package Calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class Hesapla extends JFrame implements ActionListener, ItemListener {

    private JTextField txt1;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15,
            btn16;
    private JPanel pnl1, pnl2;

    public Hesapla() {
        setLayout(new GridLayout(5, 4));

        txt1 = new JTextField();

        pnl1 = new JPanel();
        pnl2 = new JPanel();

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");
        btn11 = new JButton("+");
        btn12 = new JButton("-");
        btn13 = new JButton("/");
        btn14 = new JButton("*");
        btn15 = new JButton("=");
        btn16 = new JButton("C");

        pnl2.setLayout(new GridLayout(1, 1));
        pnl2.add(txt1);
        add(pnl2);

        pnl1.setLayout(new GridLayout(4, 4));
        pnl1.add(btn1);
        pnl1.add(btn2);
        pnl1.add(btn3);
        pnl1.add(btn4);
        pnl1.add(btn5);
        pnl1.add(btn6);
        pnl1.add(btn7);
        pnl1.add(btn8);
        pnl1.add(btn9);
        pnl1.add(btn10);
        pnl1.add(btn11);
        pnl1.add(btn12);
        pnl1.add(btn13);
        pnl1.add(btn14);
        pnl1.add(btn15);
        pnl1.add(btn16);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        add(pnl1);

        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setTitle("Hesap Makinesi");

    }

    public static void main(String[] args) {
        new Hesapla();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String number1 = txt1.getText();
        String number2 = txt1.getText();

        int fNum = Integer.parseInt(number1);
        int sNum = Integer.parseInt(number2);

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        if (event.getSource() == btn1) {
            int buton1 = 1;
            txt1.setText("" + array[0]);
        } else if (event.getSource() == btn2) {
            int buton2 = 2;
            txt1.setColumns(buton2);
        } else if (event.getSource() == btn3) {
            int buton3 = 3;
            txt1.setColumns(buton3);
        } else if (event.getSource() == btn4) {
            int buton4 = 4;
            txt1.setColumns(buton4);
        } else if (event.getSource() == btn5) {
            int buton5 = 5;
            txt1.setColumns(buton5);
        } else if (event.getSource() == btn6) {
            int buton6 = 6;
            txt1.setColumns(buton6);
        } else if (event.getSource() == btn7) {
            int buton7 = 7;
            txt1.setColumns(buton7);
        } else if (event.getSource() == btn8) {
            int buton8 = 8;
            txt1.setColumns(buton8);
        } else if (event.getSource() == btn9) {
            int buton9 = 9;
            txt1.setColumns(buton9);
        } else if (event.getSource() == btn10) {
            int buton0 = 0;
            txt1.setColumns(buton0);
        } else if (event.getSource() == btn11 && btn15.isSelected()) {
            int result = fNum + sNum;
            txt1.setText(" " + result);
        } else if (event.getSource() == btn12 && btn15.isSelected()) {
            int result = fNum + sNum;
            txt1.setText("1" + result);
        }

    }

}
