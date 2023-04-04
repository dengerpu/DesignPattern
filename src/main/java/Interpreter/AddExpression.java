package Interpreter;

import java.util.HashMap;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-04 20:08
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 处理相加
    // var仍然是{a = 10, b = 20}
    // 一会我们debug 源码，就ok

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // super.left.interpreter(var) :返回left表达式对应的值a = 10
        // super.right.interpreter(var):返回right表达式对应值b = 20

        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
