package loop;

public class LoopDemo2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + '\t');
            }
            System.out.println();
        }
        int temp;
        for (int i = 0; i < 9; i++) {
            if (i >= 5 && i<8) {
                temp = 4 - (i % 4);
            } else if (i == 8) {
                temp = 0;
            }else {
                temp = i;
            }
            for (int j = 0; j < 9 ; j++) {
                System.out.print(" ");
                if (j == 4 - temp || j == 4 + temp) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
