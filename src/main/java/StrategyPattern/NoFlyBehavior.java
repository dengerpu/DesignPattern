package StrategyPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-06 14:33
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞翔~~~");
    }
}
