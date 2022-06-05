package GUI;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame{
    private JTextField textField;
    private JCheckBox boldJCheckBox; // to select/deselect bold
    private JCheckBox italicJCheckBox;

    public CheckBoxFrame(){
        super("CheckBox Test");
        setLayout( new FlowLayout() ); 

        textField = new JTextField( "Watch the font style change", 20 );
        textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) ); 
        add(textField);

        boldJCheckBox = new JCheckBox( "Bold" ); // create bold checkbox 
        italicJCheckBox = new JCheckBox( "Italic" ); // create italic
        add( boldJCheckBox ); // add bold checkbox to JFrame
        add( italicJCheckBox ); // add italic checkbox to JFrame
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener( handler );
        italicJCheckBox.addItemListener(handler);
    }


    private class CheckBoxHandler implements ItemListener{
        private int valBold = Font.PLAIN; // controls bold font style
        private int valItalic = Font.PLAIN; // controls italic font style
        public void itemStateChanged( ItemEvent event ){
             if ( event.getSource() == boldJCheckBox )
            valBold =boldJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
            
             if ( event.getSource() == italicJCheckBox )
            valItalic =italicJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;

            textField.setFont(new Font( "Serif", valBold + valItalic, 14 ) );
        }
    }
 }
