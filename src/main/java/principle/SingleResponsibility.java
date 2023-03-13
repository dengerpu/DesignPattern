package principle;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-13 22:31
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        // 方案一  违反单一职责原则
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("轮船");
        vehicle.run("飞机");

        // 方案二 遵循单一职责原则
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WatterVehicle watterVehicle = new WatterVehicle();
        watterVehicle.run("轮船");

        // 方案三
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runAir("飞机");
        vehicle2.runRoad("公路");
        vehicle2.runWatter("轮船");
    }


}
// 交通工具类
// 方式1，run方法违反了单一职责原则
// 解决方案，根据交通工具运行方法不同，分解成不同的类
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}
// 方案2  遵循了单一职责原则
// 但是这样做的改动很大，即 将类分解，同时修改客户端
// 改进： 直接修改Vehicle类，改动的代码会比较少
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上运行...");
    }
}

class WatterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上运行...");
    }
}

// 方案三
// 这种修改方法没有对原来的类做大的修改，只是增加方法
// 这李虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责原则
class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在公路上运行...");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行...");
    }
    public void runWatter(String vehicle) {
        System.out.println(vehicle + "在水上运行...");
    }
}

