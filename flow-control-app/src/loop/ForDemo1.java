package loop;

public class ForDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("1~100整数和" + sum);
        int sum2 = 0;
        for (int i = 0; i < 101; i += 2) {
            sum2 += i;
        }
        System.out.println("1~100偶数和" + sum2);
    }
}
