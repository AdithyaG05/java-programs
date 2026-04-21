package lab1;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {

        LinkedList<String> l_listobj = new LinkedList<>();
        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        l_listobj.offerLast("Pink");

        System.out.println("After adding at end: " + l_listobj);
    }
}