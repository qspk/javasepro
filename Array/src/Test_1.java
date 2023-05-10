import java.util.Random;

public class Test_1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = r.nextInt(5);
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
