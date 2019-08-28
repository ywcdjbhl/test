package com.you.test;

import java.io.FileWriter;
import java.io.Writer;

/**
 * 生产sql类
 */
public class Test542 {

    public static void createsql() throws Exception {
        Writer out = new FileWriter("d://sqll.txt");
        int id = 0;
        for (int i = 0; i < 1000_000; i++) {
            String sql = "insert into student (age, score, tname) value ('" + id + "', '" + id + "', 'kobe');\n";
            System.err.println(sql);
            out.write(sql);
            id = id + 1;
        }
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws Exception {
        createsql();
    }
}
