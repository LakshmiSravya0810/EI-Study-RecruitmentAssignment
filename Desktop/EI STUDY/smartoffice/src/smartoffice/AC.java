package smartoffice;

public class AC implements Observer {
    @Override
    public void update(boolean occupied) {
        if (occupied) {
            System.out.println("AC turned ON.");
        } else {
            System.out.println("AC turned OFF.");
        }
    }
}
