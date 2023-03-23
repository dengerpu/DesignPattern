package builderPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 15:06
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙30cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼建造房顶");
    }
}
