import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


import java.awt.Color;
import java.awt.*;

public class PlayerMenu extends JFrame {
    JTextField textField;
    PlayerMenu(){
        super("Snake Game");
        this.setLayout(new FlowLayout());

        //JLabel

        JLabel png= new JLabel();
        ImageIcon icon= new ImageIcon("transparent(1100x500).png");
        png.setIcon(icon);
        png.setOpaque(true);
        
        this.add(png);
        this.setResizable(false);
        
        JLabel label= new JLabel() ;
        label.setText("Enter Player Name:  ");
        label.setFont(new Font("Arial", Font.BOLD,30));

        //JTextField
        textField= new JTextField(20);
        textField.setSize(30,30);
        //Add event to textField
        EventHandler handler= new EventHandler();
        textField.addKeyListener(handler);
        
        //Add components to frame
        this.add(label);
        this.add(textField);

         //Close java program when using window
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         //Dimension of frame
         this.setSize(1100,650);
         //Makes frame appear on screen
         this.setVisible(true);
         //Set fram to center
         this.setLocationRelativeTo(null);
         //Set background color of frame
         this.getContentPane().setBackground(new Color(237,241,214));
         //this.getContentPane().setBackground(Color.BLACK);
 
 
       
    }
    private class EventHandler implements KeyListener{

        public void keyPressed(KeyEvent event) {
            Board pm= new Board();
            if(event.getKeyCode()== KeyEvent.VK_ENTER){
                pm.playerName = textField.getText();
                dispose();

                new GameFrame();
            }
           

    }
        public void keyReleased(KeyEvent event) {

    }
        public void keyTyped(KeyEvent event) {
    }
}
}
