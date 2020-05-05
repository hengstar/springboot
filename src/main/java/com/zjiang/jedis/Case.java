package com.zjiang.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisDataException;

/**
 * description: Case <br>
 * date: 2020/3/27 9:43 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 * 案例说明：
 * 1.要求设定ABC三个用户
 * 2.A用户限制每分钟调用10次，B用户限制30次/分钟调用，C用户不限制次数
 */
public class Case {
    private String id;
    private int num;

    public Case(String id, int num) {
        this.id = id;
        this.num = num;
    }

    public void service() {
        Jedis jedis = new Jedis("192.168.57.3", 6379);
        String username = jedis.get("user:" + id);
        try {
            if (username == null) {
                //用户不存在，创建新的用户
                jedis.setex("user:" + id, 30, Long.MAX_VALUE - num + "");
                System.out.println(id+"添加成功");
            } else {
                //用户已存在，加1
                jedis.incr("user:" + id);
                Long number = num - (Long.MAX_VALUE - Long.valueOf(jedis.get("user:" + id)));
                System.out.println("user:" + id + "第" + number + "次调用");
                business();
            }
        } catch (JedisDataException e) {
            System.out.println("用户使用次数用尽，请升级用户，或等待30s");
            return;
        } finally {

            jedis.close();
        }
    }

    //业务调用
    public void business() {
        System.out.println("运行调度");

    }
}

class MyThread extends Thread {
    Case aCase;

    public MyThread(String id, int num) {
        aCase = new Case(id, num);
    }

    public void run() {
        while (true) {
            aCase.service();
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("A", 10);
        myThread1.start();
        MyThread myThread2 = new MyThread("B", 30);
        myThread2.start();
        MyThread myThread3 = new MyThread("C", Integer.MAX_VALUE);
        myThread3.start();
    }
}

