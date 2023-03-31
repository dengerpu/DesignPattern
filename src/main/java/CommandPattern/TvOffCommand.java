package CommandPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 14:29
 */
public class TvOffCommand implements Command {
    private TvReceiver tv;

    public TvOffCommand(TvReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
