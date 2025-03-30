package parkinglot;

import parkinglot.vehicletype.Car;
import parkinglot.vehicletype.Motorcycle;
import parkinglot.vehicletype.Truck;
import parkinglot.vehicletype.Vehicle;

public class ParkingLotDemo {
    public static void run() {
        ParkingLot parkingLot = ParkingLot.getInstance();// singleton
        parkingLot.addLevel(new Level(1, 5));
        parkingLot.addLevel(new Level(2, 6));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorcycle = new Motorcycle("M1234");

        // Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
    public static void main(String args[]){
        run();
    }
}
