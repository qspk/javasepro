package com.pk;

public class MyString {
    //目标: 快速熟悉String提供的处理字符串的常用方法
    public static void main(String[] args) {
        byte[] bytes = {97, 98, 99};
        String rs = new String(bytes);
        System.out.println(rs);  //abc


        //1.获取字符串长度
        System.out.println(rs.length());  //3

        //2.获取字符串中某个索引位置处的字符
        char c = rs.charAt(0);
        System.out.println(c);  //a
        //2.1遍历字符串
        for (int i = 0; i < rs.length(); i++) {
            char ch = rs.charAt(i);
            System.out.print(ch);
        }
        System.out.println("-----------------------");

        //3.把字符串转换成字符数组,再进行遍历
        char[] chars = rs.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        //4.判断字符串内容,内容一样就返回true
        String s1 = new String("黑马");
        String s2 = new String("黑马");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        //5.忽略大小写比较字符串内容
        String c1 = "34aeFg";
        String c2 = "34Aefg";
        System.out.println(c1.equals(c2)); //false
        System.out.println(c1.equalsIgnoreCase(c2));  //true

        //6.截取字符串内容(包前不包后)
        String s3 = "Java是最好的编程语言之一";
        String rs2 = s3.substring(0, 8);
        System.out.println(rs2);  //Java是最好的

        //7.从当前索引位置一直截取到字符串额末尾
        String rs3 = s3.substring(5);
        System.out.println(rs3);  //最好的编程语言之一

        //8.把字符串中的某个内容替换成新内容,并返回新的字符串对象给我们
        String info = "这个电影简直是个垃圾,垃圾电影";
        String rs4 = info.replace("垃圾", "大便");
        System.out.println(rs4);

        //9.判断字符串中是否包含某个数字
        String info2 = "Java是最好的编程语言之一,我爱Java";
        System.out.println(info2.contains("Java"));  //true
        System.out.println(info2.contains("java"));     //false
        System.out.println(info2.contains("Java2"));    //false

        //10.判断字符串是否以某个字符串开头
        String rs5 = "张三丰";
        System.out.println(rs5.startsWith("张"));   //TRUE
        System.out.println(rs5.startsWith("张三"));  //TRUE
        System.out.println(rs5.startsWith("张三3"));  //false

        //11.把字符串按照某个指定内容分割成多个字符串,放到一个字符串数组中返回给我们
        String rs6 = "张无忌,周芷若,殷素素,赵敏";
        String[] names = rs6.split(",");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
