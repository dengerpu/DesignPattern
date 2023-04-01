package VisitorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:28
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man("张三"));
        objectStructure.attach(new Woman("李思曼"));

        // 成功
        Success success = new Success();
        objectStructure.display(success);

        System.out.println("========================");

        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
