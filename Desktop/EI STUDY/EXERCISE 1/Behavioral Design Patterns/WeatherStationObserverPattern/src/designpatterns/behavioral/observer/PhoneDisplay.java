package designpatterns.behavioral.observer;

public class PhoneDisplay implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("Phone display shows weather: " + weather);
    }
}
