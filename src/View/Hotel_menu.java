/*
 * Created by JFormDesigner on Sat Dec 19 21:12:04 IRST 2020
 */

package View;

import Model.Hotel_income;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class Hotel_menu extends JFrame {
    public Hotel_menu() {
        initComponents();
    }

    private void button_hotel_working_dayActionPerformed() {
        JOptionPane.showMessageDialog(null," * Hotel open 24/7 :) * ","Announcement",1);
    }

    private void button_hotel_incomeActionPerformed() {
        Hotel_income_form hotel_income_form = new Hotel_income_form();
        hotel_income_form.setVisible(true);
    }

    private void button_payment_per_customerActionPerformed() throws Exception {
        Payment_per_customers payment_per_customers = new Payment_per_customers();
        payment_per_customers.setVisible(true);
    }

    private void button_customer_paymentActionPerformed() {
        Customers_payment customers_payment = new Customers_payment();
        customers_payment.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button_customer_payment = new JButton();
        button_payment_per_customer = new JButton();
        button_hotel_working_day = new JButton();
        button_hotel_income = new JButton();
        button1 = new JButton();

        //======== this ========
        setTitle("Hotel Income Option Menu");
        var contentPane = getContentPane();

        //---- button_customer_payment ----
        button_customer_payment.setText("       Show  Customer payment");
        button_customer_payment.setFont(button_customer_payment.getFont().deriveFont(button_customer_payment.getFont().getStyle() & ~Font.BOLD, button_customer_payment.getFont().getSize() + 3f));
        button_customer_payment.addActionListener(e -> button_customer_paymentActionPerformed());

        //---- button_payment_per_customer ----
        button_payment_per_customer.setText("    Payments per customer");
        button_payment_per_customer.setFont(button_payment_per_customer.getFont().deriveFont(button_payment_per_customer.getFont().getStyle() & ~Font.BOLD, button_payment_per_customer.getFont().getSize() + 3f));
        button_payment_per_customer.addActionListener(e -> {
            try {
                button_payment_per_customerActionPerformed();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        //---- button_hotel_working_day ----
        button_hotel_working_day.setText("    Hotel working day");
        button_hotel_working_day.setFont(button_hotel_working_day.getFont().deriveFont(button_hotel_working_day.getFont().getStyle() & ~Font.BOLD, button_hotel_working_day.getFont().getSize() + 3f));
        button_hotel_working_day.addActionListener(e -> button_hotel_working_dayActionPerformed());

        //---- button_hotel_income ----
        button_hotel_income.setText("    Hotel Income ");
        button_hotel_income.setFont(button_hotel_income.getFont().deriveFont(button_hotel_income.getFont().getStyle() & ~Font.BOLD, button_hotel_income.getFont().getSize() + 3f));
        button_hotel_income.addActionListener(e -> button_hotel_incomeActionPerformed());

        //---- button1 ----
        button1.setText("     Hotel customers on hotel working days");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() & ~Font.BOLD, button1.getFont().getSize() + 3f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button_customer_payment, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_payment_per_customer, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_hotel_working_day, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(button_hotel_income, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button_customer_payment, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button_payment_per_customer, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button_hotel_working_day, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button_hotel_income, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button_customer_payment;
    private JButton button_payment_per_customer;
    private JButton button_hotel_working_day;
    private JButton button_hotel_income;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
