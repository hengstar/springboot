package com.zjiang.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Test2 {
    public static final String STR_1 = "";

    public static void main(String[] args) {
//        int vernierInt = 2019050600;
//        if (String.valueOf(vernierInt).substring(8).equals("00")) {
//            String strPath = "D:\\Tencent Files\\";
//            File file = new File(strPath);
//            if (!file.exists()) {
//                file.mkdirs();
//            }
//        }
//        Integer num=555;
//        System.out.println(num==555);
//        String a= "ASC,DFFFG,FFF,SDF,SDS，";
//        String b= ",FFF,";
//        String b1= ",FFFF,";
//        int c=(a.length()-a.replace(b,"").length())/b.length();
//        int d=a.indexOf(b1);
//        System.out.println(a.indexOf("C"));
//
//        int i=1;
//        i=++i;
//        System.out.println(i);

//        System.out.println(c);

        int num0=1;
        int num1=1;
        int[] arr={1,0,1,1,1,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==0){
                if(arr[i]==arr[i+1]){
                    ++num0;
                }
                if(arr[i]!=arr[i+1]){
                    int w=num0;
                    num0=1;
                    Math.max(3,5);
                }
            }
            if(arr[i]==1){
                if(arr[i]==arr[i+1]){
                    ++num1;
                }
                if(arr[i]!=arr[i+1]){
                    num1=1;
                }
            }
        }
        System.out.println(num0);
        System.out.println(num1);
    }

}
