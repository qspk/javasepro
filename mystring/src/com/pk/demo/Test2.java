package com.pk.demo;

import java.util.Random;

/**
 * 生成n位数的验证码
 */
public class Test2 {
    private static Random r = new Random();
    public static void main(String[] args) {
        System.out.println(createCode(4));
        System.out.println(createCode(6));
    }

    public static String createCode(int n) {
        String code = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(code.charAt(r.nextInt(62)));
        }
        return sb.toString();
    }
}
