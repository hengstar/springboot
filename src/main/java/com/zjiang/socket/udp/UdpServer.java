package com.zjiang.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * description: UdpServer <br>
 * date: 2019/12/21 22:56 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("UDP服务启动了***");
        DatagramSocket ds = new DatagramSocket(8080);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        String add = dp.getAddress().toString();
        String data = new String(dp.getData(), 0, dp.getLength());
        System.out.println("从IP" + add + "获取到信息：" + data);
    }
}
