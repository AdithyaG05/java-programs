//2. Write a Java program to iterate a linked list in reverse order (using
// objlist.descendingIterator())
package lab1;

import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        Iterator<String> rev = list.descendingIterator();

        System.out.println("Reverse order:");
        while (rev.hasNext()) {
            System.out.println(rev.next());
        }
    }
}
