package com.pk;

//买飞机票
public class Demo_1 {
    public static void main(String[] args) {
        double price = 1000;   //价格
        int month = 8;      //月份
        int type = 0;       //座舱类型 0:经济舱  1:头等舱
        price = buyAirTicket(price, month, type);
        System.out.println("当前飞机票价格为: " + price);
    }

    public static double buyAirTicket(double price, int month, int type) {
        if (month >= 5 && month <= 10) {  //旺季
            switch (type) {
                case 0:
                    price *= 0.85;
                    break;
                case 1:
                    price *= 0.9;
                    break;
            }
        } else {
            switch (type) {
                case 0:
                    price *= 0.65;
                    break;
                case 1:
                    price *= 0.7;
                    break;
            }
        }
        return price;
    }
}
