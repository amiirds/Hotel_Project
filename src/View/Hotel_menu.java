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

    private void button_payment_per_customerActionPerformed() {
        Payment_per_customers payment_per_customers = null;
        try {
            payment_per_customers = new Payment_per_customers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        payment_per_customers.setVisible(true);
    }

    private void button_customer_paymentActionPerformed() {
        Customers_payment customers_payment = new Customers_payment();
        customers_payment.setVisible(true);
    }

    private void button_hote_customerActionPerformed() {
        Hotel_customer_workingday_form hotelCustomerWorkingdayForm = new Hotel_customer_workingday_form();
        hotelCustomerWorkingdayForm.setVisible(true);
    }
    public void close() {
        if (button_return.isSelected()) {
            Hotel_menu hotel_menu = new Hotel_menu();
            hotel_menu.dispose();
        }
    }
    private void button_returnActionPerformed() {
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        button_hotel_customer = new JButton();
        button_customer_payment = new JButton();
        button_payment_per_customer = new JButton();
        button_hotel_working_day = new JButton();
        button_hotel_income = new JButton();
        button_return = new JButton();

        //======== this ========
        setTitle("Hotel Income Option Menu");
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(153, 153, 255));
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );

            //---- button_hotel_customer ----
            button_hotel_customer.setText("     Hotel customers on hotel working days");
            button_hotel_customer.setFont(new Font("Noteworthy", Font.PLAIN, 15));
            button_hotel_customer.addActionListener(e -> button_hote_customerActionPerformed());

            //---- button_customer_payment ----
            button_customer_payment.setText("       Show  Customer payment");
            button_customer_payment.setFont(new Font("Noteworthy", Font.PLAIN, 15));
            button_customer_payment.addActionListener(e -> button_customer_paymentActionPerformed());

            //---- button_payment_per_customer ----
            button_payment_per_customer.setText("    Payments per customer");
            button_payment_per_customer.setFont(new Font("Noteworthy", Font.PLAIN, 15));
            button_payment_per_customer.addActionListener(e -> button_payment_per_customerActionPerformed());

            //---- button_hotel_working_day ----
            button_hotel_working_day.setText("    Hotel working day");
            button_hotel_working_day.setFont(new Font("Noteworthy", Font.PLAIN, 15));
            button_hotel_working_day.addActionListener(e -> button_hotel_working_dayActionPerformed());

            //---- button_hotel_income ----
            button_hotel_income.setText("    Hotel Income ");
            button_hotel_income.setFont(new Font("Noteworthy", Font.PLAIN, 15));
            button_hotel_income.addActionListener(e -> button_hotel_incomeActionPerformed());

            //---- button_return ----
            button_return.setText("Return");
            button_return.setFont(new Font("Noteworthy", Font.PLAIN, 15));
            button_return.addActionListener(e -> button_returnActionPerformed());

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button_hotel_customer, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_customer_payment, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_payment_per_customer, GroupLayout.PREFERRED_SIZE, 551, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_hotel_working_day, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_hotel_income, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_return, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(button_hotel_customer, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button_customer_payment, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(button_payment_per_customer, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(button_hotel_working_day, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(button_hotel_income, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button_return, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JButton button_hotel_customer;
    private JButton button_customer_payment;
    private JButton button_payment_per_customer;
    private JButton button_hotel_working_day;
    private JButton button_hotel_income;
    private JButton button_return;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
