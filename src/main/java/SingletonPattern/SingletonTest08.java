package SingletonPattern;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.EnumMap;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 21:00
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance1 = Singleton8.INSTANCE;
        System.out.println(instance == instance1);
        instance1.sayok();
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());
    }
}

// 枚举
enum Singleton8{
    INSTANCE;
    public void sayok() {
        System.out.println("ok");
    }
}
