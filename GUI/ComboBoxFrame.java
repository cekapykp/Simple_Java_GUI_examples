package GUI;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame {
    private JComboBox imagesJComboBox; // combobox to hold names of icons
    private JLabel label; // label to display selected icon

    private String names[] = { "bug1.gif", "bug2.gif", "bug1.gif", "bug2.gif" };
    private Icon icons[] = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3])) };

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout()); // set frame layout

        imagesJComboBox = new JComboBox(names); // set
        imagesJComboBox.setMaximumRowCount(3);
        imagesJComboBox.addItemListener(
                new ItemListener() // anonymous inner class
                {
                    // handle JComboBox event
                    public void itemStateChanged(ItemEvent event) {
                        // determine whether check box selected
                        if (event.getStateChange() == ItemEvent.SELECTED)
                            label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                    } // end method itemStateChanged
                } // end anonymous inner class
        );
        add(imagesJComboBox); // add combobox to JFrame
        label = new JLabel(icons[0]); // display first icon
        add(label); // add label to JFrame
    } // end ComboBoxFrame constructor
} // end class ComboBoxFrame