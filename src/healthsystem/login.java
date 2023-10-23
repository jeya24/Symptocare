package healthsystem;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton b2;
    JTextField t1,t2,t3,t4,t5;
    JRadioButton r1,r2;
    JPasswordField p1;

    login() {

        l1 = new JLabel("Symptocare");
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Verdana",Font.BOLD,18));
        l1.setBounds(73,5,200,40);
        add(l1);

        l2 = new JLabel("User Login");
        l2.setFont(new Font("Verdana",Font.PLAIN,16));
        l2.setForeground(Color.WHITE);
        l2.setBounds(500,50,375,30);
        add(l2);

        l8 = new JLabel("Email Address");
        l8.setFont(new Font("Verdana",Font.PLAIN,14));
        l8.setForeground(Color.WHITE);
        l8.setBounds(500,150,375,25);
        add(l8);

        t1 = new JTextField();
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Verdana",Font.PLAIN,14));
        t1.setBounds(500,180,200,20);
        add(t1);

        l13 = new JLabel("Password");
        l13.setFont(new Font("Verdana",Font.PLAIN,14));
        l13.setForeground(Color.WHITE);
        l13.setBounds(500,220,375,25);
        add(l13);

        p1 = new JPasswordField();
        p1.setForeground(Color.BLACK);
        p1.setFont(new Font("Verdana",Font.PLAIN,14));
        p1.setBounds(500,250,200,20);
        add(p1);

        b2 = new JButton("Login");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Verdana",Font.PLAIN,13));
        b2.setBounds(500,330,90,25);
        add(b2);



        l3 = new JLabel("“Get ready to embark on a health ");
        l3.setFont(new Font("Verdana",Font.ITALIC,15));
        l3.setForeground(Color.BLACK);
        l3.setBounds(60,100,375,80);
        add(l3);

        l4 = new JLabel("adventure like no other! Say hello ");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(60,120,375,80);
        add(l4);

        l5 = new JLabel("to Symptocare, where health  ");
        l5.setFont(new Font("Verdana",Font.ITALIC,15));
        l5.setForeground(Color.BLACK);
        l5.setBounds(75,140,375,80);
        add(l5);

        l4 = new JLabel("and happiness collide in the ");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(75,160,375,80);
        add(l4);

        l4 = new JLabel("most delightful way possible. It’s not");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(53,180,375,80);
        add(l4);

        l4 = new JLabel("just an app; it’s your personal");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(68,200,375,80);
        add(l4);

        l4 = new JLabel("cheerleader for wellness!”");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(75,220,375,80);
        add(l4);


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/bg.png"));
        Image i5 = i4.getImage().getScaledInstance(800, 450, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(0, 0, 800, 450);
        add(image2);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/blue.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(475, 25, 300, 400);
        image2.add(image1);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/logon.png"));
        Image i8 = i7.getImage().getScaledInstance(39, 40, Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(25, 7, 45, 41);
        image2.add(image3);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/doc3.png"));
        Image i11 = i10.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image9 = new JLabel(i12);
        image9.setBounds(60, 270, 180, 180);
        image2.add(image9);


        setLayout(null);
        setSize(800, 450);
        setLocation(250, 120);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();

    }

}

