package ProxyPattern.CglibProxy;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 20:55
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();

        TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayHello("张三");

    }
}
