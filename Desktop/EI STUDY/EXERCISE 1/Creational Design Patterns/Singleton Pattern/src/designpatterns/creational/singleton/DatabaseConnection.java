package designpatterns.creational.singleton;

public class DatabaseConnection {
    // Static field to hold the single instance of the class
    private static DatabaseConnection instance;

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
        System.out.println("Database Connection established.");
    }

    // Public method to provide access to the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Example method
    public void connect() {
        System.out.println("Connecting to the database...");
    }
}
