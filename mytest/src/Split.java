import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String s = "e,ds,fds";
        String[] s2 = s.split(",");
        String s3 = Arrays.toString(s2);
        for (String s1 : s2) {
            System.out.print(s1);
        }
        System.out.println(s3);
    }
}
