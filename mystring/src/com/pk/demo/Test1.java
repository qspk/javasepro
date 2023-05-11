package com.pk.demo;

import java.util.Scanner;

/**
 * 模拟登录验证用户名与密码
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入登录名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

            if (login(username, password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败,您还剩" + (3 - i) + "次机会");
            }

        }
    }

    //判断用户名与方法是否正确
    public static boolean login(String username, String password) {
        String name = "111";
        String pw = "111111";
        return name.equals(username) && pw.equals(password);
    }
}
