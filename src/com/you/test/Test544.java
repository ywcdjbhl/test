package com.you.test;

import java.io.UnsupportedEncodingException;

public class Test544 {
    public static void main(String[] args) {
        String s = "掐";
        try {
            byte[] bs = s.getBytes("GBK");
            String ss = "";
            for (byte b : bs) {
                ss = ss + b + " ";
            }
            System.err.println("掐 GBK " + ss);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            byte[] bs = s.getBytes("GB2312");
            String ss = "";
            for (byte b : bs) {
                ss = ss + b + " ";
            }
            System.err.println("掐 GB2312 " + ss);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String s2 = "亾";
        try {
            byte[] bs = s2.getBytes("GBK");
            String ss = "";
            for (byte b : bs) {
                ss = ss + b + " ";
            }
            System.err.println("亾 GBK " + ss);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            byte[] bs = s2.getBytes("GB2312");
            String ss = "";
            for (byte b : bs) {
                ss = ss + b + " ";
            }
            System.err.println("亾 GB2312 " + ss);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
