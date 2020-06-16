package observer.observer;

import observer.model.WeatherData;

public class MonitorDisplay implements Observer<WeatherData> {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Monitor: " + weatherData.toString());
    }
}
