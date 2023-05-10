package operator;

public class Demo6 {
    public static void main(String[] args) {
        int a = 170;
        int b = 140;
        int c = 190;
        int max = Math.max(a,b);
        max = Math.max(max, c);
        System.out.println(max);
        System.out.println((a > b ? a : b) > c ? (a > b ? a : b) : c);
    }


}
