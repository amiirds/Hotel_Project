/*
 * Created by JFormDesigner on Mon Dec 21 01:06:05 IRST 2020
 */

package View;

import Model.Repository.Passengers_Repo;

import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.plaf.*;

/**
 *
 * @author unknown
 */
public class Customers_payment extends JFrame {
    public Customers_payment() {
        initComponents();
    }

    private void button_show_paymentActionPerformed() {
        Passengers_Repo passengers_repo = null;
        try {
            passengers_repo = new Passengers_Repo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            label_show.setText("\t" + passengers_repo.first_payment() + " Tooman");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        ImageIcon img = new ImageIcon("src/ds.png");
        JOptionPane.showMessageDialog(null,"Here you are , your all First payment of Clients\nThanks","Notification",1,img);
    }

    private void button_exitActionPerformed() {
        try {
            ImageIcon img = new ImageIcon("src/ds.png");
            JOptionPane.showMessageDialog(null,"After you click Ok window will be closed in 2 second","Announcement",2,img);
            Thread.sleep(1000);
            setVisible(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label1 = new JLabel();
        panel2 = new JPanel();
        button_show_payment = new JButton();
        button_exit = new JButton();
        label_show = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setBackground(new Color(51, 51, 51));
        setTitle("Welcome");
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(72, 38, 72, 211));
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );

            //---- label1 ----
            label1.setText("Show Customer Total Payment");
            label1.setFont(new Font("Noteworthy", Font.BOLD, 16));
            label1.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(label1)
                        .addContainerGap(139, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 153, 153));

            //---- button_show_payment ----
            button_show_payment.setText("Show Payment");
            button_show_payment.addActionListener(e -> button_show_paymentActionPerformed());

            //---- button_exit ----
            button_exit.setText("Exit");
            button_exit.addActionListener(e -> button_exitActionPerformed());

            //---- label_show ----
            label_show.setBackground(Color.white);
            label_show.setFont(label_show.getFont().deriveFont(label_show.getFont().getSize() + 8f));
            label_show.setText("   ");
            label_show.setForeground(Color.white);

            //---- label2 ----
            label2.setText("Total Payment =");
            label2.setFont(new Font("Noteworthy", Font.PLAIN, 18));
            label2.setForeground(Color.black);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(button_show_payment))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(button_exit))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label2)
                                .addGap(57, 57, 57)
                                .addComponent(label_show, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(49, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_show, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(button_show_payment)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_exit)
                        .addGap(31, 31, 31))
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
    private JLabel label1;
    private JPanel panel2;
    private JButton button_show_payment;
    private JButton button_exit;
    private JLabel label_show;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
