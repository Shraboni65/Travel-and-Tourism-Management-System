
package travelandtour;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DashboardAdmin extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6,b7,b8;
    String username;

    DashboardAdmin (String username) {

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
        
        setTitle("Admin Dashboard");

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 60, 230, 1000);
        p2.setBackground(new Color(0, 0, 102));
        this.add(p2);
        
        b8 = new JButton("Approve User");
        b8.setBackground(new Color(0, 0, 102));
        b8.setForeground(Color.WHITE);
        b8.setMargin(new Insets(0, 0, 0, 190));
        b8.setBounds(0, 100, 300, 50);
        b8.addActionListener(this);
        p2.add(b8);

        b2 = new JButton("Approve Booking");
        b2.setBackground(new Color(0, 0, 102));
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0, 0, 0, 190));
        b2.setBounds(0, 150, 300, 50);
        b2.addActionListener(this);
        p2.add(b2);
        
        b7 = new JButton("Destinations");
        b7.setBackground(new Color(0, 0, 102));
        b7.setForeground(Color.WHITE);
        b7.setMargin(new Insets(0, 0, 0, 205));
        b7.setBounds(0, 200, 300, 50);
        b7.addActionListener(this);
        p2.add(b7);
        
        b6 = new JButton("View Hotels");
        b6.setBackground(new Color(0, 0, 102));
        b6.setForeground(Color.WHITE);
        b6.setMargin(new Insets(0, 0, 0, 215));
        b6.setBounds(0, 250, 300, 50);
        b6.addActionListener(this);
        p2.add(b6);
        
        b1 = new JButton("Add Hotels");
        b1.setBackground(new Color(0, 0, 102));
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0, 0, 0, 205));
        b1.setBounds(0, 300, 300, 50);
        b1.addActionListener(this);
        p2.add(b1);

        b3 = new JButton("About");
        b3.setBackground(new Color(0, 0, 102));
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0, 0, 0, 225));
        b3.setBounds(0, 350, 300, 50);
        b3.addActionListener(this);
        p2.add(b3);
        
        b4 = new JButton("Exit");
        b4.setBackground(new Color(0, 0, 102));
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0, 0, 0, 225));
        b4.setBounds(0, 400, 300, 50);
        b4.addActionListener(this);
        p2.add(b4);
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/TanguarHawor.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
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
    public void actionPerformed (ActionEvent ae) {
        
        if(ae.getSource() == b1){
            AddHotel  a = new AddHotel();
            a.setVisible(true);
        }        
        else if(ae.getSource() == b2){
            ApproveBooking  a = new ApproveBooking();
            a.setVisible(true);
        }
        else if (ae.getSource() == b3) {
            new About().setVisible(true);
        }
        else if (ae.getSource() == b4){
            System.exit(0);
        }
        else if (ae.getSource() == b6) {
            ViewHotels vh = new ViewHotels();
            vh.setVisible(true);
        } 
        else if (ae.getSource() == b7) {
            Destinations d = new Destinations();
            d.setVisible(true);
        } 
        else if (ae.getSource() == b8) {
            ApproveUser au = new ApproveUser(username);
            au.setVisible(true);
        } 
    }

    public static void main(String[] args) {
        new DashboardAdmin("Anonymous").setVisible(true);
    }
}
