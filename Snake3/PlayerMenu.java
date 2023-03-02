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

        JPanel northPanel= new JPanel();
        JPanel southPanel= new JPanel();
        JPanel westPanel= new JPanel();
        JPanel eastPanel= new JPanel();
        JPanel centerPanel= new JPanel();
        
        JLabel label= new JLabel() ;
        label.setText("Enter Player Name:  ");
        label.setFont(new Font("Arial", Font.BOLD,30));

        //JTextField
        textField= new JTextField(20);
        //Add event to textField
        EventHandler handler= new EventHandler();
        textField.addKeyListener(handler);
        
        //Add components to frame
        this.add(label);
        this.add(textField);

         //Close java program when using window
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         //Dimension of frame
         this.setSize(1024,700);
         //Makes frame appear on screen
         this.setVisible(true);
         //Set fram to center
         this.setLocationRelativeTo(null);
         //Set background color of frame
         this.getContentPane().setBackground(Color.WHITE);
 
       
    }
    private class EventHandler implements KeyListener{

        public void keyPressed(KeyEvent event) {
            GamePanel gp= new GamePanel();
            if(event.getKeyCode()== KeyEvent.VK_ENTER){
                //gp.playerName = textField.getText();
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
