package src;
/*
 * Introducing Classes: Class Fundamentals, Declaring Objects, Assigning Object Reference Variables,
 * Methods, Constructors, this Keyword, Garbage Collection
 *
 * 1. Class Fundamentals:
 * - A class is a blueprint for objects, defining properties (fields) and behaviors (methods).
 * - Syntax: `class ClassName { fields; methods; }`
 * - Classes encapsulate data and behavior, supporting OOP principles.
 *
 * 2. Declaring Objects:
 * - Objects are instances of a class, created with the `new` keyword.
 * - Syntax: `ClassName objectName = new ClassName();`
 *
 * 3. Assigning Object Reference Variables:
 * - Object variables store references (memory addresses), not the object itself.
 * - Assigning one object variable to another copies the reference, not the object.
 *
 * 4. Introducing Methods:
 * - Methods define behaviors, with a signature: `returnType methodName(parameters) { body }`
 * - Can access and modify object fields.
 *
 * 5. Constructors:
 * - Special methods called when an object is created, with the same name as the class.
 * - Used to initialize object fields. No return type.
 *
 * 6. this Keyword:
 * - Refers to the current object instance.
 * - Used to distinguish instance variables from parameters with the same name.
 *
 * 7. Garbage Collection:
 * - Java automatically manages memory via the garbage collector.
 * - Objects no longer referenced are reclaimed to free memory.
 * - Example: Setting an object reference to `null` makes it eligible for garbage collection.
 *
 * This program demonstrates all these concepts with a `Box` class representing a 3D box.
 *
 * Exercise:
 * 1. Add a method to calculate the surface area of the box.
 * 2. Create two Box objects, assign one to the other, and verify they reference the same object.
 * 3. Set a Box object to null and explain how it becomes eligible for garbage collection.
 */
public class ClassDemo {
    // Class definition
    static class Box {
        // Instance variables (fields)
        private double width;
        private double height;
        private double depth;

        // Constructor: Initializes object fields
        Box(double width, double height, double depth) {
            this.width = width; // this keyword: distinguish instance variable from parameter
            this.height = height;
            this.depth = depth;
        }

        // Method: Calculate volume
        double calculateVolume() {
            return width * height * depth;
        }

        // Method: Set dimensions
        void setDimensions(double width, double height, double depth) {
            this.width = width; // this keyword: refer to instance variables
            this.height = height;
            this.depth = depth;
        }

        // Method: Return string representation
        @Override
        public String toString() {
            return "Box[width=" + width + ", height=" + height + ", depth=" + depth + "]";
        }
    }

    public static void main(String[] args) {
        // Declaring Objects: Create two Box objects
        Box box1 = new Box(10, 20, 15); // Constructor initializes fields
        Box box2 = new Box(5, 5, 5);

        // Assigning Object Reference Variables
        Box box3 = box1; // box3 now references the same object as box1

        // Using Methods
        System.out.println("Box1: " + box1); // Calls toString
        System.out.println("Box1 Volume: " + box1.calculateVolume());
        System.out.println("Box2: " + box2);
        System.out.println("Box3 (same as Box1): " + box3); // Same reference as box1

        // Modify box1 via box3 to show they reference the same object
        box3.setDimensions(12, 22, 17);
        System.out.println("After modification, Box1: " + box1); // Reflects box3 changes

        // Garbage Collection: Make box2 eligible for garbage collection
        box2 = null; // No references to the second Box object
        System.out.println("Box2 set to null, eligible for garbage collection.");

        // Suggest garbage collection (not guaranteed to run immediately)
        System.gc();
    }
}