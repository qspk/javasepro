package com.pk;

import java.util.Random;

//生成任意个数随机数
public class Demo_2 {
    public static void main(String[] args) {
        int n = 4;
        String code = getVerificationCode(n);
        System.out.println(code);
        code = getVerificationCode2(n);
        System.out.println(code);
    }

    public static String getVerificationCode(int n) {
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    char ch1 = (char) (r.nextInt(10)+48);
                    code += ch1;
                    break;
                case 1:
                    char ch2 = (char) (r.nextInt(10)+97);
                    code += ch2;
                    break;
                case 2:
                    char ch3 = (char) (r.nextInt(10)+65);
                    code += ch3;
                    break;
            }
        }
        return code;
    }

    public static String getVerificationCode2(int n) {
        String code0 = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        //System.out.println(code0.length());
        StringBuilder code = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            char ch = code0.charAt(r.nextInt(62));
            code.append(ch);
        }
        return code.toString();
    }
}
