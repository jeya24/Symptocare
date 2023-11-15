package healthsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contactus extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6;
    JButton b1, b2, b3, b4, b5, b6, b7;

    contactus() {

        l1 = new JLabel("Symptocare");
        l1.setForeground(new Color(0x000000));
        l1.setFont(new Font("Verdana", Font.BOLD, 16));
        l1.setBounds(73, 13, 200, 40);
        add(l1);

        b1 = new JButton("Home");
        b1.setFont(new Font("Verdana", Font.PLAIN, 15));
        b1.setBounds(320, 20, 50, 30);
        b1.setForeground(new Color(0x4B0080));
        b1.setContentAreaFilled(false);
        b1.setOpaque(false);
        b1.setBorder(null);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("About Us");
        b2.setFont(new Font("Verdana", Font.PLAIN, 15));
        b2.setBounds(370, 20, 100, 30);
        b2.setForeground(new Color(0x4B0080));
        b2.setContentAreaFilled(false);
        b2.setOpaque(false);
        b2.setBorder(null);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Services");
        b3.setFont(new Font("Verdana", Font.PLAIN, 15));
        b3.setBounds(460, 20, 100, 30);
        b3.setForeground(new Color(0x4B0080));
        b3.setContentAreaFilled(false);
        b3.setOpaque(false);
        b3.setBorder(null);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("Contact Us");
        b4.setFont(new Font("Verdana", Font.PLAIN, 15));
        b4.setBounds(560, 20, 100, 30);
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


        l1 = new JLabel("JEYAVARDHINI S");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.BOLD, 20));
        l1.setBounds(80, 80, 500, 100);
        add(l1);

        l1 = new JLabel("RA2211026010324");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 13));
        l1.setBounds(500, 70, 500, 100);
        add(l1);

        l1 = new JLabel("js8862@srmist.edu.in");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 13));
        l1.setBounds(500, 90, 500, 100);
        add(l1);

        l1 = new JLabel("SONAL PANDA");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.BOLD, 20));
        l1.setBounds(90, 170, 500, 100);
        add(l1);

        l1 = new JLabel("RA2211026010323");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 13));
        l1.setBounds(500, 160, 500, 100);
        add(l1);

        l1 = new JLabel("sp9203@srmist.edu.in");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 13));
        l1.setBounds(500, 180, 500, 100);
        add(l1);

        l1 = new JLabel("VAIBAHAV");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.BOLD, 20));
        l1.setBounds(110, 260, 500, 100);
        add(l1);

        l1 = new JLabel("RA2211026010308");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 13));
        l1.setBounds(500, 250, 500, 100);
        add(l1);

        l1 = new JLabel("@vr4453@srmist.edu.in");
        l1.setForeground(new Color(90, 22, 126));
        l1.setFont(new Font("TimesRoman", Font.PLAIN, 13));
        l1.setBounds(500, 270, 500, 100);
        add(l1);

        l2 = new JLabel("GET TO KNOW OUR TEAM");
        l2.setForeground(new Color(160, 0, 255));
        l2.setFont(new Font("Verdana",Font.BOLD,25));
        l2.setBounds(200,380,500,100);
        add(l2);



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
        image6.setBounds(35, 170, 700, 2);
        add(image6);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i20 = i19.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i21 = new ImageIcon(i20);
        JLabel image7 = new JLabel(i21);
        image7.setBounds(35,180, 700, 2);
        add(image7);

        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i32 = i31.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i33 = new ImageIcon(i32);
        JLabel image11 = new JLabel(i33);
        image11.setBounds(35, 260, 700, 2);
        add(image11);

        ImageIcon i34 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i35 = i34.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i36 = new ImageIcon(i35);
        JLabel image12 = new JLabel(i36);
        image12.setBounds(35,270, 700, 2);
        add(image12);

        ImageIcon i37 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i38 = i37.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i39 = new ImageIcon(i38);
        JLabel image13 = new JLabel(i39);
        image13.setBounds(35, 350, 700, 2);
        add(image13);

        ImageIcon i40 = new ImageIcon(ClassLoader.getSystemResource("icons/line.png"));
        Image i41 = i40.getImage().getScaledInstance(700, 2, Image.SCALE_SMOOTH);
        ImageIcon i42 = new ImageIcon(i41);
        JLabel image14 = new JLabel(i42);
        image14.setBounds(35,360, 700, 2);
        add(image14);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/aboutline.png"));
        Image i23 = i22.getImage().getScaledInstance(3, 250, Image.SCALE_SMOOTH);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel image8 = new JLabel(i24);
        image8.setBounds(400, 100, 2, 60);
        add(image8);

        ImageIcon i43 = new ImageIcon(ClassLoader.getSystemResource("icons/aboutline.png"));
        Image i44 = i43.getImage().getScaledInstance(3, 250, Image.SCALE_SMOOTH);
        ImageIcon i45 = new ImageIcon(i44);
        JLabel image15 = new JLabel(i45);
        image15.setBounds(400, 190, 2, 60);
        add(image15);

        ImageIcon i46 = new ImageIcon(ClassLoader.getSystemResource("icons/aboutline.png"));
        Image i47 = i46.getImage().getScaledInstance(3, 250, Image.SCALE_SMOOTH);
        ImageIcon i48 = new ImageIcon(i47);
        JLabel image16 = new JLabel(i48);
        image16.setBounds(400, 280, 2, 60);
        add(image16);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icons/team2.png"));
        Image i26 = i25.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon i27 = new ImageIcon(i26);
        JLabel image9 = new JLabel(i27);
        image9.setBounds(570, 405, 40, 40);
        add(image9);


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
                new services("","");
            } else if (e.getSource() == b4) {

                setVisible(false);
                new contactus();
            }


        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new contactus();
    }
}

