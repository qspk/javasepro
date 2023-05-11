package com.pk;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("红色");
        System.out.println(sb == sb2);
        //链式编程
        sb.append("红色").append("蓝色");

        System.out.println("反转前" + sb);
        sb.reverse();
        System.out.println("反转后" + sb);

        System.out.println(sb.length());

        String s = sb.toString();
        System.out.println(s);
    }
}
