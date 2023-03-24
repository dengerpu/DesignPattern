package adapterPattern.ObjectAdapter;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 14:27
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("===适配器模式===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
