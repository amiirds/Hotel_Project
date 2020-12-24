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
    private ImageIcon image;
    public MenuForm() {
        initComponents();
        image = new ImageIcon("src/hotel.png");
        label_image.setIcon(image);
    }

    private void button_passengersActionPerformed() {
        PassengersForm passengersForm = new PassengersForm();
        passengersForm.setVisible(true);
    }

    private void button_employeesActionPerformed() {
        EmployeesForm employeesForm = new EmployeesForm();
        employeesForm.setVisible(true);
    }

    private void button_roomsActionPerformed() {
        RoomsForm roomsForm = null;
        try {
            roomsForm = new RoomsForm();
        } catch (Exception e) {
            e.printStackTrace();
        }
        roomsForm.setVisible(true);
    }

    private void button_incomeActionPerformed() {
        Hotel_menu hotel_menu = new Hotel_menu();
        hotel_menu.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button_passengers = new JButton();
        button_employees = new JButton();
        button_rooms = new JButton();
        button_income = new JButton();
        label_image = new JLabel();

        //======== this ========
        setTitle("    Menu");
        var contentPane = getContentPane();

        //---- button_passengers ----
        button_passengers.setText("Passsengers ");
        button_passengers.addActionListener(e -> {
			button_passengersActionPerformed();
			button_passengersActionPerformed();
		});

        //---- button_employees ----
        button_employees.setText("Employees");
        button_employees.addActionListener(e -> button_employeesActionPerformed());

        //---- button_rooms ----
        button_rooms.setText("Rooms");
        button_rooms.addActionListener(e -> button_roomsActionPerformed());

        //---- button_income ----
        button_income.setText("Hotel Income");
        button_income.addActionListener(e -> button_incomeActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button_rooms, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addComponent(button_passengers, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button_employees, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_income, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                    .addGap(98, 98, 98))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label_image, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button_passengers, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_employees, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button_income, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_rooms, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19))
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
    private JLabel label_image;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
