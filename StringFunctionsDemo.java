//3a. Develop a java program for performing various string operations with different string handling
// functions directed as follows:
// String Creation and Basic Operations, Length and Character Access, String Comparison, String
// Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
// String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
// startsWith() and endsWith()
package lab3;

import java.util.*;

public class StringFunctionsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 2: " + s1.charAt(2));

        // 3. String Comparison
        String s3 = "hello";
        System.out.println("Equals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

        // 4. String Searching
        System.out.println("Index of 'l': " + s1.indexOf('l'));
        System.out.println("Contains 'He': " + s1.contains("He"));

        // 5. Substring Operations
        System.out.println("Substring (1 to 4): " + s1.substring(1, 4));

        // 6. String Modification
        String modified = s1.replace("H", "J");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String s4 = "   Java Programming   ";
        System.out.println("Before Trim: '" + s4 + "'");
        System.out.println("After Trim: '" + s4.trim() + "'");

        // 8. String Concatenation
        String concat = s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Splitted words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder Output: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Alice", 90);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email
        String email = "user@gmail.com";
        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
