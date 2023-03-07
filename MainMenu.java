import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    MainMenu(){

        JLabel imageLabel= new JLabel();
        ImageIcon snakeImage= new ImageIcon("bgdraft.png");
        imageLabel.setIcon(snakeImage);
        this.add(imageLabel);
        this.setResizable(false);

       
        JButton startButton = new JButton();
        ImageIcon startImageIcon = new ImageIcon("startbutton.png");

        startButton.setIcon(startImageIcon);
        setLayout(new GridBagLayout());
        GridBagConstraints g =new GridBagConstraints();
        g.gridx=0;
        g.gridy=0;

        
        
        setSize(30,30);
        setVisible(true);
        
        
        
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);
        // Add button to frame
        g.gridx=0;
        g.gridy=5;
        startButton.setMargin(getInsets());
        startButton.setBorder(BorderFactory.createEtchedBorder());
        this.add(startButton,g);
      
       
       
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100,650);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(237,241,214));
       

    }
    // Event Handler
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            // open game frame
            new DifficultyMenu();
            // Close main menu frame
            dispose();
        }
}
}
