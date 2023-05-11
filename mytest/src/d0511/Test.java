package d0511;

public class Test {
    public static void main(String[] args) {
        MyStatic myStatic = new MyStatic(33);
        System.out.println(MyStatic.getCount());

        MyStatic.setCount(20);
        System.out.println(MyStatic.getCount());

        new MyStatic(10);
        System.out.println(MyStatic.getCount());
    }
}
