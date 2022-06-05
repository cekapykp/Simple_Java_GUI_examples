import javax.swing.*;
import GUI.ButtonFrame;

import java.awt.*;
import java.awt.event.*;

public class Button {
        public static void main(String[] args) {
        ButtonFrame jButtonFrame = new ButtonFrame("Check-up Codes");
        jButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButtonFrame.setLocationRelativeTo(null);
        jButtonFrame.setSize(200, 400);
        jButtonFrame.setVisible(true);
    }
}