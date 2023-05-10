package loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        int count = 0;
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        while (paperThickness < peakHeight) {
            paperThickness *= 2;
            count++;
        }
        System.out.println("纸折叠了" + count + "次");
        System.out.println("折叠纸张厚度:" + paperThickness + "毫米");
    }
}
