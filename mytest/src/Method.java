public class Method {
    public static void main(String[] args) {
        print();
        String s = "wq";
        String[] ss = {"w", "q"};
    }

    private static void print1() {
        System.out.println("print1");
    }

     static void print() {
        print1();
    }

}
