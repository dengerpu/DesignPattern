package ObserverPattern.improve;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-02 14:59
 */
// 观察者接口，有观察者来实现
public interface Observer {

    public void update(float temperature, float pressure,float humidity);

}
