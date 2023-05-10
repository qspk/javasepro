package test_2;

import java.util.Scanner;
//九九乘法表
public class Demo_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个 1~9 之间的整数:");
        int n = sc.nextInt();
        print_n_n(n);
    }

    public static void print_n_n(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + '\t');
            }
            System.out.println();
        }
    }
}
