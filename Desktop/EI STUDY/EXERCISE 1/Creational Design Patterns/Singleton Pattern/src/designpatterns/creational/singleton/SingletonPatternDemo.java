package designpatterns.creational.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Get the single instance of DatabaseConnection
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        // Try to get another instance
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        // Check if both instances are the same
        System.out.println(db1 == db2); // Should print true
    }
}
