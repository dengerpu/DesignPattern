package MementoPattern.game;

import java.util.ArrayList;
import java.util.HashMap;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-03 16:38
 */
public class Caretaker {

    // 如果只保存一次状态
    private Memento memento;
    // 对GameRole保存多次状态
    private ArrayList<Memento> mementos;

    // 对多个游戏角色保存多个状态
    private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
