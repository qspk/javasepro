public class EnhanceFor {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};

        for (int i : arr) {
            i = 3;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
