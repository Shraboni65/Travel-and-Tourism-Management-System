package travelandtour;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
    
    JTextField tfusername;
    JPasswordField tfpassword;

    Login(){
        
        super("Login Sight");
        
        setSize(900,400);
        setLocationRelativeTo(null);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 80, 170, 200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);
        
        JLabel lblusername = new JLabel("User ID");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("SAN SARIF", Font.PLAIN, 20));
        p2.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 110, 100, 25);
        lblpassword.setFont(new Font("SAN SARIF", Font.PLAIN, 20));
        p2.add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        JButton login = new JButton("Login");
        login.setBounds(60, 200, 90, 30); // Adjusted bounds
        login.setBackground(new Color(70,200,250));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        p2.add(login);
        
        JButton signup = new JButton("Signup");
        signup.setBounds(180, 200, 90, 30); 
        signup.setBackground(new Color(70,200,250));
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        p2.add(signup);
        
        JButton exit = new JButton("Exit");
        exit.setBounds(300, 200, 90, 30); 
        exit.setBackground(Color.RED);
        exit.setForeground(Color.BLACK);
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Signup s = new Signup();
                s.setVisible(true);
                setVisible(false);
            }
        });
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String username = tfusername.getText().trim();
                String password = new String(tfpassword.getPassword());
                
                if(username.equals("admin") && password.equals("admin")){
                    DashboardAdmin d = new DashboardAdmin("admin");
                    d.setVisible(true);
                    setVisible(false);
                    return;
                }
                
                
                int uid = 0;
                
                if(username.equals("") || password.equals("")){
                    JOptionPane.showMessageDialog(null, "Incorrect credentials", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                try{
                    uid = Integer.parseInt(username);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Username must be a number", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                try{
                    Connection conn = JConnection.connectDb();
                    
                    PreparedStatement ps = conn.prepareStatement("SELECT pass  FROM users  WHERE uid = ?");
                    ps.setString(1, username);
                    
                    ResultSet rs = ps.executeQuery();
            
                    String dbPass = null;

                    while(rs.next()){
                        dbPass = rs.getString(1);
                    }
                    
                    if(dbPass == null){
                        JOptionPane.showMessageDialog(null, "Incorrect credentials", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                    if(password.equals(dbPass)){
                        
                        ps = conn.prepareStatement("SELECT approval  FROM users  WHERE uid = ?");
                        ps.setInt(1, uid);

                        rs = ps.executeQuery();

                        int app = 0;

                        while(rs.next()){
                            app = rs.getInt(1);
                        }
                        
                        if(app==0){
                            JOptionPane.showMessageDialog(null, "Your user id: " + uid + " is waiting for approval\nPlease contact with our nearest customer center", "Pending", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        else{
                            Dashboard d = new Dashboard(username);
                            d.setVisible(true);
                            setVisible(false);
                            
                            ps = conn.prepareStatement("UPDATE current_user SET uid = ?");
                            ps.setInt(1, uid);
                            ps.execute();
                            
                            return;
                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect credentials", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Please insert your correct UserId & Passwrd!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                
            }
        });
        
        p2.add(exit);        
        
        setVisible(true);
    }

   
    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
