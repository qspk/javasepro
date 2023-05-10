public class Test_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        print(arr);
        int[] arr1 = {};
        int[] arr2 = null;
        print(arr1);
        print(arr2);
    }

    private static void print(int[] arr) {
        if (arr == null) {
            System.out.println((Object) null);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}
