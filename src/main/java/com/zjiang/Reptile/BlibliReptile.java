package com.zjiang.Reptile;

import org.jsoup.Jsoup;


/*
*   B站弹幕地址"http://comment.bilibili.com/"+cid+".xml"
*   通过获取源码可以得到cid和aid
*
* */
public class BlibliReptile {

    private static String url = "https://www.bilibili.com/video/av76065109?spm_id_from=333.334.b_63686965665f7265636f6d6d656e64.19";

    public static void main(String[] args) throws Exception{
        String code = null;
//        获取网页源代码
        code = Jsoup.connect(url).execute().body();
//        获取B站cid标识
        String cid=code.substring(code.indexOf("\\\"cid=")+6,code.indexOf("&aid"));
//        拼接弹幕地址
        String barrageUrl = "http://comment.bilibili.com/"+cid+".xml";
//        Document barrageData = Jsoup.parse(new URL(barrageUrl).openStream(), "utf-8", barrageUrl);

        System.out.println(Jsoup.connect(barrageUrl).execute().body());



    }

}
