package ObserverPattern.improve;

import java.util.ArrayList;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-02 15:06
 */
public class WeatherData implements Subject{

    private float temperature;

    private float pressure;

    private float humidity;

    // 观察者集合
    private ArrayList<Observer> observes;

    // 加入新的第三方
    public WeatherData() {
       observes = new ArrayList<>();
    }

    public void dataChange() {
        // 调用接入方的update
        notifyObservers();
    }

    // 当数据有更新时，就调用setData
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 调用dataChange,将最新的信息 推送给 接入方 currentConditions
        dataChange();
    }


    // 注册一个观察者
    @Override
    public void registerObserver(Observer o) {
        observes.add(o);
    }

    // 移除一个观察者
    @Override
    public void removeObserver(Observer o) {
        if (observes.contains(o)) {
            observes.remove(o);
        }
    }

    // 遍历所有的观察者，并通知
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observes.size(); i++) {
            observes.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
