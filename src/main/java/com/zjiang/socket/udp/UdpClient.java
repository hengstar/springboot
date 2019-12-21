package com.zjiang.socket.udp;

import java.io.IOException;
import java.net.*;

/**
 * description: UdpClient <br>
 * date: 2019/12/21 23:03 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class UdpClient {
    public static void main(String[] args) throws IOException {

        String msg = "我是测试消息";
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = msg.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("127.0.0.1", 8080));
        ds.send(dp);
        ds.close();
        System.out.println("客户端发送消息完毕***");
    }
}
