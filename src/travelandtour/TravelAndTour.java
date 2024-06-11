package travelandtour;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



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

public class TravelAndTour extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1;

    public TravelAndTour() {

        super("Explore The World!");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int windowWidth = screenWidth - 100;
        int windowHeight = screenHeight - 100;

        setSize(windowWidth, windowHeight);
        setLayout(null);
        setLocationRelativeTo(null);

        b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i3 = i1.getImage().getScaledInstance(windowWidth, windowHeight, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        b1.setBounds(windowWidth - 200, windowHeight - 105, 150, 50);
        l1.setBounds(0, 0, windowWidth, windowHeight);

        l1.setLayout(null);
        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            int uid = 0;
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("SELECT uid FROM current_user");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                uid = rs.getInt(1);
            }
            
            if(uid == 0){
                new Login().setVisible(true);
                this.setVisible(false);
            }
            else{
                Dashboard d = new Dashboard(uid + "");
                d.setVisible(true);
                setVisible(false);
            }
            
            ps.close();
            rs.close();
            conn.close();
        }catch(Exception ex){
            
        }       
    }

    public static void main(String[] args) {
        TravelAndTour window = new TravelAndTour();
        window.setVisible(true);
    }
}
