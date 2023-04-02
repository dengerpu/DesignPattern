package ObserverPattern.improve;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-02 15:04
 */
// 接口,让 WeatherData来实现
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
