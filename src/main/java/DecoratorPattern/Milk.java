package DecoratorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 14:22
 */
public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
