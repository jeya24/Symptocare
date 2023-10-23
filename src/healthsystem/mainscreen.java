package healthsystem;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class mainscreen extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2,b3,b4,b5,b6;

    mainscreen(){

        l1 = new JLabel("Symptocare");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Verdana",Font.PLAIN,15));
        l1.setBounds(120,12,450,40);
        add(l1);



        b1 = new JButton("Home");
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Verdana",Font.PLAIN,15));
        b1.setBounds(400,20,100,30);
        b1.setBackground(Color.BLACK);
        add(b1);

        b2 = new JButton("About");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Verdana",Font.PLAIN,15));
        b2.setBounds(550,20,100,30);
        add(b2);

        b3 = new JButton("Services");
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setFont(new Font("Verdana",Font.PLAIN,15));
        b3.setBounds(700,20,100,30);
        add(b3);

        b4 = new JButton("Contact");
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.setFont(new Font("Verdana",Font.PLAIN,15));
        b4.setBounds(850,20,100,30);
        add(b4);

        b5 = new JButton("Login >");
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        b5.setFont(new Font("Verdana",Font.PLAIN,15));
        b5.setBounds(1100,20,100,30);
        add(b5);

        l2 = new JLabel("A heritage in care.");
        l2.setFont(new Font("Verdana",Font.BOLD,25));
        l2.setForeground(Color.BLACK);
        l2.setBounds(65,150,375,30);
        add(l2);

        l3 = new JLabel("A reputation in ");
        l3.setFont(new Font("Verdana",Font.BOLD,25));
        l3.setForeground(Color.BLACK);
        l3.setBounds(65,180,375,30);
        add(l3);

        l2 = new JLabel("excellence.");
        l2.setFont(new Font("Verdana",Font.BOLD,25));
        l2.setForeground(Color.BLACK);
        l2.setBounds(65,210,375,30);
        add(l2);





        setLayout((null));
        setLocation(0,0);
        setUndecorated(false);
        setBackground(Color.white);
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        new mainscreen();
    }
}
