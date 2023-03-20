package SingletonPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 21:00
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance1 = Singleton7.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());
    }
}

// 静态内部类
class Singleton7 {
    private Singleton7 (){}

    // 写一个静态内部类该类中有一个静态属性 Singleton7
    private static class SingletonClass {
        private static final Singleton7 instance = new Singleton7();
    }

    public static synchronized  Singleton7 getInstance() {
        return SingletonClass.instance;
    }
}
