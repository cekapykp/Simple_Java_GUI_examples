package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame2 extends JFrame {
    private JButton plainJButton; // button with just text
    private JButton fancyJButton;

    public ButtonFrame2() {
        super("Testing Buttons");
        setLayout(new FlowLayout()); // set frame layout
        plainJButton = new JButton("Plain Button"); // button with text
        add(plainJButton);
        Icon bug1 = new ImageIcon(getClass().getResource("logo.jpeg"));
        Icon bug2 = new ImageIcon(getClass().getResource("logo.jpeg"));
        fancyJButton = new JButton("Fancy Button", bug1); // set image
        fancyJButton.setRolloverIcon(bug2); // set rollover image
        add(fancyJButton); // add fancyJButton to JFrame

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed( ActionEvent event ){
            JOptionPane.showMessageDialog( ButtonFrame2.this,
            event.getActionCommand() );
        }
    } // end method actionPerformed7 }
}
