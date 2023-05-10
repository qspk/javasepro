package datatype;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);

        int a = 20;
        byte b = (byte)a;

        int i =199;
        byte j=(byte) i;
        System.out.println(j);
    }
}
