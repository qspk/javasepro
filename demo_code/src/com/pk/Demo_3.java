package com.pk;

import java.util.Scanner;

//评委打分
public class Demo_3 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入评委数:");
        int num = sc.nextInt();
        double avg = getAvg(num);
//        System.out.println("选手最终成绩为:" + avg);
        System.out.printf("选手最终成绩为:%4.2f",avg);
    }

    public static double getAvg(int n) {
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("第" + (i + 1) + "位评委打分:");
            int score = sc.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("输入分数有误,请输入[0-100]的整数");
                i--;
            } else {
                scores[i] = score;
            }
        }
        int sum = 0;
        int min = scores[0];
        int max = scores[0];
        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
            if (min > score) {
                min = score;
            }
        }
        return 1.0*(sum - min - max) / (scores.length - 2);
    }
}
