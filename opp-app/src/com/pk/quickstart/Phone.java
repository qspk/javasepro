package com.pk.quickstart;

import com.sun.istack.internal.NotNull;

public class Phone {
    String brand;
    int price;

    //打电话
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    //发短信
    public void sendMessage(String name) {
        System.out.println("给" + name + "发短信");
    }

}
