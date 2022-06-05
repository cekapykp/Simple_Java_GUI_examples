package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public  class LabelFrame extends JFrame {
        private JLabel label1;
        private JLabel label2;
        private JLabel label3;

        public LabelFrame(String title) {
            super(title);
            setLayout(new FlowLayout());

            label1 = new JLabel("I am a label");
            add(label1);

            label2 = new JLabel("second label");
            label2.setToolTipText("tooltip of scond label");
            add(label2);

            label3 = new JLabel();
            label3.setText("label 3");
            label3.setToolTipText("tool tip text 3");

            label3.setHorizontalTextPosition(SwingConstants.CENTER);
            label3.setVerticalTextPosition(SwingConstants.BOTTOM);
            add(label3);
            
        }

        public LabelFrame() {
        }
    }
