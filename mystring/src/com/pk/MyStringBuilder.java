package com.pk;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("红色");
        System.out.println(sb == sb2);
        //链式编程
        sb.append("红色").append("蓝色");

        System.out.println("反转前" + sb);
        sb.reverse();
        System.out.println("反转后" + sb);

        System.out.println(sb.length());

        String s = sb.toString();
        System.out.println(s);
        int[] arr = {1, 2, 3};
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{");
        for (int i = 0; i < arr.length; i++) {
            sb3 = i == arr.length - 1 ? sb3.append(arr[i]).append("}") : sb3.append(arr[i]).append(",");
        }
        System.out.println(sb3);
    }
}
