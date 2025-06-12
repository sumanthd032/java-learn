# Java Learn

Welcome to Java learn repository. It includes Java code with detailed comments explaining key concepts, along with exercises to solidify understanding. 🚀

## Table of Contents

- [Introduction](#introduction)
- [Concepts Covered](#concepts-covered)
- [How to Use This Repo](#how-to-use-this-repo)
- [Setup Instructions](#setup-instructions)
- [Repository Structure](#repository-structure)
- [Contributing](#contributing)

---

## Introduction

This repo contains Java code files with inline comments explaining core concepts. Each file demonstrates practical examples and ties to specific Java principles. The goal is to build a comprehensive resource for learning Java from the ground up.

---

## Concepts Covered

### Introduction to Java
- **Files**: `src/HelloWorld.java`, `src/BuzzwordDemo.java`
- Java’s Lineage: History, influences (C++, Smalltalk), and design goals (portability, simplicity).
- The Bytecode: Platform-independent code executed by the JVM.
- The Java Buzzwords: Key principles like simple, object-oriented, robust, and portable.

### Overview of Java
- **Files**: `src/OOPDemo.java`, `src/ProgramStructure.java`, `src/DataTypesAndArrays.java`
- Object-Oriented Programming: Encapsulation, inheritance, polymorphism, abstraction.
- Structure of a Java Program: Package, imports, class, main method.
- Data Types and Arrays: Primitive types, reference types, single and multi-dimensional arrays.

### Introducing Classes
- **Files**: `src/ClassDemo.java`, `src/StackDemo.java`
- Class Fundamentals, Declaring Objects, Reference Variables, Methods, Constructors, `this` Keyword, Garbage Collection.

### Methods and Classes
- **Files**: `src/MethodDemo.java`, `src/ComplexNumberDemo.java`
- Overloading, Objects as Parameters, Argument Passing, Returning Objects.

### Inheritance
- **Files**: `src/InheritanceDemo.java`, `src/AbstractShapeDemo.java`
- Subclasses, `super`, Constructor Order, Overriding, Polymorphism, Abstract Classes, `final`.

### Packages and Interfaces
- **Files**:
  - `src/com/learning/shapes/Shape.java`
  - `src/com/learning/shapes/Circle.java`
  - `src/com/learning/demo/PackageDemo.java`
- Package Structure, Access Protection, Importing, Interfaces, Default Interface Methods.

### Exception Handling
- **Files**:
  - `src/com/learning/exceptions/ExceptionDemo.java`
  - `src/com/learning/exceptions/CustomExceptionDemo.java`
- Exception Types, `try-catch`, `throw`, `throws`, `finally`, Custom Exceptions.

### Multithreaded Programming
- **Files**:
  - `src/com/learning/threads/ThreadDemo.java`
  - `src/com/learning/threads/SyncDemo.java`
- Thread Creation, `isAlive()`, `join()`, Priorities, Synchronization.

### File I/O
- **Files**:
  - `src/com/learning/io/ConsoleIODemo.java`
  - `src/com/learning/io/FileIODemo.java`
- Console I/O, File Read/Write, `PrintWriter`, Resource Management.

### String Handling
- **Files**:
  - `src/com/learning/strings/StringDemo.java`
  - `src/com/learning/strings/StringBufferDemo.java`
- String Operations, `StringBuffer`, Comparisons, Modifications, Searching.

### Generics
- **Files**:
  - `src/com/learning/generics/GenericsDemo.java`
  - `src/com/learning/generics/TwoTypeGenericsDemo.java`
- Type Wrappers, Autoboxing, Generic Classes, Two Type Parameters.

### Collections Framework
- **Files**:
  - `src/com/learning/collections/ListDemo.java`
  - `src/com/learning/collections/SetAndDequeDemo.java`
- `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `ArrayDeque`.

---

## How to Use This Repo

1. Browse the `src/` folder for `.java` files.
2. Read the inline comments for explanations.
3. Run the code to see examples in action.
4. Try the exercises provided in the comments.
5. Check back for new content as learning progresses!

---

## Setup Instructions

1. Install Java Development Kit (JDK) from Oracle or OpenJDK.
2. Clone the repository:
   ```bash
   git clone <repo-url>
   ```
3. Navigate to the code directory:
   ```bash
   cd java-learn/src
   ```
4. Compile a Java file:
   ```bash
   javac FileName.java
   ```
5. Run the compiled program:
   ```bash
   java FileName
   ```

---

## Repository Structure

```
java-learn/
├── src/
│   ├── com/
│   │   ├── learning/
│   │   │   ├── shapes/
│   │   │   │   ├── Shape.java
│   │   │   │   ├── Circle.java
│   │   │   ├── demo/
│   │   │   │   ├── PackageDemo.java
│   │   │   ├── exceptions/
│   │   │   │   ├── ExceptionDemo.java
│   │   │   │   ├── CustomExceptionDemo.java
│   │   │   ├── threads/
│   │   │   │   ├── ThreadDemo.java
│   │   │   │   ├── SyncDemo.java
│   │   │   ├── io/
│   │   │   │   ├── ConsoleIODemo.java
│   │   │   │   ├── FileIODemo.java
│   │   │   ├── strings/
│   │   │   │   ├── StringDemo.java
│   │   │   │   ├── StringBufferDemo.java
│   │   │   ├── generics/
│   │   │   │   ├── GenericsDemo.java
│   │   │   │   ├── TwoTypeGenericsDemo.java
│   │   │   ├── collections/
│   │   │   │   ├── ListDemo.java
│   │   │   │   ├── SetAndDequeDemo.java
│   ├── HelloWorld.java
│   ├── BuzzwordDemo.java
│   ├── OOPDemo.java
│   ├── ProgramStructure.java
│   ├── DataTypesAndArrays.java
│   ├── ClassDemo.java
│   ├── StackDemo.java
│   ├── MethodDemo.java
│   ├── ComplexNumberDemo.java
│   ├── InheritanceDemo.java
│   ├── AbstractShapeDemo.java
├── README.md
```

---

## Contributing

This is a personal learning project, but feedback is welcome! Feel free to open an issue or pull request for suggestions or improvements.

---
