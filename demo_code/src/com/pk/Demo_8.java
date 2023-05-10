package com.pk;

import java.util.Random;
import java.util.Scanner;

/*
    双色球
 */
public class Demo_8 {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[7];
        System.out.println("请选择投注方式: 1.自动投注 2.手动投注");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                arr = autoCreateNumber();
                break;
            case 2:
                arr = userSelectNumber();
                break;
            default:
                System.out.println("错误选项,退出系统");
                break;
        }
        System.out.println("您的投注结果为:");
        printNumbers(arr);
        judge(arr);
    }

    //用户选择双色球号码
    public static int[] userSelectNumber() {
        int[] numbers = new int[7];
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球数字(红球数字不可重复):");
            int number = sc.nextInt();
            numbers[i] = number;
            if (number < 1 || number > 33) {
                System.out.println("输入红球数字超出范围,请重新输入!");
                i--;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (number == numbers[j]) {
                    System.out.println("输入红球数字重复,请重新输入!");
                    i--;
                    break;
                }
            }
        }
        System.out.println("请输入蓝球数字:");
        int number = sc.nextInt();
        while (number < 1 || number > 16) {
            System.out.println("输入红球数字超出范围,请重新输入!");
            System.out.println("请输入蓝球数字");
            number = sc.nextInt();
        }
        numbers[numbers.length - 2] = number;
        return numbers;
    }

    //系统自动生成双色球
    public static int[] autoCreateNumber() {
        int[] arr = new int[7];
        for (int i = 0; i < 6; i++) {   //生成红球号码
            arr[i] = r.nextInt(33) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        arr[6] = r.nextInt(16) + 1;   //生成蓝球号码
        return arr;
    }

    //判断用户是否中奖
    public static void judge(int[] arr) throws InterruptedException {
        int[] arr0 = autoCreateNumber();
        System.out.println("中奖号码为:");
        printNumbers(arr0);
        System.out.println("开奖啦~~正在判断您是否中奖");
        Thread.sleep(2000);
        int count = 0;
        boolean flag = (arr[6] == arr0[6]);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] == arr0[j]) {
                    count++;
                }
            }
        }
        if (count == 6 && flag) {
            System.out.println("奖金1000万");
        } else if (count == 6) {
            System.out.println("奖金500万");
        } else if (count == 5 && flag) {
            System.out.println("奖金3000块");
        } else if (count == 5 || count == 4 && flag) {
            System.out.println("奖金200块");
        } else if (count == 4 || count == 3 && flag) {
            System.out.println("奖金10块");
        } else if (flag) {
            System.out.println("奖金5块");
        } else {
            System.out.println("为福利事业做贡献~~");
        }

    }

    //打印双色球号码
    public static void printNumbers(int[] numbers) {
        System.out.print("红球: ");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println("蓝球: " + numbers[numbers.length - 2]);
    }
}
