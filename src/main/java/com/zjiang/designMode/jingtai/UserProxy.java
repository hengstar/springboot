package com.zjiang.designMode.jingtai;

public class UserProxy implements IUser{

    IUser user = new UserImpl();

    @Override
    public void make() {
        System.out.println("静态代理之前");
        user.make();
        System.out.println("静态代理之后");
    }
}
