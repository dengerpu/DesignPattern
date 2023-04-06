package StrategyPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-06 14:32
 */
public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技术高超~~~");
    }
}
