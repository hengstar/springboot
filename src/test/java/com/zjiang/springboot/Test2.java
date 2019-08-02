package com.zjiang.springboot;

import java.io.File;

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
public class Test2 {
    public static void main(String[] args) {
        int vernierInt = 2019050600;
        if (String.valueOf(vernierInt).substring(8).equals("00")) {
            String strPath = "D:\\Tencent Files\\";
            File file = new File(strPath);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }
}
