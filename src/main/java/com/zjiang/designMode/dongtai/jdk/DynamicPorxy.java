package com.zjiang.designMode.dongtai.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicPorxy implements InvocationHandler {

    private Object object;

    public DynamicPorxy(Object o) {
        object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理之前");
        method.invoke(object);
        System.out.println("动态代理之后");
        return null;
    }
}
