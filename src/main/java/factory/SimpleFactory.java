package factory;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-22 19:27
 */
// 简单工厂类
public class SimpleFactory {

    // 返回对应的Pizza
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }  else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
