package operator;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Demo1 {
    public static void main(String[] args) {
        int a =2;
        int b =1;
        double c = 4.3;
        System.out.println("pk"+a+b);
        System.out.println(a+"pk"+b);
        System.out.println(a+'a'+b);
        System.out.println('a'+a+b);
        System.out.println(c+"pk"+a);
        System.out.println("pk"+c+a);
        System.out.println(c+'a'+a);
    }
}
