package com.you.test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// BaseRedisRepository

public class Test614 {
    public String getEntityRedisKey(String keyPattern, Object entity, Map<String, String> variableValues) {
        String resovledKey = keyPattern;
        Set<String> keyVariables = getKeyVariables(keyPattern);
        for (String keyVariable : keyVariables) {
            String variableValue = null;
            Object fieldValue = null;
            if (entity != null) {
                try {
                    Class<?> clazz = entity.getClass();
                    Field field = clazz.getDeclaredField(keyVariable);
                    field.setAccessible(true);
                    fieldValue = field.get(entity);
                    if (fieldValue != null && !field.getType().isArray()) {
                        variableValue = fieldValue.toString();
                    }
                } catch(NoSuchFieldException e){
//                    variableValue = resolveIdValue(entity, keyVariable);
                } catch (Exception e) {
                    System.err.println("GetEntityRedisKey error" + e);
                    throw new RuntimeException("GetEntityRedisKey error [" + keyPattern + "]", e);
                }

            }
            if (variableValue == null) {
                if (variableValues == null || variableValues.get(keyVariable) == null) {
                    return null;
                }
                variableValue = variableValues.get(keyVariable);
            }
            resovledKey = resovledKey.replaceAll("\\{" + keyVariable + "\\}", variableValue);
        }

        return resovledKey;
    }

    private Set<String> getKeyVariables(String key) {
        Set<String> keyVariables = new HashSet<String>();
        Pattern p = Pattern.compile("\\{(\\w+)\\}");

        Matcher m = p.matcher(key);

        while (m.find()) {
            String variable = m.group(1);
            keyVariables.add(variable);
        }
        return keyVariables;

    }

    public static void main(String[] args) {
        Test614 test = new Test614();
        String key = "kvp_room_member_{roomid}_{uid}";
        Map<String, String> map = new HashMap<>();
        map.put("roomid", "212");
        map.put("uid", "788");
        test.getEntityRedisKey(key, null, map);
    }
}
