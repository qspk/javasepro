package com.pk;

/*
    拷贝数组
 */
public class Demo_5 {
    public static void main(String[] args) {
        int[] arr0 = {11, 22, 33};
        int[] arr = copyArray(arr0);
        printArray(arr0);
        printArray(arr);
    }

    public static int[] copyArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
}
