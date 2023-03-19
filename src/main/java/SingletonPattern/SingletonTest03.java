package SingletonPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 21:00
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance1 = Singleton3.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());
    }
}

// 懒汉式（线程不安全）
class Singleton3 {
    private Singleton3 (){}

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
