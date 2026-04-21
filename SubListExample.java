package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
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

        // Extract 1st and 2nd elements (index 0 to 2, 2 is exclusive)
        List<String> subList = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted SubList (1st & 2nd elements): " + subList);
    }
}