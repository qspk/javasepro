package com.pk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/*
    抽红包
 */
public class Demo_6 {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] bonus = {9, 180, 520, 666, 9999};
        upset(bonus);
        raffle(bonus);
    }

    //判断用户中了什么将
    private static void raffle(int[] bonus) {
        for (int i = 0; i < bonus.length; i++) {
            System.out.print("用户输入任意键抽奖:");
            String name = sc.next();
            System.out.println("恭喜您抽中:" + bonus[i] + "元");
        }
    }

    //打乱数组,打乱数组排序
    public static void upset(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(5);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
