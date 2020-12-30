/*
 * Created by JFormDesigner on Sun Dec 20 22:14:46 IRST 2020
 */

package View;


import javax.swing.border.*;
import Model.Entity.Passengers_Entity;
import Model.Repository.Passengers_Repo;
import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;


/**
 * @author unknown
 */
public class Payment_per_customers extends JFrame {
    public Payment_per_customers() throws Exception {
        initComponents();
        ImageIcon imageIcon = new ImageIcon("src/invoice.png");
        label_image.setIcon(imageIcon);
    }

    private void button1ActionPerformed() {
        try {
            ImageIcon img = new ImageIcon("src/ds.png");
            JOptionPane.showMessageDialog(null,"After you click Ok window will be closed in 2 second","Announcement",2,img);
            Thread.sleep(1000);
            setVisible(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    Passengers_Repo passengers_repo = new Passengers_Repo();
    List <Passengers_Entity> list = passengers_repo.list();

    private void initComponents() {
        String[] ids = new String[list.size()];
        int i = 0;
        for (Passengers_Entity passengers_entity : list) {
            ids[i] = passengers_entity.toString();
            i++;
        }
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label1 = new JLabel();
        label_image = new JLabel();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        list1 = new JList(ids);
        button1 = new JButton();

        //======== this ========
        setTitle("Welcome");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(72, 38, 72, 211));
            panel1.setBorder(null);
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );

            //---- label1 ----
            label1.setText("Payment for Each Client");
            label1.setFont(new Font("Noteworthy", Font.BOLD, 20));
            label1.setForeground(Color.white);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_image, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 153, 153));

            //======== scrollPane1 ========
            {

                //---- list1 ----
                list1.setFont(list1.getFont().deriveFont(list1.getFont().getStyle() | Font.BOLD, list1.getFont().getSize() + 3f));
                list1.setBackground(new Color(255, 153, 153));
                list1.setForeground(Color.white);
                list1.setBorder(new TitledBorder("List of payment"));
                scrollPane1.setViewportView(list1);
            }

            //---- button1 ----
            button1.setText("Exit");
            button1.addActionListener(e -> button1ActionPerformed());

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                .addGap(215, 215, 215))))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1)
                        .addContainerGap(20, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label1;
    private JLabel label_image;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JList list1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
