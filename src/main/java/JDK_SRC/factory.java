package JDK_SRC;

import java.util.Calendar;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-22 20:57
 */
public class factory {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 注意月份下标从0开始，所以取月份要+1
        System.out.println("年:"+calendar.get(Calendar.YEAR));
        System.out.println("月:"+(calendar.get(Calendar.MONTH)+ 1));
        System.out.println("日:"+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:"+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:"+calendar.get(Calendar.MINUTE));
        System.out.println("秒:"+calendar.get(Calendar.SECOND));
    }
}
