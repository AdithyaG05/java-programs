//2. Write a java program for getting different colors through ArrayList interface and remove the
// 2nd element and color &quot;Blue&quot; from the ArrayList
package lab1;

import java.util.ArrayList;

public class RemoveColors {
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

        // Remove 2nd element (index 1)
        if (colors.size() > 1) {
            colors.remove(1);
            System.out.println("After removing 2nd element: " + colors);
        }

        // Remove "Blue"
        if (colors.remove("Blue")) {
            System.out.println("After removing 'Blue': " + colors);
        } else {
            System.out.println("'Blue' not found in the list.");
        }
    }
}
