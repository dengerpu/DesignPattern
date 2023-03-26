package DecoratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-25 16:13
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
