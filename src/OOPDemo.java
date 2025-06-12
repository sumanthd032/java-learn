/*
 * Overview of Java: Object-Oriented Programming (OOP)
 *
 * Object-Oriented Programming (OOP):
 * Java is fundamentally object-oriented, organizing code around objects and classes.
 * Key OOP principles demonstrated in this program:
 * 1. Encapsulation: Bundling data (fields) and methods, controlling access with modifiers (private, public).
 * 2. Inheritance: Extending a class to inherit its properties and behavior (extends keyword).
 * 3. Polymorphism: Allowing objects of different classes to be treated as objects of a common superclass.
 * 4. Abstraction: Hiding complex details and exposing only necessary functionality (via abstract classes or interfaces).
 *
 * This program includes:
 * - A Vehicle class (superclass) with encapsulated fields and methods.
 * - A Car class that inherits from Vehicle, demonstrating inheritance.
 * - Polymorphism via method overriding (toString).
 * - Abstraction is implied through the class design (could be extended with an abstract class or interface).
 *
 * Why It Matters:
 * OOP makes code modular, reusable, and easier to maintain, which is critical for large-scale Java applications.
 *
 * Exercise:
 * 1. Add a new subclass (e.g., Motorcycle) that extends Vehicle with unique behavior.
 * 2. Create an interface Drivable with a method drive(), and make Car implement it.
 */
public class OOPDemo {
    // Superclass demonstrating encapsulation
    static class Vehicle {
        private String brand; // Encapsulation: private field
        private int speed;

        public Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        public String getBrand() { // Encapsulation: public getter
            return brand;
        }

        public void setSpeed(int speed) { // Encapsulation: public setter
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }

        @Override
        public String toString() { // Polymorphism: can be overridden by subclasses
            return "Vehicle: " + brand + ", Speed: " + speed;
        }
    }

    // Subclass demonstrating inheritance
    static class Car extends Vehicle {
        private int numDoors;

        public Car(String brand, int speed, int numDoors) {
            super(brand, speed); // Inheritance: call superclass constructor
            this.numDoors = numDoors;
        }

        @Override
        public String toString() { // Polymorphism: override superclass method
            return "Car: " + getBrand() + ", Speed: " + getSpeed() + ", Doors: " + numDoors;
        }
    }

    public static void main(String[] args) {
        // Create objects to demonstrate OOP
        Vehicle vehicle = new Vehicle("Generic", 100); // Base class
        Car car = new Car("Toyota", 120, 4); // Subclass

        // Polymorphism: Vehicle reference can hold Car object
        Vehicle polyCar = new Car("Honda", 150, 2);

        // Display results
        System.out.println(vehicle); // Calls Vehicle's toString
        System.out.println(car); // Calls Car's toString
        System.out.println(polyCar); // Calls Car's toString (polymorphism)
    }
}