package smartoffice;

import java.util.HashMap;
import java.util.Map;

public class OfficeConfig {
    private static OfficeConfig instance;
    private int roomCount;
    private Map<Integer, Room> rooms;

    // Private constructor to prevent multiple instances
    private OfficeConfig() {
        rooms = new HashMap<>();
    }

    // Get the single instance of OfficeConfig
    public static OfficeConfig getInstance() {
        if (instance == null) {
            instance = new OfficeConfig();
        }
        return instance;
    }

    public void configureRooms(int count) {
        this.roomCount = count;
        for (int i = 1; i <= roomCount; i++) {
            rooms.put(i, new Room(i));
        }
        System.out.println("Office configured with " + count + " meeting rooms.");
    }

    public Room getRoom(int roomId) {
        return rooms.get(roomId);
    }
}
