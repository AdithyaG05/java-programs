package lab1;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Start iterator from index 1 (2nd position)
        Iterator<String> iteratorobj = list.listIterator(1);

        System.out.println("Elements from 2nd position:");
        while (iteratorobj.hasNext()) {
            System.out.println(iteratorobj.next());
        }
    }
}