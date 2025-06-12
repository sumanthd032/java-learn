package com.learning.strings;

/*
 * String Handling: The String Constructors, String Length, Special String Operations,
 * Character Extraction, String Comparison, Searching Strings, Modifying a String,
 * Changing the Case of Characters Within a String, Joining Strings
 *
 * 1. The String Constructors:
 * - String objects are immutable (cannot be changed after creation).
 * - Common constructors: String(), String(String), String(char[]), String(byte[]).
 *
 * 2. String Length:
 * - length() method returns the number of characters in a string.
 *
 * 3. Special String Operations:
 * - Concatenation: Using + or concat().
 * - String literals: Stored in the string pool for efficiency.
 *
 * 4. Character Extraction:
 * - Methods like charAt(int), getChars(), toCharArray() extract characters.
 *
 * 5. String Comparison:
 * - equals(), equalsIgnoreCase(): Compare content.
 * - compareTo(), compareToIgnoreCase(): Lexicographical comparison.
 * - ==: Tests reference equality, not content.
 *
 * 6. Searching Strings:
 * - indexOf(), lastIndexOf(): Find substrings or characters.
 * - contains(): Checks if a substring exists.
 *
 * 7. Modifying a String:
 * - Since Strings are immutable, methods like substring(), replace() return new strings.
 *
 * 8. Changing the Case of Characters Within a String:
 * - toUpperCase(), toLowerCase(): Convert string case.
 *
 * 9. Joining Strings:
 * - String.join() (Java 8+) combines strings with a delimiter.
 *
 * This program demonstrates these concepts with practical examples.
 *
 * Package:
 * - In `com.learning.strings` to demonstrate package organization.
 *
 * Exercise:
 * 1. Create a method to reverse a string using charAt().
 * 2. Use compareTo() to sort an array of strings.
 * 3. Write a method that joins strings with a custom delimiter and prefix.
 */

public class StringDemo {
    public static void main(String[] args) {
        // String Constructors
        String s1 = new String(); // Empty string
        String s2 = new String("Hello"); // From string literal
        char[] chars = {'J', 'a', 'v', 'a'};
        String s3 = new String(chars); // From char array
        byte[] bytes = {65, 66, 67}; // ASCII for A, B, C
        String s4 = new String(bytes); // From byte array

        // String Length
        System.out.println("s2 length: " + s2.length()); // 5

        // Special String Operations
        String concat = s2 + " World"; // Concatenation with +
        String concat2 = s2.concat(" Java"); // Using concat()
        System.out.println("Concatenation: " + concat); // Hello World
        System.out.println("Concat with concat(): " + concat2); // Hello Java

        // Character Extraction
        System.out.println("Char at index 1 in s2: " + s2.charAt(1)); // e
        char[] dest = new char[4];
        s2.getChars(0, 4, dest, 0); // Copy "Hell" to dest
        System.out.println("getChars: " + new String(dest)); // Hell
        System.out.println("toCharArray: " + String.valueOf(s2.toCharArray())); // Hello

        // String Comparison
        String s5 = "hello";
        System.out.println("s2 equals s5: " + s2.equals(s5)); // false (case-sensitive)
        System.out.println("s2 equalsIgnoreCase s5: " + s2.equalsIgnoreCase(s5)); // true
        System.out.println("s2 compareTo s5: " + s2.compareTo(s5)); // Negative (H < h)
        System.out.println("s2 == s5: " + (s2 == s5)); // false (different objects)

        // Searching Strings
        System.out.println("Index of 'l' in s2: " + s2.indexOf('l')); // 2
        System.out.println("Last index of 'l' in s2: " + s2.lastIndexOf('l')); // 3
        System.out.println("Contains 'ell' in s2: " + s2.contains("ell")); // true

        // Modifying a String
        String sub = s2.substring(1, 4); // ell
        System.out.println("Substring: " + sub);
        String replaced = s2.replace('l', 'L');
        System.out.println("Replace: " + replaced); // HeLLo

        // Changing Case
        System.out.println("Uppercase s2: " + s2.toUpperCase()); // HELLO
        System.out.println("Lowercase s2: " + s2.toLowerCase()); // hello

        // Joining Strings
        String joined = String.join(", ", "Apple", "Banana", "Orange");
        System.out.println("Joined: " + joined); // Apple, Banana, Orange
    }
}