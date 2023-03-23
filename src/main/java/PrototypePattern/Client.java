package PrototypePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 10:36
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom", 1 , "白色");
        sheep.friend = new Sheep("jack",2, "黑色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        System.out.println("sheep1:" + sheep1);
        System.out.println("sheep2:" + sheep2);
        System.out.println("sheep3:" + sheep3);
        System.out.println("sheep4:" + sheep4);
        // 浅拷贝
        System.out.println(sheep1.friend.hashCode()); // 2125039532
        System.out.println(sheep.friend.hashCode()); // 2125039532
    }
}
