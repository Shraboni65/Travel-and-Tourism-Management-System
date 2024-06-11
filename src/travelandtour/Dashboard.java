package travelandtour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Dashboard extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5,b6,b7;
    String username;

    Dashboard(String username) {
        this.username = username;

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1950, 60);
        p1.setBackground(new Color(0, 0, 102));
        this.add(p1);

        JLabel l3 = new JLabel("Dashboard");
        l3.setBounds(15, 20, 300, 40);
        l3.setFont(new Font("Tahoma", Font.BOLD, 30));
        l3.setForeground(Color.WHITE);
        p1.add(l3);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 60, 230, 1000);
        p2.setBackground(new Color(0, 0, 102));
        this.add(p2);
        
        setTitle("User Dashboard");

        b1 = new JButton("Profile");
        b1.setBackground(new Color(0, 0, 102));
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0, 0, 0, 205));
        b1.setBounds(0, 100, 300, 50);
        b1.addActionListener(this);
        p2.add(b1);
        
        b7 = new JButton("Destinations");
        b7.setBackground(new Color(0, 0, 102));
        b7.setForeground(Color.WHITE);
        b7.setMargin(new Insets(0, 0, 0, 205));
        b7.setBounds(0, 150, 300, 50);
        b7.addActionListener(this);
        p2.add(b7);
        
        b6 = new JButton("View Hotels");
        b6.setBackground(new Color(0, 0, 102));
        b6.setForeground(Color.WHITE);
        b6.setMargin(new Insets(0, 0, 0, 215));
        b6.setBounds(0, 200, 300, 50);
        b6.addActionListener(this);
        p2.add(b6);

        b2 = new JButton("Book Hotel");
        b2.setBackground(new Color(0, 0, 102));
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0, 0, 0, 190));
        b2.setBounds(0, 250, 300, 50);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("Your Bookings");
        b3.setBackground(new Color(0, 0, 102));
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0, 0, 0, 195));
        b3.setBounds(0, 300, 300, 50);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("About");
        b4.setBackground(new Color(0, 0, 102));
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0, 0, 0, 225));
        b4.setBounds(0, 350, 300, 50);
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Logout");
        b5.setBackground(new Color(0, 0, 102));
        b5.setForeground(Color.WHITE);
        b5.setMargin(new Insets(0, 0, 0, 215));
        b5.setBounds(0, 400, 300, 50);
        b5.addActionListener(this);
        p2.add(b5);
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Jaflong.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1000);
        this.add(l1);

        JLabel l4 = new JLabel("Travel and Tourism Management");
        l4.setBounds(500, 60, 1000, 70);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 55));
        l1.add(l4);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1){
            new Profile(username).setVisible(true);
        }
        else if (ae.getSource() == b4) {
            new About().setVisible(true);
        } 
        else if (ae.getSource() == b2) {
            BookHotel b = new BookHotel(username);
            b.setVisible(true);
        } 
        else if (ae.getSource() == b3) {
            History h = new History(username);
            h.setVisible(true);
        } 
        else if (ae.getSource() == b5) {
            try {
                Connection conn = JConnection.connectDb();
                PreparedStatement ps = conn.prepareStatement("UPDATE current_user SET uid = 0");
                ps.execute();

                Login l = new Login();
                l.setVisible(true);
                setVisible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (ae.getSource() == b6) {
            ViewHotels vh = new ViewHotels();
            vh.setVisible(true);
        } 
        else if (ae.getSource() == b7) {
            Destinations d = new Destinations();
            d.setVisible(true);
        } 
    }

    public static void main(String[] args) {
        new Dashboard("Anonymous").setVisible(true);
    }
}
