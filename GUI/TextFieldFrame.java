package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TextFieldFrame extends JFrame {
    // text field with set size
    private JTextField textField1;
    // text field constructed with text
    private JTextField textField2;
    // text field with text and size
    private JTextField textField3;
    // password field with text
    private JPasswordField passwordField;

    public TextFieldFrame() {
        super(
                "Testing JTextField and JPasswordField");
        // set frame layout
        setLayout(new FlowLayout());
        // construct textfield with 10 columns
        textField1 = new JTextField(10);
        // add textField1 to JFrame
        add(textField1);
        // construct textfield with default text
        textField2 = new JTextField("Enter text here");
        // add textField2 to JFrame
        add(textField2);

        // construct textfield with default text and 21
        textField3 = new JTextField("Uneditable text field", 21);
        // disable editing
        textField3.setEditable(false);
        // add textField3 to JFrame
        add(textField3);
        // construct passwordfield with default text
        passwordField = new JPasswordField("Hidden text");
        // add passwordField to JFrame
        add(passwordField);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class TextFieldHandler implements ActionListener {
        // process text field events
        public void actionPerformed(ActionEvent event) {
            String string = ""; // declare string to display
            // user pressed Enter in JTextField textField1
            if (event.getSource() == textField1)
                string = String.format("textField1: %s",
                        event.getActionCommand());
            // user pressed Enter in JTextField textField2
            else if (event.getSource() == textField2)
                string = String.format("textField2: %s",
                        event.getActionCommand());
            // user pressed Enter in JTextField passwordField
            else if (event.getSource() == passwordField)
                string = String.format("passwordField:%s",
                        new String(passwordField.getPassword()));
            // display JTextField content
            JOptionPane.showMessageDialog(null, string);

        }
    }
}