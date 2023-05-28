package list;

import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<People> peoples = new ArrayList<>();

        peoples.add(new People("aa", 11));
        peoples.add(new People("bb", 22));

        People p1 = peoples.get(0);
        p1.setAge(33);
        People p2 = p1;
        p2.setName("cc");

        System.out.println(peoples);

        System.out.println(p1);
        System.out.println(p2);
    }
}
