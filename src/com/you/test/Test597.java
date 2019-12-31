package com.you.test;


import org.apache.http.entity.ContentType;

import java.nio.charset.Charset;

// ContentType

public class Test597 {
    public static void main(String[] args) {
        ContentType con = ContentType.APPLICATION_ATOM_XML;
        ContentType.create("  \t \n \n  \n ", Charset.forName("UTF-8"));
    }
}
