package UML.composition;


/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 17:10
 */
public class Computer {
     Mouse mouse = new Mouse(); // 整体与部分是可以不分开的，是组合关系
     Monitor monitor = new Monitor(); // 整体与部分是可以不分开的，是组合关系
}
