package com.you.test;

import redis.clients.jedis.Jedis;

public class Test375 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        String agefor = jedis.get("agefor");
        System.err.println(agefor);
        jedis.set("homefor", "boker");
    }
}

