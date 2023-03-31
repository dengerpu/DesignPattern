package CommandPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-30 21:28
 */
public class LightOnCommand implements Command{

    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
