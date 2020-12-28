/*
 * Created by JFormDesigner on Tue Dec 22 19:24:22 IRST 2020
 */

package View;



import Model.Repository.Reserve_Rooms_Repository;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

/**
 * @author unknown
 */
public class Hotel_customer_workingday_form extends JFrame {
    public Hotel_customer_workingday_form() {
        initComponents();
    }

    List<String> list = new ArrayList();
    String[] names;
    DefaultTableModel defaultTableModel;
    DefaultListModel listModel;
    private void button_showActionPerformed() {
        listModel = new DefaultListModel();

        try {
            Reserve_Rooms_Repository reserve_rooms_repository = new Reserve_Rooms_Repository();
            list = reserve_rooms_repository.list(textField_date.getText());
            if (list.size() == 0)
            {
                ImageIcon img = new ImageIcon("src/Error.png");
                listModel.addElement(JOptionPane.showConfirmDialog(null,"There Nothing to show\nSearch another Date","Warning",JOptionPane.DEFAULT_OPTION,2,img));
            }
            names = new String[list.size()];
            for (int i=0;i<list.size();i++) {
                names[i] = list.get(i);
                listModel.addElement("name = " + list.get(i) + "\t\t------>Submitted in  = " +textField_date.getText());
            }
            list_names.setModel(listModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"There is no date to match \n Try Again");
            e.printStackTrace();
        }
    }

    private void button_exitActionPerformed() {
        try {
            ImageIcon img = new ImageIcon("src/ds.png");
            JOptionPane.showMessageDialog(null,"After you click Ok window will be closed in 2 second","Announcement",2,img);
            Thread.sleep(1500);
            setVisible(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label2 = new JLabel();
        panel2 = new JPanel();
        label1 = new JLabel();
        textField_date = new JTextField();
        scrollPane1 = new JScrollPane();
        list_names = new JList();
        button_show = new JButton();
        button_exit = new JButton();

        //======== this ========
        setTitle("Welcome");
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(72, 38, 72, 211));
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //---- label2 ----
            label2.setText("Hotel Customers Registration Information");
            label2.setForeground(Color.white);
            label2.setFont(new Font("Noteworthy", Font.PLAIN, 20));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(label2)
                        .addContainerGap(127, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 153, 153));

            //---- label1 ----
            label1.setText("Enter your Date (like --> 2020/1/1)  = ");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 3f));
            label1.setForeground(Color.white);

            //---- textField_date ----
            textField_date.setFont(textField_date.getFont().deriveFont(textField_date.getFont().getSize() + 3f));

            //======== scrollPane1 ========
            {

                //---- list_names ----
                list_names.setBackground(new Color(255, 153, 153));
                list_names.setForeground(Color.white);
                list_names.setFont(list_names.getFont().deriveFont(list_names.getFont().getStyle() | Font.BOLD, list_names.getFont().getSize() + 5f));
                scrollPane1.setViewportView(list_names);
            }

            //---- button_show ----
            button_show.setText("Show");
            button_show.addActionListener(e -> button_showActionPerformed());

            //---- button_exit ----
            button_exit.setText("Exit");
            button_exit.addActionListener(e -> button_exitActionPerformed());

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(button_show, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(button_exit, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(40, 40, 40)
                                        .addComponent(textField_date, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(68, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button_show)
                            .addComponent(button_exit))
                        .addContainerGap(40, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private JLabel label2;
    private JPanel panel2;
    private JLabel label1;
    private JTextField textField_date;
    private JScrollPane scrollPane1;
    private JList list_names;
    private JButton button_show;
    private JButton button_exit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
