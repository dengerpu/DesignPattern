package Interpreter;

import java.util.HashMap;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-04 16:00
 */
// 抽象类表达式，通过HashMap键值对，可以获取到变量的值
public abstract class Expression {
    // a+b-c
    // 解释公式和数值，key就是公布（表达式）参数[a,b,c],value就是具体指
    // HashMap {a = 10, b = 20}
    public abstract int interpreter(HashMap<String, Integer>var);
}
