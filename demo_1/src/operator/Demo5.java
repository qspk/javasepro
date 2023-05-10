package operator;

public class Demo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > 20 && ++b > 8);
        System.out.println(b);
        System.out.println(a < 20 || ++b > 87);
        System.out.println(b);

        int c = a^b;
        System.out.println(c);
        System.out.println(c ^ a); //b
        System.out.println(c ^ b); //a
        a=a^b;
        System.out.println(a);
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
