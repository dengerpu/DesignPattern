package CommandPattern;

import javafx.scene.effect.Light;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-30 20:28
 */
public class LightOffCommand implements Command{

    // 聚合LightReceiver
    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        light.off();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        light.on();
    }
}
