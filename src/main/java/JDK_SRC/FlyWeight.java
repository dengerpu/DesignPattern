package JDK_SRC;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-29 16:46
 */
// 享元模式在JDK中的应用
public class FlyWeight {
    public static void main(String[] args) {

        // 如果Integer.valueOf(x)x在-128---127直接，就是使用享元模式返回,如果不在范围类，则仍然new

        //小结:
        //1.在valueOf方法中，先判断值是否在 IntegerCache 中，如果不在，就创建新的Integer(new)，否则，就直接从缓存池返回
        //2. valueOf方法，就使用到享元模式
        //3.如果使用valueOf 方法得到一个Integer实例，范围在-128- 127，执行速度比 new 快

        Integer x = Integer.valueOf(127);//得到x实例，类型
        Integer y = new Integer(127);//得到y 实例，类型
        Integer z = Integer.valueOf(127); //
        Integer w = new Integer(127);
        System.out.println(x.equals(y)); // 判断的是值  true
        System.out.println(x == y ); // false
        System.out.println(x == z ); // true
        System.out.println(w == x ); // false
        System.out.println(w == y ); // false


        Integer x1 = Integer.valueOf(200);
        Integer x2 = Integer.valueOf(200);
        System.out.println("x1==x2 = " + (x1 == x2));

    }
}
