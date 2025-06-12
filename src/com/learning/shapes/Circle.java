package com.learning.shapes;

/*
 * Packages and Interfaces: Access Protection, Interfaces
 *
 * Access Protection:
 * - Java’s access modifiers (public, protected, default/package-private, private) control visibility.
 * - public: Accessible everywhere.
 * - protected: Accessible in same package or subclasses.
 * - default (no modifier): Accessible only in same package.
 * - private: Accessible only within the same class.
 * - In this class, radius is private, getArea() is public (required by Shape interface).
 *
 * Interfaces:
 * - This class implements the Shape interface, providing an implementation for getArea().
 * - Inherits the default method getDescription() from Shape.
 *
 * This file is in the `com.learning.shapes` package, demonstrating package organization and access control.
 *
 * Why It Matters:
 * - Access protection ensures encapsulation, controlling how fields and methods are accessed.
 * - Interfaces allow Circle to conform to a standard contract, enabling polymorphism.
 *
 * Exercise:
 * 1. Add a protected field color and a public getter to demonstrate access protection.
 * 2. Override the default getDescription() method to include radius.
 * 3. Create a Rectangle class in this package that implements Shape.
 */

public class Circle implements Shape {
    private double radius; // private: Only accessible in this class

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement Shape’s abstract method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Accessor for private field
    public double getRadius() {
        return radius;
    }
}