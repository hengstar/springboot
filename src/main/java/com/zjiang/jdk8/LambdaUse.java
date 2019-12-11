package com.zjiang.jdk8;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * description: LambdaUse <br>
 * date: 2019/11/25 15:52 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 * <p>
 * Lambda表达式的使用
 * 1.举例： (o1, o2) -> Integer.compare(o1, o2);
 * 2.格式：
 * -> :lambda操作符 或者 箭头操作符
 * ->左边 : lambda形参列表（其实就是接口中的抽象方法的形参）
 * ->右边 : Lambda体（其实就是重写的抽象方法的方法体）
 * 3.Lambda表达式的使用：分为6种情况介绍
 *  ->左边:lambda形参列表的参数类型可以省略(类型推断)；如果Lambda表达式形参列表只有一个参数，其一对()也可以省略
 *  ->右边:lambda体应该使用一对{}包裹；如果Lambda体只有一条执行语句（可能是return语句），
 *         这一对{}可以省略（省略{}的话return关键字也得省略）
 * <p>
 * 4.lambda表达式的本质：作为函数式接口的实例
 * 5.如果接口中，只声明了一个抽象方法的接口，就是函数式接口，
 *      注解--@FunctionalInterface  可以用于检验它是否是一个函数式接口
 * 6.匿名实现类所表示的现在都可以使用Lambda表达式来写
 */

public class LambdaUse {

    //语法格式一：无参无返回值的
    @Test
    public void test1() {
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

    //语法格式二：无参无返回值的
    @Test
    public void test2() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("中国人民银行");
        System.out.println("-----------lambda表达式------------");
        Consumer<String> consumer1 = (String s) -> {
            System.out.println(s);
        };
        consumer1.accept("lambda表达式是骗子~");
    }

    //语法格式三：数据类型可以省略，因为可由编译器得出，成为“类型推断”
    @Test
    public void test3() {
        Consumer<String> consumer = (String s) -> {
            System.out.println(s);
        };
        consumer.accept("lambda表达式是个优秀的人~");
        System.out.println("-----------lambda表达式<类型推断>------------");
        Consumer<String> consumer1 = (m) -> {
            System.out.println(m);
        };
        consumer1.accept("lambda表达式是不用戴帽子~");

    }

    //语法格式四：当形参只有一个参数时，小括号可以省略
    @Test
    public void test4() {
        Consumer<String> consumer = (m) -> {
            System.out.println(m);
        };
        consumer.accept("lambda表达式是不用戴帽子~");
        System.out.println("---------------------------------");
        Consumer<String> consumer1 = m -> {
            System.out.println(m);
        };
        consumer1.accept("lambda表达式是不用穿衣服~");

    }

    //语法格式五：Lambda需要两个或以上参数，多条执行语句，并且可以有返回值
    @Test
    public void test5() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };
        System.out.println(com.compare(15, 30));
        System.out.println("-----------lambda方式----------------------");
        Comparator<Integer> com1 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com1.compare(13, 123));
    }

    //语法格式六：当Lambda体只有一条语句时，return和大括号若有，都可以省略
    @Test
    public void test6() {
        Comparator<Integer> com1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println(com1.compare(13, 123));
        System.out.println("-----------lambda方式省略return和大括号----------------------");
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(13, 123));

        };
}
