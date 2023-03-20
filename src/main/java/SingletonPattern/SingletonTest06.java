package SingletonPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 21:00
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());
    }
}

// 双重检查
class Singleton6 {
    private Singleton6 (){}

    private static Singleton6 instance;

    // 提供一个静态的公有方法，加入双重检查代码，解决线程安全问题,同时解决懒加载问题
    // 同时保证了效率,推荐使用
    public static synchronized  Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                instance = new Singleton6();
            }
        }
        return instance;
    }
}
