package UML.composition;

import UML.dependency.IDCard;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 17:17
 */
public class Person{
    private IDCard card; // 聚合，整体和部分可以分开
    private Head head = new Head(); // 组合，整体和部分不可以分开
}
