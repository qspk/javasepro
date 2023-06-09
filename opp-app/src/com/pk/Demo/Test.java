package com.pk.Demo;

import java.util.Scanner;

public class Test {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];

        movies[0] = new Movie(1, "水门桥", 38.9, 9.8, "徐克", "吴京", "12万人想看");
        movies[1] = new Movie(2, "出拳吧", 39, 7.8, "唐晓白", "田雨", "3.5万人想看");
        movies[2] = new Movie(3, "月球陨落", 42, 7.9, "罗兰", "贝瑞", "17.9万人想看");
        movies[3] = new Movie(4, "一点就到家", 35, 8.7, "许宏宇", "刘昊然", "10.8万人想看");

        MovieOperation mo = new MovieOperation(movies);

        while (true) {
            System.out.println("==电影信息系统==");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询某个电影的详细信息");
            System.out.println("3.退出");
            System.out.println("请输入您的操作命令: ");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //展示全部电影信息
                    mo.printAllMovies();
                    break;
                case 2:
                    System.out.println("请您输入要查询电影的id: ");
                    int id = sc.nextInt();
                    mo.searchMovieById(id);
                    break;
                case 3:
                    System.out.println("感谢您的使用~~下次再来~~");
                    return;
                   /* System.exit(0);
                    break;*/
                default:
                    System.out.println("您输入的命令有问题~~");
            }
        }
    }
}
