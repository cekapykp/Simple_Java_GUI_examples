package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class ButtonFrame extends JFrame {
        private JButton button;
        public ButtonFrame(String title) {
            super(title);
            setLayout(new FlowLayout());
            button = new JButton("I am a Button");
            add(button);
            ButtonHandler handler = new ButtonHandler();
            button.addActionListener(handler);
        }
        private class ButtonHandler implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null, "You clicked me");
            } // end actionPerformed
        }     
    }
