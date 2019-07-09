package com.you.test;

import java.io.File;
import java.nio.file.FileSystem;

public class Test399 {
    public static void rename() {
        File file = new File("F:/test");
        File[] files = file.listFiles();
        for (File oneFile : files) {
            if (!oneFile.getName().contains(".c")) {
                continue;
            }
            String name = oneFile.getName();
            String number = name.substring(4, name.length() - 2);
            int numberInt = Integer.parseInt(number);
            numberInt = numberInt + 503;
            number = numberInt + "";
            String newName = "test" + number + ".c";
            oneFile.renameTo(new File("D://" + newName));
        }
    }
    public static void main(String[] args) {
        rename();
    }

}
