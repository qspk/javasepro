package branch;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Random r = new Random();
            int a = r.nextInt(3);
            int num = sc.nextInt();
            if (num == 9) {
                System.exit(0);
            }
            print(num);
            System.out.println("PC:");
            print(a);
            compare(a, num);
        }
    }

    private static void compare(int a, int num) {
        if (num == a) {
            System.out.println("平局");
        } else {
            if (num == 0 && a == 1 || num == 1 && a == 2 || num == 2 && a == 0) {
                System.out.println("win");
            } else {
                System.out.println("lose");
            }
        }
    }

    private static void print(int num) {
        if (num == 0) {
            System.out.println("石头");
        } else if (num == 1) {
            System.out.println("剪刀");
        } else if (num == 2) {
            System.out.println("布");
        } else {
            System.out.println("错误");
        }
    }
}
