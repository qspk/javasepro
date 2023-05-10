package test_1;

import java.util.Scanner;

public class Demo1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚年龄:");
        int age1 = sc.nextInt();
        System.out.println("请输入第二个和尚年龄:");
        int age2 = sc.nextInt();
        System.out.println("请输入第三个和尚年龄:");
        int age3 = sc.nextInt();
        //求出年龄最大者
        int max = (age1 > age2 ? age1 : age2) > age3 ? (age1 > age2 ? age1 : age2) : age3;
        //求出年龄最小者
        int min = (age1 < age2 ? age1 : age2) < age3 ? (age1 < age2 ? age1 : age2) : age3;
        int mid = age1 + age2 + age3 - max - min;
        System.out.println(max+"岁是最大年龄,获得五彩仙衣一件!");
        System.out.println(mid+"岁排第二,获得旧棕衣一件!");
        System.out.println(min+"岁是最小年龄,获得锦澜袈裟一件!");
    }
}
