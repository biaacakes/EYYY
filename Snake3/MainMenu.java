import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

import java.awt.*;
import java.beans.EventHandler;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame  {
    MainMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        //PICKING OF PHOTO FOR ICON
        ImageIcon icon= new ImageIcon("hays.gif");
        //ICON APPEARANCE ON SCREEN
        JLabel label= new JLabel();
        label.setIcon(icon);
        
        //JButton
        ImageIcon icon1 = new ImageIcon("nge.jpg");
        JButton button= new JButton ();
        button.setText("START GAME");
        button.setFont(new Font("Consolas", Font.BOLD, 20));
        this.getContentPane().setBackground(new Color(237,241,214));
        button.setIcon(icon1);
        button.setBounds(100, 100, 100, 100);
        
        //Add events to button
        EventHandler handler= new EventHandler();
        button.addActionListener(handler);

        //Add components to fram
        this.add(label);
        this.add(button);

    }
    //EVENT HANDLER CLASS
    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            //JOptionPane.showMessageDialog(null, "HELLO BIANCA!");

            //SWITCHES TO GAME
            new DifficultyMenu();

            //Closes Main Menu
            dispose();
        }
    }
}