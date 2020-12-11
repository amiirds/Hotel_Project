/*
 * Created by JFormDesigner on Tue Dec 01 22:25:52 IRST 2020
 */

package View;

import javax.swing.plaf.*;

import Model.Entity.Reserve_Rooms_Entity;
import Model.Repository.Reserve_Rooms_Repository;
import Model.Service.Employee_Service;
import Model.Service.Reserve_Rooms_Service;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * @author unknown
 */
public class ReservationForm extends JFrame {
    public ReservationForm() throws Exception {
        Reserve_Rooms_Repository reserve_rooms_repository;
        //
        initComponents();
        reserve_rooms_repository = new Reserve_Rooms_Repository();
    }

    private void buttonsubmitActionPerformed() {
        try {
            Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();
            reserve_rooms_entity.setRoom_number(comboBox_roomnumber.getSelectedIndex());
            reserve_rooms_entity.setFullname(textFieldname.getText());
            reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
            reserve_rooms_entity.setDate_of_reserve(textField_dataofreserv.getText());
            reserve_rooms_entity.setPhone_number(textField_phonenumber.getText());
            reserve_rooms_entity.setTime_of_reserve(textField_timeofreserv.getText());
            reserve_rooms_entity.setFirst_Payment(Long.parseLong(textField_firstpayment.getText()));
            reserve_rooms_entity.setStaying_time(Long.parseLong(textField_stayingtime.getText()));
            Reserve_Rooms_Service reserve_rooms_service = new Reserve_Rooms_Service();
            reserve_rooms_service.insert(reserve_rooms_entity);
            JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to saved " + e.getStackTrace(),"Error",2);

        }
    }

    private void button_editActionPerformed() {
        try {
            Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();
            reserve_rooms_entity.setRoom_number(comboBox_roomnumber.getSelectedIndex());
            reserve_rooms_entity.setFullname(textFieldname.getText());
            reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
            reserve_rooms_entity.setDate_of_reserve(textField_dataofreserv.getText());
            reserve_rooms_entity.setPhone_number(textField_phonenumber.getText());
            reserve_rooms_entity.setTime_of_reserve(textField_timeofreserv.getText());
            reserve_rooms_entity.setFirst_Payment(Long.parseLong(textField_firstpayment.getText()));
            reserve_rooms_entity.setStaying_time(Long.parseLong(textField_stayingtime.getText()));
            Reserve_Rooms_Service reserve_rooms_service = new Reserve_Rooms_Service();
            reserve_rooms_service.update(reserve_rooms_entity);
            JOptionPane.showMessageDialog(null, "Successfully edit", "Success", 1);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to edit ","Error",2);

        }
    }

    private void button_deleteActionPerformed() throws Exception {
        Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();
        if (reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText())).equals("")) {
            JOptionPane.showMessageDialog(null, "Meli code can't be empty  ", "Error", 2);
        } else {
            reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
            Reserve_Rooms_Service reserve_rooms_service = new Reserve_Rooms_Service();
            try {
                reserve_rooms_service.delete(reserve_rooms_entity);
                JOptionPane.showMessageDialog(null, "Successfully Delete ", "Success", 1);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to Delete ", "Error", 2);
            }
        }
    }
    Integer[] room_number = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel2 = new JPanel();
        label1 = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        textFieldname = new JTextField();
        label3 = new JLabel();
        textFieldcodemeli = new JTextField();
        label4 = new JLabel();
        textField_phonenumber = new JTextField();
        label5 = new JLabel();
        textField_stayingtime = new JTextField();
        label7 = new JLabel();
        textField_dataofreserv = new JTextField();
        label6 = new JLabel();
        textField_timeofreserv = new JTextField();
        label9 = new JLabel();
        comboBox_roomnumber = new JComboBox(room_number);
        label8 = new JLabel();
        textField_firstpayment = new JTextField();
        buttonsubmit = new JButton();
        button_edit = new JButton();
        button_delete = new JButton();

        //======== this ========
        setBackground(new Color(0, 204, 153));
        setTitle("Reservation");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[401]",
            // rows
            "[]" +
            "[]" +
            "[381]"));

        //======== panel2 ========
        {
            panel2.setBackground(new Color(153, 0, 0));
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0
            , 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,
            panel2. getBorder( )) ); panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
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
                "[fill]",
                // rows
                "[]" +
                "[]"));

            //---- label1 ----
            label1.setText("Room ReservationMangment");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 2f));
            label1.setForeground(Color.white);
            panel2.add(label1, "cell 0 1");
        }
        contentPane.add(panel2, "cell 0 0,growx");

        //======== panel1 ========
        {
            panel1.setBackground(Color.darkGray);
            panel1.setBorder(LineBorder.createBlackLineBorder());
            panel1.setForeground(Color.black);
            panel1.setFont(panel1.getFont().deriveFont(panel1.getFont().getSize() + 3f));
            panel1.setLayout(new MigLayout(
                "hidemode 3,align left top",
                // columns
                "[230,fill]" +
                "[100,fill]" +
                "[54,fill]" +
                "[fill]" +
                "[15,fill]" +
                "[fill]" +
                "[117,fill]" +
                "[133,fill]" +
                "[104,fill]" +
                "[170,fill]",
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
                "[]"));

            //---- label2 ----
            label2.setText("FullName = ");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() & ~Font.ITALIC, label2.getFont().getSize() + 3f));
            label2.setForeground(Color.black);
            panel1.add(label2, "cell 0 0");

            //---- textFieldname ----
            textFieldname.setFont(textFieldname.getFont().deriveFont(textFieldname.getFont().getSize() + 3f));
            textFieldname.setForeground(Color.black);
            panel1.add(textFieldname, "cell 1 0 2 1");

            //---- label3 ----
            label3.setText("Meli Code = ");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 3f));
            label3.setForeground(Color.black);
            panel1.add(label3, "cell 0 1");

            //---- textFieldcodemeli ----
            textFieldcodemeli.setFont(textFieldcodemeli.getFont().deriveFont(textFieldcodemeli.getFont().getSize() + 3f));
            textFieldcodemeli.setForeground(Color.black);
            panel1.add(textFieldcodemeli, "cell 1 1 2 1");

            //---- label4 ----
            label4.setText("Phone Number = ");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 3f));
            label4.setForeground(Color.black);
            panel1.add(label4, "cell 0 2,aligny center,growy 0");

            //---- textField_phonenumber ----
            textField_phonenumber.setFont(textField_phonenumber.getFont().deriveFont(textField_phonenumber.getFont().getSize() + 3f));
            textField_phonenumber.setForeground(Color.black);
            panel1.add(textField_phonenumber, "cell 1 2 2 1");

            //---- label5 ----
            label5.setText("Staying time(Nights) =");
            label5.setForeground(Color.black);
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 3f));
            panel1.add(label5, "cell 0 3");

            //---- textField_stayingtime ----
            textField_stayingtime.setFont(textField_stayingtime.getFont().deriveFont(textField_stayingtime.getFont().getSize() + 3f));
            textField_stayingtime.setForeground(Color.black);
            panel1.add(textField_stayingtime, "cell 1 3 2 1");

            //---- label7 ----
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 3f));
            label7.setForeground(Color.black);
            label7.setText("Date of reserve =");
            panel1.add(label7, "cell 0 4");

            //---- textField_dataofreserv ----
            textField_dataofreserv.setFont(textField_dataofreserv.getFont().deriveFont(textField_dataofreserv.getFont().getSize() + 3f));
            textField_dataofreserv.setForeground(Color.black);
            panel1.add(textField_dataofreserv, "cell 1 4 2 1");

            //---- label6 ----
            label6.setText("Time of Reserve =");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 3f));
            label6.setForeground(Color.black);
            panel1.add(label6, "cell 0 5");

            //---- textField_timeofreserv ----
            textField_timeofreserv.setForeground(Color.black);
            textField_timeofreserv.setFont(textField_timeofreserv.getFont().deriveFont(textField_timeofreserv.getFont().getSize() + 3f));
            panel1.add(textField_timeofreserv, "cell 1 5 2 1");

            //---- label9 ----
            label9.setText("Room number =");
            label9.setForeground(Color.black);
            label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 3f));
            panel1.add(label9, "cell 0 6");
            panel1.add(comboBox_roomnumber, "cell 1 6 2 1");

            //---- label8 ----
            label8.setText("First Payment =");
            label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 3f));
            label8.setForeground(Color.black);
            panel1.add(label8, "cell 0 7");

            //---- textField_firstpayment ----
            textField_firstpayment.setForeground(Color.black);
            textField_firstpayment.setFont(textField_firstpayment.getFont().deriveFont(textField_firstpayment.getFont().getSize() + 3f));
            panel1.add(textField_firstpayment, "cell 1 7 2 1");

            //---- buttonsubmit ----
            buttonsubmit.setText("Submit");
            buttonsubmit.addActionListener(e -> buttonsubmitActionPerformed());
            panel1.add(buttonsubmit, "cell 0 9");

            //---- button_edit ----
            button_edit.setText("Edit");
            button_edit.addActionListener(e -> button_editActionPerformed());
            panel1.add(button_edit, "cell 1 9");

            //---- button_delete ----
            button_delete.setText("Delete");
            button_delete.addActionListener(e -> {
                try {
                    button_deleteActionPerformed();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Failed to Delete ", "Error", 2);

                }
            });
            panel1.add(button_delete, "cell 2 9 3 1");
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
    private JPanel panel1;
    private JLabel label2;
    private JTextField textFieldname;
    private JLabel label3;
    private JTextField textFieldcodemeli;
    private JLabel label4;
    private JTextField textField_phonenumber;
    private JLabel label5;
    private JTextField textField_stayingtime;
    private JLabel label7;
    private JTextField textField_dataofreserv;
    private JLabel label6;
    private JTextField textField_timeofreserv;
    private JLabel label9;
    private JComboBox comboBox_roomnumber;
    private JLabel label8;
    private JTextField textField_firstpayment;
    private JButton buttonsubmit;
    private JButton button_edit;
    private JButton button_delete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
