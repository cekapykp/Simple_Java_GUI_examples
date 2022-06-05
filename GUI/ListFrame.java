package GUI;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame {
    private JList colorJList; // list to display colors
    private final String colorNames[] = { "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
            "Orange", "Pink", "Red", "White", "Yellow" };
    private final Color colors[] = { Color.BLACK, Color.BLUE, Color.CYAN,
            Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
            Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
            Color.YELLOW };

    public ListFrame()
    {
    super( "List Test" );
    setLayout( new FlowLayout() ); // set frame layout
    colorJList = new JList( colorNames ); // create with colorNames
    colorJList.setVisibleRowCount( 5 ); // display five rows at once
    // do not allow multiple selections
    colorJList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );
    // add a JScrollPane containing JList to frame
    add( new JScrollPane( colorJList ) ); 

        colorJList.addListSelectionListener(
        new ListSelectionListener() // anonymous inner class
        {
            public void valueChanged( ListSelectionEvent event )
            {
            getContentPane().setBackground(
            colors[ colorJList.getSelectedIndex() ] );
            } // end method valueChanged
        } // end anonymous inner class
        ); // end call to addListSelectionListener
}
}
