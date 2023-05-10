public class MyTest_1 {
    public static void main(String[] args) {
        /*
         *    127   0111 1111
         * +  127   01111111
         *    254   1000 0000 0111 1110    补码 0111 1111 1000 0011
         */
        byte b = 127;
        b += b;
        System.out.println(b);
        int c = Math.abs(-40);
        loop1:
        {
            while (true) {
                System.out.println(1);
                break loop1;
            }
        }

    }
}
