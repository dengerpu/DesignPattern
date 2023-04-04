package MementoPattern.game;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-03 16:34
 */
// 备忘录对象
public class Memento {

    // 攻击力
    private int vit;
    // 防御力
    private int def;

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
