package com.pk;
//找素数优化
public class Demo_7_1 {
    public static void main(String[] args) {
        System.out.println(getSu(101, 200));
    }

    public static int getSu(int start, int end) {
        int count = 0;
        //健壮性判断
        int max = Math.max(start, end);
        int min = Math.min(start, end);

        for (int i = min; i <= max; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        return count;
    }
}
