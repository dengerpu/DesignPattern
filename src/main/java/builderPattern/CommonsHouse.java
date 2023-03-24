package builderPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 15:04
 */
public class CommonsHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBaise("普通房子打地基10米");
        System.out.println("普通房子打地基10米");
    }

    @Override
    public void buildWalls() {
        house.setWall("普通房子砌墙10cm");
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通房子屋顶");
        System.out.println("普通房子屋顶");
    }
}
