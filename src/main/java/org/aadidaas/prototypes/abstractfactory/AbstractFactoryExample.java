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

// Concrete Products for Petrol Vehicles
class PetrolCar implements ICar {
    public void run() {
        System.out.println("Petrol Car is running with a roaring engine.");
    }
}

class PetrolBike implements IBike {
    public void run() {
        System.out.println("Petrol Bike is running with a loud exhaust.");
    }
}

class PetrolPlane implements IPlane {
    public void run() {
        System.out.println("Petrol Plane is flying using jet fuel.");
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

// Concrete Factory for Petrol Vehicles
class PetrolVehicleFactory implements VehicleFactory {
    public ICar createCar() {
        return new PetrolCar();
    }

    public IBike createBike() {
        return new PetrolBike();
    }

    public IPlane createPlane() {
        return new PetrolPlane();
    }
}

// Usage
public class AbstractFactoryExample {
    public static void main(String[] args) {
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        ICar electricCar = electricFactory.createCar();
        electricCar.run(); // Output: Electric Car is running silently.

        IBike PetrolBike = new PetrolVehicleFactory().createBike();
        PetrolBike.run(); // Output: Petrol Bike is running with a loud exhaust.
    }
}

