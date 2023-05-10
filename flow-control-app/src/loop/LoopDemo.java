package loop;

public class LoopDemo {
    public static void main(String[] args) {
        int i = 0, j = 0;
        loop:
        while (true) {
            j++;
            while (true) {
                i++;
                if (i < 3) {
                    continue loop;
                }
                System.out.println("i=3");
                break loop;
            }
        }
        System.out.println(j);
    }
}
