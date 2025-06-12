/*
 * Introduction to Java: The Java Buzzwords
 *
 * The Java Buzzwords:
 * Java's design principles make it powerful and versatile. This program demonstrates some key buzzwords:
 * 1. Simple: Clean syntax, no pointers or manual memory management.
 * 2. Object-Oriented: Uses classes and objects (e.g., String class below).
 * 3. Robust: Exception handling prevents crashes (see try-catch).
 * 4. Portable: Runs on any JVM (this code works on any platform).
 * 5. Secure: Bytecode verification ensures safe execution.
 * 6. Architecture-Neutral: Independent of hardware.
 * 7. Interpreted: JVM interprets bytecode.
 * 8. High-Performance: JIT compilation optimizes execution.
 * 9. Multithreaded: Supports concurrent tasks (not shown here, but Java supports threads).
 * 10. Distributed: Supports networked apps (e.g., sockets).
 * 11. Dynamic: Supports runtime class loading.
 *
 * This program showcases simplicity (clear syntax), robustness (try-catch), and object-oriented programming (String class).
 *
 * Exercise: Extend this program to demonstrate another buzzword, e.g., multithreaded (add a simple Thread).
 */
public class BuzzwordDemo {
    public static void main(String[] args) {
        try { // Robust: Handle potential errors
            String message = "Java is awesome!"; // Simple: Clear syntax, Object-Oriented: String is a class
            System.out.println(message); // Portable: Runs anywhere with a JVM
        } catch (Exception e) { // Robust: Catch and handle exceptions
            System.err.println("Error: " + e.getMessage());
        }
    }
}