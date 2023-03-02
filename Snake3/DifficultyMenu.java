import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {
    DifficultyMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon ("nokia.gif");
        JLabel label= new JLabel();
        label.setIcon(icon);

        JButton easyButton = new JButton();
        easyButton.setText("Easy");
        easyButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        easyButton.setBackground(Color.BLACK);
        EventHandler easyHandler = new EventHandler(200);
        //Add event to easy button
        easyButton.addActionListener(easyHandler);
        
       

        JButton mediumButton = new JButton();
        mediumButton.setText("Medium");
        mediumButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        mediumButton.setBackground(Color.white);
        EventHandler mediumHandler = new EventHandler(400);
        mediumButton.addActionListener(mediumHandler);


        JButton hardButton = new JButton();
        hardButton.setText("Hard");
        hardButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        hardButton.setBackground(Color.white);
        EventHandler hardHandler = new EventHandler(10);
        hardButton.addActionListener(hardHandler);

        
        this.add(label);
       
        add(easyButton);
        add(mediumButton);
        add(hardButton);

        
        //Close java program when using window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Dimension of frame
        this.setSize(480,450);
        //Makes frame appear on screen
        this.setVisible(true);
        //Set fram to center
        this.setLocationRelativeTo(null);
        //Set background color of frame
        this.getContentPane().setBackground(Color.WHITE);

    }

    private class EventHandler implements ActionListener {

        int snakeSpeed;
        EventHandler (int speed) {
            this.snakeSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            GamePanel gp= new GamePanel(); 
            //gp.DELAY = snakeSpeed;
            
            new ColorMenu();


        }
    }
}

