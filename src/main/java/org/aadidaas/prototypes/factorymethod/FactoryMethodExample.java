package org.aadidaas.prototypes.factorymethod;

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

// Factory Method (Abstract Creator)
abstract class VehicleFactory {
    abstract IVehicle createVehicle();

    void testRun() {
        IVehicle vehicle = createVehicle();
        vehicle.run();
    }
}

// Concrete Factories
class CarFactory extends VehicleFactory {
    IVehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    IVehicle createVehicle() {
        return new Bike();
    }
}

class PlaneFactory extends VehicleFactory {
    IVehicle createVehicle() {
        return new Plane();
    }
}

// Usage
public class FactoryMethodExample {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.testRun(); // Output: Car is running on the road.

        VehicleFactory planeFactory = new PlaneFactory();
        planeFactory.testRun(); // Output: Plane is flying in the sky.
    }
}
