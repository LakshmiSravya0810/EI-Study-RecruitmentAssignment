package designpatterns.behavioral.observer;

public interface WeatherSubject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
