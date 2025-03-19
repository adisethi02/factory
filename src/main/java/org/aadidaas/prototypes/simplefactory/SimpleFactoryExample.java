package org.aadidaas.prototypes.simplefactory;

// Product Interface
interface IVehicle {
    void run();
}

// Concrete Products
class Car implements IVehicle {
    public void run() {
        System.out.println("Car is running on the road.");
    }
}

class Bike implements IVehicle {
    public void run() {
        System.out.println("Bike is running on the road.");
    }
}

class Plane implements IVehicle {
    public void run() {
        System.out.println("Plane is flying in the sky.");
    }
}

// Simple Factory
class VehicleFactory {
    public static IVehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "bike" -> new Bike();
            case "plane" -> new Plane();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
    }
}

// Usage
public class SimpleFactoryExample {
    public static void main(String[] args) {
        IVehicle car = VehicleFactory.createVehicle("car");
        car.run(); // Output: Car is running on the road.

        IVehicle plane = VehicleFactory.createVehicle("plane");
        plane.run(); // Output: Plane is flying in the sky.
    }
}

