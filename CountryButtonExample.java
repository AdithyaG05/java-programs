//4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
// depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
// mechanism with addActionListener( ).
package lab4;

import javax.swing.*;
import java.awt.event.*;

public class CountryButtonExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country Buttons");

        JButton indiaBtn = new JButton("India");
        JButton sriBtn = new JButton("Srilanka");

        JLabel label = new JLabel("Click a button");
        label.setBounds(100, 100, 300, 30);

        indiaBtn.setBounds(50, 30, 100, 30);
        sriBtn.setBounds(200, 30, 100, 30);

        // India button event
        indiaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        // Srilanka button event
        sriBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        frame.add(indiaBtn);
        frame.add(sriBtn);
        frame.add(label);

        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
