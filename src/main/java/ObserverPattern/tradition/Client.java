package ObserverPattern.tradition;

public class Client {
	public static void main(String[] args) {
		//创建接入方currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//创建WeatherData并将接入方currentConditions 传递到WeatherData中
		WeatherData weatherData = new WeatherData(currentConditions);
		

		weatherData.setData(30, 150, 40);

		System.out.println("============天气发生变化=============");
		weatherData.setData(40, 160, 20);
		

	}
}
