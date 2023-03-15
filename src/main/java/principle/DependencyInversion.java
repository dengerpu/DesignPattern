package principle;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-15 22:23
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}
// 传统方法
//class Email {
//    public String getInfo() {
//        return "电子邮件信息：hello,world;";
//    }
//}
//// 如果我们获取的对象是微信，短信等等，则新增类，同时Perons也要增加相应的接收方法
//// 解决思路:引入一个抽象的接口IReceiver，表示接收者,这样Person类与接口IReceiver 发生依赖
//// 因为 Email, WeiXin等等属于接收的范围，他们各自实现IReceiver 接口就ok,这样我们就符号依赖倒转原则
//class Person {
//    public void receive(Email email) {
//        System.out.println(email.getInfo());
//    }
//}

// 利用依赖倒转原则
interface IReceiver {
    String getInfo();
}
class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "电子邮件信息：hello,world;";
    }
}
class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return"微信信息：hello,world;";
    }
}
class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}