package JDK_SRC;

import java.util.Arrays;
import java.util.Comparator;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-06 15:22
 */
public class Strategy {
    public static void main(String[] args) {
        Integer[] data = {9,1,2,8,4,3};

        // 1.实现了Comparator接口（策略接口),匿名类对象new Comparator<Integer>(){..}
        // 2.对象new Comparator<Integer>(){..}就是实现了策略接口的对象
        // 3. public int compare(Integer o1, Integer o2){}指定具体的处理方式

//        public static <T> void sort(T[] a, Comparator<? super T> c) {
//            if (c == null) {
//                sort(a);
//            } else {
//                if (Arrays.LegacyMergeSort.userRequested)
//                    legacyMergeSort(a, c); // 使用策略对象C
//                else
                    // 使用策略对象C
//                    TimSort.sort(a, 0, a.length, c, null, 0, 0);
//            }
//        }
        Arrays.sort(data, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 >= o2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        System.out.println(Arrays.toString(data));

        Integer[] data2 = {19,11,12,18,14,13};
        Arrays.sort(data2, (var1, var2) -> {
           if (var1.compareTo(var2) > 0) {
               return -1;
           } else {
               return 1;
           }
        });
        System.out.println(Arrays.toString(data2));
    }
}
