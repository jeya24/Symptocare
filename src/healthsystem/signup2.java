package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l12,l13;
    JButton b2,b4;
    JTextField t1,t2,t3,t4,t5,t6;
    String pwd;
    String email;

    signup2(String email,String pwd) {

        this.email=email;
        this.pwd=pwd;

        l1 = new JLabel("Symptocare");
        l1.setForeground(new Color(0x000000));
        l1.setFont(new Font("Verdana",Font.BOLD,18));
        l1.setBounds(73,5,200,40);
        add(l1);

        l6 = new JLabel(email);
        l6.setBounds(720,30,100,40);
        l6.setFont(new Font("Raleway",Font.ITALIC,20));
        add(l6);

        l2 = new JLabel("Create Account");
        l2.setFont(new Font("Verdana",Font.PLAIN,14));
        l2.setForeground(Color.black);
        l2.setBounds(500,50,375,30);
        add(l2);

        l8 = new JLabel("Weight*");
        l8.setFont(new Font("Verdana",Font.PLAIN,12));
        l8.setForeground(Color.black);
        l8.setBounds(500,100,375,25);
        add(l8);

        t1 = new JTextField();
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Verdana",Font.PLAIN,13));
        t1.setBounds(500,125,200,20);
        add(t1);

        l8 = new JLabel("Height*");
        l8.setFont(new Font("Verdana",Font.PLAIN,12));
        l8.setForeground(Color.black);
        l8.setBounds(500,150,375,25);
        add(l8);

        t2 = new JTextField();
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("Verdana",Font.PLAIN,13));
        t2.setBounds(500,175,200,20);
        add(t2);

        l11 = new JLabel("Regular Medications*");
        l11.setFont(new Font("Verdana",Font.PLAIN,12));
        l11.setForeground(Color.black);
        l11.setBounds(500,200,375,25);
        add(l11);

        t3 = new JTextField();
        t3.setForeground(Color.BLACK);
        t3.setFont(new Font("Verdana",Font.PLAIN,13));
        t3.setBounds(500,225,200,20);
        add(t3);

        l12 = new JLabel("Any severe condition*");
        l12.setFont(new Font("Verdana",Font.PLAIN,12));
        l12.setForeground(Color.black);
        l12.setBounds(500,250,375,25);
        add(l12);

        t4 = new JTextField();
        t4.setForeground(Color.BLACK);
        t4.setFont(new Font("Verdana",Font.PLAIN,13));
        t4.setBounds(500,275,200,20);
        add(t4);


        l13 = new JLabel("Additional Info");
        l13.setFont(new Font("Verdana",Font.PLAIN,12));
        l13.setForeground(Color.black);
        l13.setBounds(500,300,375,25);
        add(l13);

        t6 = new JTextField();
        t6.setForeground(Color.BLACK);
        t6.setFont(new Font("Verdana",Font.PLAIN,13));
        t6.setBounds(500,325,200,20);
        add(t6);

        b2 = new JButton("Sign up");
        b2.setForeground(new Color(0x4B0080));
        b2.setBackground(new Color(0xCC98EA));
        b2.setFont(new Font("Verdana",Font.PLAIN,13));
        b2.setBounds(660,380,90,25);
        b2.addActionListener(this);
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


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/mainbg1.png"));
        Image i5 = i4.getImage().getScaledInstance(800, 450, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(0, 0, 800, 450);
        add(image2);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/lav.png"));
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

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/doc1.png"));
        Image i11 = i10.getImage().getScaledInstance(288, 200, Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image9 = new JLabel(i12);
        image9.setBounds(0, 200, 450, 410);
        image2.add(image9);

        setLayout(null);
        setSize(800, 450);
        setLocation(250, 120);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String weight = t1.getText();
        String height = t2.getText();
        String regmed = t3.getText();
        String sevcond = t4.getText();
        String addinfo = t6.getText();


        try{
            if(weight.equals("") || height.equals("") || regmed.equals("") || sevcond.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter the required credentials.");
            }else {
                SQLConnection connection1 = new SQLConnection();
                String query1 = "insert into signup2 values('"+email+"','"+weight+"','"+height+"','"+regmed+"','"+sevcond+"','"+addinfo+"')";
                //to input user entered values into the table in mysql - executeupdate
                connection1.statement.executeUpdate(query1);
                new homepage(email,pwd);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signup2("","");

    }

}
