package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homepage extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2,b3,b4,b5,b6;
    String email,pwd;

    homepage(String email,String pwd){
        this.email = email;
        this.pwd=pwd;

        l1 = new JLabel("Symptocare");
        l1.setForeground(new Color(0x000000));
        l1.setFont(new Font("Verdana",Font.BOLD,16));
        l1.setBounds(73,13,200,40);
        add(l1);



        l3 = new JLabel("Your Journey to");
        l3.setFont(new Font("Verdana",Font.PLAIN,20));
        l3.setForeground(Color.BLACK);
        l3.setBounds(600,80,375,150);
        add(l3);

        l4 = new JLabel("Better Health");
        l4.setFont(new Font("Verdana",Font.PLAIN,20));
        l4.setForeground(Color.BLACK);
        l4.setBounds(600,120,375,150);
        add(l4);

        l5 = new JLabel("Starts Here");
        l5.setFont(new Font("Verdana",Font.PLAIN,20));
        l5.setForeground(Color.BLACK);
        l5.setBounds(600,160,375,150);
        add(l5);


        b6 = new JButton("Discover more");
        b6.setFont(new Font("Verdana",Font.PLAIN,12));
        b6.setBounds(630,400,140,35);
        b6.setForeground(new Color(0x4B0080));
        b6.setBackground(new Color(0xCC98EA));
        b6.addActionListener(this);
        add(b6);



        b1 = new JButton("Home");
        b1.setFont(new Font("Verdana",Font.PLAIN,15));
        b1.setBounds(320,20,50,30);
        b1.setForeground(new Color(0x4B0080));
        b1.setContentAreaFilled(false);
        b1.setOpaque(false);
        b1.setBorder(null);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("About Us");
        b2.setFont(new Font("Verdana",Font.PLAIN,15));
        b2.setBounds(370,20,100,30);
        b2.setForeground(new Color(0x4B0080));
        b2.setContentAreaFilled(false);
        b2.setOpaque(false);
        b2.setBorder(null);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Services");
        b3.setFont(new Font("Verdana",Font.PLAIN,15));
        b3.setBounds(460,20,100,30);
        b3.setForeground(new Color(0x4B0080));
        b3.setContentAreaFilled(false);
        b3.setOpaque(false);
        b3.setBorder(null);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("Contact Us");
        b4.setFont(new Font("Verdana",Font.PLAIN,15));
        b4.setBounds(560,20,100,30);
        b4.setForeground(new Color(0x4B0080));
        b4.setContentAreaFilled(false);
        b4.setOpaque(false);
        b4.setBorder(null);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Logout");
        b5.setFont(new Font("Verdana",Font.BOLD,15));
        b5.setBounds(650,20,100,30);
        b5.setForeground(new Color(0x4B0080));
        b5.setContentAreaFilled(false);
        b5.setOpaque(false);
        b5.setBorder(null);
        b5.addActionListener(this);
        add(b5);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/account.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image1 = new JLabel(i3);
        image1.setBounds(735, 25, 20, 20);
        add(image1);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/logon.png"));
        Image i8 = i7.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(30, 10, 45, 41);
        add(image3);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/picbg.png"));
        Image i11 = i10.getImage().getScaledInstance(664, 598, Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image4 = new JLabel(i12);
        image4.setBounds(0, 60, 664, 500);
        add(image4);


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/mainbg1.png"));
        Image i5 = i4.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(0, 0, 800, 500);
        add(image2);




        setLayout((null));
        setSize(800, 500);
        setLocation(250, 90);
        setUndecorated(true);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == b1){
                new homepage("","");
                setVisible(false);
            } else if (e.getSource() == b2 ) {
                new aboutforuser();
                setVisible(false);
            } else if (e.getSource() == b3) {
                new services(email,pwd);
                setVisible(false);
            }else if (e.getSource()==b4) {
                new contactus();
                setVisible(false);
            }else if (e.getSource() == b5) {
                new mainscreen();
                setVisible(false);
            }else if (e.getSource() == b6 ) {
                new services(email,pwd);
                setVisible(false);
            }


        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new homepage("","");
    }
}
