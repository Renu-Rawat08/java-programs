// Parent class
class Vehicle {
    // Method to be overridden
    void startEngine() {
        System.out.println("The vehicle engine starts with a generic sound.");
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    // Overriding the parent method
    @Override
    void startEngine() {
        System.out.println("The car engine roars to life: Vroom!");
    }
}

// Subclass inheriting from Vehicle
class ElectricCar extends Vehicle {
    // Overriding the parent method
    @Override
    void startEngine() {
        System.out.println("The electric car turns on silently: Whirrrr.");
    }
}

// Main class to execute the code
public class Main {
    public static void main(String[] args) {
        // Parent reference pointing to Parent object
        Vehicle myVehicle = new Vehicle();
        
        // Parent references pointing to Subclass objects (Polymorphism)
        Vehicle myCar = new Car();
        Vehicle myElectricCar = new ElectricCar();

        // JVM decides which method to call at RUNTIME based on the object type
        myVehicle.startEngine();     // Outputs generic sound
        myCar.startEngine();         // Outputs Vroom!
        myElectricCar.startEngine(); // Outputs Whirrrr.
    }
}