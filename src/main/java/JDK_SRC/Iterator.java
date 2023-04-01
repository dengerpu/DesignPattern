package JDK_SRC;

import java.util.ArrayList;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-01 15:56
 */
public class Iterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("jack");
        arrayList.add("tom");

        java.util.Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
