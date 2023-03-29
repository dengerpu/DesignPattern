package ProxyPattern.dynamicProxy;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 19:23
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("开始授课....");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hi~" + name);
    }
}
