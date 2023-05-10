package com.pk;

//数据加密
public class Demo_4 {
    public static void main(String[] args) {
        int number = 1983;
        int[] numbers = split(number);
        String data = encrypt(numbers);
        System.out.println(data);
        data = encrypt(numbers);
        System.out.println(data);
    }
    //加密算法
    private static String encrypt(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        reverse(numbers);
        String data = "";
        for (int i : numbers) {
            data += i;
        }
        return data;
    }
    //反转数组
    private static void reverse(int[] numbers) {
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
    //分割整数为数组
    private static int[] split(int number) {
        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = number / 100 % 10;
        numbers[2] = number / 10 % 10;
        numbers[3] = number % 10;
        return numbers;
    }
}
