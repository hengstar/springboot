package com.zjiang.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * description: JedisTest <br>
 * date: 2020/3/26 17:00 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class JedisTest {

    @Test
    public void test() {
//        Jedis jedis = new Jedis("192.168.57.3", 6379);
        Jedis jedis=JedisUtils.getJedis();
        jedis.set("name3", "zjiang1");
        String name = jedis.get("name");
        System.out.println("" + name);
        jedis.close();
    }



}
