package JDK_SRC;

import java.util.HashMap;
import java.util.Map;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-26 19:39
 */
public class Composite {
    public static void main(String[] args) {
        // 说明
        // 1. Map就是一个抽象的构建（类似我们的Component)
        // 2. HashMap是一个中间的构建(Composite)，实现/继承了相关方法有put，putall
        // 3. Node 是 HashMap的静态内部类，类似Leaf叶子节点，这里就没有put,putall
        // static class Node<K,V> implements Map.Entry<K,v>


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"红楼梦");


        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(2,"三国演义");
        map1.put(3,"水浒传");
        map1.put(4,"西游记");

        map.putAll(map1);
        System.out.println(map);
    }
}
