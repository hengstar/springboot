package com.zjiang.jdk8;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * description: MethodRefTest <br>
 * date: 2019/11/25 22:01 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 * 方法引用的使用
 * 1.使用情景:当要传递给Lambda体的操作已经有了实现的方法了，可以使用方法引用！
 * 2.方法引用本质上就是Lambda表达式
 * 3.使用格式  类（或对象） ::方法名
 * 4.具体分为如下三种场景
 *      对象 :: 非静态方法
 *      类 :: 静态方法
 *      类 :: 非静态方法
 * 5.方法引用使用的要求：要求接口中的抽象接口的形参列表和返回值类型与方法引用的方法的形参列表和返回值类型要相同
 */
public class MethodRefTest {

    //场景一：对象::实例方法
    //Consumer中的void accept(T t);
    //PrintStream中的 void println(T t);
    @Test
    public void Test1(){
        Consumer<String> consumer1=str -> System.out.println(str);
        consumer1.accept("北京我爱你");
        System.out.println("-------------方法引用方式--------------------");
        PrintStream out = System.out;
        Consumer<String> consumer2=out::println;
        consumer2.accept("北京我昨天很爱你");
    }

    //Supplier中的 String get()
    //User中的 String getName();
    @Test
    public void test2(){
        User user=new User();
        Supplier<String> supplier1=() ->user.getName();
        System.out.println(supplier1.get());
        System.out.println("-------------方法引用方式--------------------");
        Supplier<String> supplier2=() ->user.getName();
        System.out.println(supplier2.get());
    }

    public class User{
        public String getName(){
            return "I am Tom";
        }
    }
}
