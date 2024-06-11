
package travelandtour;

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

public class Signup extends JFrame implements ActionListener {

    JTextField tfUsername, tfPhone;
    JPasswordField pfPassword;
    JComboBox<String> cbMembership;
    JButton btnRegister;

    Signup() {
        super("Signup Page");

        setSize(400, 400);
        setLocationRelativeTo(null); 
        getContentPane().setBackground(new Color(133,193,233));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 50, 100, 30);
        add(lblUsername);

        tfUsername = new JTextField();
        tfUsername.setBounds(150, 50, 200, 30);
        add(tfUsername);

        JLabel lblPhone = new JLabel("Phone:");
        lblPhone.setBounds(50, 100, 100, 30);
        add(lblPhone);

        tfPhone = new JTextField();
        tfPhone.setBounds(150, 100, 200, 30);
        add(tfPhone);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 150, 100, 30);
        add(lblPassword);

        pfPassword = new JPasswordField();
        pfPassword.setBounds(150, 150, 200, 30);
        add(pfPassword);

        JLabel lblMembership = new JLabel("Membership:");
        lblMembership.setBounds(50, 200, 100, 30);
        add(lblMembership);

        String[] memberships = {"Silver", "Gold", "Diamond"};
        cbMembership = new JComboBox<>(memberships);
        cbMembership.setBounds(150, 200, 200, 30);
        add(cbMembership);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(100, 280, 200, 30);
        btnRegister.setBackground(Color.GREEN);
        btnRegister.setForeground(Color.WHITE);
        btnRegister.addActionListener(this);
        add(btnRegister);

        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username = tfUsername.getText().trim();
        String phone = tfPhone.getText().trim();
        String password = new String(pfPassword.getPassword());
        String membership = (String) cbMembership.getSelectedItem();
        
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter a valid User Name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(phone.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Phone number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(password.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Password", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(password.length() < 8){
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            
            Connection conn = JConnection.connectDb();
            
            PreparedStatement ps = conn.prepareStatement("SELECT max(uid) FROM users");
            
            ResultSet rs = ps.executeQuery();
            
            int myMax = 10000;
            int dbMax = 0;
            
            while(rs.next()){
                dbMax = rs.getInt(1);
            }
            int max;
            if(myMax > dbMax)   max = myMax;
            else    max = dbMax;
            int uid = max + 1;
           
            ps = conn.prepareStatement("INSERT INTO users (uid,name,pass,phone,type,approval) VALUES (?,?,?,?,?,0) ");
            ps.setInt(1, uid);
            ps.setString(2, username);
            ps.setString(4, phone);
            ps.setString(3, password);
            ps.setString(5, membership);
            
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Your user ID is: " + uid + "\nPlease contact with our nearest customer center for activation", "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            
            ps.close();
            rs.close();
            conn.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Your registration has been failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}

