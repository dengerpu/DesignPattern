package factory;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-22 19:38
 */
//相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());

        //使用简单工厂模式
        //new OrderPizza(new SimpleFactory());
        //System.out.println("~~退出程序~~");
    }
}
