package DecoratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 14:23
 */
public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
