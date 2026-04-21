//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
// is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
// implementing the event handling mechanism with addActionListener( ).
package lab4;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Buttons");

        JButton digitalBtn = new JButton(new ImageIcon("digital.jpg"));
        JButton hourBtn = new JButton(new ImageIcon("hourglass.jpg"));

        JLabel label = new JLabel("Click an image button");
        label.setBounds(50, 200, 300, 30);

        digitalBtn.setBounds(50, 50, 120, 120);
        hourBtn.setBounds(200, 50, 120, 120);

        // Digital Clock event
        digitalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Hour Glass event
        hourBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.add(digitalBtn);
        frame.add(hourBtn);
        frame.add(label);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
