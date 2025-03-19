package org.aadidaas.prototypes.abstractfactory;

// Product Interfaces
interface ICar {
    void run();
}

interface IBike {
    void run();
}

interface IPlane {
    void run();
}

// Concrete Products for Electric Vehicles
class ElectricCar implements ICar {
    public void run() {
        System.out.println("Electric Car is running silently.");
    }
}

class ElectricBike implements IBike {
    public void run() {
        System.out.println("Electric Bike is running with zero emissions.");
    }
}

class ElectricPlane implements IPlane {
    public void run() {
        System.out.println("Electric Plane is flying with no fuel consumption.");
    }
}

// Concrete Products for Gasoline Vehicles
class GasolineCar implements ICar {
    public void run() {
        System.out.println("Gasoline Car is running with a roaring engine.");
    }
}

class GasolineBike implements IBike {
    public void run() {
        System.out.println("Gasoline Bike is running with a loud exhaust.");
    }
}

class GasolinePlane implements IPlane {
    public void run() {
        System.out.println("Gasoline Plane is flying using jet fuel.");
    }
}

// Abstract Factory
interface VehicleFactory {
    ICar createCar();

    IBike createBike();

    IPlane createPlane();
}

// Concrete Factory for Electric Vehicles
class ElectricVehicleFactory implements VehicleFactory {
    public ICar createCar() {
        return new ElectricCar();
    }

    public IBike createBike() {
        return new ElectricBike();
    }

    public IPlane createPlane() {
        return new ElectricPlane();
    }
}

// Concrete Factory for Gasoline Vehicles
class GasolineVehicleFactory implements VehicleFactory {
    public ICar createCar() {
        return new GasolineCar();
    }

    public IBike createBike() {
        return new GasolineBike();
    }

    public IPlane createPlane() {
        return new GasolinePlane();
    }
}

// Usage
public class AbstractFactoryExample {
    public static void main(String[] args) {
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        ICar electricCar = electricFactory.createCar();
        electricCar.run(); // Output: Electric Car is running silently.

        IBike gasolineBike = new GasolineVehicleFactory().createBike();
        gasolineBike.run(); // Output: Gasoline Bike is running with a loud exhaust.
    }
}

