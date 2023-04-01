package VisitorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:15
 */
public abstract class Person {


    // 提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
