import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ColorMenu extends JFrame {

    private String[] colorlist ={"BLACK" , "WHITE" , "PINK" , "MAGENTA" , "CYAN" , "YELLOW"};
    private Color[] colors= {Color.BLACK, Color.WHITE, Color.PINK, Color.MAGENTA, Color.CYAN, Color.YELLOW};

    ColorMenu () {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        ImageIcon icon= new ImageIcon("kulay.gif");
        JLabel label1= new JLabel();
        label1.setIcon(icon);


    JLabel label = new JLabel();
   
    label.setText("Choose your preferred color of Snake");
    label.setFont(new Font("Times New Roman", Font.BOLD, 10));
    label.setIcon(icon);
    
    //JList Component
    JList list = new JList(colorlist);
    list.setVisibleRowCount(3);

    //Sets Selection Mode
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    
    JScrollPane scrollPane = new JScrollPane(list);

    this.add(label1);
    this.add(label);
    this.add(scrollPane);
    
    
        //Close java program when using window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Dimension of frame
        this.setSize(285,285);
        //Makes frame appear on screen
        this.setVisible(true);
        //Set frame to center
        this.setLocationRelativeTo(null);
        //Set background color of frame
        this.getContentPane().setBackground(Color.white); 


    }
}
