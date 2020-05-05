package com.zjiang.springtest;

/**
 * description: algorithm <br>
 * date: 2020/3/12 15:31 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class algorithm {
    public static void main(String[] args) {

        System.out.println(""+numDecodings("abc"));
    }


    public static String numDecodings(String s) {
        String end="";
        for (int i = s.length(); i >0; i--) {
            String ss=s.substring(i-1,i);
            System.out.println(""+ss);

            end+=ss;
        }
        return end;
    }
}
