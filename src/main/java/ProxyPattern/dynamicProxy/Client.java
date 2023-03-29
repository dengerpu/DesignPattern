package ProxyPattern.dynamicProxy;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 19:56
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        ITeacherDao target = new TeacherDao();

        // 给目标，创建代理对象，可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        proxyInstance.sayHello("张三");
        System.out.println("==============");
        proxyInstance.teach();
    }
}
