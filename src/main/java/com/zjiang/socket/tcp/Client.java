package com.zjiang.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * description: Client <br>
 * date: 2019/12/21 22:17 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("客户端启动****");
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream outputStream = socket.getOutputStream();
        System.out.println("请输入你要给服务端发的话，按回车键结束");
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();
        outputStream.write(msg.getBytes());
        System.out.println("消息发送完啦****");
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        String result = new String(bytes, 0, length);
        System.out.println("这个是服务器给我反馈的信息:" + result);

    }
}
