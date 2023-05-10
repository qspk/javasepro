package loop;

public class ForDemo2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if (Math.pow(ge(i),3) + Math.pow(shi(i),3)+Math.pow(bai(i),3) == i) {
                System.out.print(i+"\t\t");
                count++;
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print('\t');
        }
    }


    private static int ge(int a) {
        return a % 10;
    }


    private static int shi(int num) {
        return num / 10 % 10;
    }

    private static int bai(int num) {
        return num / 100 % 10;
    }
}
