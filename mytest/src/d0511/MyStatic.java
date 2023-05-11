package d0511;

public class MyStatic {
    private static int count;


    public MyStatic() {
    }

    public MyStatic(int count) {
        this.count = count;
    }

    /**
     * 获取
     * @return count
     */
    public static int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public static void setCount(int count) {
        MyStatic.count = count;
    }

    public String toString() {
        return "MyStatic{count = " + count + "}";
    }
}
