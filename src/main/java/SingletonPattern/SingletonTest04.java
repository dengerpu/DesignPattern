package SingletonPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 21:00
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance1 = Singleton4.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());
    }
}

// 懒汉式（线程安全）
class Singleton4 {
    private Singleton4 (){}

    private static Singleton4 instance;

    // 加入同步处理代码，解决线程安全问题
    public static synchronized  Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
