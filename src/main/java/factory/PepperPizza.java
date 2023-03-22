package factory;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-22 19:37
 */
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给胡椒披萨准备原材料 ");
    }

}
