package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(300, 100);
        getContentPane().setBackground(Color.WHITE);
        getContentPane().setBackground(new java.awt.Color(145,195,190));
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/stud1.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 350);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("<html>Developed By:<br/> AVINASH BHALLA 2160323 <br/>  PARI AGARWAL 2160444 <br/>RASHI DUBEY 2160446</html>");
        name.setBounds(70, 220, 550, 100);
        name.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(name);
       
        
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
