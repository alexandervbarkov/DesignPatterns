package observer;

import observer.subject.Subject;
import observer.subject.WeatherStation;
import observer.model.WeatherData;
import observer.observer.MonitorDisplay;
import observer.observer.Observer;
import observer.observer.TvDisplay;

public class Application {
    public static void main(String... args) {
        Subject<WeatherData> weatherStation = new WeatherStation();
        Observer<WeatherData> tvDisplay = new TvDisplay();
        Observer<WeatherData> monitorDisplay = new MonitorDisplay();
        weatherStation.registerObserver(tvDisplay);
        weatherStation.registerObserver(monitorDisplay);
        weatherStation.notifyObservers(new WeatherData(50, 25, 50));
        weatherStation.removeObserver(tvDisplay);
        weatherStation.notifyObservers(new WeatherData(65, 20, 60));
    }
}
