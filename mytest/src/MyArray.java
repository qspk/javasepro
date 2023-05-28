public class MyArray {
    public static void main(String[] args) {
        int[] a = {12, 42, 12};
        int[] b = {a[0],a[1],a[2]};
        b[0] = 1;

        System.out.println(a[0]);

    }
}
