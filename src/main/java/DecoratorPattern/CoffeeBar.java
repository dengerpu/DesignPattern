package DecoratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 14:28
 */
public class CoffeeBar {
    public static void main(String[] args) {
        // 装饰者模式下单： 2份巧克力 + 一份牛奶的LongBlack

        // 点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用：" + order.cost());
        System.out.println("描述:" + order.getDes());

        // 加一份牛奶
       order = new Milk(order);
        System.out.println("加一份牛奶，费用：" + order.cost());
        System.out.println("加一份牛奶，描述:" + order.getDes());

        // 加一份巧克力
        order = new Chocolate(order);
        System.out.println("一份巧克力 加一份牛奶，费用：" + order.cost());
        System.out.println("一份巧克力 加一份牛奶，描述:" + order.getDes());
        // 加一份巧克力
        order = new Chocolate(order);
        System.out.println("2份巧克力 加一份牛奶，费用：" + order.cost());
        System.out.println("2份巧克力 加一份牛奶，描述:" + order.getDes());

        System.out.println("====================");
        Drink order2 = new DeCaf();
        System.out.println("无因咖啡，费用：" + order2.cost());
        System.out.println("无因咖啡，描述:" + order2.getDes());

        order2 = new Milk(order2);
        System.out.println("无因咖啡 加一份牛奶，费用：" + order2.cost());
        System.out.println("无因咖啡 加一份牛奶，描述:" + order2.getDes());
    }
}
