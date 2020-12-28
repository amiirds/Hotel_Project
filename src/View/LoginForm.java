/*
 * Created by JFormDesigner on Tue Dec 01 21:49:57 IRST 2020
 */

package View;

import javax.swing.plaf.*;
import Model.Repository.user_repo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author unknown
 */

public class LoginForm extends JFrame {
    private ImageIcon image;
    private ImageIcon image2;
    private ImageIcon image3;
    private ImageIcon image4;
    public int index;

    public LoginForm() {
        user_repo user_repository;
        initComponents();
        Showtime();
        try {
            user_repository = new user_repo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        image = new ImageIcon("src/ds.png");
        label_image.setIcon(image);
        image2 = new ImageIcon("src/person.png");
        label_person.setIcon(image2);
        image3 = new ImageIcon("src/pass.png");
        label_pass.setIcon(image3);
        image4 = new ImageIcon("src/login.png");
        label_login.setIcon(image4);

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
                setVisible(false);
            }
            if (exist == false) {
                JOptionPane.showMessageDialog(null,"username or password doesn't exist or wrong","ERROR",2);
            }
        }
        }

        private void button_cancelActionPerformed() {
            dispose();
        }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label_time = new JLabel();
        label_login = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        button_submit = new JButton();
        passwordField1 = new JPasswordField();
        textField_username = new JTextField();
        button1 = new JButton();
        label_image = new JLabel();
        label_person = new JLabel();
        label_pass = new JLabel();

        //======== this ========
        setBackground(new Color(0, 102, 102));
        setTitle("Login");
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(72, 38, 72, 211));
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
            javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax
            . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
            . awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
            . Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .
            PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .
            equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

            //---- label_time ----
            label_time.setFont(label_time.getFont().deriveFont(label_time.getFont().getStyle() | Font.BOLD, label_time.getFont().getSize() + 3f));
            label_time.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label_time, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 135, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(label_login, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label_time, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(label_login, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(58, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 153, 153));

            //---- label2 ----
            label2.setText("USERNAME (Name) =");
            label2.setFont(new Font("Noteworthy", Font.ITALIC, 16));
            label2.setBackground(Color.black);
            label2.setForeground(Color.black);

            //---- label3 ----
            label3.setText("PASSWORD (Meli code) =");
            label3.setFont(new Font("Noteworthy", Font.PLAIN, 16));
            label3.setForeground(Color.black);

            //---- button_submit ----
            button_submit.setText("submit");
            button_submit.setBackground(Color.red);
            button_submit.addActionListener(e -> button_submitActionPerformed());

            //---- passwordField1 ----
            passwordField1.setForeground(Color.black);
            passwordField1.setFont(passwordField1.getFont().deriveFont(passwordField1.getFont().getSize() + 3f));

            //---- textField_username ----
            textField_username.setForeground(Color.black);
            textField_username.setFont(textField_username.getFont().deriveFont(textField_username.getFont().getSize() + 3f));

            //---- button1 ----
            button1.setText("Cancel");
            button1.addActionListener(e -> button_cancelActionPerformed());

            //---- label_image ----
            label_image.setBackground(Color.red);
            label_image.setFont(label_image.getFont().deriveFont(label_image.getFont().getStyle() | Font.BOLD, label_image.getFont().getSize() + 3f));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(button_submit, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label_pass, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label3))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label_person, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label2)))
                                .addGap(27, 27, 27)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(textField_username, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 31, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label2)
                                    .addComponent(textField_username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(label_person, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_pass, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button_submit, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label_time;
    private JLabel label_login;
    private JPanel panel2;
    private JLabel label2;
    private JLabel label3;
    private JButton button_submit;
    private JPasswordField passwordField1;
    private JTextField textField_username;
    private JButton button1;
    private JLabel label_image;
    private JLabel label_person;
    private JLabel label_pass;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
