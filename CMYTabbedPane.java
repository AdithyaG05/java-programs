//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
// the concerned color whenever the specific tab is selected in the Pan.
package lab5;

import javax.swing.*;
import java.awt.*;

public class CMYTabbedPane {

    public static void main(String[] args) {

        JFrame frame = new JFrame("CMY Tabs");

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyan = new JPanel();
        JPanel magenta = new JPanel();
        JPanel yellow = new JPanel();

        cyan.setBackground(Color.CYAN);
        magenta.setBackground(Color.MAGENTA);
        yellow.setBackground(Color.YELLOW);

        tabbedPane.add("CYAN", cyan);
        tabbedPane.add("MAGENTA", magenta);
        tabbedPane.add("YELLOW", yellow);

        tabbedPane.addChangeListener(e -> {
            int index = tabbedPane.getSelectedIndex();
            System.out.println("Selected Color Tab: " + tabbedPane.getTitleAt(index));
        });

        frame.add(tabbedPane);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
