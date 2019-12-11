package com.zjiang.jdk8;

import org.junit.Test;

import java.util.Comparator;

/**
 * Lambda表达式使用举例
 * description: LambdaDemo <br>
 * date: 2019/11/25 15:28 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class LambdaDemo {

    @Test
    public void demo() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京呀");
            }
        };
        r1.run();
        System.out.println("**************************");
        Runnable r2 = () -> System.out.println("Lambda爱北京呀");
        r2.run();
    }

    @Test
    public void demo1() {
        System.out.println("-----------正常模式------------");
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int num1 = com1.compare(15, 45);
        System.out.println(num1);

        System.out.println("-----------lambda表达式------------");

        Comparator<Integer> com2 = (o1, o2) -> Integer.compare(o1, o2);
        int num2 = com2.compare(0, 5);
        System.out.println(num2);

        System.out.println("-----------方法引用------------");

        Comparator<Integer> com3 = Integer::compare;
        int num3 = com3.compare(0, 5);
        System.out.println(num2);
    }
}
