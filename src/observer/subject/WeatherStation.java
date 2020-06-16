package observer.subject;

import observer.model.WeatherData;
import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject<WeatherData> {
    private List<Observer<WeatherData>> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer<WeatherData> observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer<WeatherData> observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(WeatherData weatherData) {
        observerList.forEach(weatherDataObserver -> weatherDataObserver.update(weatherData));
    }
}
