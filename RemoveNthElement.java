package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNthElement {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Take input for n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter position (n) to remove: ");
        int n = sc.nextInt();

        // Remove nth element (index = n-1)
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1);
            System.out.println("After removing element at position " + n + ": " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}