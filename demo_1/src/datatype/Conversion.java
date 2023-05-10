package datatype;

public class Conversion {
    public static void main(String[] args) {
        byte b1 =4;
        byte b2 =4;
        //b1 = b1+b1;
        int rs1 = b1+b2;
        short s1 = 908;

        char c = 'f';
        int rs2 = c;
        c = (char)++rs2;
        System.out.println(++c);
    }
}
