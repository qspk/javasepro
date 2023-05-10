package demo;
public class Variable {

    public static void main(String[] args) {
        int age = 11;
        System.out.println(age);
        age++;
        System.out.println(age++);

        System.out.println(age);

        System.out.println(++age);
        System.out.println(age);
        System.out.println("----------------");
        int a = 10;
        int b = 12;
        int c = a > b ? 10 : 12;
        System.out.println(false ? a : b);
        System.out.println(c);
    }
}
