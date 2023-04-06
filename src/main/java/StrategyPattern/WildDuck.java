package StrategyPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-06 14:47
 */
public class WildDuck extends Duck{

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
