

/*
 * Inheritance: Basics, Using super, Multilevel Hierarchy, When Constructors Are Executed,
 * Method Overriding, Dynamic Method Dispatch, Using final with Inheritance
 *
 * 1. Basics:
 * - Inheritance allows a class (subclass) to inherit fields and methods from another class (superclass).
 * - Syntax: `class Subclass extends Superclass`
 * - Promotes code reuse and establishes an "is-a" relationship (e.g., Car is-a Vehicle).
 *
 * 2. Using super:
 * - The `super` keyword refers to the superclass.
 * - Used to call superclass constructors (`super(args)`) or methods (`super.method()`).
 *
 * 3. Multilevel Hierarchy:
 * - A class can inherit from a subclass, forming a chain (e.g., A -> B -> C).
 * - Each level inherits properties from all parent classes.
 *
 * 4. When Constructors Are Executed:
 * - Constructors are called in order from superclass to subclass during object creation.
 * - If not explicitly called, the superclass’s no-arg constructor is invoked automatically.
 *
 * 5. Method Overriding:
 * - A subclass can redefine a superclass method with the same signature (name, parameters, return type).
 * - Must use `@Override` annotation for clarity and error checking.
 *
 * 6. Dynamic Method Dispatch:
 * - When a superclass reference holds a subclass object, the subclass’s overridden method is called at runtime.
 * - Enables polymorphism, a key feature of OOP.
 *
 * 7. Using final with Inheritance:
 * - `final` method: Prevents overriding in subclasses.
 * - `final` class: Prevents inheritance entirely.
 *
 * This program demonstrates these concepts with a Vehicle -> Car -> ElectricCar hierarchy.
 *
 * Exercise:
 * 1. Add a method to Car and override it in ElectricCar.
 * 2. Create a final method in Vehicle and try overriding it in Car (should cause a compilation error).
 * 3. Test dynamic method dispatch by creating a Vehicle reference to an ElectricCar object.
 */
public class InheritanceDemo {
    // Superclass
    static class Vehicle {
        private String brand;

        // Constructor
        Vehicle(String brand) {
            this.brand = brand;
            System.out.println("Vehicle constructor: " + brand);
        }

        // Method to override
        String getDescription() {
            return "Vehicle: " + brand;
        }

        // Final method: Cannot be overridden
        final void safetyCheck() {
            System.out.println("Vehicle safety check completed for " + brand);
        }
    }

    // Subclass: Single-level inheritance
    static class Car extends Vehicle {
        private int numDoors;

        // Constructor: Calls superclass constructor using super
        Car(String brand, int numDoors) {
            super(brand); // Call Vehicle constructor
            this.numDoors = numDoors;
            System.out.println("Car constructor: " + numDoors + " doors");
        }

        // Method Overriding
        @Override
        String getDescription() {
            return "Car: " + super.getDescription() + ", Doors: " + numDoors; // Use super to call superclass method
        }
    }

    // Subclass: Multilevel hierarchy (ElectricCar -> Car -> Vehicle)
    static class ElectricCar extends Car {
        private int batteryCapacity;

        // Constructor
        ElectricCar(String brand, int numDoors, int batteryCapacity) {
            super(brand, numDoors); // Call Car constructor
            this.batteryCapacity = batteryCapacity;
            System.out.println("ElectricCar constructor: " + batteryCapacity + " kWh");
        }

        // Method Overriding
        @Override
        String getDescription() {
            return "ElectricCar: " + super.getDescription() + ", Battery: " + batteryCapacity + " kWh";
        }
    }

    // Final class: Cannot be extended
    final static class FinalVehicle {
        void info() {
            System.out.println("This is a final class, cannot be inherited.");
        }
    }

    public static void main(String[] args) {
        // Constructor Execution Order
        System.out.println("Creating ElectricCar object:");
        ElectricCar tesla = new ElectricCar("Tesla", 4, 75); // Vehicle -> Car -> ElectricCar constructors

        // Method Overriding and Dynamic Method Dispatch
        Vehicle vehicleRef = tesla; // Superclass reference to subclass object
        System.out.println("\nDynamic Method Dispatch:");
        System.out.println(vehicleRef.getDescription()); // Calls ElectricCar’s getDescription at runtime

        // Using super: Already shown in getDescription calls
        Car car = new Car("Toyota", 4);
        System.out.println("\nCar Description: " + car.getDescription());

        // Final Method
        tesla.safetyCheck(); // Inherited from Vehicle, cannot be overridden

        // Final Class: Try extending FinalVehicle (uncomment to see error)
        // static class Test extends FinalVehicle {} // Compilation error: cannot inherit from final class
    }
}