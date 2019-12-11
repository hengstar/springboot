package com.zjiang.Reptile;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zjiang
 *
 */
public class ReptileURtil {

    private static String url = "https://588ku.com/sucai/0-dnum-0-78-0-0-1/";

    /**
     * **/
    public static void main(String[] args) {

        String code = null;
        // 获取网页源代码
        code = getCodeByurl(url);
        // 解析源代码，获取图片的连接的集合
        List<String> list = new ArrayList<String>();
        list = getUrlListfromCode(code);

        String newUrl = null;
        // 转换成一个网页连接，不再是一个字符串
        URL webUrl = null;
        // 定义一个连接
        HttpURLConnection connection = null;
        // 定义输入流
        InputStream inputStream = null;
        // 定义字节
        byte[] bs = null;
        // 定义一个输出流
        FileOutputStream outputStream = null;
        try {
            for (int i = 0, len = list.size(); i < len; i++) {
                newUrl = list.get(i);
                newUrl = "http:" + newUrl;
                webUrl = new URL(newUrl);
                connection = (HttpURLConnection) webUrl.openConnection();
                // 获取输入流
                inputStream = connection.getInputStream();
                // 从输入流获取数组
                bs = readInputStream(inputStream);
                //
                outputStream = new FileOutputStream(
                        new File("C:/Users/Administrator/Desktop/img/" + System.currentTimeMillis() + ".png"));
                outputStream.write(bs);
            }
            System.out.println("成功·····");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("执行完毕·····");
        }
    }

    public static List<String> getUrlListfromCode(String code) {
        List<String> list = new ArrayList<String>();
        // 获取文档对象
        Document document = Jsoup.parse(code);
        // 获取相应的节点
        Elements elements = document.select("div [id=orgImgWrap]").select("img[class=lazy]");
        int len = elements.size();
        for (int i = 0; i < len; i++) {
            list.add(elements.get(i).attr("data-original"));
        }
        return list;
    }

    public static String getCodeByurl(String url) {
        String code = null;
        try {
            code = Jsoup.connect(url).execute().body();
            // System.out.println(code);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return code;
    }

    public static byte[] readInputStream(InputStream inputStream) throws Exception {
        byte[] buffer = new byte[1024];
        int len = -1;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        while ((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        outputStream.close();
        inputStream.close();
        return outputStream.toByteArray();
    }
}

