//3. Write a java program for getting different colors through ArrayList interface and sort them
// using Collections.sort( ArrayListObj)
package lab1;

import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Sort the ArrayList
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted List: " + colors);
    }
}
