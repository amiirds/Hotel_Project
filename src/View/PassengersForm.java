/*
 * Created by JFormDesigner on Mon Nov 30 13:28:48 IRST 2020
 */

package View;

import java.awt.*;
import javax.swing.*;
import Model.Entity.Passengers_Entity;
import Model.Repository.Passengers_Repo;
import Model.Service.Passengers_service;


/**
 * @author unknown
 */

public class PassengersForm extends JFrame {
    long room_payment = 0;
    private ImageIcon imageIcon ;
    private ImageIcon imageIcon2 ;
    public PassengersForm() {
        
        Passengers_Repo passengers_repo;
        initComponents();
        try {
            passengers_repo = new Passengers_Repo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        imageIcon = new ImageIcon("src/registration.png");
        label_image.setIcon(imageIcon);
        imageIcon2 = new ImageIcon("src/Error.png");

    }

    private void buttonsubmitActionPerformed() {
        try {
            Passengers_Entity passengers_entity = new Passengers_Entity();
            passengers_entity.setMeli_code(Long.parseLong(textField_codemeli.getText()));
            passengers_entity.setFullname(textField_fullname.getText());
            passengers_entity.setNumber_of_passengers(Long.parseLong(String.valueOf(comboBox_numberofpassengers.getSelectedIndex()+1)));
            passengers_entity.setDuration_of_stay(Long.parseLong(textField_durationstay.getText()));
            if (radioButton_iran.isSelected()){
                passengers_entity.setNationality(radioButton_iran.getText());
            }
            else {
                passengers_entity.setNationality(radioButton_foreigner.getText());
            }

            passengers_entity.setPhone_number(Long.parseLong(textField_phonenumber.getText()));
            passengers_entity.setTotal_payment(Long.parseLong(label_totalpay.getText()));
            Passengers_service passengers_service = new Passengers_service();
            if (Long.parseLong(textField_firstpay.getText())<20000){
                JOptionPane.showMessageDialog(null,"Please your first payment upper than 20K ","Error",2,imageIcon2);
            }
            else {
                passengers_entity.setFirst_Payment(Long.parseLong(textField_firstpay.getText()));
                passengers_service.insert(passengers_entity);
                JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);
            }
        } catch (Exception e) {
            if (Long.parseLong(textField_firstpay.getText())<20000){
                JOptionPane.showMessageDialog(null,"Please your first payment upper than 20K ","Error",2,imageIcon2);
            }
            else
            JOptionPane.showMessageDialog(null,"Failed to saved ","Error",2);
        }
    }

    private void button_editActionPerformed() {
        try {
            Passengers_Entity passengers_entity = new Passengers_Entity();
            passengers_entity.setMeli_code(Long.parseLong(textField_codemeli.getText()));
            passengers_entity.setFullname(textField_fullname.getText());
            passengers_entity.setNumber_of_passengers(Long.parseLong(String.valueOf(comboBox_numberofpassengers.getSelectedIndex()+1)));
            passengers_entity.setDuration_of_stay(Long.parseLong(textField_durationstay.getText()));
            if (radioButton_iran.isSelected()){
                passengers_entity.setNationality(radioButton_iran.getText());
            }
            else {
                passengers_entity.setNationality(radioButton_foreigner.getText());
            }
            passengers_entity.setPhone_number(Long.parseLong(textField_phonenumber.getText()));
            passengers_entity.setTotal_payment(Long.parseLong(label_totalpay.getText()));
            Passengers_service passengers_service = new Passengers_service();
            if (Long.parseLong(textField_firstpay.getText())<20000){
                JOptionPane.showMessageDialog(null,"Please your first payment upper than 20K ","Error",2,imageIcon2);
            }
            else {
                passengers_entity.setFirst_Payment(Long.parseLong(textField_firstpay.getText()));
                passengers_service.update(passengers_entity);
                JOptionPane.showMessageDialog(null, "Successfully edit", "Success", 1);
            }
        }
        catch (Exception e) {
            if (Long.parseLong(textField_firstpay.getText())<20000){
                JOptionPane.showMessageDialog(null,"Please your first payment upper than 20K ","Error",2,imageIcon2);
            }
            else
                JOptionPane.showMessageDialog(null,"Failed to edit \n Code melli and other text field mustn't be Empty ","Error",2);
        }
    }

    private void button_deleteActionPerformed() {
        Passengers_Entity passengers_entity = new Passengers_Entity();
        if (passengers_entity.setMeli_code(Long.parseLong(textField_codemeli.getText())).equals("")) {
            JOptionPane.showMessageDialog(null, "Meli code can't be empty  ", "Error", 2);
        } else {
            passengers_entity.setMeli_code(Long.parseLong(textField_codemeli.getText()));
            Passengers_service passengers_service = null;
            try {
                passengers_service = new Passengers_service();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                passengers_service.delete(passengers_entity);
                JOptionPane.showMessageDialog(null, "Successfully Delete ", "Success", 1);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to Delete " + e.getStackTrace(), "Error", 2);
            }
        }
    }

    private void button_fullpaymentActionPerformed() {
        
        if (radioButton_normal.isSelected()){
            room_payment = Passengers_Entity.getNormal_Room_price();
        }
        if (radioButton_vip.isSelected()){
            room_payment = Passengers_Entity.getSpecial_Room_price();
        }
        long total_payment = Long.parseLong(textField_durationstay.getText()) * Long.parseLong(String.valueOf(comboBox_numberofpassengers.getSelectedItem())) * room_payment ;
        label_totalpay.setText(String.valueOf(total_payment));
    }

    private void radioButton_iranActionPerformed() {
        if (radioButton_iran.isSelected())
            radioButton_foreigner.setSelected(false);
    }

    private void radioButton_foreignerActionPerformed() {
        if (radioButton_foreigner.isSelected())
            radioButton_iran.setSelected(false);
    }

    private void radioButton_vipActionPerformed() {
        if (radioButton_vip.isSelected())
            radioButton_normal.setSelected(false);
    }

    private void radioButton_normalActionPerformed() {
        if (radioButton_normal.isSelected())
            radioButton_vip.setSelected(false);
    }


    Integer[] number = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27 ,28 ,29 ,30 ,31 ,32 ,33 ,34 ,35 ,36 ,37 ,38 ,39 ,40 ,41 ,42 ,43 ,44 ,45 ,46 ,47 ,48 ,49 ,50 ,51 ,52 ,53 ,54 ,55 ,56 ,57 ,58 ,59 ,60 ,61 ,62 ,63 ,64 ,65 ,66 ,67 ,68 ,69 ,70 ,71 ,72 ,73 ,74 ,75 ,76 ,77 ,78 ,79 ,80 ,81 ,82 ,83 ,84 ,85 ,86 ,87 ,88 ,89 ,90 ,91 ,92 ,93 ,94 ,95 ,96 ,97 ,98 ,99 ,100 ,101 ,102 ,103 ,104 ,105 ,106 ,107 ,108 ,109 ,110 ,111 ,112 ,113 ,114 ,115 ,116 ,117 ,118 ,119 ,120 ,121 ,122 ,123 ,124 ,125 ,126 ,127 ,128 ,129 ,130 ,131 ,132 ,133 ,134 ,135 ,136 ,137 ,138 ,139 ,140 ,141 ,142 ,143 ,144 ,145 ,146 ,147 ,148 ,149 ,150 ,151 ,152 ,153 ,154 ,155 ,156 ,157 ,158 ,159 ,160 ,161 ,162 ,163 ,164 ,165 ,166 ,167 ,168 ,169 ,170 ,171 ,172 ,173 ,174 ,175 ,176 ,177 ,178 ,179 ,180 ,181 ,182 ,183 ,184 ,185 ,186 ,187 ,188 ,189 ,190 ,191 ,192 ,193 ,194 ,195 ,196 ,197 ,198 ,199 ,200};

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel1 = new JPanel();
        label = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        textField_fullname = new JTextField();
        textField_codemeli = new JTextField();
        textField_durationstay = new JTextField();
        textField_phonenumber = new JTextField();
        buttonsubmit = new JButton();
        button_edit = new JButton();
        button_delete = new JButton();
        radioButton_iran = new JRadioButton();
        radioButton_foreigner = new JRadioButton();
        textField_firstpay = new JTextField();
        label10 = new JLabel();
        label_totalpay = new JLabel();
        radioButton_vip = new JRadioButton();
        radioButton_normal = new JRadioButton();
        button_fullpayment = new JButton();
        comboBox_numberofpassengers = new JComboBox(number);
        panel2 = new JPanel();
        label1 = new JLabel();
        label_image = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(255, 153, 153));
            panel1.setFont(panel1.getFont().deriveFont(panel1.getFont().getSize() + 3f));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
            .border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder
            .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.
            awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
            ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}})
            ;

            //---- label ----
            label.setText("Fullname =");
            label.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label.setForeground(Color.white);

            //---- label3 ----
            label3.setText("Nationality =");
            label3.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label3.setForeground(Color.white);

            //---- label4 ----
            label4.setText("Meli code or passport No=");
            label4.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label4.setForeground(Color.white);

            //---- label5 ----
            label5.setText("Phone Number =");
            label5.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label5.setForeground(Color.white);

            //---- label6 ----
            label6.setText("Number of passengers =");
            label6.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label6.setForeground(Color.white);

            //---- label7 ----
            label7.setText("duration of stay (Night) =");
            label7.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label7.setForeground(Color.white);

            //---- label8 ----
            label8.setText("First payment amount (Tooman) =");
            label8.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label8.setForeground(Color.white);

            //---- label9 ----
            label9.setText("Total payment (Tooman) =");
            label9.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label9.setForeground(Color.white);

            //---- buttonsubmit ----
            buttonsubmit.setText("Submit");
            buttonsubmit.addActionListener(e -> {
			buttonsubmitActionPerformed();
		});

            //---- button_edit ----
            button_edit.setText("Edit");
            button_edit.addActionListener(e -> button_editActionPerformed());

            //---- button_delete ----
            button_delete.setText("Delete");
            button_delete.addActionListener(e -> button_deleteActionPerformed());

            //---- radioButton_iran ----
            radioButton_iran.setText("Iranian");
            radioButton_iran.setFont(radioButton_iran.getFont().deriveFont(radioButton_iran.getFont().getSize() - 2f));
            radioButton_iran.addActionListener(e -> radioButton_iranActionPerformed());

            //---- radioButton_foreigner ----
            radioButton_foreigner.setText("Foreigner");
            radioButton_foreigner.setFont(radioButton_foreigner.getFont().deriveFont(radioButton_foreigner.getFont().getSize() - 2f));
            radioButton_foreigner.addActionListener(e -> radioButton_foreignerActionPerformed());

            //---- label10 ----
            label10.setText("VIP/NORMAL =");
            label10.setFont(new Font("Noteworthy", Font.PLAIN, 20));
            label10.setForeground(Color.white);

            //---- radioButton_vip ----
            radioButton_vip.setText("vip");
            radioButton_vip.addActionListener(e -> radioButton_vipActionPerformed());

            //---- radioButton_normal ----
            radioButton_normal.setText("normal");
            radioButton_normal.addActionListener(e -> radioButton_normalActionPerformed());

            //---- button_fullpayment ----
            button_fullpayment.setText("Show full payment");
            button_fullpayment.addActionListener(e -> button_fullpaymentActionPerformed());

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(buttonsubmit, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_edit, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_delete, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 301, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label_totalpay)
                                .addGap(216, 216, 216))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label5)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(radioButton_vip, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioButton_normal))
                                    .addComponent(textField_durationstay)
                                    .addComponent(textField_firstpay)
                                    .addComponent(textField_fullname)
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(radioButton_iran, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioButton_foreigner))
                                    .addComponent(textField_phonenumber, GroupLayout.Alignment.TRAILING)
                                    .addComponent(textField_codemeli, GroupLayout.Alignment.TRAILING)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 414, Short.MAX_VALUE)
                                .addComponent(comboBox_numberofpassengers, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addComponent(button_fullpayment, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_fullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton_foreigner)
                            .addComponent(radioButton_iran))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_codemeli, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_phonenumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_numberofpassengers, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioButton_normal)
                                    .addComponent(radioButton_vip))))
                        .addGap(5, 5, 5)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button_fullpayment)
                                    .addComponent(textField_durationstay, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_firstpay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_totalpay))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonsubmit)
                            .addComponent(button_edit)
                            .addComponent(button_delete))
                        .addGap(31, 31, 31))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(72, 38, 72, 211));

            //---- label1 ----
            label1.setText("Client Managment");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 3f));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                        .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_image, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel1;
    private JLabel label;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextField textField_fullname;
    private JTextField textField_codemeli;
    private JTextField textField_durationstay;
    private JTextField textField_phonenumber;
    private JButton buttonsubmit;
    private JButton button_edit;
    private JButton button_delete;
    private JRadioButton radioButton_iran;
    private JRadioButton radioButton_foreigner;
    private JTextField textField_firstpay;
    private JLabel label10;
    private JLabel label_totalpay;
    private JRadioButton radioButton_vip;
    private JRadioButton radioButton_normal;
    private JButton button_fullpayment;
    private JComboBox comboBox_numberofpassengers;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label_image;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
