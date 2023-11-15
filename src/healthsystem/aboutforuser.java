package healthsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutforuser extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2,b3,b4,b5,b6,b7;

    aboutforuser() {

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

        b5 = new JButton("Logout");
        b5.setFont(new Font("Verdana",Font.BOLD,15));
        b5.setBounds(650,20,100,30);
        b5.setForeground(new Color(0x4B0080));
        b5.setContentAreaFilled(false);
        b5.setOpaque(false);
        b5.setBorder(null);
        b5.addActionListener(this);
        add(b5);



        l1 = new JLabel("Why You Should Trust Us?");
        l1.setForeground(new Color(0x4B0080));
        l1.setFont(new Font("Verdana",Font.BOLD,25));
        l1.setBounds(210,80,500,100);
        add(l1);

        l1 = new JLabel("Get to Know About Us");
        l1.setForeground(new Color(0x4B0080));
        l1.setFont(new Font("Verdana",Font.BOLD,24));
        l1.setBounds(250,120,500,100);
        add(l1);

        l1 = new JLabel("SYMPTOCARE");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.BOLD,30));
        l1.setBounds(80,300,500,100);
        add(l1);

        l1 = new JLabel("YOUR HEALTH COMPANION");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.PLAIN,13));
        l1.setBounds(80,330,500,100);
        add(l1);

        l1 = new JLabel("The idea behind this website is it build one which");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.ITALIC,15));
        l1.setBounds(400,250,350,100);
        add(l1);

        l1 = new JLabel("takes input as various symptoms and gives you");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.ITALIC,15));
        l1.setBounds(400,270,350,100);
        add(l1);

        l1 = new JLabel("all possible diseases, information, treatments and");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.ITALIC,15));
        l1.setBounds(400,290,370,100);
        add(l1);

        l1 = new JLabel("doctor consultation suggestions. The primary idea");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.ITALIC,15));
        l1.setBounds(400,310,360,100);
        add(l1);

        l1 = new JLabel("is to build a user friendly website where they can");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.ITALIC,15));
        l1.setBounds(400,330,350,100);
        add(l1);

        l1 = new JLabel("refer to ease their mind and have easy access");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.ITALIC,15));
        l1.setBounds(400,350,350,100);
        add(l1);

        l1 = new JLabel("to consultation and care.");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman",Font.ITALIC,15));
        l1.setBounds(400,370,350,100);
        add(l1);





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

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/aboutline.png"));
        Image i23 = i22.getImage().getScaledInstance(3, 250, Image.SCALE_SMOOTH);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel image8 = new JLabel(i24);
        image8.setBounds(380, 260, 2, 200);
        add(image8);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icons/man.png"));
        Image i26 = i25.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon i27 = new ImageIcon(i26);
        JLabel image9 = new JLabel(i27);
        image9.setBounds(30, 330,40 , 40);
        add(image9);

        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icons/about-us.png"));
        Image i29 = i28.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon i30 = new ImageIcon(i29);
        JLabel image10 = new JLabel(i30);
        image10.setBounds(750, 450,40, 40);
        add(image10);




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
        try{
            if(e.getSource() == b1){
                new homepage("","");
                setVisible(false);
            } else if (e.getSource() == b2 ) {
                new healthsystem.about();
                setVisible(false);
            } else if (e.getSource() == b3) {
                new services("","");
                setVisible(false);
            }else if (e.getSource()==b4) {
                new contactus();
                setVisible(false);
            }else if (e.getSource() == b5) {
                new mainscreen();
                setVisible(false);
            }


        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new aboutforuser();
    }
}