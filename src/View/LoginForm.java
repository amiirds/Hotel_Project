/*
 * Created by JFormDesigner on Tue Dec 01 21:49:57 IRST 2020
 */

package View;

import Model.Repository.user_repo;

import javax.swing.*;
import java.awt.*;

/**
 * @author unknown
 */

public class LoginForm extends JFrame {

    public int index;

    public LoginForm() {
        user_repo user_repository;
        initComponents();
        try {
            user_repository = new user_repo();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void button_submitActionPerformed() {

        if (textField_username.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Username can't be empty","ERROR",2);

        }
        else if (passwordField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"password can't be empty","ERROR",2);
        }
        else {

            boolean exist = false;
            for (int i = 0; i < user_repo.usernames.size(); i++) {
                if (user_repo.usernames.get(i).equals(textField_username.getText()) && user_repo.passes.get(i).equals(passwordField1.getText())) {
                    exist = true;
                    break;
                }
            }
            if (exist == true) {
                MenuForm menuForm = new MenuForm();
                menuForm.setVisible(true);
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(null,"username or password doesn't exist or wrong","ERROR",2);

            }
        }
        }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField_username = new JTextField();
        passwordField1 = new JPasswordField();
        button_submit = new JButton();

        //======== this ========
        setBackground(new Color(204, 51, 0));
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Login User");
        label1.setBackground(Color.red);
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 3f));

        //---- label2 ----
        label2.setText("USERNAME =");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 3f));
        label2.setBackground(Color.black);
        label2.setForeground(Color.black);

        //---- label3 ----
        label3.setText("PASSWORD =");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 3f));
        label3.setForeground(Color.black);

        //---- textField_username ----
        textField_username.setForeground(Color.black);
        textField_username.setFont(textField_username.getFont().deriveFont(textField_username.getFont().getSize() + 3f));

        //---- passwordField1 ----
        passwordField1.setForeground(Color.black);
        passwordField1.setFont(passwordField1.getFont().deriveFont(passwordField1.getFont().getSize() + 3f));

        //---- button_submit ----
        button_submit.setText("submit");
        button_submit.setBackground(Color.darkGray);
        button_submit.addActionListener(e -> button_submitActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label2)
                        .addComponent(label3))
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(textField_username, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordField1))
                    .addContainerGap(16, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(button_submit, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addComponent(button_submit, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField_username;
    private JPasswordField passwordField1;
    private JButton button_submit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
