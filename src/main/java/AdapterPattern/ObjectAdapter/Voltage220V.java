package AdapterPattern.ObjectAdapter;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 14:19
 */
// 被适配的类
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
