package BridgePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 19:57
 */
public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
