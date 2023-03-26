package DecoratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 14:25
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
