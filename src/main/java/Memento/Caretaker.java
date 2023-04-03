package Memento;

import java.util.ArrayList;
import java.util.List;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-03 16:13
 */
// 守护者对象（负责保存多个备忘录对象）
public class Caretaker {

    // 在List集合中会有很多的备忘录对象
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    // 获取到第index个Originator的备忘录对象（即保存状态）
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
