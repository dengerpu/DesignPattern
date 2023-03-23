package builderPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 15:04
 */
public class CommonsHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基10米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
