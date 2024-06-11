
package travelandtour;

import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JLabel caption;
    Thread th;

    @Override
    public void run() {
        try {

            l1.setVisible(true);
            caption.setText("Bagerhat");
            l1.add(caption);
            Thread.sleep(1000);
            l1.setVisible(false);
            
            l2.setVisible(true);
            caption.setText("Bandarban");
            l2.add(caption);
            Thread.sleep(1000);
            l2.setVisible(false);
            
            l3.setVisible(true);
            caption.setText("Cox’s Bazar Beach");
            l3.add(caption);
            Thread.sleep(1000);
            l3.setVisible(false);
            
            l4.setVisible(true);
            caption.setText("Kaptai Lake");
            l4.add(caption);
            Thread.sleep(1000);
            l4.setVisible(false);
            
            l5.setVisible(true);
            caption.setText("NafaKhum Waterfalls");
            l5.add(caption);
            Thread.sleep(1000);
            l5.setVisible(false);
            
            l6.setVisible(true);
            caption.setText("Lalbagh Fort");
            l6.add(caption);
            Thread.sleep(1000);
            l6.setVisible(false);
            
            l7.setVisible(true);
            caption.setText("Sonargaon");
            l7.add(caption);
            Thread.sleep(1000);
            l7.setVisible(false);
            
            l8.setVisible(true);
            caption.setText("Srimongol");
            l8.add(caption);
            Thread.sleep(1000);
            l8.setVisible(false);
            
            l9.setVisible(true);
            caption.setText("St. Martin’s Island");
            l9.add(caption);
            Thread.sleep(1000);
            l9.setVisible(false);
            
            l10.setVisible(true);
            caption.setText("Tangoar Haor");
            l10.add(caption);
            Thread.sleep(1000);
            l10.setVisible(false);

            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Destinations() {

        setBounds(580, 220, 900, 700);
        setLocationRelativeTo(null);
        setTitle("Destinations");
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);
    
        caption = new JLabel();
        caption.setBounds(50, 550, 1000, 70);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        add(caption);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Bagerhat.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(0, 0, 900, 700);
        add(l1);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/Bandarban.jpg"));
        Image i5 = i4.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l2 = new JLabel(i6);
        l2.setBounds(0, 0, 900, 700);
        add(l2);
        l2.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/CoxsBazarBeach.jpg"));
        Image i8 = i7.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l3 = new JLabel(i9);
        l3.setBounds(0, 0, 900, 700);
        add(l3);
        l3.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/KaptaiLake.jpg"));
        Image i11 = i10.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l4 = new JLabel(i12);
        l4.setBounds(0, 0, 900, 700);
        add(l4);
        l4.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/NafaKhumWaterfalls.jpg"));
        Image i14 = i13.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l5 = new JLabel(i15);
        l5.setBounds(0, 0, 900, 700);
        add(l5);
        l5.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/LalbaghFort.jpg"));
        Image i17 = i16.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l6 = new JLabel(i18);
        l6.setBounds(0, 0, 900, 700);
        add(l6);
        l6.setVisible(false);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icons/Sonargaon.jpg"));
        Image i20 = i19.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l7 = new JLabel(i21);
        l7.setBounds(0, 0, 900, 700);
        add(l7);
        l7.setVisible(false);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/Srimongol.jpg"));
        Image i23 = i22.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l8 = new JLabel(i24);
        l8.setBounds(0, 0, 900, 700);
        add(l8);
        l8.setVisible(false);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icons/StMartinIsland.jpg"));
        Image i26 = i25.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l9 = new JLabel(i27);
        l9.setBounds(0, 0, 900, 700);
        add(l9);
        l9.setVisible(false);
        
        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icons/TangoarHaor.jpg"));
        Image i29 = i28.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l10 = new JLabel(i30);
        l10.setBounds(0, 0, 900, 700);
        add(l10);
        l10.setVisible(false);

        th.start();

    }

    public static void main(String args[]) {
        new Destinations().setVisible(true);

    }

}


