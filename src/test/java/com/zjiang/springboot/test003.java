package com.zjiang.springboot;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class test003 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        System.out.println(list.toString());
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if ("2".equals(item)) {
//                iterator.remove();
//            }
//        }
        for (String item : list) {
            System.out.println("这里是"+item);
            if ("2".equals(item)) {
                list.remove(item);
            }
        }
        System.out.println(list.toString());


        Date date = new Date();

    }

}
