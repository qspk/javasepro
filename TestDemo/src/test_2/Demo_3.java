package test_2;

//买飞机票
public class Demo_3 {
    public static void main(String[] args) {
        double price1 = calculate(1000, 6, "经济舱");
        double price2 = calculate(1000, 6, "头等舱");
        System.out.println("当前优惠价格为:" + price2);
    }

    public static double calculate(double price, int month, String type) {
        if (month >= 5 && month <= 10) { //旺季
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        } else {   //淡季
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
