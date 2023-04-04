package MementoPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-03 16:08
 */
// 备忘录对象（负责保存好记录）
public class Memento {

    private String state;

    // 构造器
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
