package SingletonPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 20:20
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());
    }
}

// 饿汉式（静态代码块）
// 1.构造器私有化（防止new）
// 2.类的内部创建
// 3.向外暴露一个静态的公共方法
// 4.代码实现

class Singleton2 {
    // 1.构造器私有化，外部不能 new
    private Singleton2() {

    }
    // 2.在本类内部创建实例对象
    private final static Singleton2 singleton;

    static {
        singleton = new Singleton2();
    }

    // 3.向外暴露一个静态的公共方法
    public static Singleton2 getInstance() {
        return singleton;
    }
}
