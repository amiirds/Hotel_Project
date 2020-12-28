/*
 * Created by JFormDesigner on Tue Dec 01 22:11:28 IRST 2020
 */

package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class MenuForm extends JFrame {
    private ImageIcon image;
    private ImageIcon image2;
    private ImageIcon image3;
    private ImageIcon image4;
    public MenuForm() {
        initComponents();
        image = new ImageIcon("src/hotel.png");
        label_image.setIcon(image);
        image2 = new ImageIcon("src/emplo.png");
        label_image2.setIcon(image2);
        image3 = new ImageIcon("src/budget.png");
        label_image3.setIcon(image3);
        image4 = new ImageIcon("src/bed.png");
        label_image4.setIcon(image4);
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
        panel2 = new JPanel();
        button_rooms = new JButton();
        button_passengers = new JButton();
        button_employees = new JButton();
        button_income = new JButton();
        panel1 = new JPanel();
        label_image = new JLabel();
        label_image2 = new JLabel();
        label_image3 = new JLabel();
        label_image4 = new JLabel();

        //======== this ========
        setTitle("    Menu");
        setBackground(new Color(0, 153, 153));
        var contentPane = getContentPane();

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 153, 153));
            panel2.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax
            . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing
            .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .
            Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .red
            ) ,panel2. getBorder () ) ); panel2. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override
            public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName (
            ) ) )throw new RuntimeException( ) ;} } );

            //---- button_rooms ----
            button_rooms.setText("Rooms");
            button_rooms.setFont(new Font("Noteworthy", Font.BOLD, 12));
            button_rooms.addActionListener(e -> button_roomsActionPerformed());

            //---- button_passengers ----
            button_passengers.setText("Passsengers ");
            button_passengers.setFont(new Font("Noteworthy", Font.BOLD, 12));
            button_passengers.addActionListener(e -> {
			button_passengersActionPerformed();
		});

            //---- button_employees ----
            button_employees.setText("Employees");
            button_employees.setFont(new Font("Noteworthy", Font.BOLD, 12));
            button_employees.addActionListener(e -> button_employeesActionPerformed());

            //---- button_income ----
            button_income.setText("Hotel Income");
            button_income.setFont(new Font("Noteworthy", Font.BOLD, 12));
            button_income.addActionListener(e -> button_incomeActionPerformed());

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(button_rooms, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_employees, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_passengers, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_income, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(42, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(button_passengers, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_employees, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_income, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_rooms, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
            );
        }

        //======== panel1 ========
        {
            panel1.setBackground(new Color(72, 38, 72, 211));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label_image3, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_image4, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_image2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(label_image2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(label_image3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(label_image4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
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
    private JPanel panel2;
    private JButton button_rooms;
    private JButton button_passengers;
    private JButton button_employees;
    private JButton button_income;
    private JPanel panel1;
    private JLabel label_image;
    private JLabel label_image2;
    private JLabel label_image3;
    private JLabel label_image4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
