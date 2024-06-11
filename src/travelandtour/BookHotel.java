
package travelandtour;

import java.awt.Color;

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

public class BookHotel extends javax.swing.JFrame {
    
    String username;
    int discountRate;

    public BookHotel(String u) {
        initComponents();
        
        this.setBounds(620, 180, 570, 540);
        setTitle("Book Hotel");
        this.getContentPane().setBackground(Color.WHITE);
        jPanel1.setBackground(new Color(133,193,233));
        this.setLayout(null);
        setResizable(false);
        
        username = u;
        
        checkPrice.setBackground(Color.BLUE);
        checkPrice.setForeground(Color.WHITE);
        
        bookNow.setBackground(Color.GREEN);
        
        monthFrom.removeAllItems();
        monthTo.removeAllItems();
        destination.removeAllItems();
        hotels.removeAllItems();
        
        String months[] = {"JAN", "FEB", "MAR", "APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
        
        
        for(int i=0; i<12; i++){
            monthFrom.addItem(months[i]);
            monthTo.addItem(months[i]);
        }
        
        String city[] = {"COX'S BAZAR","DHAKA","RAJSHAHI","SYLHET"};
        for(int i=0; i<city.length;i++){
            destination.addItem(city[i]);
        }
        
        duration.setText("");
        price.setText("");
        discount.setText("");
        totalPrice.setText("");
        destinationLbl.setText("");
        hotelLbl.setText("");
        fromLbl.setText("");
        toLbl.setText("");
        
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("SELECT type FROM users WHERE uid = ?");
            ps.setInt(1, Integer.parseInt(u));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String type = rs.getString(1);
                if(type.equals("Silver")) discountRate = 5;
                else if(type.equals("Gold")) discountRate = 10;
                else discountRate = 15;
            }
            ps.close();
            rs.close();
            conn.close();
        }catch(Exception e){
            
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dayFrom = new javax.swing.JTextField();
        monthFrom = new javax.swing.JComboBox<>();
        yearFrom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dayTo = new javax.swing.JTextField();
        monthTo = new javax.swing.JComboBox<>();
        yearTo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        destination = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        hotels = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        duration = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        checkPrice = new javax.swing.JButton();
        bookNow = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        destinationLbl = new javax.swing.JLabel();
        hotelLbl = new javax.swing.JLabel();
        fromLbl = new javax.swing.JLabel();
        toLbl = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("From Date");

        dayFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayFromActionPerformed(evt);
            }
        });

        monthFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Day");

        jLabel3.setText("Month");

        jLabel4.setText("Year");

        jLabel5.setText("To Date");

        monthTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Destination");

        destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationActionPerformed(evt);
            }
        });

        jLabel8.setText("Hotels");

        hotels.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Duration (Nights)");

        duration.setText("jLabel10");

        jLabel11.setText("Price (Tk)");

        price.setText("jLabel12");

        jLabel13.setText("Discount (Tk)");

        discount.setText("jLabel14");

        jLabel15.setText("Total Price (Tk)");

        totalPrice.setText("jLabel16");

        checkPrice.setText("Check Price");
        checkPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPriceActionPerformed(evt);
            }
        });

        bookNow.setText("Book Now");
        bookNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNowActionPerformed(evt);
            }
        });

        jLabel10.setText("Destination");

        jLabel12.setText("Hotel");

        jLabel14.setText("From");

        jLabel16.setText("To");

        destinationLbl.setText("jdksjd");

        hotelLbl.setText("jLabel18");

        fromLbl.setText("jLabel19");

        toLbl.setText("jLabel20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destination, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hotels, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dayFrom)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayTo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(monthFrom, 0, 90, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yearFrom)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearTo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totalPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(discount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(duration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(destinationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hotelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(fromLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(toLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(bookNow, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dayFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dayTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hotels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(duration)
                    .addComponent(jLabel10)
                    .addComponent(destinationLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(price)
                    .addComponent(jLabel12)
                    .addComponent(hotelLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(discount)
                    .addComponent(jLabel14)
                    .addComponent(fromLbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(totalPrice)
                    .addComponent(jLabel16)
                    .addComponent(toLbl))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPrice)
                    .addComponent(bookNow))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dayFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayFromActionPerformed

    private void checkPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPriceActionPerformed
        
        ///Date Handling starts
        int d1, m1, y1;
        int d2, m2, y2;
        
        String D1 = dayFrom.getText().toString().trim();
        String Y1 = yearFrom.getText().toString().trim();
        String D2 = dayTo.getText().toString().trim();
        String Y2 = yearTo.getText().toString().trim();
        
        try{
            d1 = Integer.parseInt(D1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "From-Day must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            y1 = Integer.parseInt(Y1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "From-Year must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            d2 = Integer.parseInt(D2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "To-Day must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            y2 = Integer.parseInt(Y2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "To-Year must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(y1 <2024 || y1 > 2030){
            JOptionPane.showMessageDialog(null, "From-Year must be between 2024 to 2030", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(y2 <2024 || y2 > 2030){
            JOptionPane.showMessageDialog(null, "To-Year must be between 2024 to 2030", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int d[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        m1 = monthFrom.getSelectedIndex();
        
        int limit1 = d[m1];
        if(m1==1 && (y1%400==0 || (y1%4==0 && y1%100!=0)))  limit1++;
        
        if(d1 < 1 || d1 > limit1){
            JOptionPane.showMessageDialog(null, "From-day must be between 1 to " + limit1, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        m2 = monthTo.getSelectedIndex();
        int limit2 = d[m2];
        if(m2==1 && (y2%400==0 || (y2%4==0 && y2%100!=0)))  limit2++;
        
        if(d2 < 1 || d2 > limit2){
            JOptionPane.showMessageDialog(null, "To-day must be between 1 to " + limit2, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ///Date Handling Ends
        
        
        
        
        int days = (int)JDate.calculateDateDifference(d1, m1, y1, d2, m2, y2);
        Double discountedPrice = 0.0;
        ///Code for calculating duration
        
        String dest = destination.getSelectedItem().toString();
        String hotel = hotels.getSelectedItem().toString();
        
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("SELECT price FROM hotels WHERE destination = ? and hotel = ?");
            ps.setString(1, dest);
            ps.setString(2, hotel);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                duration.setText(days + "");
                price.setText(rs.getInt(1) + "");
                
                
                discountedPrice = ((double)rs.getInt(1) * (double)days * (double)discountRate)/100.0;
                discount.setText(discountedPrice + "");
                
                totalPrice.setText(       ( (double)days* (double)rs.getInt(1)   - discountedPrice  )  +       ""       );
                
            }
            
            rs.close();
            ps.close();
            conn.close();
        }catch(Exception e){
            
        }
        
        destinationLbl.setText(destination.getSelectedItem().toString());
        hotelLbl.setText(hotels.getSelectedItem().toString());
        fromLbl.setText(JDate.dateToString(d1, m1, y1));
        toLbl.setText(JDate.dateToString(d2, m2, y2));
    }//GEN-LAST:event_checkPriceActionPerformed

    private void destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationActionPerformed
        
        Object selectedItem = destination.getSelectedItem();
        String dest = (String) selectedItem;
        
        hotels.removeAllItems();

        
        try{
            Connection conn = JConnection.connectDb();
            
            PreparedStatement ps = conn.prepareStatement("SELECT hotel  FROM hotels  WHERE destination = ?");
            ps.setString(1, dest);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String h = rs.getString(1);
                hotels.addItem(h);
            }
            
            ps.close();
            rs.close();
            conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Destinationr", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_destinationActionPerformed

    private void bookNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNowActionPerformed
        String check = duration.getText().toString().trim();
        if(check.equals("")){
            JOptionPane.showMessageDialog(null, "Please check the price first", "Invalid Selection", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int max = 50000;
        int dbMax = 0;
        try{
            Connection conn = JConnection.connectDb();
            PreparedStatement ps = conn.prepareStatement("SELECT max(bid) FROM bookings");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dbMax = rs.getInt(1);
            }
            int bid = 0;
            if(max > dbMax) bid = max;
            else    bid = dbMax;
            bid++;
            
            
            int uid = Integer.parseInt(username);
            String fromDate = fromLbl.getText();
            String toDate = toLbl.getText();
            int d = Integer.parseInt(duration.getText());
            String dest = destinationLbl.getText();
            String h = hotelLbl.getText();
            Double p = Double.parseDouble(price.getText());
            Double dis = Double.parseDouble(discount.getText());
            
            ps = conn.prepareStatement("INSERT INTO bookings(bid, uid, fromdate, todate, duration, destination, hotels, price, discount, approval) VALUES(?,?,?,?,?,?,?,?,?,0)");
            ps.setInt(1, bid);
            ps.setInt(2, uid);
            ps.setString(3, fromDate);
            ps.setString(4, toDate);
            ps.setInt(5, d);
            ps.setString(6, dest);
            ps.setString(7, h);
            ps.setDouble(8, p);
            ps.setDouble(9, dis);
            
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Your Booking ID is: " + bid + "\nPlease contact with our nearest customer center for confirmation", "Booking Successful", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            return;
        }catch(Exception e){
        }
    }//GEN-LAST:event_bookNowActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookHotel("A").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookNow;
    private javax.swing.JButton checkPrice;
    private javax.swing.JTextField dayFrom;
    private javax.swing.JTextField dayTo;
    private javax.swing.JComboBox<String> destination;
    private javax.swing.JLabel destinationLbl;
    private javax.swing.JLabel discount;
    private javax.swing.JLabel duration;
    private javax.swing.JLabel fromLbl;
    private javax.swing.JLabel hotelLbl;
    private javax.swing.JComboBox<String> hotels;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> monthFrom;
    private javax.swing.JComboBox<String> monthTo;
    private javax.swing.JLabel price;
    private javax.swing.JLabel toLbl;
    private javax.swing.JLabel totalPrice;
    private javax.swing.JTextField yearFrom;
    private javax.swing.JTextField yearTo;
    // End of variables declaration//GEN-END:variables
}
