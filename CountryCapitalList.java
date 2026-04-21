//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
// France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
// countries on console whenever the countries are selected on the list.
package lab5;

import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalList {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country-Capital List");

        String[] countries = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington DC");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Nairobi");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore City");

        JList<String> list = new JList<>(countries);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBounds(50, 50, 200, 150);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String country = list.getSelectedValue();
                System.out.println("Country: " + country +
                        " | Capital: " + capitals.get(country));
            }
        });

        frame.add(scroll);

        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
