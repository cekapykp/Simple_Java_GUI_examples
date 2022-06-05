import javax.swing.JFrame;

import GUI.PanelFrame;

public class PanelDemo extends JFrame {
    public static void main(String args[]) {
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450, 200); // set frame size
        panelFrame.setVisible(true); // display frame
    } // end main
} // end class PanelDemo