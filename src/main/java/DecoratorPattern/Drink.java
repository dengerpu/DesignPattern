package DecoratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-25 16:07
 */
// Component主体
public abstract class Drink {

    public String des; // 藐视
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 计算费用的抽象方法
    // 子类来实现
    public abstract float cost();
}
