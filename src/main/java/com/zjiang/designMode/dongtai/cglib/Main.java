package com.zjiang.designMode.dongtai.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib动态代理
 * 基于字节码文件
 * 调用方法快
 */
public class Main {
    public static void main(String[] args) {
        //拿到代理类
        CglibProxy cglibProxy = new CglibProxy();
        //设置代理信息
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserImpl.class);
        enhancer.setCallback(cglibProxy);
        //获取到接口对象
        IUser user = (IUser) enhancer.create();
        //执行接口方法
        user.make();
    }


}
