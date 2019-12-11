package com.zjiang.designMode.dongtai.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * 基于反射
 * 加载快
 */


public class Main {
    public static void main(String[] args) {
        IUser user = new UserImpl();
        InvocationHandler handler = new DynamicPorxy(user);
        //通过反射
        IUser proxy = (IUser) Proxy.newProxyInstance(IUser.class.getClassLoader(), new Class[]{IUser.class}, handler);
        proxy.make();
    }
}
