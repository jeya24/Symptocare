package healthsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class appointment extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    JTextField t1,t2,t3,t4,t5,t6;
    JComboBox cb1,cb2,c3,c4,c5,c6;

    String pwd,email;

    appointment(String email,String pwd){

        this.email=email;
        this.pwd=pwd;


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




        l1 = new JLabel("Semirra Bayan, M.D.");
        l1.setForeground(new Color(75, 0, 128));
        l1.setFont(new Font("Verdana",Font.PLAIN,16));
        l1.setBounds(40,100,200,40);
        add(l1);


        l2 = new JLabel("Audiologist");
        l2.setForeground(new Color(131, 90, 194, 255));
        l2.setFont(new Font("Verdana",Font.ITALIC,14));
        l2.setBounds(40,120,200,40);
        add(l2);


        l3 = new JLabel("Phoenix,AZ");
        l3.setForeground(new Color(131, 90, 194, 255));
        l3.setFont(new Font("Verdana",Font.ITALIC,14));
        l3.setBounds(40,140,200,40);
        add(l3);


        l1 = new JLabel("Jamie Bogle, Ph.D.");
        l1.setForeground(new Color(75, 0, 128));
        l1.setFont(new Font("Verdana",Font.PLAIN,16));
        l1.setBounds(40,180,200,40);
        add(l1);


        l2 = new JLabel("Sports Medicine Specialist");
        l2.setForeground(new Color(131, 90, 194, 255));
        l2.setFont(new Font("Verdana",Font.ITALIC,14));
        l2.setBounds(40,200,200,40);
        add(l2);


        l3 = new JLabel("Rochester,MN");
        l3.setForeground(new Color(131, 90, 194, 255));
        l3.setFont(new Font("Verdana",Font.ITALIC,14));
        l3.setBounds(40,220,200,40);
        add(l3);


        l1 = new JLabel("Joseph Breen, M.D.");
        l1.setForeground(new Color(75, 0, 128));
        l1.setFont(new Font("Verdana",Font.PLAIN,16));
        l1.setBounds(40,260,200,40);
        add(l1);


        l2 = new JLabel("Otolaryngologist");
        l2.setForeground(new Color(131, 90, 194, 255));
        l2.setFont(new Font("Verdana",Font.ITALIC,14));
        l2.setBounds(40,280,200,40);
        add(l2);


        l3 = new JLabel("Phoenix,AZ");
        l3.setForeground(new Color(131, 90, 194, 255));
        l3.setFont(new Font("Verdana",Font.ITALIC,14));
        l3.setBounds(40,300,200,40);
        add(l3);



        l1 = new JLabel("Matthew Carlson, M.D.");
        l1.setForeground(new Color(75, 0, 128));
        l1.setFont(new Font("Verdana",Font.PLAIN,16));
        l1.setBounds(250,100,200,40);
        add(l1);


        l2 = new JLabel("Facial Plastic Surgeon");
        l2.setForeground(new Color(131, 90, 194, 255));
        l2.setFont(new Font("Verdana",Font.ITALIC,14));
        l2.setBounds(250,120,200,40);
        add(l2);


        l3 = new JLabel("Jacksonville,FL");
        l3.setForeground(new Color(131, 90, 194, 255));
        l3.setFont(new Font("Verdana",Font.ITALIC,14));
        l3.setBounds(250,140,200,40);
        add(l3);


        l1 = new JLabel("Angela Donaldson, M.D.");
        l1.setForeground(new Color(75, 0, 128));
        l1.setFont(new Font("Verdana",Font.PLAIN,16));
        l1.setBounds(250,180,200,40);
        add(l1);


        l2 = new JLabel("Pediatrician");
        l2.setForeground(new Color(131, 90, 194, 255));
        l2.setFont(new Font("Verdana",Font.ITALIC,14));
        l2.setBounds(250,200,200,40);
        add(l2);


        l3 = new JLabel("Rochester,MN");
        l3.setForeground(new Color(131, 90, 194, 255));
        l3.setFont(new Font("Verdana",Font.ITALIC,14));
        l3.setBounds(250,220,200,40);
        add(l3);



        l1 = new JLabel("Sharon Libi, M.D.");
        l1.setForeground(new Color(75, 0, 128));
        l1.setFont(new Font("Verdana",Font.PLAIN,16));
        l1.setBounds(250,260,200,40);
        add(l1);


        l2 = new JLabel("Cardiologist");
        l2.setForeground(new Color(131, 90, 194, 255));
        l2.setFont(new Font("Verdana",Font.ITALIC,14));
        l2.setBounds(250,280,200,40);
        add(l2);


        l3 = new JLabel("Rochester,MN");
        l3.setForeground(new Color(131, 90, 194, 255));
        l3.setFont(new Font("Verdana",Font.ITALIC,14));
        l3.setBounds(250,300,200,40);
        add(l3);


        l3 = new JLabel("Enter Disease:");
        l1.setForeground(new Color(75, 0, 128));
        l3.setFont(new Font("Verdana",Font.PLAIN,15));
        l3.setBounds(470,100,200,40);
        add(l3);

        t1 = new JTextField();
        t1.setForeground(new Color(0, 0, 0, 255));
        t1.setFont(new Font("Verdana",Font.PLAIN,14));
        t1.setBounds(470,140,200,25);
        add(t1);


        l3 = new JLabel("Date(DD-MM-YYYY): ");
        l1.setForeground(new Color(75, 0, 128));
        l3.setFont(new Font("Verdana",Font.PLAIN,15));
        l3.setBounds(470,170,200,40);
        add(l3);

        t2 = new JTextField();
        t2.setForeground(new Color(0, 0, 0, 255));
        t2.setFont(new Font("Verdana",Font.PLAIN,14));
        t2.setBounds(470,210,200,25);
        add(t2);


        l3 = new JLabel("Slot: ");
        l3.setForeground(new Color(75, 0, 128));
        l3.setFont(new Font("Verdana",Font.PLAIN,15));
        l3.setBounds(470,240,200,40);
        add(l3);


        String s1[] = {"4.00 - 4.15","4.15 - 4.30","4.30 - 4.45","4.45 - 5.00","5.00 - 5.15","5.15 - 5.30","5.30 - 5.45","5.45 - 6.00"};
        cb1 = new JComboBox(s1);
        cb1.setBackground(Color.white);
        cb1.setFont(new Font("Raleway",Font.PLAIN,12));
        cb1.setBounds(470,280,200,25);
        add(cb1);


        l3 = new JLabel("Doctor: ");
        l3.setForeground(new Color(75, 0, 128));
        l3.setFont(new Font("Verdana",Font.PLAIN,15));
        l3.setBounds(470,310,200,40);
        add(l3);

        String s2[] = {"Semirra Bayan","Jamie Bogle","Joseph Breen","Matthew Carlson","Angela Donaldson","Sharon Libi"};
        cb2 = new JComboBox(s2);
        cb2.setBackground(Color.white);
        cb2.setFont(new Font("Raleway",Font.PLAIN,12));
        cb2.setBounds(470,350,200,25);
        add(cb2);

        l3 = new JLabel("*To cancel appointment, please communicate through your registered email.");
        l3.setForeground(new Color(53, 0, 79));
        l3.setFont(new Font("Verdana",Font.BOLD,15));
        l3.setBounds(40,460,1000,40);
        add(l3);


        b8 = new JButton("Book");
        b8.setFont(new Font("Verdana",Font.BOLD,15));
        b8.setBounds(600,400,130,30);
        b8.setForeground(new Color(0x4B0080));
        b8.setBackground(new Color(0xCC98EA));
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("Back");
        b9.setFont(new Font("Verdana",Font.BOLD,15));
        b9.setBounds(50,400,130,30);
        b9.setForeground(new Color(0x4B0080));
        b9.setBackground(new Color(0xCC98EA));
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


        ImageIcon i50 = new ImageIcon(ClassLoader.getSystemResource("icons/lav.png"));
        Image i55 = i50.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH);
        ImageIcon i56 = new ImageIcon(i55);
        JLabel image11 = new JLabel(i56);
        image11.setBounds(450, 100, 320, 340);
        add(image11);


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

            String disease = t1.getText();
            String date1 = t2.getText();
            Date date = new Date();
            String slot = (String) cb1.getSelectedItem();
            String doctor = (String) cb2.getSelectedItem();


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
            }else if (e.getSource() == b5) {
                new mainscreen();
                setVisible(false);
            }else if (e.getSource() == b8) {
                    if (disease.equals("")|| date.equals("")||slot.equals("")||doctor.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields.");
                    } else {
                        SQLConnection connection = new SQLConnection();
                        String query = "insert into appointment values('" + email + "','" + date + "','" + disease + "',' " + date1 + "',' "+ slot +" ','" + doctor + "')";
                        connection.statement.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Successfully booked appointment!");
                    }

            }else if (e.getSource() == b9) {
                setVisible(false);
                new services("","");
            }


        } catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new appointment("","");

    }


}
