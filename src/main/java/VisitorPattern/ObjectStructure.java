package VisitorPattern;

import java.util.LinkedList;
import java.util.List;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:22
 */
public class ObjectStructure {
    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //增加到list
    public void  attach(Person p) {
        persons.add(p);
    }
    // 移除
    public void detach(Person p) {
        persons.remove(p);
    }

    // 显示测评情况
    public void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }
}
