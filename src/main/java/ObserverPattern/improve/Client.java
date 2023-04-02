package ObserverPattern.improve;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-02 15:25
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();

        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        // 注册到 weatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        System.out.println("通知各个注册者，看看信息");
        weatherData.setData(15f,40f,30f);

        weatherData.removeObserver(currentConditions);

        weatherData.setData(10f,20f,30f);
    }
}
