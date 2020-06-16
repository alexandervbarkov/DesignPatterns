package observer.model;

public class WeatherData {
    private int temp, humidity, pressure;

    public WeatherData(int temp, int humidity, int pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public int getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherData that = (WeatherData) o;

        if (temp != that.temp) return false;
        return humidity == that.humidity && pressure == that.pressure;
    }

    @Override
    public int hashCode() {
        int result = temp;
        result = 31 * result + humidity;
        result = 31 * result + pressure;
        return result;
    }
}
