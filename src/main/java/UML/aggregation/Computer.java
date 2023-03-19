package UML.aggregation;


/***
 * @author dep
 * @version 1.0
 * @date 2023-03-19 17:10
 */
public class Computer {
    private Mouse mouse; // 整体与部分是可以分开的，是聚合关系
    private Monitor monitor; // 整体与部分是可以分开的，是聚合关系

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
