package com.you.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Test526 {
    public static void main(String[] args) throws Exception {
        Class clazzArrayList = ArrayList.class;
        System.err.println(clazzArrayList);
        Field fieldelementData = clazzArrayList.getDeclaredField("elementData");
        System.err.println(fieldelementData);
        fieldelementData.setAccessible(true);
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("hello");
        list.add("word");
        list.add(new HashSet());
        list.add(new TreeSet());
        Object objectfieldelementData = fieldelementData.get(list);
        System.err.println(objectfieldelementData);
        Object object2 = list.clone();
        Object objectfieldelementData2 = fieldelementData.get(object2);
        System.err.println(objectfieldelementData2);
        System.err.println(objectfieldelementData == objectfieldelementData2);
        ArrayList list2 = (ArrayList) object2;
        System.err.println(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i) == list2.get(i));
        }
        Object[] objects = (Object[]) objectfieldelementData;
        Object[] objects2 = (Object[]) objectfieldelementData2;
        System.err.println(objects.length);
        System.err.println(objects2.length);
    }
}
