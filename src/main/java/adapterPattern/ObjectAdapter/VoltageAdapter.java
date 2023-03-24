package adapterPattern.ObjectAdapter;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 14:23
 */
// 对象适配器类
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; // 关联关系--聚合

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dist = 0;
        if (voltage220V != null ) {
            int src = voltage220V.output220V();// 获取220v电压
            System.out.println("使用对象适配器");
            dist = src / 44; // 转为5v
            System.out.println("适配完成，输出的电压为： " + dist);
        }

        return dist;
    }
}
