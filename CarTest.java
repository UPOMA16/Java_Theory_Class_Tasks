class Car {
    String owner;
    String brand;
    String serialNumber;
    double fuel;
    boolean isRunning;

    void start() {
        if (fuel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("No fuel! Cannot start.");
        }
    }

    void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }

    double checkFuel() {
        return fuel;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.owner = "Upoma";
        myCar.brand = "Toyota";
        myCar.serialNumber = "SN12345";
        myCar.fuel = 10.5;

        System.out.println("Owner: " + myCar.owner);
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Serial: " + myCar.serialNumber);
        System.out.println("Fuel level: " + myCar.checkFuel());

        myCar.start();
        myCar.stop();
    }
}