import javax.swing.JFrame;

import GUI.GridLayoutFrame;

public class GridLayoutDemo {
    public static void main(String args[]) {
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setSize(300, 200); // set frame size
        gridLayoutFrame.setVisible(true); // display frame
    } // end main
} // end class GridLayoutDemo