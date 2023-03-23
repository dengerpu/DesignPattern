package PrototypePattern.deepclone;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 12:49
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "宋江";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name= =" + p.name + "p.deepCloneableTarget= " + p.deepCloneableTarget.hashCode());
        System.out.println( "p2.name=" + p.name + "p2 deepCloneableTarget=" + p2 .deepCloneableTarget.hashCode());

    }
}
