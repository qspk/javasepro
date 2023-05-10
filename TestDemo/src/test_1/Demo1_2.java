package test_1;

public class Demo1_2 {
    public static void main(String[] args) {
        int height1 =150;
        int height2 =210;
        int height3 =165;
        //两次连续的三元运算求出三者的最高身高
        int max = (height1 > height2 ? height1 : height2) > height3 ? (height1 > height2 ? height1 : height2) : height3;
        System.out.println("最高身高为:"+ max+"cm");

    }
}
