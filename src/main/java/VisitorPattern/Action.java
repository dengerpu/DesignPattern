package VisitorPattern;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-31 22:12
 */
public abstract class Action {

    // 得到男性的评价
    public abstract void getManResult(Man man);

    // 得到女的评 价
    public abstract void getWomanResult(Woman woman);
}
