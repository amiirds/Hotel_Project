/*
 * Created by JFormDesigner on Mon Nov 30 20:31:38 IRST 2020
 */

package View;

import javax.swing.plaf.*;

import Model.Entity.Rooms_Entity;
import Model.Repository.Rooms_Repository;
import Model.Service.Rooms_Service;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * @author unknown
 */
public class RoomsForm extends JFrame {
    private ImageIcon image;
    public RoomsForm() throws Exception {

        Rooms_Repository rooms_repository;
        initComponents();

        rooms_repository = new Rooms_Repository();
        image = new ImageIcon("src/living-room-2.png");
        label_image.setIcon(image);
    }
    private void buttonsubmitActionPerformed() {
        try {
            Rooms_Entity rooms_entity = new Rooms_Entity();
            rooms_entity.setRoom_number(comboBoxroomnumber.getSelectedIndex()+1);
            if (checkBox_vip.isSelected()) {
                rooms_entity.setType_of_room(checkBox_vip.getText());
            }
            if (checkBox_Ordinary.isSelected()) {
                rooms_entity.setType_of_room(checkBox_Ordinary.getText());
            }
            rooms_entity.setNumber_of_Vip_rooms(comboBox_numbervip.getSelectedIndex()+1);
            rooms_entity.setNumber_of_Ordinary_rooms(comboBox_numberordinary.getSelectedIndex()+1);
            
            if (checkBox_singlebed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_singlebed.getText());
            if (checkBox_doublebed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_doublebed.getText());
            if (checkBox_QueenSizeBed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_QueenSizeBed.getText());
            if (checkBox_KingSizeBed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_KingSizeBed.getText());
            if (checkBox_TV.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_TV.getText());
            if (checkBox_Bathtub.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_Bathtub.getText());
            if (checkBox_DuplexRoom.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_DuplexRoom.getText());
            if (checkBox_ps5.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_ps5.getText());
            if (checkBox_no.isSelected())
                rooms_entity.setStatus(checkBox_no.getText());
            if (checkBox_yes.isSelected())
                rooms_entity.setStatus(checkBox_yes.getText());
            Rooms_Service rooms_service = new Rooms_Service();
                rooms_service.insert(rooms_entity);

                JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to saved \n 1-You may selected repeated room No \n 2-Or the status of reserved is empty\nTry Again" ,"Error",2);
        }
    }

    private void button_editActionPerformed() {
        try {

            Rooms_Entity rooms_entity = new Rooms_Entity();
            rooms_entity.setRoom_number(comboBoxroomnumber.getSelectedIndex()+1);
            if (checkBox_vip.isSelected()) {
                rooms_entity.setType_of_room(checkBox_vip.getText());
            }
            if (checkBox_Ordinary.isSelected()) {
                rooms_entity.setType_of_room(checkBox_Ordinary.getText());
            }
            rooms_entity.setNumber_of_Vip_rooms(comboBox_numbervip.getSelectedIndex()+1);
            rooms_entity.setNumber_of_Ordinary_rooms(comboBox_numberordinary.getSelectedIndex()+1);
            if (checkBox_singlebed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_singlebed.getText());
            if (checkBox_doublebed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_doublebed.getText());
            if (checkBox_QueenSizeBed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_QueenSizeBed.getText());
            if (checkBox_KingSizeBed.isSelected())
                rooms_entity.setNormal_Room_Facilities(checkBox_KingSizeBed.getText());
            if (checkBox_TV.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_TV.getText());
            if (checkBox_Bathtub.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_Bathtub.getText());
            if (checkBox_DuplexRoom.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_DuplexRoom.getText());
            if (checkBox_ps5.isSelected())
                rooms_entity.setSpecial_Room_Facilities(checkBox_ps5.getText());
            if (checkBox_no.isSelected())
                rooms_entity.setStatus(checkBox_no.getText());
            if (checkBox_yes.isSelected())
                rooms_entity.setStatus(checkBox_yes.getText());
            Rooms_Service rooms_service = new Rooms_Service();
            rooms_service.update(rooms_entity);
            JOptionPane.showMessageDialog(null, "Successfully edit", "Success", 1);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to edit \n you may selected repeated room No\n Try Again" ,"Error",2);
        }
    }


    private void button_deleteActionPerformed() {
        Rooms_Entity rooms_entity = new Rooms_Entity();
        rooms_entity.setRoom_number(comboBoxroomnumber.getSelectedIndex()+1);
        Rooms_Service rooms_service = null;
        try {
            rooms_service = new Rooms_Service();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            rooms_service.delete(rooms_entity);
            JOptionPane.showMessageDialog(null, "Successfully Delete ", "Success", 1);

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to Delete ", "Error", 2);
        }
    }

    private void checkBox_vipActionPerformed() {
        if (checkBox_vip.isSelected())
            checkBox_Ordinary.setSelected(false);
    }

    private void checkBox_OrdinaryActionPerformed() {
        if (checkBox_Ordinary.isSelected())
            checkBox_vip.setSelected(false);
    }

    private void checkBox_singlebedActionPerformed() {
        if (checkBox_singlebed.isSelected()) {
            checkBox_doublebed.setSelected(false);
            checkBox_QueenSizeBed.setSelected(false);
            checkBox_KingSizeBed.setSelected(false);
        }
    }

    private void checkBox_doublebedActionPerformed() {
        if (checkBox_doublebed.isSelected()) {
            checkBox_singlebed.setSelected(false);
            checkBox_QueenSizeBed.setSelected(false);
            checkBox_KingSizeBed.setSelected(false);
        }
    }

    private void checkBox_QueenSizeBedActionPerformed() {
        if (checkBox_QueenSizeBed.isSelected()) {
            checkBox_doublebed.setSelected(false);
            checkBox_singlebed.setSelected(false);
            checkBox_KingSizeBed.setSelected(false);
        }
    }

    private void checkBox_KingSizeBedActionPerformed() {
        if (checkBox_KingSizeBed.isSelected()) {
            checkBox_doublebed.setSelected(false);
            checkBox_QueenSizeBed.setSelected(false);
            checkBox_singlebed.setSelected(false);
        }
    }

    private void checkBox_TVActionPerformed() {
        if (checkBox_TV.isSelected()){
            checkBox_Bathtub.setSelected(false);
            checkBox_DuplexRoom.setSelected(false);
            checkBox_ps5.setSelected(false);
        }
    }

    private void checkBox_BathtubActionPerformed() {
        if (checkBox_Bathtub.isSelected()){
            checkBox_TV.setSelected(false);
            checkBox_DuplexRoom.setSelected(false);
            checkBox_ps5.setSelected(false);
        }
    }

    private void checkBox_DuplexRoomActionPerformed() {
        if (checkBox_DuplexRoom.isSelected()){
            checkBox_Bathtub.setSelected(false);
            checkBox_TV.setSelected(false);
            checkBox_ps5.setSelected(false);
        }
    }

    private void checkBox_ps5ActionPerformed() {
        if (checkBox_ps5.isSelected()){
            checkBox_Bathtub.setSelected(false);
            checkBox_DuplexRoom.setSelected(false);
            checkBox_TV.setSelected(false);
        }
    }

    private void checkBox_yesActionPerformed() { 
        if (checkBox_yes.isSelected())
            checkBox_no.setSelected(false);
    }

    private void checkBox_noActionPerformed() {
        if (checkBox_no.isSelected())
            checkBox_yes.setSelected(false);
    }
    
    Integer[] room_number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301};
    private void initComponents() {
            // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
            // Generated using JFormDesigner Evaluation license - unknown
            panel2 = new JPanel();
            label1 = new JLabel();
            label_image = new JLabel();
            panel1 = new JPanel();
            labelnumber = new JLabel();
            comboBoxroomnumber = new JComboBox(room_number);
            label10 = new JLabel();
            checkBox_vip = new JCheckBox();
            checkBox_Ordinary = new JCheckBox();
            label4 = new JLabel();
            comboBox_numbervip = new JComboBox(room_number);
            label5 = new JLabel();
            comboBox_numberordinary = new JComboBox(room_number);
            label6 = new JLabel();
            checkBox_singlebed = new JCheckBox();
            checkBox_doublebed = new JCheckBox();
            checkBox_QueenSizeBed = new JCheckBox();
            checkBox_KingSizeBed = new JCheckBox();
            label9 = new JLabel();
            checkBox_TV = new JCheckBox();
            checkBox_Bathtub = new JCheckBox();
            checkBox_DuplexRoom = new JCheckBox();
            checkBox_ps5 = new JCheckBox();
            label2 = new JLabel();
            checkBox_yes = new JCheckBox();
            checkBox_no = new JCheckBox();
            buttonsubmit = new JButton();
            button_edit = new JButton();
            button_delete = new JButton();

            //======== this ========
            setBackground(new Color(0, 204, 153));
            setTitle("Rooms");
            setForeground(Color.black);
            var contentPane = getContentPane();
            contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[753]",
                // rows
                "[]" +
                "[]" +
                "[500]"));

            //======== panel2 ========
            {
                panel2.setBackground(new Color(72, 38, 72, 211));
                panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
                . border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder
                . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .
                awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel2. getBorder( )) )
                ; panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
                ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
                ;
                panel2.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("Rooms Mangment");
                label1.setFont(new Font("Noteworthy", Font.BOLD, 19));
                label1.setForeground(Color.white);
                panel2.add(label1, "cell 0 0 1 3");
                panel2.add(label_image, "cell 22 1 1 2");
            }
            contentPane.add(panel2, "cell 0 0,growx");

            //======== panel1 ========
            {
                panel1.setBackground(new Color(255, 153, 153));
                panel1.setBorder(LineBorder.createBlackLineBorder());
                panel1.setLayout(new MigLayout(
                    "hidemode 3,align left top",
                    // columns
                    "[230,fill]" +
                    "[204,fill]" +
                    "[fill]" +
                    "[139,fill]" +
                    "[230,fill]",
                    // rows
                    "[45]" +
                    "[35]" +
                    "[36]" +
                    "[35]" +
                    "[34]" +
                    "[48]" +
                    "[38]" +
                    "[48]" +
                    "[48]" +
                    "[]" +
                    "[31]"));

                //---- labelnumber ----
                labelnumber.setText("Room Number =");
                labelnumber.setFont(new Font("Noteworthy", Font.PLAIN, 21));
                labelnumber.setForeground(Color.white);
                panel1.add(labelnumber, "cell 0 0");
                panel1.add(comboBoxroomnumber, "cell 1 0");

                //---- label10 ----
                label10.setText("Type Of Room = ");
                label10.setFont(new Font("Noteworthy", Font.PLAIN, 21));
                label10.setForeground(Color.white);
                panel1.add(label10, "cell 0 1");

                //---- checkBox_vip ----
                checkBox_vip.setText("VIP");
                checkBox_vip.addActionListener(e -> checkBox_vipActionPerformed());
                panel1.add(checkBox_vip, "cell 1 1");

                //---- checkBox_Ordinary ----
                checkBox_Ordinary.setText("Ordinary");
                checkBox_Ordinary.addActionListener(e -> checkBox_OrdinaryActionPerformed());
                panel1.add(checkBox_Ordinary, "cell 1 1");

                //---- label4 ----
                label4.setText("Number Of Vip Rooms = ");
                label4.setFont(new Font("Noteworthy", Font.PLAIN, 21));
                label4.setForeground(Color.white);
                panel1.add(label4, "cell 0 2,aligny center,growy 0");
                panel1.add(comboBox_numbervip, "cell 1 2");

                //---- label5 ----
                label5.setText("Number Of Ordinary Rooms =");
                label5.setForeground(Color.white);
                label5.setFont(new Font("Noteworthy", Font.PLAIN, 21));
                panel1.add(label5, "cell 0 3");
                panel1.add(comboBox_numberordinary, "cell 1 3");

                //---- label6 ----
                label6.setText("Normal Room Facilities = ");
                label6.setFont(new Font("Noteworthy", Font.PLAIN, 21));
                label6.setForeground(Color.white);
                panel1.add(label6, "cell 0 4");

                //---- checkBox_singlebed ----
                checkBox_singlebed.setText("Single Bed");
                checkBox_singlebed.addActionListener(e -> checkBox_singlebedActionPerformed());
                panel1.add(checkBox_singlebed, "cell 1 4");

                //---- checkBox_doublebed ----
                checkBox_doublebed.setText("Double Bed");
                checkBox_doublebed.addActionListener(e -> checkBox_doublebedActionPerformed());
                panel1.add(checkBox_doublebed, "cell 1 4");

                //---- checkBox_QueenSizeBed ----
                checkBox_QueenSizeBed.setText("Queen Size Bed");
                checkBox_QueenSizeBed.addActionListener(e -> checkBox_QueenSizeBedActionPerformed());
                panel1.add(checkBox_QueenSizeBed, "cell 2 4");

                //---- checkBox_KingSizeBed ----
                checkBox_KingSizeBed.setText("King Size Bed");
                checkBox_KingSizeBed.addActionListener(e -> checkBox_KingSizeBedActionPerformed());
                panel1.add(checkBox_KingSizeBed, "cell 3 4");

                //---- label9 ----
                label9.setText("Special Room Facilities = ");
                label9.setFont(new Font("Noteworthy", Font.PLAIN, 21));
                label9.setForeground(Color.white);
                panel1.add(label9, "cell 0 5");

                //---- checkBox_TV ----
                checkBox_TV.setText("TV");
                checkBox_TV.addActionListener(e -> checkBox_TVActionPerformed());
                panel1.add(checkBox_TV, "cell 1 5");

                //---- checkBox_Bathtub ----
                checkBox_Bathtub.setText(" Bathtub");
                checkBox_Bathtub.addActionListener(e -> checkBox_BathtubActionPerformed());
                panel1.add(checkBox_Bathtub, "cell 1 5");

                //---- checkBox_DuplexRoom ----
                checkBox_DuplexRoom.setText("Duplex Room");
                checkBox_DuplexRoom.addActionListener(e -> checkBox_DuplexRoomActionPerformed());
                panel1.add(checkBox_DuplexRoom, "cell 2 5");

                //---- checkBox_ps5 ----
                checkBox_ps5.setText("PS5");
                checkBox_ps5.addActionListener(e -> checkBox_ps5ActionPerformed());
                panel1.add(checkBox_ps5, "cell 3 5");

                //---- label2 ----
                label2.setText("Reservation =");
                label2.setForeground(Color.white);
                label2.setFont(new Font("Noteworthy", Font.PLAIN, 21));
                panel1.add(label2, "cell 0 6");

                //---- checkBox_yes ----
                checkBox_yes.setText("Yes");
                checkBox_yes.addActionListener(e -> checkBox_yesActionPerformed());
                panel1.add(checkBox_yes, "cell 1 6");

                //---- checkBox_no ----
                checkBox_no.setText("No");
                checkBox_no.addActionListener(e -> checkBox_noActionPerformed());
                panel1.add(checkBox_no, "cell 1 6");

                //---- buttonsubmit ----
                buttonsubmit.setText("Submit");
                buttonsubmit.addActionListener(e -> buttonsubmitActionPerformed());
                panel1.add(buttonsubmit, "cell 0 7");

                //---- button_edit ----
                button_edit.setText("Edit");
                button_edit.addActionListener(e -> button_editActionPerformed());
                panel1.add(button_edit, "cell 1 7");

                //---- button_delete ----
                button_delete.setText("Delete");
                button_delete.addActionListener(e -> button_deleteActionPerformed());
                panel1.add(button_delete, "cell 2 7");
            }
            contentPane.add(panel1, "cell 0 1 1 2");
            pack();
            setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel2;
    private JLabel label1;
    private JLabel label_image;
    private JPanel panel1;
    private JLabel labelnumber;
    private JComboBox comboBoxroomnumber;
    private JLabel label10;
    private JCheckBox checkBox_vip;
    private JCheckBox checkBox_Ordinary;
    private JLabel label4;
    private JComboBox comboBox_numbervip;
    private JLabel label5;
    private JComboBox comboBox_numberordinary;
    private JLabel label6;
    private JCheckBox checkBox_singlebed;
    private JCheckBox checkBox_doublebed;
    private JCheckBox checkBox_QueenSizeBed;
    private JCheckBox checkBox_KingSizeBed;
    private JLabel label9;
    private JCheckBox checkBox_TV;
    private JCheckBox checkBox_Bathtub;
    private JCheckBox checkBox_DuplexRoom;
    private JCheckBox checkBox_ps5;
    private JLabel label2;
    private JCheckBox checkBox_yes;
    private JCheckBox checkBox_no;
    private JButton buttonsubmit;
    private JButton button_edit;
    private JButton button_delete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
