package com.zjiang.jdk8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * description: LambdaFunction <br>
 * date: 2019/11/25 21:22 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 * java内置的4大核心函数式接口
 * 1.消费型接口 Consumer<T> 返回 void accept<T t>
 * 2.供给型接口 Supplier<T> T get()
 * 3.函数型接口 Function<T,R> R apply(T t)
 * 4.断定型接口 Predicate<T> boolean test(T t)
 */
public class LambdaFunction {

    @Test
    public void test1() {
        happy(52.00, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("今天吃饭花了" + aDouble);
            }
        });
        System.out.println("--------------Lambda方式------------------");
        happy(52.00, menoy -> System.out.println("今天吃饭花了" + menoy));

    }

    public void happy(Double menoy, Consumer<Double> consumer) {
        consumer.accept(menoy);
    }

    @Test
    public void test2() {
        List<String> list = Arrays.asList("北京", "南京", "天津", "东京", "西京", "普京", "晶晶");
        List<String> filterstr1=filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterstr1);
        System.out.println("--------------Lambda方式------------------");
        List<String> filterstr2=filterString(list,s -> s.contains("京"));
        System.out.println(filterstr2);
    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> predicate) {
        ArrayList<String> filterList = new ArrayList();
        for (String s : list) {
            if (predicate.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }
}
