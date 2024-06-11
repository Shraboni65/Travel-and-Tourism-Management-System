
package travelandtour;

import java.awt.Color;
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

public class ApproveUser extends javax.swing.JFrame {

    public ApproveUser(String username) {
        initComponents();
        
        this.setBounds(660, 250, 350, 400);
        setTitle("User Approval");
        getContentPane().setBackground(new Color(133,193,233));
        approve.setBackground(Color.GREEN);
        approve.setForeground(Color.WHITE);
        notapprove.setBackground(Color.RED);
        notapprove.setForeground(Color.BLACK);
        setResizable(false);
        
        uidtxt.setText("");
        uidlbl.setText("");
        namelbl.setText("");
        phonelbl.setText("");
        typelbl.setText("");
        statuslbl.setText("");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uidlbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        phonelbl = new javax.swing.JLabel();
        typelbl = new javax.swing.JLabel();
        notapprove = new javax.swing.JButton();
        uidtxt = new javax.swing.JTextField();
        approve = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        statuslbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User ID");

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel2.setText("User ID");

        jLabel3.setText("User Name");

        jLabel4.setText("Phone");

        jLabel5.setText("Type");

        uidlbl.setText("jLabel6");

        namelbl.setText("jLabel7");

        phonelbl.setText("jLabel8");

        typelbl.setText("jLabel9");

        notapprove.setText("NOT APPROVE");
        notapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notapproveActionPerformed(evt);
            }
        });

        uidtxt.setText("jTextField1");

        approve.setText("APPROVE");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        jLabel6.setText("Status");

        statuslbl.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(notapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(uidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uidlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(namelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phonelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(statuslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(search)
                    .addComponent(uidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uidlbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namelbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phonelbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(typelbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statuslbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notapprove)
                    .addComponent(approve))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        String UID = uidtxt.getText().toString();
        int uid = 0;
        try{
            uid = Integer.parseInt(UID);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "User ID must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("SELECT uid,name,phone,type,approval FROM users WHERE uid = ?");
            ps.setInt(1, uid);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                uid = rs.getInt(1);
                String name = rs.getString(2);
                String phone = rs.getString(3);
                String type = rs.getString(4);
                int approval = rs.getInt(5);
                String APPROVAL = "Approved";
                if(approval == 0)   APPROVAL = "Pending";
                
                uidlbl.setText(uid + "");
                namelbl.setText(name+ "");
                phonelbl.setText(phone+ "");
                typelbl.setText(type+ "");
                statuslbl.setText(APPROVAL+ "");
                
                if(uid == 0){
                
                    JOptionPane.showMessageDialog(null, "No booking information found with the booking ID: " + uid, "Invalid User ID", JOptionPane.ERROR_MESSAGE);
                    uidtxt.setText("");
                    uidlbl.setText("");
                    namelbl.setText("");
                    phonelbl.setText("");
                    typelbl.setText("");
                    statuslbl.setText("");
                    
                    return;
                
                }               
            }          
        }catch(Exception e){
            
        }      
    }//GEN-LAST:event_searchActionPerformed

    private void notapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notapproveActionPerformed
        
        String UID = uidlbl.getText();
        if(UID.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid booking ID first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int uid = Integer.parseInt(UID);
        String status = statuslbl.getText();
        if(status.equals("Pending")){
            JOptionPane.showMessageDialog(null, "User ID: " + uid + " has not approved Yet.", "Not Our User", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            return;
        }
        
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET approval = 0 WHERE uid = ?");
            ps.setInt(1, uid);
            ps.execute();
            statuslbl.setText("Pending");
            JOptionPane.showMessageDialog(null, "User ID: " + uid + " has been Removed Successfully.", "Pending", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            
            return;
        }catch(Exception ex){
            
        }
        
    }//GEN-LAST:event_notapproveActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        
        String UID = uidlbl.getText();
        if(UID.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid booking ID first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int uid = Integer.parseInt(UID);
        String status = statuslbl.getText();
        if(status.equals("Approved")){
            JOptionPane.showMessageDialog(null, "User ID: " + uid + " has already been approved.", "Already Approved", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            return;
        }
        
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("UPDATE users SET approval = 1 WHERE uid = ?");
            ps.setInt(1, uid);
            ps.execute();
            statuslbl.setText("Approved");
            JOptionPane.showMessageDialog(null, "User ID: " + uid + " has been approved.", "Approved", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            
            return;
        }catch(Exception ex){
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_approveActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveUser("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel namelbl;
    private javax.swing.JButton notapprove;
    private javax.swing.JLabel phonelbl;
    private javax.swing.JButton search;
    private javax.swing.JLabel statuslbl;
    private javax.swing.JLabel typelbl;
    private javax.swing.JLabel uidlbl;
    private javax.swing.JTextField uidtxt;
    // End of variables declaration//GEN-END:variables
}
