package factory;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-22 19:36
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }

}