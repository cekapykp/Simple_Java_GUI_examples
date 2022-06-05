
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "You clicked me");
    } // end of actionPerformed
} // end of class

public class Button_v2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title");
        frame.setSize(200, 400);
        frame.setVisible(true);

        JButton button = new JButton("Ben bir Butonum");
        button.setSize(30,30);
        frame.add(button);

        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
    }
}
