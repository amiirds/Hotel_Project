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
    public PassengersForm() {
        
        Passengers_Repo passengers_repo;
        initComponents();
        try {
            passengers_repo = new Passengers_Repo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buttonsubmitActionPerformed() {
        try {
            Passengers_Entity passengers_entity = new Passengers_Entity();
            passengers_entity.setMeli_code(Long.parseLong(textField_codemeli.getText()));
            passengers_entity.setFullname(textField_fullname.getText());
            passengers_entity.setFirst_Payment(Long.parseLong(textField_firstpay.getText()));
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
            passengers_service.insert(passengers_entity);
            JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to saved " + e.getStackTrace(),"Error",2);
        }
    }

    private void button_editActionPerformed() {
        try {
            Passengers_Entity passengers_entity = new Passengers_Entity();
            passengers_entity.setMeli_code(Long.parseLong(textField_codemeli.getText()));
            passengers_entity.setFullname(textField_fullname.getText());
            passengers_entity.setFirst_Payment(Long.parseLong(textField_firstpay.getText()));
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
            passengers_service.update(passengers_entity);
            JOptionPane.showMessageDialog(null, "Successfully edit", "Success", 1);
        } catch (Exception e) {
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

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(Color.darkGray);
            panel1.setFont(panel1.getFont().deriveFont(panel1.getFont().getSize() + 3f));
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );

            //---- label ----
            label.setText("Fullname =");
            label.setFont(label.getFont().deriveFont(label.getFont().getSize() + 2f));

            //---- label3 ----
            label3.setText("Nationality =");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 2f));

            //---- label4 ----
            label4.setText("Meli code or passport No=");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 2f));

            //---- label5 ----
            label5.setText("Phone Number =");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 2f));

            //---- label6 ----
            label6.setText("Number of passengers =");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 2f));

            //---- label7 ----
            label7.setText("duration of stay (Night) =");
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 2f));

            //---- label8 ----
            label8.setText("First payment amount (Tooman) =");
            label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 2f));

            //---- label9 ----
            label9.setText("Total payment (Tooman) =");
            label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 3f));

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
            radioButton_iran.addActionListener(e -> radioButton_iranActionPerformed());

            //---- radioButton_foreigner ----
            radioButton_foreigner.setText("Foreigner");
            radioButton_foreigner.addActionListener(e -> radioButton_foreignerActionPerformed());

            //---- label10 ----
            label10.setText("VIP/NORMAL =");
            label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 2f));

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
                        .addComponent(buttonsubmit, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_edit, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_delete)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                                .addGap(195, 195, 195))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(radioButton_vip, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton_normal)
                                .addGap(27, 27, 27))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label5)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(textField_fullname, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(comboBox_numberofpassengers, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                .addComponent(textField_durationstay, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                .addComponent(textField_phonenumber, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                .addComponent(textField_codemeli, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                .addComponent(textField_firstpay, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(radioButton_iran, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(radioButton_foreigner)))))
                        .addGap(23, 23, 23)
                        .addComponent(button_fullpayment)
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField_fullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButton_foreigner)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton_iran))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField_codemeli, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(textField_phonenumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_numberofpassengers, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(radioButton_vip)
                                .addContainerGap(241, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(radioButton_normal)))
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(textField_durationstay, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))
                                    .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(button_fullpayment)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_firstpay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_totalpay))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(buttonsubmit)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button_edit)
                                        .addComponent(button_delete)))
                                .addGap(31, 31, 31))))
            );
        }

        //======== panel2 ========
        {
            panel2.setBackground(new Color(153, 0, 0));

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
                        .addContainerGap(560, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE))
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
