package com.you.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

// 查询指定目录下的文件中是否有需要的关键字
public class Test398 {
    public static List query(String filepath, String word) throws Exception {
        File file = new File(filepath);
        File[] fs = file.listFiles();
        List<String> result = new LinkedList<>();
        for (File onefile : fs) {
            if (onefile.getName().contains("git")) {
                continue;
            }
            BufferedReader brr = new BufferedReader(new FileReader(onefile));
            while (true) {
                String line = brr.readLine();
                if (line == null) {
                    break;
                }
                if (line.contains(word)) {
                    result.add(onefile.getName());
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        List<String> result = query("F://xuec", "*(pc2 + j)");
        System.err.println(result);
    }
}
