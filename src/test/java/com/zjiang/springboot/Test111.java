package com.zjiang.springboot;

import java.util.ArrayList;
import java.util.List;

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
public class Test111 {

    public static void main(String[] args) {
        String a = "UU_1_201810161600.txt";
        String b = "UU_01_201810161600.txt";
        String c = "UU_11_201810161600.txt";
        String d = "UU_13_201810161600.txt";
        List<String> list = new ArrayList<String>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        Boolean bz = true;
        for (String str : list) {
            str = str.substring(2, 5).replaceAll("_", "");
            if (str.length() <= 1) {
                bz = false;
                continue;
            }
        }
        System.out.println(bz);

    }

}
