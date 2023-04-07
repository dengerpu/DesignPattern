package ChainOfResponsibilityPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-07 14:27
 */
// 请求类
public class PurchaseRequest {

    private int type = 0; //请求类型
    private float price = 0.0f; // 请求金额
    private int id = 0;

    // 构造器
    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
