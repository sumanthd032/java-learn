
/*
 * Methods and Classes: Overloading Methods, Objects as Parameters, Argument Passing, Returning Objects
 *
 * 1. Overloading Methods:
 * - Method overloading allows multiple methods with the same name but different parameter lists (type, number, or order).
 * - Java selects the correct method based on the arguments provided at compile time.
 * - Example: Multiple `calculateArea` methods with different parameters.
 *
 * 2. Objects as Parameters:
 * - Objects can be passed to methods as parameters, allowing methods to operate on their fields or call their methods.
 * - The object reference is passed, so changes to the object’s fields persist outside the method.
 *
 * 3. Argument Passing:
 * - Java uses pass-by-value for all arguments.
 * - For objects, the value of the reference is passed, meaning the method can modify the object’s state but cannot reassign the reference.
 * - For primitives, a copy of the value is passed, so changes don’t affect the original.
 *
 * 4. Returning Objects:
 * - Methods can return objects, allowing creation or modification of objects within a method.
 * - The returned object can be used directly or assigned to a variable.
 *
 * This program demonstrates these concepts with a Rectangle class that calculates area and manipulates dimensions.
 *
 * Exercise:
 * 1. Add an overloaded method to calculate the perimeter of the rectangle.
 * 2. Create a method that takes two Rectangle objects as parameters and returns true if they have the same area.
 * 3. Demonstrate pass-by-value by trying to reassign a Rectangle object in a method and checking if the original reference changes.
 */
public class MethodDemo {
    static class Rectangle {
        private double length;
        private double width;

        // Constructor
        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Overloading Methods: Different calculateArea signatures
        double calculateArea() {
            return length * width;
        }

        double calculateArea(double scale) { // Overloaded: Scale the area
            return length * width * scale;
        }

        // Objects as Parameters: Compare area with another Rectangle
        boolean hasSameArea(Rectangle other) {
            return this.calculateArea() == other.calculateArea();
        }

        // Method to demonstrate argument passing
        void modifyDimensions(Rectangle other, double newLength) {
            // Object parameter: Modify other’s state (pass-by-reference-like behavior)
            other.length = newLength;
            other.width = newLength / 2;
            // Primitive parameter: newLength is a copy (pass-by-value)
            newLength = 0; // Doesn’t affect caller’s value
        }

        // Returning Objects: Create a scaled copy of this Rectangle
        Rectangle createScaledCopy(double scale) {
            return new Rectangle(this.length * scale, this.width * scale);
        }

        @Override
        public String toString() {
            return "Rectangle[length=" + length + ", width=" + width + ", area=" + calculateArea() + "]";
        }
    }

    public static void main(String[] args) {
        // Create Rectangle objects
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(10, 5);

        // Overloading Methods
        System.out.println("Rect1 Area: " + rect1.calculateArea()); // Calls calculateArea()
        System.out.println("Rect1 Scaled Area (x2): " + rect1.calculateArea(2.0)); // Calls calculateArea(double)

        // Objects as Parameters
        System.out.println("Rect1 and Rect2 have same area? " + rect1.hasSameArea(rect2)); // true

        // Argument Passing: Modify rect2’s state
        double testLength = 20;
        rect1.modifyDimensions(rect2, testLength);
        System.out.println("After modification, Rect2: " + rect2); // rect2’s state changed
        System.out.println("TestLength unchanged: " + testLength); // Primitive unchanged (pass-by-value)

        // Returning Objects
        Rectangle scaledRect = rect1.createScaledCopy(1.5);
        System.out.println("Scaled Rectangle: " + scaledRect);
    }
}