package Exam;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;	


public class GuiApplication extends JFrame implements ActionListener  {
	private JPanel pnl1,pnl2,pnl3;
	private JButton btn1,btn2,btn3,btn4;
	private JTextArea txtarea;
	private JLabel lbl;

	
	
	public GuiApplication() {

	super("Gui Application");	
	
	setLayout(new BorderLayout());
	
	pnl1 = new JPanel();
	pnl2 = new JPanel();
	pnl3 = new JPanel();
	
	//pnl1.setBorder(new TitleBorder("Menu"));
	//pnl2.setBorder(new TitleBorder("Detailed Info"));
	
	
	pnl1.setLayout(new GridLayout(1,4));
	pnl2.setLayout(new GridLayout(1,1));
	pnl3.setLayout(new GridLayout(1,1));
	
	btn1 = new JButton("Student");
	btn2 = new JButton("Teacher");
	btn3 = new JButton("Class");
	btn4 = new JButton("Class-Student-Teacher");
	
	pnl1.add(btn1);
	pnl1.add(btn2);
	pnl1.add(btn3);
	pnl1.add(btn4);
	
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	btn3.addActionListener(this);
	btn4.addActionListener(this);
	
	
	
	txtarea = new JTextArea();
	pnl2.add(txtarea);
	
	lbl = new JLabel("...");
	pnl3.add(lbl);
	
	
	add(pnl1,BorderLayout.NORTH);
	add(pnl2,BorderLayout.CENTER);
	add(pnl3,BorderLayout.SOUTH);
	
	
	setVisible(true);
	setLocationRelativeTo(null);
	setSize(700,300);
	
	}
	
	public static void main(String[] args) {
		
		new GuiApplication();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		txtarea.setText("");
		
		if(event.getSource()==btn1) {
			//JOptionPane.showMessageDialog(null, "Click");
			for(Student s:gui_console.arrayStudent)
				txtarea.append(s.toString());
			
		}
		
		else if(event.getSource()==btn2) {
			
			for(Teacher t:gui_console.arrayTeacher)
				txtarea.append(t.toString());
			
		}
		
		else if(event.getSource()== btn3) {
			
			for(Class c:gui_console.arrayClass)
				txtarea.append(c.toString());
			
		}
		
		
		
	}
	
	

}
