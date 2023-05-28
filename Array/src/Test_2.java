import java.util.ArrayList;

public class Test_2 {
    /**
     * 集合删除的两种方式
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("黑枸杞");
        list.add("大枸杞");
        list.add("JAVA入门");
        list.add("数据结构");
        list.add("枸杞");
        list.add("枸杞子");
        System.out.println(list);

//        list.removeIf(s -> s.contains("枸杞"));
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("枸杞")) {
                list.remove(i);
                i--;
            }
        }*/

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).contains("枸杞")) {
                list.remove(i);
            }
        }

        System.out.println(list);
    }
}
