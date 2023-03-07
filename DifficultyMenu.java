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

        ImageIcon icon = new ImageIcon ("transparent(1100x500).png");
        JLabel label= new JLabel();
        label.setIcon(icon);


        JButton easyButton = new JButton();
        easyButton.setText("Easy");
        easyButton.setForeground(Color.WHITE);
        easyButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        easyButton.setBackground(new Color(128,70,116));
        easyButton.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of icon+text within label
		easyButton.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label
       
        EventHandler easyHandler = new EventHandler(200);
        //Add event to easy button
        easyButton.addActionListener(easyHandler);
        
       

        JButton mediumButton = new JButton();
        mediumButton.setText("Medium");
        mediumButton.setForeground(Color.WHITE);
        mediumButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        mediumButton.setBackground(new Color(128,70,116));
        mediumButton.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of icon+text within label
		mediumButton.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label
        
        EventHandler mediumHandler = new EventHandler(100);
        mediumButton.addActionListener(mediumHandler);


        JButton hardButton = new JButton();
        hardButton.setText("Hard");
        hardButton.setForeground(Color.WHITE);
        hardButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        hardButton.setBackground(new Color(128,70,116));
        hardButton.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of icon+text within label
		hardButton.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label


        EventHandler hardHandler = new EventHandler(50);
        hardButton.addActionListener(hardHandler);

        JButton expertButton= new JButton();
        expertButton.setText("Expert");
        expertButton.setForeground(Color.WHITE);
        expertButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        expertButton.setBackground(new Color(128,70,116));
        expertButton.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of icon+text within label
		expertButton.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label


        EventHandler handler3 = new EventHandler(40);
        expertButton.addActionListener(handler3);
        
        

        JButton godmodeButton= new JButton();
        godmodeButton.setText("God Mode");
        godmodeButton.setForeground(Color.WHITE);
        godmodeButton.setFont(new Font("Times New Roman", Font.BOLD, 30));
        godmodeButton.setBackground(new Color(128,70,116));
        godmodeButton.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of icon+text within label
		godmodeButton.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label

        EventHandler handler4= new EventHandler(10);
        godmodeButton.addActionListener(handler4);
        
        
        this.add(label);
       
        add(easyButton);
        add(mediumButton);
        add(hardButton);
        add(expertButton);
        add(godmodeButton);

        
        //Close java program when using window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Dimension of frame
        this.setSize(1100,700);
        //Makes frame appear on screen
        this.setVisible(true);
        //Set fram to center
        this.setLocationRelativeTo(null);
        //Set background color of frame
        this.getContentPane().setBackground(new Color(237,241,214));

    }

    private class EventHandler implements ActionListener {

        int snakeSpeed;
        EventHandler (int speed) {
            this.snakeSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            Board gp = new Board();
            
            gp.DELAY = snakeSpeed;
        
            new ColorMenu();


        }
    }
}