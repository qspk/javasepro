import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int luckNumber = r.nextInt(100) + 1;
        do {
            System.out.println("请输入您猜测的数字:");
            int num = sc.nextInt();
            if (luckNumber == num) {
                System.out.println("猜对了!");
                break;
            } else if (num > luckNumber) {
                System.out.println("猜大了,再猜一次~");
            } else {
                System.out.println("猜小了,再猜一次~");
            }
        } while (true);
    }
}
