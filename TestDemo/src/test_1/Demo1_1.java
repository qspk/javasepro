package test_1;

public class Demo1_1 {
    public static void main(String[] args) {
        int weight1 = 180;
        int weight2 = 200;
        boolean flag = weight1 == weight2 ? true : false;
        //体重相同flag为true,否则为false
        if (flag == true) {
            System.out.println("两只老虎体重一样");
        } else {
            System.out.println("两只老虎体重不一样");
        }
    }
}
