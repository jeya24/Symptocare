package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton button1,button2,button3,b4,b9;
    JTextField t1,t2,t3,t4,t5;
    JPasswordField p1;

    String email,pwd;

    login(String pwd,String email) {
        this.pwd=pwd;
        this.email=email;


        l1 = new JLabel("Symptocare");
        l1.setForeground(new Color(0x000000));
        l1.setFont(new Font("Verdana",Font.BOLD,18));
        l1.setBounds(73,5,200,40);
        add(l1);

        l2 = new JLabel("User Login");
        l2.setFont(new Font("Verdana",Font.PLAIN,16));
        l2.setForeground(Color.BLACK);
        l2.setBounds(500,50,375,30);
        add(l2);

        l8 = new JLabel("Email Address");
        l8.setFont(new Font("Verdana",Font.PLAIN,14));
        l8.setForeground(Color.black);
        l8.setBounds(500,150,375,25);
        add(l8);

        t1 = new JTextField();
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Verdana",Font.PLAIN,14));
        t1.setBounds(500,180,200,20);
        add(t1);

        l13 = new JLabel("Password");
        l13.setFont(new Font("Verdana",Font.PLAIN,14));
        l13.setForeground(Color.BLACK);
        l13.setBounds(500,220,375,25);
        add(l13);

        p1 = new JPasswordField();
        p1.setForeground(Color.BLACK);
        p1.setFont(new Font("Verdana",Font.PLAIN,14));
        p1.setBounds(500,250,200,20);
        add(p1);

        button1 =  new JButton("Sign in");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(new Color(0x4B0080));
        button1.setBackground(new Color(0xCC98EA));
        button1.setBounds(500,310,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 =  new JButton("Sign up");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(new Color(0x4B0080));
        button2.setBackground(new Color(0xCC98EA));
        button2.setBounds(650,310,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 =  new JButton("Clear");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(new Color(0x4B0080));
        button3.setBackground(new Color(0xCC98EA));
        button3.setBounds(575,360,100,30);
        button3.addActionListener(this);
        add(button3);



        l3 = new JLabel("“Get ready to embark on a health ");
        l3.setFont(new Font("Verdana",Font.ITALIC,15));
        l3.setForeground(Color.BLACK);
        l3.setBounds(60,80,375,80);
        add(l3);

        l4 = new JLabel("adventure like no other! Say hello ");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(60,100,375,80);
        add(l4);

        l5 = new JLabel("to Symptocare, where health  ");
        l5.setFont(new Font("Verdana",Font.ITALIC,15));
        l5.setForeground(Color.BLACK);
        l5.setBounds(75,120,375,80);
        add(l5);

        l4 = new JLabel("and happiness collide in the ");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(75,140,375,80);
        add(l4);

        l4 = new JLabel("most delightful way possible. It’s not");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(53,160,375,80);
        add(l4);

        l4 = new JLabel("just an app; it’s your personal");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(68,180,375,80);
        add(l4);

        l4 = new JLabel("cheerleader for wellness!”");
        l4.setFont(new Font("Verdana",Font.ITALIC,15));
        l4.setForeground(Color.BLACK);
        l4.setBounds(75,200,375,80);
        add(l4);

        b4 = new JButton("Back");
        b4.setFont(new Font("System", Font.PLAIN, 13));
        b4.setBounds(690, 22, 130, 28);
        b4.setForeground(new Color(0x4B0080));
        b4.setContentAreaFilled(false);
        b4.setOpaque(false);
        b4.setBorder(null);
        b4.addActionListener(this);
        add(b4);




        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/mainbg1.png"));
        Image i5 = i4.getImage().getScaledInstance(800, 450, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(0, 0, 800, 450);
        add(image2);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/lav.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 450, Image.SCALE_SMOOTH);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                SQLConnection connection = new SQLConnection();
                String email = t1.getText();
                String pwd = p1.getText();
                String query = "select * from login where email = '"+email+"' and password = '"+pwd+"'";
                ResultSet resultSet = connection.statement.executeQuery(query);
                if (resultSet.next()){
                    setVisible(false);
                    new homepage(email,pwd);
                } else {
                    JOptionPane.showMessageDialog(null,"Please enter the correct credentials");
                }
            } else if (e.getSource() == button2) {
                new signup1();
                setVisible(false);

            } else if (e.getSource() == button3) {
                t1.setText("");
                p1.setText("");
            }else if (e.getSource()==b4) {
                setVisible(false);
                new mainscreen();
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login("","");

    }

}

