package test_2;

import java.util.Random;

//定义功能，将数组中的0元素，使用1-10之间的随机数替换掉。
public class Demo_2 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 43, 5, 4, 6, 6, 7, 7, 88, 9, 9, 9, 0, 0, 9};
        replace_0(arr);
        print(arr);
    }

    public static void replace_0(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = r.nextInt(10) + 1;
            }
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
