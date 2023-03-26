package DecoratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-25 16:09
 */
public class Decorator extends Drink{
    private Drink obj;

    public Decorator(Drink obj) { // 聚合
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }
}
