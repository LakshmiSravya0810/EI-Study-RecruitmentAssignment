package designpatterns.behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay();
        TVDisplay tv = new TVDisplay();

        station.addObserver(phone);
        station.addObserver(tv);

        station.setWeather("Sunny");
        station.setWeather("Rainy");
    }
}
