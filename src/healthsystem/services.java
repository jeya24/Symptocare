package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class services extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b20;

    String pwd,email;

    services(String email,String pwd){

        this.pwd=pwd;
        this.email=email;


        l1 = new JLabel("Symptocare");
        l1.setForeground(new Color(0x000000));
        l1.setFont(new Font("Verdana",Font.BOLD,16));
        l1.setBounds(73,13,200,40);
        add(l1);

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

        b20 = new JButton("Logout");
        b20.setFont(new Font("Verdana",Font.BOLD,15));
        b20.setBounds(650,20,100,30);
        b20.setForeground(new Color(0x4B0080));
        b20.setContentAreaFilled(false);
        b20.setOpaque(false);
        b20.setBorder(null);
        b20.addActionListener(this);
        add(b20);

        l1 = new JLabel("Our Services");
        l1.setForeground(new Color(0x4B0080));
        l1.setFont(new Font("Verdana",Font.BOLD,25));
        l1.setBounds(300,100,500,100);
        add(l1);

        b5 = new JButton("SYMPTOM");
        b5.setFont(new Font("Verdana",Font.BOLD,15));
        b5.setBounds(85,280,100,30);
        b5.setForeground(new Color(0x4B0080));
        b5.setContentAreaFilled(false);
        b5.setOpaque(false);
        b5.setBorder(null);
        b5.addActionListener(this);
        add(b5);

        b10 = new JButton("CHECKER");
        b10.setFont(new Font("Verdana",Font.BOLD,15));
        b10.setBounds(60,300,150,30);
        b10.setForeground(new Color(0x4B0080));
        b10.setContentAreaFilled(false);
        b10.setOpaque(false);
        b10.setBorder(null);
        b10.addActionListener(this);
        add(b10);


        b6 = new JButton("BOOK");
        b6.setFont(new Font("Verdana",Font.BOLD,15));
        b6.setBounds(343,280,100,30);
        b6.setForeground(new Color(0x4B0080));
        b6.setContentAreaFilled(false);
        b6.setOpaque(false);
        b6.setBorder(null);
        b6.addActionListener(this);
        add(b6);

        b11 = new JButton("APPOINTMENT");
        b11.setFont(new Font("Verdana",Font.BOLD,15));
        b11.setBounds(320,300,150,30);
        b11.setForeground(new Color(0x4B0080));
        b11.setContentAreaFilled(false);
        b11.setOpaque(false);
        b11.setBorder(null);
        b11.addActionListener(this);
        add(b11);


        b8 = new JButton("CONSULT");
        b8.setFont(new Font("Verdana",Font.BOLD,16));
        b8.setBounds(595,290,100,30);
        b8.setForeground(new Color(0x4B0080));
        b8.setContentAreaFilled(false);
        b8.setOpaque(false);
        b8.setBorder(null);
        b8.addActionListener(this);
        add(b8);


        b9 = new JButton("Update email");
        b9.setFont(new Font("Verdana",Font.BOLD,15));
        b9.setBounds(515,420,300,30);
        b9.setForeground(new Color(0x4B0080));
        b9.setContentAreaFilled(false);
        b9.setOpaque(false);
        b9.setBorder(null);
        b9.addActionListener(this);
        add(b9);




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

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i11 = i10.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image4 = new JLabel(i12);
        image4.setBounds(35, 80, 700, 2);
        add(image4);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i14 = i13.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel image5 = new JLabel(i15);
        image5.setBounds(35, 90, 700, 2);
        add(image5);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i17 = i16.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel image6 = new JLabel(i18);
        image6.setBounds(35, 205, 700, 2);
        add(image6);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i20 = i19.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i21 = new ImageIcon(i20);
        JLabel image7 = new JLabel(i21);
        image7.setBounds(35, 215, 700, 2);
        add(image7);


        ImageIcon i37 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i38 = i37.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i39 = new ImageIcon(i38);
        JLabel image13 = new JLabel(i39);
        image13.setBounds(35, 450, 700, 2);
        add(image13);

        ImageIcon i40 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i41 = i40.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i42 = new ImageIcon(i41);
        JLabel image14 = new JLabel(i42);
        image14.setBounds(35,460, 700, 2);
        add(image14);



        ImageIcon i50 = new ImageIcon(ClassLoader.getSystemResource("icons/pre.png"));
        Image i51 = i50.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon i52 = new ImageIcon(i51);
        JLabel image17 = new JLabel(i52);
        image17.setBounds(95, 325, 80, 80);
        add(image17);

        ImageIcon i53 = new ImageIcon(ClassLoader.getSystemResource("icons/app.png"));
        Image i54 = i53.getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        ImageIcon i55 = new ImageIcon(i54);
        JLabel image18 = new JLabel(i55);
        image18.setBounds(360, 325, 75, 75);
        add(image18);


        ImageIcon i46 = new ImageIcon(ClassLoader.getSystemResource("icons/cons.png"));
        Image i47 = i46.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon i48 = new ImageIcon(i47);
        JLabel image16 = new JLabel(i48);
        image16.setBounds(610, 320, 80, 80);
        add(image16);



        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icons/service.png"));
        Image i29 = i28.getImage().getScaledInstance(683, 594, Image.SCALE_SMOOTH);
        ImageIcon i30 = new ImageIcon(i29);
        JLabel image10 = new JLabel(i30);
        image10.setBounds(60, 250,150, 150);
        add(image10);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/service.png"));
        Image i23 = i22.getImage().getScaledInstance(683, 594, Image.SCALE_SMOOTH);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel image8 = new JLabel(i24);
        image8.setBounds(320, 250, 150, 150);
        add(image8);



        ImageIcon i43 = new ImageIcon(ClassLoader.getSystemResource("icons/service.png"));
        Image i44 = i43.getImage().getScaledInstance(683, 594, Image.SCALE_SMOOTH);
        ImageIcon i45 = new ImageIcon(i44);
        JLabel image15 = new JLabel(i45);
        image15.setBounds(570, 250, 150, 150);
        add(image15);





        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/mainbg1.png"));
        Image i5 = i4.getImage().getScaledInstance(790, 500, Image.SCALE_SMOOTH);
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
        try {
            if (e.getSource() == b1) {

                setVisible(false);
                new homepage("","");
            } else if (e.getSource() == b2) {
                setVisible(false);
                new aboutforuser();
            } else if (e.getSource() == b3) {
                setVisible(false);
                new services(email,pwd);
            } else if (e.getSource() == b4) {
                setVisible(false);
                new contactus();
            } else if (e.getSource() == b5) {
                setVisible(false);
                new predictor(email,pwd);
            }else if (e.getSource() == b10) {
                setVisible(false);
                new predictor(email,pwd);
            }else if (e.getSource() == b20) {
                new mainscreen();
                setVisible(false);
            }else if (e.getSource() == b6) {
                setVisible(false);
                new appointment(email,pwd);
            }else if (e.getSource() == b11) {
                setVisible(false);
                new appointment(email,pwd);
            }else if (e.getSource() == b8) {
                setVisible(false);
                new consult(email,pwd);
            }else if (e.getSource() == b9) {
                setVisible(false);
                new pwdchange(email,pwd);
            }


        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new services("","");

    }


}
