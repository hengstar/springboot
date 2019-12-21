package com.zjiang.socket.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * description: Server <br>
 * date: 2019/12/21 21:52 <br>
 * author: zjiang <br>
 * version: 1.0 <br>
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("TCP 服务端启动*****");
        ServerSocket serverSocket = new ServerSocket(8080);
        //也是可能会阻塞
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int length = inputStream.read(bytes);
        String result = new String(bytes, 0, length);
        System.out.println("客户端发来的消息：" + result);
        OutputStream outputStream = accept.getOutputStream();
        System.out.println("请输入你要给客户端发的话，按回车键结束");
        Scanner scan = new Scanner(System.in);
        String returnMsg = scan.nextLine();
        outputStream.write(returnMsg.getBytes());
        System.out.println("我已经给客户端反馈了");

    }
}
