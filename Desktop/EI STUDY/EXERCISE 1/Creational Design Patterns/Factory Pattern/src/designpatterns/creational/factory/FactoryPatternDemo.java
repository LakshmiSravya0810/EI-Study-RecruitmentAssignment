package designpatterns.creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.drive();
    }
}
