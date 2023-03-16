package principle;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-16 21:28
 * 里氏替换原则
 */
public class RichterSubstitution {
    public static void main(String[] args) {
        AA a = new AA();
        System.out.println(a.func1(3, 2));

        BB bb = new BB();
        System.out.println(bb.func1(3,2)); // 本意是求3-2，但是子类BB无意改写了
        System.out.println(bb.fun2(3,2));
        System.out.println(bb.fun3(3,2));

    }

}
//// 传统方式
//// Aa类
//class AA {
//    // 返回两个数的差
//    public int func1(int num1, int num2) {
//        return num1 - num2;
//    }
//}
//// BB类继承了AA
//class BB extends AA {
//    // 这里，重写AA类的方法，可能是无意识的
//    public int func1(int a, int b) {
//        return a+b;
//    }
//    public int fun2(int a, int b) {
//        return func1(a,b) + 9;
//    }
//}

// 里氏替换原则
// 创建一个更加基础的基类
class Base {
    // 把更加基础的方法和成员写到Base类
}
// Aa类继承Base类
class AA extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}
// BB类继承了AA
class BB extends Base {

    // 如果B需要使用A类的方法,使用组合关系
    private AA a = new AA();

    public int func1(int a, int b) {
        return a+b;
    }
    public int fun2(int a, int b) {
        return func1(a,b) + 9;
    }
    // 仍然想使用A的方法
    public int fun3(int a, int b) {
        return this.a.func1(a,b);
    }
}
