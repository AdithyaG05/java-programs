package lab2;

import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        System.out.println("Index of 'l': " + str1.indexOf('l'));
        System.out.println("Contains 'He': " + str1.contains("He"));

        // 5. Substring Operations
        System.out.println("Substring (1 to 4): " + str1.substring(1, 4));

        // 6. String Modification
        String modified = str1.replace("H", "J");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String str4 = "  Java Programming  ";
        System.out.println("Before Trim: '" + str4 + "'");
        System.out.println("After Trim: '" + str4.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("Splitted words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 22);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}