package com.learning.shapes;

/*
 * Packages and Interfaces: Interfaces, Default Interface Methods
 *
 * Interfaces:
 * - An interface defines a contract of methods that implementing classes must provide.
 * - Syntax: `interface InterfaceName { methods; }`
 * - Methods are implicitly public and abstract (unless default or static).
 * - Classes implement interfaces using `implements` keyword.
 *
 * Default Interface Methods:
 * - Introduced in Java 8, default methods provide a default implementation in an interface.
 * - Syntax: `default returnType methodName() { body }`
 * - Allows interfaces to evolve without breaking existing implementations.
 *
 * This file defines a Shape interface with an abstract method getArea() and a default method getDescription().
 *
 * Why It Matters:
 * - Interfaces enable loose coupling and polymorphism, allowing different classes to share a common contract.
 * - Default methods add flexibility to interfaces.
 *
 * Package:
 * - This file is in the `com.learning.shapes` package, demonstrating package organization.
 *
 * Exercise:
 * 1. Add a new abstract method getPerimeter() to the Shape interface.
 * 2. Add a default method getColor() that returns a default color (e.g., "Unknown").
 * 3. Create another interface Drawable with a default method and have Shape extend it.
 */

public interface Shape {
    // Abstract method: Must be implemented by classes
    double getArea();

    // Default method: Provides default implementation
    default String getDescription() {
        return "This is a shape with area: " + getArea();
    }
}