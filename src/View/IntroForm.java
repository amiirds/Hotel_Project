/*
 * Created by JFormDesigner on Fri Dec 04 01:05:59 IRST 2020
 */

package View;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class IntroForm extends JFrame {
    public IntroForm() {
        initComponents();
    }

    private void button_loginActionPerformed() {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

    private void button_ReservationActionPerformed() throws Exception {
        ReservationForm reservationForm = new ReservationForm();
        reservationForm.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button_login = new JButton();
        button_Reservation = new JButton();

        //======== this ========
        setTitle("Welcome");
        var contentPane = getContentPane();

        //---- button_login ----
        button_login.setText("Login  (Managers & Emplooyes)");
        button_login.addActionListener(e -> button_loginActionPerformed());

        //---- button_Reservation ----
        button_Reservation.setText("Reservation");
        button_Reservation.addActionListener(e -> {
            try {
                button_ReservationActionPerformed();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(button_login, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Reservation, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(button_login, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button_Reservation, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button_login;
    private JButton button_Reservation;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
