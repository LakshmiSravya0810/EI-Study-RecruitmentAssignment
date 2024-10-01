package designpatterns.behavioral.observer;

public class TVDisplay implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("TV display shows weather: " + weather);
    }
}
