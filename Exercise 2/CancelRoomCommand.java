package smartoffice;

public class CancelRoomCommand implements Command {
    private Room room;

    public CancelRoomCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (room.isOccupied()) {
            room.setOccupied(false);
            System.out.println("Room " + room.getRoomId() + " booking cancelled.");
        } else {
            System.out.println("Room " + room.getRoomId() + " is not currently booked.");
        }
    }
}
