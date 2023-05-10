public class Test_1 {
    public static void main(String[] args) {

        int n = 6;
        add(n);
    }

    private static void add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
