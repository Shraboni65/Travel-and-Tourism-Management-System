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

public class ApproveBooking extends javax.swing.JFrame {
    
    void clear(){
        bookingIdLbl.setText("");
        uidLbl.setText("");
        usernameLbl.setText("");
        phoneLbl.setText("");
        destinationLbl.setText("");
        hotelLbl.setText("");
        fromLbl.setText("");
        toLbl.setText("");
        durationLbl.setText("");
        priceLbl.setText("");
        discountLbl.setText("");
        totalLbl.setText("");
        statusLbl.setText("");
    }

    public ApproveBooking() {
        initComponents();
        
        this.setBounds(600, 180, 440, 560);
        setTitle("Booking Approval");
        search.setBackground(Color.WHITE);
        search.setForeground(Color.black);
        approve.setBackground(Color.GREEN);
        approve.setForeground(Color.WHITE);
        getContentPane().setBackground(new Color(133,193,233));
        setResizable(false);
        clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookingTxt = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        bookingIdLbl = new javax.swing.JLabel();
        uidLbl = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        destinationLbl = new javax.swing.JLabel();
        hotelLbl = new javax.swing.JLabel();
        fromLbl = new javax.swing.JLabel();
        toLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        discountLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        durationLbl = new javax.swing.JLabel();
        approve = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Booking ID");

        bookingTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingTxtActionPerformed(evt);
            }
        });

        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel2.setText("Booking ID");

        jLabel3.setText("User ID");

        jLabel4.setText("Username");

        jLabel5.setText("Phone");

        jLabel6.setText("Destination");

        jLabel8.setText("From");

        jLabel9.setText("To");

        jLabel10.setText("Price");

        jLabel11.setText("Discount");

        jLabel12.setText("Total");

        jLabel13.setText("Hotel");

        usernameLbl.setText("jLabel14");

        bookingIdLbl.setText("jLabel15");

        uidLbl.setText("jLabel17");

        phoneLbl.setText("jLabel18");

        destinationLbl.setText("jLabel19");

        hotelLbl.setText("jLabel20");

        fromLbl.setText("jLabel21");

        toLbl.setText("jLabel22");

        priceLbl.setText("jLabel23");

        discountLbl.setText("jLabel24");

        totalLbl.setText("jLabel25");

        jLabel7.setText("Duration");

        durationLbl.setText("jLabel16");

        approve.setText("APPROVE");
        approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveActionPerformed(evt);
            }
        });

        jLabel14.setText("Status");

        statusLbl.setText("jLabel15");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discountLbl)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(toLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(durationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(priceLbl)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fromLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(destinationLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                                .addComponent(phoneLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(usernameLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(uidLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bookingIdLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hotelLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(statusLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                        .addComponent(totalLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(bookingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(approve, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bookingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bookingIdLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(uidLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(destinationLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(hotelLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fromLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(toLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(durationLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(priceLbl))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(discountLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(totalLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(statusLbl))
                .addGap(18, 18, 18)
                .addComponent(approve)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookingTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingTxtActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String BID = bookingTxt.getText().toString();
        int bid = 0;
        try{
            bid = Integer.parseInt(BID);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Booking ID must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM bookings WHERE bid = ?");
            ps.setInt(1, bid);
            ResultSet rs = ps.executeQuery();
            int uid = 0;
            while(rs.next()){
                uid = rs.getInt(2);
                String from = rs.getString(3);
                String to = rs.getString(4);
                int duration = rs.getInt(5);
                String destination = rs.getString(6);
                String hotel = rs.getString(7);
                Double price = rs.getDouble(8);
                Double discount = rs.getDouble(9);
                Double total = (double)duration * price - discount;
                int approval = rs.getInt(10);
                String APPROVAL = "Approved";
                if(approval == 0)   APPROVAL = "Pending";
                
                bookingIdLbl.setText(bid + "");
                uidLbl.setText(uid + "");
                usernameLbl.setText("");
                phoneLbl.setText("");
                destinationLbl.setText(destination + "");
                hotelLbl.setText(hotel + "");
                fromLbl.setText(from + "");
                toLbl.setText(to + "");
                durationLbl.setText(duration + "");
                priceLbl.setText(price + "");
                discountLbl.setText(discount + "");
                totalLbl.setText(total + "");
                statusLbl.setText(APPROVAL + "");
                
            }
            if(uid == 0){
                clear();
                JOptionPane.showMessageDialog(null, "No booking information found with the booking ID: " + bid, "Invalid Booking ID", JOptionPane.ERROR_MESSAGE);
                
                return;
            }
            
            ps = conn.prepareStatement("SELECT name, phone FROM Users where uid = ?");
            ps.setInt(1, uid);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                usernameLbl.setText(rs.getString(1) + "");
                phoneLbl.setText(rs.getString(2) + "");
            }
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_searchActionPerformed

    private void approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveActionPerformed
        String BID = bookingIdLbl.getText();
        if(BID.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter a valid booking ID first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int bid = Integer.parseInt(BID);
        String status = statusLbl.getText();
        if(status.equals("Approved")){
            JOptionPane.showMessageDialog(null, "Booking ID: " + bid + " has already been approved.", "Already Approved", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            return;
        }
        
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("UPDATE bookings SET approval = 1 WHERE bid = ?");
            ps.setInt(1, bid);
            ps.execute();
            statusLbl.setText("Approved");
            JOptionPane.showMessageDialog(null, "Booking ID: " + bid + " has been approved.", "Approved", JOptionPane.WARNING_MESSAGE);
            this.setVisible(false);
            
            return;
        }catch(Exception ex){
            
        }
    }//GEN-LAST:event_approveActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JLabel bookingIdLbl;
    private javax.swing.JTextField bookingTxt;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JLabel discountLbl;
    private javax.swing.JLabel durationLbl;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JLabel hotelLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JButton search;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel toLbl;
    private javax.swing.JLabel totalLbl;
    private javax.swing.JLabel uidLbl;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
