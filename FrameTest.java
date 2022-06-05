import javax.swing.JFrame;

public class FrameTest {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Hello From Check-up Codes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Dictates how the application reacts when the user clicks the close button
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
