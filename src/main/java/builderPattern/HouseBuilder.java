package builderPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 14:56
 */
public abstract class HouseBuilder {

    House house = new House();

    // 将建造流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 建造房子，将产品（房子）返回
    public House buildHouse() {
        return house;
    }
}
