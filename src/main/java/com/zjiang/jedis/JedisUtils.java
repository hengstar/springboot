package com.zjiang.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

/**
 * description: JedisUtils <br>
 * date: 2020/3/27 11:32 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 *     连接redis工具
 */
public class JedisUtils {
    private static JedisPool jedisPool=null;
    private static String host = null;
    private static int port;
    private static int maxTotal;
    private static int maxIdle;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("redis");
        host = resourceBundle.getString("redis.host");
        port = Integer.parseInt(resourceBundle.getString("redis.port"));
        maxTotal = Integer.parseInt(resourceBundle.getString("redis.maxTotal"));
        maxIdle = Integer.parseInt(resourceBundle.getString("redis.maxIdle"));
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPool = new JedisPool(jedisPoolConfig, host, port);
    }


    public static Jedis getJedis() {
        return jedisPool.getResource();
    }
}
