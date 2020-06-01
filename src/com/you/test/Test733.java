package com.you.test;

import org.apache.http.impl.client.HttpClientBuilder;
// HttpClientBuilder
public class Test733 {
    public static void main(String[] args) {
        HttpClientBuilder builder = HttpClientBuilder.create();
        System.err.println(builder);
        HttpClientBuilder builder2 = HttpClientBuilder.create();
        System.err.println(builder2);
    }
}
