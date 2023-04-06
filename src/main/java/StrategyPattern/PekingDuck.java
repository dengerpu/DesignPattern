package StrategyPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-06 14:42
 */
public class PekingDuck extends Duck{

    // 假如北京鸭可以飞翔，但是飞翔技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~北京鸭~~");
    }
}
