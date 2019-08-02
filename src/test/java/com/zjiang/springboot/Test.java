package com.zjiang.springboot;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * <p>标题: </p>
 * <p>功能描述: </p>
 *       
 * <p>版权: 税友软件集团股份限公司</p> 
 * <p>创建时间: 2018年5月6日,下午6:21:19</p> 
 * <p>作者：zjiang</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
@SpringBootApplication
public class Test {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHH");
        String now = dateFormat.format(calendar.getTime());
        System.out.println(now);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHH");// 设置日期格式
        String nowdate = formatter.format(new Date());
        int vernierInt = 2019050916;
        if (nowdate.substring(8).equals("00") && String.valueOf(vernierInt).substring(8).equals("23")) {
            vernierInt = Integer.parseInt(nowdate);
            System.out.println(vernierInt);
        }
        if (vernierInt + 1 == Integer.parseInt(nowdate)) {
            vernierInt = Integer.parseInt(nowdate);
            System.out.println(vernierInt);
        }
        System.out.println("meiyou tihuan");
        // String year = str.substring(0, 4);
        // String month = str.substring(4, 6);
        // String day = str.substring(6, 8);
        // String hour = str.substring(8);
        // if (hour.equals("24")) {
        // if ((Integer.parseInt(str.substring(0, 4)) % 4 == 0 && Integer.parseInt(str.substring(0, 4)) % 100 != 0)
        // || Integer.parseInt(str.substring(0, 4)) % 400 == 0) {
        // if (month.equals("02")) {
        // if (day.equals("29")) {
        // str = str.substring(0, 4) + String.valueOf(Integer.parseInt(day) + 1) + "01" + hour;
        // }
        // }
        // }
        // if (str.substring(7, 8).equals("9")) {
        // str = str.substring(0, 4) + month + String.valueOf(Integer.parseInt(str.substring(6, 7)) + 1) + "0"
        // + "00";
        // System.out.println(str);
        // } else {
        // str = str.substring(0, 4) + month + String.valueOf(Integer.parseInt(str.substring(6, 8)) + 1) + "00";
        // System.out.println(str);
        // }
        // if (month.indexOf("01030507081012") >= 0) {
        // if (day.equals("31")) {
        // if (str.substring(5, 6).equals("9")) {
        // str = str.substring(0, 4) + "10" + "01" + "00";
        // System.out.println(str);
        // } if() {
        // str = str.substring(0, 4) + "0" + String.valueOf(Integer.parseInt(str.substring(5, 6)) + 1)
        // + "01" + "00";
        // System.out.println(str);
        // }
        // }
        // }
        //
        // }
    }
}
