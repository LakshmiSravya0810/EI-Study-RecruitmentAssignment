package smartoffice;

public class BookRoomCommand implements Command {
    private Room room;

    public BookRoomCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (!room.isOccupied()) {
            room.setOccupied(true);
            System.out.println("Room " + room.getRoomId() + " booked successfully.");
        } else {
            System.out.println("Room " + room.getRoomId() + " is already occupied.");
        }
    }
}
