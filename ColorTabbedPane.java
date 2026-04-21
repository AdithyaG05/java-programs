package lab5;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ColorTabbedPane {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Tabs");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel red = new JPanel();
        JPanel blue = new JPanel();
        JPanel green = new JPanel();

        red.setBackground(Color.RED);
        blue.setBackground(Color.BLUE);
        green.setBackground(Color.GREEN);

        tabbedPane.add("RED", red);
        tabbedPane.add("BLUE", blue);
        tabbedPane.add("GREEN", green);

        tabbedPane.addChangeListener(e -> {
            int index = tabbedPane.getSelectedIndex();
            System.out.println("Selected Tab Color: " + tabbedPane.getTitleAt(index));
        });

        frame.add(tabbedPane);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}