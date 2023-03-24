package BridgePattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 19:59
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new UprightPhone(new ViVo());
        phone.open();
        phone.close();
        phone.call();
        System.out.println("================");
        Phone phone1 = new UprightPhone(new Xiaomi());
        phone1.open();
        phone1.close();
        phone1.call();
        System.out.println("================");
        Phone phone2 = new RotatePhone(new ViVo());
        phone2.open();
        phone2.close();
        phone2.call();
    }
}
