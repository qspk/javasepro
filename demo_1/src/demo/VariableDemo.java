package demo;

public class VariableDemo {
    public static void main(String[] args) {
        //桃子个数
        int num = 10;
        //桃子单价
        double price = 66666.66;
        //桃树年龄
        int age = 100;
        //说话真假
        boolean b = false;

        System.out.println("树上有"+num+"颗桃");
        System.out.println("每颗桃售价"+price+"元");
        System.out.println("桃树生长了"+age+"年");
        System.out.println("上面三句话有两句是"+b);

        char c = 'A';
        int a = c;
        System.out.println(a);

    }

}
