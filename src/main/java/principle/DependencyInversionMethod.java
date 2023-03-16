package principle;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-15 22:36
 */
// 依赖传递三种方式
public class DependencyInversionMethod {
    public static void main(String[] args) {
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}

//// 通过接口传递实现依赖
//// 开关的接口
//interface IOpenAndClose {
//    public void open(ITV tv); // 抽象方法；接收接口
//}
//interface ITV { // ITV 接口
//    public void play();
//}
//class ChangHong implements ITV {
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//}
//// 实现接口
//class OpenAndClose implements IOpenAndClose {
//    @Override
//    public void open(ITV tv) {
//        tv.play();;
//    }
//}

//// 方式2，通过构造方法传递依赖
//interface IOpenAndClose {
//    public void open(); // 抽象方法
//}
//interface ITV { // ITV接口
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv; // 成员
//
//    public OpenAndClose(ITV tv) { // 构造器
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}
//class ChangHong implements ITV {
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//}

// 方式三:通过setter方法传递
interface IOpenAndClose {
    public void open(); // 抽象方法

    public void setTv(ITV tv);
}
interface ITV { // ITV接口
    public void play();
}
class OpenAndClose implements IOpenAndClose {

    public ITV tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}
class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}