package CommandPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 14:28
 */
public class TvOnCommand implements Command{

    private TvReceiver tv;

    public TvOnCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
