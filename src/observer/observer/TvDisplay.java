package observer.observer;

import observer.model.WeatherData;

public class TvDisplay implements Observer<WeatherData> {
    @Override
    public void update(WeatherData weatherData) {
        System.out.println("TV: " + weatherData.toString());
    }
}
