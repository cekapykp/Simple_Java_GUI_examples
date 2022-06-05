
import javax.swing.*;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        class LabelFrame extends JFrame {
            private JLabel label1;
            public LabelFrame(String title) {
                super(title); 
                setLayout(new FlowLayout());
                label1 = new JLabel("I am a label");
                add(label1); 
            }
        }

        LabelFrame label = new LabelFrame("Check-up Codes");
        label.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setSize(300, 300);
        label.setVisible(true);

    }

}
