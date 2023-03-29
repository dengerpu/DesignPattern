package ProxyPattern.CglibProxy;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 20:46
 */
public class TeacherDao {
    public void teach() {
        System.out.println("老师授课中...，我是cglib代理，我不需要实现接口");
    }

    public void sayHello(String name) {
        System.out.println("你好~~~" + name);
    }
}
