package com.pk;

/*
    找素数
 */
public class Demo_7 {
    public static void main(String[] args) {
        int start = 101, end = 200;
        searchPrimeNumber(start, end);
    }

    public static void searchPrimeNumber(int start, int end) {
        int count = 0;
        loop1:
        for (int i = start; i <= end; i++) {
            for (int j = 2; j < i / 2; j++) {   //j <= i ,i=4时
                if (i % j == 0) {
                    continue loop1;
                }
            }
            count++;
            System.out.print(i + " ");
        }
        System.out.println("\n一共有" + count + "个素数");
    }
}
