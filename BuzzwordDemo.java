public class BuzzwordDemo{
    public static void main(String[] args) {
        try { // Robust: Exception handling
            String message = "Java is awesome!"; // Simple: Clear syntax
            System.out.println(message); // Object-Oriented: Using String class
            // Portable: This runs on any JVM
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}