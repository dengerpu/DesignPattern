package BridgePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 19:53
 */
public class UprightPhone extends Phone{
    public UprightPhone(Brand brand) {
        super(brand);
    }

    private String typeName = "直立";

    @Override
    protected void open() {
        super.open();
        System.out.println(typeName +"手机打开");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println(typeName +"手机关闭");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println(typeName +"手机打电话");
    }
}
