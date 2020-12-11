/*
 * Created by JFormDesigner on Tue Dec 01 22:11:28 IRST 2020
 */

package View;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class MenuForm extends JFrame {
    public MenuForm() {
        initComponents();
    }

    private void button_passengersActionPerformed() throws Exception {
        PassengersForm passengersForm = new PassengersForm();
        passengersForm.setVisible(true);
    }

    private void button_employeesActionPerformed() {
        EmployeesForm employeesForm = new EmployeesForm();
        employeesForm.setVisible(true);
    }

    private void button_roomsActionPerformed() throws Exception {
        RoomsForm roomsForm = new RoomsForm();
        roomsForm.setVisible(true);
    }

    private void button_reservationActionPerformed() throws Exception {
        ReservationForm reservationForm = new ReservationForm();
        reservationForm.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button_passengers = new JButton();
        button_employees = new JButton();
        button_rooms = new JButton();
        button_income = new JButton();

        //======== this ========
        setTitle("Menu");
        var contentPane = getContentPane();

        //---- button_passengers ----
        button_passengers.setText("Passsengers ");
        button_passengers.addActionListener(e -> {
            try {
                button_passengersActionPerformed();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        //---- button_employees ----
        button_employees.setText("Employees");
        button_employees.addActionListener(e -> button_employeesActionPerformed());

        //---- button_rooms ----
        button_rooms.setText("Rooms");
        button_rooms.addActionListener(e -> {
            try {
                button_roomsActionPerformed();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        //---- button_income ----
        button_income.setText("Hotel Income");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button_rooms, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button_income, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button_passengers, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(button_employees, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button_passengers, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_employees, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button_rooms, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_income, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(18, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button_passengers;
    private JButton button_employees;
    private JButton button_rooms;
    private JButton button_income;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
