package com.you.test;

import org.apache.http.client.ClientProtocolException;

import java.io.IOException;

public class Test611 {
    public static void main(String[] args) {
        Exception e = new ClientProtocolException();
        boolean flag = e instanceof IOException;
        System.err.println(flag);
    }
}
