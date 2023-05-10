package com.pk;

import java.util.Random;
import java.util.Scanner;

//双色球  计算抽中一等奖的概率
public class Demo_8_2 {
    private static Random r = new Random();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] userNumbers = userSelectNumbers();
//        int[] userNumbers = userSelectNumbers2();
//        printNumbers(userNumbers);
        int[] randomNumbers = autoCreate();
        printNumbers(randomNumbers);
        int count = 0;
        while (judge(randomNumbers)) {
            count++;
        }
        System.out.println("抽了 "+count+" 次");
    }

    //判断用户是否中奖
    private static boolean judge(int[] numbers) {
        int[] randomNumbers = autoCreate();
        // 2、分别定义2个变量用于记住红球命中了几个以及蓝球命中了几个
        int redCount = 0;
        int blueCount = 0;

        // 先判断红球命中的数量。
        // 遍历用户投注的号码的前6个红球
        for (int i = 0; i < numbers.length - 1; i++) {
            // userNumbers[i]
            // 开始遍历中奖号码的前6个红球号码，看用户当前选择的这个号码是否命中了
            for (int j = 0; j < randomNumbers.length - 1; j++) {
                if(numbers[i] == randomNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }

        // 3、判断蓝球是否命中了
        blueCount = numbers[6] == randomNumbers[6] ? 1 : 0;

        System.out.println("您命中的红球数量是：" + redCount);
        System.out.println("您命中的蓝球数量是：" + blueCount);

        // 4、判断中奖详情，并输出结果
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜您，中奖1000万，可以开始享受人生了~~~");
            return false;
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜您，中奖500万，可以稍微开始享受人生了~~~");
            return true;

        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜您，中奖3000元，可以出去吃顿小龙虾了~");
            return true;

        }else if(redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1){
            System.out.println("恭喜您，中了小奖：200元~");
            return true;

        }else if(redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1){
            System.out.println("中了10元~");
            return true;

        }else if( redCount < 3 && blueCount == 1){
            System.out.println("中了5元~");
            return true;

        }else {
            System.out.println("感谢您对福利事业做出的巨大贡献~~~");
            return true;
        }
    }

    //自动生成双色球号码
    private static int[] autoCreate() {
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length - 1; i++) {
            int number = r.nextInt(33) + 1;
            if (!exist(numbers, number)) {
                numbers[i] = number;
            } else {
                i--;
            }
        }
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }

    //打印号码
    private static void printNumbers(int[] userNumbers) {
        System.out.print("[");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print(i == userNumbers.length - 1 ? userNumbers[i] : userNumbers[i] + ", ");
        }
        System.out.println("]");
    }

    //用户选择双色球号码
    public static int[] userSelectNumbers() {
        int[] numbers = new int[7];
        System.out.println("请输入6个红球号码,1~33且不能重复");
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红球号码");
                int number = sc.nextInt();
                if (number > 33 || number < 1) {
                    System.out.println("您输入的号码超出范围1~33,请重试");
                } else {
                    if (exist(numbers, number)) {
                        System.out.println("请勿重复输入号码");
                    } else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请输入蓝球号码 1~16");
            int number = sc.nextInt();
            if (number >= 1 && number <= 16) {
                numbers[numbers.length - 1] = number;
                break;
            } else {
                System.out.println("您输入的号码超出范围1~16");
            }
        }
        return numbers;
    }

    //用户选择双色球号码_2
    public static int[] userSelectNumbers2() {
        int[] numbers = new int[7];
        System.out.println("请输入6个红球号码,1~33且不能重复");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int number = sc.nextInt();
            if (number > 33 || number < 1) {
                System.out.println("您输入的号码超出范围1~33,请重试");
                i--;
            } else {
                if (exist(numbers, number)) {
                    System.out.println("请勿重复输入号码");
                    i--;
                } else {
                    numbers[i] = number;
                }
            }

        }
        while (true) {
            System.out.println("请输入蓝球号码 1~16");
            int number = sc.nextInt();
            if (number >= 1 && number <= 16) {
                numbers[numbers.length - 1] = number;
                break;
            } else {
                System.out.println("您输入的号码超出范围1~16");
            }
        }
        return numbers;
    }

    //判断新的红球号码是否存在
    private static boolean exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (number == numbers[i]) {
                return true;
            }
        }
        return false;
    }
}
