package SingletonPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 20:20
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:" + instance.hashCode());
        System.out.println("instance1:" + instance1.hashCode());
    }
}

// 饿汉式（静态变量）
// 1.构造器私有化（防止new）
// 2.类的内部创建
// 3.向外暴露一个静态的公共方法
// 4.代码实现

class Singleton {
    // 1.构造器私有化，外部不能 new
    private Singleton() {

    }
    // 2.在本类内部创建实例对象
    private final static Singleton singleton = new Singleton();

    // 3.向外暴露一个静态的公共方法
    public static Singleton getInstance() {
        return singleton;
    }
}
