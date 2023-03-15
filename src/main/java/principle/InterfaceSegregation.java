package principle;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-15 21:32
 * 接口隔离原则
 */
public class InterfaceSegregation {
    public static void main(String[] args) {
//        A a = new A();
//        a.depend1(new B());
//        a.depend2(new B());
//        a.depend3(new B());
//        C c = new C();
//        c.depend1(new D());
//        c.depend4(new D());
//        c.depend5(new D());
        newA newA = new newA();
        newA.depend1(new newB());
        newA.depend2(new newB());
        newA.depend3(new newB());
        newC newC = new newC();
        newC.depend1(new newD());
        newC.depend4(new newD());
        newC.depend5(new newD());
    }
}
// 接口隔离原则
interface InterfaceNew1 {
    void operation1();
}
interface InterfaceNew2 {
    void operation2();
    void operation3();
}
interface InterfaceNew3 {
    void operation4();
    void operation5();
}
class newB implements InterfaceNew1, InterfaceNew2 {

    @Override
    public void operation1() {
        System.out.println("B实现了InterfaceNew1的operation1方法");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了InterfaceNew2的operation2方法");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了InterfaceNew2的operation3方法");
    }
}
class newD implements InterfaceNew1, InterfaceNew3 {

    @Override
    public void operation1() {
        System.out.println("D实现了InterfaceNew1的operation1方法");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了InterfaceNew3的operation4方法");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了InterfaceNew3的operation5方法");
    }
}
class newA { // A类通过接口Interface1依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(InterfaceNew1 i) {
        i.operation1();
    }
    public void depend2(InterfaceNew2 i) {
        i.operation2();
    }
    public void depend3(InterfaceNew2 i) {
        i.operation3();
    }
}
class newC { // C类通过接口Interface1 依赖（使用） D类，但是只会用到1,4,5方法
    public void depend1(InterfaceNew1 i) {
        i.operation1();
    }
    public void depend4(InterfaceNew3 i) {
        i.operation4();
    }
    public void depend5(InterfaceNew3 i) {
        i.operation5();
    }
}



// 传统方法
// 接口1
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}
class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}
class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}
class A { // A类通过接口Interface1依赖（使用）B类，但是只会用到1,2,3方法
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface1 i) {
        i.operation2();
    }
    public void depend3(Interface1 i) {
        i.operation3();
    }
}
class C { // C类通过接口Interface1 依赖（使用） D类，但是只会用到1,4,5方法
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface1 i) {
        i.operation4();
    }
    public void depend5(Interface1 i) {
        i.operation5();
    }
}