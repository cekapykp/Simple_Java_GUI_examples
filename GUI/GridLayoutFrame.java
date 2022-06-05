package GUI;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutFrame extends JFrame implements ActionListener {
    private JButton buttons[]; // array of buttons
    private final String names[] = { "one", "two", "three", "four", "five", "six"
    };
    private boolean toggle = true; // toggle between two layouts
    private Container container; // frame container
    private GridLayout gridLayout1; // first gridlayout
    private GridLayout gridLayout2;

    public GridLayoutFrame() {
        super("GridLayout Demo");
        gridLayout1 = new GridLayout(2, 3, 5, 5); // 2 by 3; gaps of 5
        gridLayout2 = new GridLayout(3, 2); // 3 by 2; no gaps
        container = getContentPane(); // get content pane
        setLayout(gridLayout1); // set JFrame layout
        buttons = new JButton[names.length];
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}// create array of JButtons
