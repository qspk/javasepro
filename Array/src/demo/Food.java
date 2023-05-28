package demo;

public class Food {
    private String name;        //菜品名
    private double originalPrice;       //菜品原价
    private double specialPrice;        //菜品优惠价
    private String info;        //菜品描述信息


    public Food() {
    }

    public Food(String name, double originalPrice, double specialPrice, String info) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.specialPrice = specialPrice;
        this.info = info;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return originalPrice
     */
    public double getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置
     * @param originalPrice
     */
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取
     * @return specialPrice
     */
    public double getSpecialPrice() {
        return specialPrice;
    }

    /**
     * 设置
     * @param specialPrice
     */
    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    /**
     * 获取
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    public String toString() {
        return "Food{name = " + name + ", originalPrice = " + originalPrice + ", specialPrice = " + specialPrice + ", info = " + info + "}";
    }
}
