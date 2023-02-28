import java.awt.Color;

public class App {
    public static void main (String[]args){ 

        MainMenu mainMenu= new MainMenu();

        mainMenu.setDefaultCloseOperation(mainMenu.EXIT_ON_CLOSE);
        mainMenu.setSize(480,450);
        mainMenu.setVisible(true);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.getContentPane().setBackground(Color.WHITE);


    }
}