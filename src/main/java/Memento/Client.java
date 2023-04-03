package Memento;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-03 16:17
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个需要保存状态的对象
        Originator originator = new Originator();
        // 创建一个守护者对象（负责保存备忘录对象）
        Caretaker caretaker = new Caretaker();

        originator.setState("状态#1  攻击力100");
        // 保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#2  攻击力100");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#3  攻击力50");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是=" + originator.getState());

        // 希望得到状态1 ，将originator恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1，当前的状态是");
        System.out.println("当前的状态是=" + originator.getState());
    }
}
