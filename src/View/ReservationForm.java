/*
 * Created by JFormDesigner on Tue Dec 01 22:25:52 IRST 2020
 */

package View;

import javax.swing.plaf.*;
import Model.Entity.Reserve_Rooms_Entity;
import Model.Repository.Reserve_Rooms_Repository;
import Model.Repository.Rooms_Repository;
import Model.Service.Reserve_Rooms_Service;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author unknown
 */
public class ReservationForm extends JFrame {
    private ImageIcon image;
    public ReservationForm() throws Exception {
        Reserve_Rooms_Repository reserve_rooms_repository;
        initComponents();
        reserve_rooms_repository = new Reserve_Rooms_Repository();
        date();
        Showtime();
        image = new ImageIcon("src/booking.png");
        label_img.setIcon(image);
    }

    public void date() {
        String textdate = new SimpleDateFormat("yyyy/MM/dd", Locale.US).format(new Date());
        textField_dataofreserv.setText(textdate );
    }
    Timer timer;
    void Showtime() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
                String time = timeformat.format(date);
                textField_timeofreserv.setText(time);

            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }


    private void buttonsubmitActionPerformed() {
        try {
            Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();

            if (textFieldcodemeli.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Failed to saved \n code meli must be 10 digit", "Error", 2);

            } else {
                if (textField_phonenumber.getText().length() != 11) {
                    JOptionPane.showMessageDialog(null, "Failed to saved \n Phone number must be 11 digit", "Error", 2);
                } else {
                    reserve_rooms_entity.setRoom_number(comboBox_roomnumber.getSelectedIndex() + 1);
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
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to saved \n you may reserved before" ,"Error",2);

        }
    }

    private void button_editActionPerformed() {
        try {
            Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();

            if (textFieldcodemeli.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Failed to edit \n code meli must be 10 digit", "Error", 2);
            } else {
                if (textField_phonenumber.getText().length() != 11) {
                    JOptionPane.showMessageDialog(null, "Failed to edit \n you may reserved before \n Phone number must be 11 digit", "Error", 2);
                } else {
                    reserve_rooms_entity.setRoom_number(comboBox_roomnumber.getSelectedIndex() + 1);
                    reserve_rooms_entity.setFullname(textFieldname.getText());
                    reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
                    reserve_rooms_entity.setDate_of_reserve(textField_dataofreserv.getText());
                    reserve_rooms_entity.setPhone_number(textField_phonenumber.getText());
                    reserve_rooms_entity.setTime_of_reserve(textField_timeofreserv.getText());
                    reserve_rooms_entity.setFirst_Payment(Long.parseLong(textField_firstpayment.getText()));
                    reserve_rooms_entity.setStaying_time(Long.parseLong(textField_stayingtime.getText()));
                    Reserve_Rooms_Service reserve_rooms_service = new Reserve_Rooms_Service();
                    reserve_rooms_service.update(reserve_rooms_entity);
                    JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to edit ","Error",2);

        }
    }

    private void button_deleteActionPerformed() {
            try {
                Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();
                if (reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText())).equals("") || textFieldcodemeli.getText().equals(null)) {
                    JOptionPane.showMessageDialog(null, "Meli code can't be empty  ", "Error", 2);
                }
                else {
                    reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
                    Reserve_Rooms_Service reserve_rooms_service = null;
                    try {
                        reserve_rooms_service = new Reserve_Rooms_Service();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        reserve_rooms_service = new Reserve_Rooms_Service();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    reserve_rooms_service.delete(reserve_rooms_entity);
                    JOptionPane.showMessageDialog(null, "Successfully Delete ", "Success", 1);
                }
        }
            catch (Exception e)
            {
                Reserve_Rooms_Entity reserve_rooms_entity = new Reserve_Rooms_Entity();
                if (reserve_rooms_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText())).equals("") || textFieldcodemeli.getText().equals(null)) {
                    JOptionPane.showMessageDialog(null, "Meli code can't be empty  ", "Error", 2);
                }
                JOptionPane.showMessageDialog(null, "Failed to Delete ", "Error", 2);
            }
    }
    Rooms_Repository roomsRepository = new Rooms_Repository();
    Object[] number = roomsRepository.select().toArray();
    private void initComponents() throws Exception {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel2 = new JPanel();
        label_img = new JLabel();
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
        comboBox_roomnumber = new JComboBox(number);
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
            "[466]",
            // rows
            "[]" +
            "[]" +
            "[381]"));

        //======== panel2 ========
        {
            panel2.setBackground(new Color(72, 38, 72, 211));
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
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
                "[fill]",
                // rows
                "[32]" +
                "[]" +
                "[]"));
            panel2.add(label_img, "cell 9 0 10 3");

            //---- label1 ----
            label1.setText("Room Reservation management");
            label1.setFont(new Font("Noteworthy", Font.BOLD, 17));
            label1.setForeground(Color.white);
            panel2.add(label1, "cell 0 1");
        }
        contentPane.add(panel2, "cell 0 0,growx");

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 153, 153));
            panel1.setBorder(LineBorder.createBlackLineBorder());
            panel1.setForeground(Color.black);
            panel1.setFont(panel1.getFont().deriveFont(panel1.getFont().getSize() + 3f));
            panel1.setLayout(new MigLayout(
                "hidemode 3,align left top",
                // columns
                "[230,fill]" +
                "[100,fill]" +
                "[73,fill]" +
                "[fill]" +
                "[15,fill]" +
                "[fill]" +
                "[117,fill]" +
                "[133,fill]" +
                "[fill]" +
                "[104,fill]" +
                "[fill]" +
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
            label2.setFont(new Font("Noteworthy", Font.BOLD, 17));
            label2.setForeground(Color.black);
            panel1.add(label2, "cell 0 0");

            //---- textFieldname ----
            textFieldname.setFont(textFieldname.getFont().deriveFont(textFieldname.getFont().getSize() + 3f));
            textFieldname.setForeground(Color.black);
            panel1.add(textFieldname, "cell 1 0 2 1");

            //---- label3 ----
            label3.setText("Meli Code = ");
            label3.setFont(new Font("Noteworthy", Font.BOLD, 17));
            label3.setForeground(Color.black);
            panel1.add(label3, "cell 0 1");

            //---- textFieldcodemeli ----
            textFieldcodemeli.setFont(textFieldcodemeli.getFont().deriveFont(textFieldcodemeli.getFont().getSize() + 3f));
            textFieldcodemeli.setForeground(Color.black);
            panel1.add(textFieldcodemeli, "cell 1 1 2 1");

            //---- label4 ----
            label4.setText("Phone Number = ");
            label4.setFont(new Font("Noteworthy", Font.BOLD, 17));
            label4.setForeground(Color.black);
            panel1.add(label4, "cell 0 2,aligny center,growy 0");

            //---- textField_phonenumber ----
            textField_phonenumber.setFont(textField_phonenumber.getFont().deriveFont(textField_phonenumber.getFont().getSize() + 3f));
            textField_phonenumber.setForeground(Color.black);
            panel1.add(textField_phonenumber, "cell 1 2 2 1");

            //---- label5 ----
            label5.setText("Staying time(Nights) =");
            label5.setForeground(Color.black);
            label5.setFont(new Font("Noteworthy", Font.BOLD, 17));
            panel1.add(label5, "cell 0 3");

            //---- textField_stayingtime ----
            textField_stayingtime.setFont(textField_stayingtime.getFont().deriveFont(textField_stayingtime.getFont().getSize() + 3f));
            textField_stayingtime.setForeground(Color.black);
            panel1.add(textField_stayingtime, "cell 1 3 2 1");

            //---- label7 ----
            label7.setFont(new Font("Noteworthy", Font.BOLD, 17));
            label7.setForeground(Color.black);
            label7.setText("Date of reserve =");
            panel1.add(label7, "cell 0 4");

            //---- textField_dataofreserv ----
            textField_dataofreserv.setFont(textField_dataofreserv.getFont().deriveFont(textField_dataofreserv.getFont().getSize() + 3f));
            textField_dataofreserv.setForeground(Color.black);
            panel1.add(textField_dataofreserv, "cell 1 4 2 1");

            //---- label6 ----
            label6.setText("Time of Reserve =");
            label6.setFont(new Font("Noteworthy", Font.BOLD, 17));
            label6.setForeground(Color.black);
            panel1.add(label6, "cell 0 5");

            //---- textField_timeofreserv ----
            textField_timeofreserv.setForeground(Color.black);
            textField_timeofreserv.setFont(textField_timeofreserv.getFont().deriveFont(textField_timeofreserv.getFont().getSize() + 3f));
            panel1.add(textField_timeofreserv, "cell 1 5 2 1");

            //---- label9 ----
            label9.setText("Room number =");
            label9.setForeground(Color.black);
            label9.setFont(new Font("Noteworthy", Font.BOLD, 17));
            panel1.add(label9, "cell 0 6");
            panel1.add(comboBox_roomnumber, "cell 1 6 2 1");

            //---- label8 ----
            label8.setText("First Payment =");
            label8.setFont(new Font("Noteworthy", Font.BOLD, 17));
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
            button_delete.addActionListener(e -> button_deleteActionPerformed());
            panel1.add(button_delete, "cell 2 9 4 1");
        }
        contentPane.add(panel1, "cell 0 1 1 2");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel2;
    private JLabel label_img;
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
