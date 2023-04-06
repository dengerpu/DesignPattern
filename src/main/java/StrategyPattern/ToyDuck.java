package StrategyPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-06 14:45
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

}
