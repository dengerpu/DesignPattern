package ProxyPattern.staticProxy;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 18:35
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标代理对象（被代理对象）
        TeacherDao teacherDao = new TeacherDao();

        // 创建代理对象，同时将被代理对象传给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 执行的是代理对象的方法，代理对象再去调用目标对象方法
        teacherDaoProxy.teach();
    }
}
