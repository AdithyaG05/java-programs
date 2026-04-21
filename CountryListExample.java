package lab5;

import javax.swing.*;
import javax.swing.event.*;

public class CountryListExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");

        String[] countries = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        JList<String> list = new JList<>(countries);
        JScrollPane scroll = new JScrollPane(list);

        scroll.setBounds(50, 50, 200, 150);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected Country: " + list.getSelectedValue());
                }
            }
        });

        frame.add(scroll);

        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}