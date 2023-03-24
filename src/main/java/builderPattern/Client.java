package builderPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 15:13
 */
public class Client {
    public static void main(String[] args) {
        // 准备盖普通的房子
        CommonsHouse commonsHouse = new CommonsHouse();
        // 准备创建房子的指挥者
        HouseDirector director = new HouseDirector(commonsHouse);
        // 完成盖房子，返回产品（房子）
        House house = director.ConstructHouse();
        System.out.println(house);

        System.out.println("-------------");
        // 准备盖高楼
        HighBuilding highBuilding = new HighBuilding();
        // 准备创建房子的指挥者
        HouseDirector director2 = new HouseDirector(highBuilding);
        // 完成盖房子，返回产品（房子）
        House house2 = director2.ConstructHouse();
        System.out.println(house2);
    }
}
