package AdapterPattern.classAdapter;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 14:23
 */
// 适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();// 获取220v电压
        int dist = src / 44; // 转为5v
        return dist;
    }
}
