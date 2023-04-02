package ObserverPattern.improve;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-02 15:24
 */
public class BaiduSite implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;
    // 更新天气情况，是由WeatherData来调用，我使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("===百度网站===");
        System.out.println("***百度网站气温:" +temperature + "***");
        System.out. println("***百度网站气压: "+ pressure + "***");
        System.out.println("***百度网站湿度:"+ humidity + "***");
    }
}
