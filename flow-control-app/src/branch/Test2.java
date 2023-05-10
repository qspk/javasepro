package branch;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        while (score >= 0 && score <= 100) {
            if (score >= 95) {
                System.out.println("自行车一辆");
            } else if (score >= 90) {
                System.out.println("游乐场一日游");
            } else if (score >= 80) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("打一顿");
            }
            score = sc.nextInt();
        }
        System.out.println("输入有误");
    }
}
