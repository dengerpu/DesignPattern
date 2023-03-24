package AdapterPattern.ObjectAdapter;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 14:25
 */
public class Phone {
    // 充电
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5v,可以正常充电");
        } else {
            System.out.println("电压异常不能充电");
        }
    }
}
