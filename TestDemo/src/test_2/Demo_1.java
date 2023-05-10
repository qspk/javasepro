package test_2;
//定义功能，计算出数组中指定元素出现的次数。
public class Demo_1 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 43, 5, 4, 6, 6, 7, 7, 88, 9, 9, 9, 0, 0, 9};
        int n = 9;
        int count = counting(arr, n);
        System.out.println(n + "在数组中出现了" + count + "次");
    }

    public static int counting(int[] arr, int n) {
        int count = 0;
        for (int i : arr) {
            if (i == n) {
                count++;
            }
        }
        return count;
    }
}
