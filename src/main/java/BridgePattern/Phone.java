package BridgePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 19:51
 */
public abstract class Phone {
    // 组合品牌
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        this.brand.close();
    }
    protected void call() {
        this.brand.call();
    }

}
