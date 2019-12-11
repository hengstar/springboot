package com.zjiang.designMode.dongtai.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理之前");
        Object invokeSuper=methodProxy.invokeSuper(o,objects);
        System.out.println("cglib动态代理之后");
        return invokeSuper;
    }
}
