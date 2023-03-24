package BridgePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 19:58
 */
public class ViVo implements Brand{
    @Override
    public void open() {
        System.out.println("ViVo手机开机");
    }

    @Override
    public void close() {
        System.out.println("ViVo手机关机");
    }

    @Override
    public void call() {
        System.out.println("ViVo手机打电话");
    }
}
