package smartoffice;

public class SmartOfficeMain {
    public static void main(String[] args) {
        OfficeConfig office = OfficeConfig.getInstance();
        office.configureRooms(3);

        Room room1 = office.getRoom(1);
        Room room2 = office.getRoom(2);

        // Add observers (lights and AC)
        Light light = new Light();
        AC ac = new AC();
        room1.addObserver(light);
        room1.addObserver(ac);

        // Create booking and cancellation commands
        BookRoomCommand bookRoom1 = new BookRoomCommand(room1);
        CancelRoomCommand cancelRoom1 = new CancelRoomCommand(room1);

        RemoteControl remote = new RemoteControl();

        // Book Room 1
        remote.setCommand(bookRoom1);
        remote.pressButton();

        // Cancel Room 1
        remote.setCommand(cancelRoom1);
        remote.pressButton();
    }
}
