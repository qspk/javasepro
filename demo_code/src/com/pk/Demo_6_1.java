package com.pk;

import java.util.Random;
import java.util.Scanner;

/*
    抽红包2
 */
public class Demo_6_1 {
    public static void main(String[] args) {
        int[] bonus = {9, 66, 180, 520, 99999};
        raffle(bonus);
    }

    public static void raffle(int[] bonus) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < bonus.length; i++) {
            System.out.print("输入任意键开始抽奖:");
            String name = sc.next();
            while (true) {
                int index = r.nextInt(5);
                if (bonus[index] != 0) {
                    System.out.println("恭喜您抽中:" + bonus[index] + "元");
                    bonus[index] = 0;
                    break;
                }
            }
        }
    }
}
