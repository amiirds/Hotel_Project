/*
 * Created by JFormDesigner on Fri Dec 04 01:05:59 IRST 2020
 */

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */

public class IntroForm extends JFrame {
    private ImageIcon image;
    public IntroForm() {
        initComponents();
        Showdate();
        Showtime();
        image = new ImageIcon("src/intro.png");
        label_image.setIcon(image);
    }
    void Showdate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        label_date.setText(simpleDateFormat.format(date));
        
    }
    Timer timer;
    void Showtime() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
                String time = timeformat.format(date);
                label_time.setText(time);

            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    private void button_loginActionPerformed() {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

    private void button_ReservationActionPerformed()  {
        ReservationForm reservationForm = null;
        try {
            reservationForm = new ReservationForm();
        } catch (Exception e) {
            e.printStackTrace();
        }
        reservationForm.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label_time = new JLabel();
        label_image = new JLabel();
        label_date = new JLabel();
        panel2 = new JPanel();
        button_login = new JButton();
        button_Reservation = new JButton();

        //======== this ========
        setTitle("Welcome");
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(55, 121, 165));
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );

            //---- label_time ----
            label_time.setForeground(Color.white);
            label_time.setFont(label_time.getFont().deriveFont(label_time.getFont().getSize() + 3f));

            //---- label_date ----
            label_date.setForeground(Color.white);
            label_date.setFont(label_date.getFont().deriveFont(label_date.getFont().getSize() + 3f));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label_time, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(label_date, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label_time, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_date, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(0, 51, 102));

            //---- button_login ----
            button_login.setText("Login  (Managers Only)");
            button_login.setFont(new Font("Noteworthy", Font.BOLD, 16));
            button_login.addActionListener(e -> button_loginActionPerformed());

            //---- button_Reservation ----
            button_Reservation.setText("Reservation");
            button_Reservation.setFont(new Font("Noteworthy", Font.BOLD, 16));
            button_Reservation.addActionListener(e -> button_ReservationActionPerformed());

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button_login, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(button_Reservation, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(button_login, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_Reservation, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label_time;
    private JLabel label_image;
    private JLabel label_date;
    private JPanel panel2;
    private JButton button_login;
    private JButton button_Reservation;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
