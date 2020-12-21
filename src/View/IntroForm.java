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
    public IntroForm() {
        initComponents();
        Showdate();
        Showtime();
    }

    void Showdate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
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
        button_login = new JButton();
        button_Reservation = new JButton();
        label_time = new JLabel();
        label_date = new JLabel();

        //======== this ========
        setTitle("Welcome");
        var contentPane = getContentPane();

        //---- button_login ----
        button_login.setText("Login  (Managers & Emplooyes)");
        button_login.addActionListener(e -> button_loginActionPerformed());

        //---- button_Reservation ----
        button_Reservation.setText("Reservation");
        button_Reservation.addActionListener(e -> button_ReservationActionPerformed());

        //---- label_time ----
        label_time.setForeground(Color.black);
        label_time.setFont(label_time.getFont().deriveFont(label_time.getFont().getSize() + 3f));

        //---- label_date ----
        label_date.setForeground(Color.black);
        label_date.setFont(label_date.getFont().deriveFont(label_date.getFont().getSize() + 3f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_Reservation, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_login, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label_time, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                            .addComponent(label_date, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label_time, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_date, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(button_login, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(button_Reservation, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button_login;
    private JButton button_Reservation;
    private JLabel label_time;
    private JLabel label_date;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
