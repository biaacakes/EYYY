import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class ColorMenu1 extends JFrame {

    JLabel label;
    JPanel panel;

    ColorMenu1(){


        JButton button= new JButton();
        ImageIcon snakeImage= new ImageIcon("easybutton(230x49).png");
        button.setIcon(snakeImage);
        panel.setBackground(Color.BLACK);
        this.add(button);
        this.setResizable(false);
        this.add(panel);

    }


        
        

    }

