package BuilderPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 15:06
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBaise("高楼打地基100米");
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        house.setWall("高楼砌墙30cm");
        System.out.println("高楼砌墙30cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("高楼建造房顶");
        System.out.println("高楼建造房顶");
    }
}
