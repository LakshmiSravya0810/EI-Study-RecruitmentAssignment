package smartoffice;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomId;
    private boolean occupied = false;
    private List<Observer> observers = new ArrayList<>();

    public Room(int roomId) {
        this.roomId = roomId;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setOccupied(boolean status) {
        this.occupied = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(occupied);
        }
    }

    public int getRoomId() {
        return roomId;
    }

    public boolean isOccupied() {
        return occupied;
    }
}
