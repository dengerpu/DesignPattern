package CompositePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 17:10
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university  = new University("清华大学","985/211");
        OrganizationComponent colleage1 = new Colleage("计算机学院","计算机学院");
        OrganizationComponent colleage2 = new Colleage("软件学院","软件学院");
        university.add(colleage1);
        university.add(colleage2);
        colleage1.add(new Department("计算机技术", "111"));
        colleage1.add(new Department("人工智能", "111"));
        colleage1.add(new Department("大数据", "111"));
        colleage2.add(new Department("软件工程", "111"));
        university.print();
        System.out.println("================");
        colleage1.print();

    }
}
