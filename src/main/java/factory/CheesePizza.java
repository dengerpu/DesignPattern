package factory;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-22 19:37
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }

}
