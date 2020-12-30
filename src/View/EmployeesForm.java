/*
 * Created by JFormDesigner on Mon Nov 30 16:22:21 IRST 2020
 */

package View;

import javax.swing.plaf.*;
import Model.Entity.Employee_Entity;
import Model.Entity.User_Entity;
import Model.Service.Employee_Service;
import Model.Service.User_Service;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Objects;

/**
 * @author unknown
 */
public class EmployeesForm extends JFrame {

    public EmployeesForm() {
        initComponents();
        ImageIcon imageIcon = new ImageIcon("src/community-man-2.png");
        label_image.setIcon(imageIcon);
    }
    private void buttonsubmitActionPerformed(){
        try {
            if (textFieldcodemeli.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "meli code or passport number must be 10 digit ", "Error", 2);
            }
            else {
                if (textFieldnumber.getText().length() != 11) {
                    JOptionPane.showMessageDialog(null, "phone number must be 11 digit ", "Error", 2);
                } else {
                    Employee_Entity employee_entity = new Employee_Entity();
                    employee_entity.setAddress(textField_address.getText());
                    employee_entity.setSalary(Long.parseLong(textField_salary.getText()));
                    employee_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
                    employee_entity.setFullname(textFieldname.getText());
                    employee_entity.setUsername(textFieldname.getText());
                    employee_entity.setPassword(textFieldcodemeli.getText());
                    employee_entity.setJob_Title(Objects.requireNonNull(comboBox_jobtitle.getSelectedItem()).toString());
                    employee_entity.setPhone_number(textFieldnumber.getText());
                    Employee_Service employee_service = new Employee_Service();
                    employee_service.save(employee_entity);
                    if (employee_entity.getJob_Title().equals("Hotel General Manager")) {
                        User_Entity user_entity = new User_Entity();
                        user_entity.setUsername(textFieldname.getText());
                        user_entity.setPassword(textFieldcodemeli.getText());
                        user_entity.setJob_title(comboBox_jobtitle.getSelectedItem().toString());
                        User_Service user_service = new User_Service();
                        user_service.save(user_entity);
                    }
                    JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to saved ","Error",2);
        }
    }

    private void button_editActionPerformed() {
        try {
            if (textFieldcodemeli.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "meli code or passport number must be 10 digit ", "Error", 2);
            }
            else {
                if (textFieldnumber.getText().length() != 11) {
                    JOptionPane.showMessageDialog(null, "phone number must be 11 digit ", "Error", 2);
                } else {
                    Employee_Entity employee_entity = new Employee_Entity();
                    employee_entity.setAddress(textField_address.getText());
                    employee_entity.setSalary(Long.parseLong(textField_salary.getText()));
                    employee_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
                    employee_entity.setFullname(textFieldname.getText());
                    employee_entity.setUsername(textFieldname.getText());
                    employee_entity.setPassword(textFieldcodemeli.getText());
                    employee_entity.setJob_Title(Objects.requireNonNull(comboBox_jobtitle.getSelectedItem()).toString());
                    employee_entity.setPhone_number(textFieldnumber.getText());
                    Employee_Service employee_service = new Employee_Service();
                    employee_service.update(employee_entity);
                    JOptionPane.showMessageDialog(null, "Successfully submit", "Success", 1);
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to edit " ,"Error",2);
        }
    }


    private void button_deleteActionPerformed() {
            try {
                Employee_Entity employee_entity = new Employee_Entity();
                User_Entity user_entity = new User_Entity();
                if (employee_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText())).equals("")) {
                    JOptionPane.showMessageDialog(null, "Meli code can't be empty  ", "Error", 2);
                }
                else {
                    employee_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText()));
                    user_entity.setPassword(textFieldcodemeli.getText());
                    Employee_Service employee_service = new Employee_Service();
                    User_Service user_service = new User_Service();
                    employee_service.delete(employee_entity);
                    Thread.sleep(1000);
                    user_service.delete(user_entity);
                JOptionPane.showMessageDialog(null, "Successfully Delete ", "Success", 1);
            }
        }
            catch (Exception e) {
                Employee_Entity employee_entity = new Employee_Entity();
                if (employee_entity.setMeli_code(Long.parseLong(textFieldcodemeli.getText())).equals("")) {
                    JOptionPane.showMessageDialog(null, "Meli code can't be empty  ", "Error", 2);
                }
                JOptionPane.showMessageDialog(null, "Failed to Delete " , "Error", 2);
            }
    }

    String[] job = {null,"Hotel General Manager","Events Manager","Cafe Manager","Chef","Kitchen Manager","Director of Housekeeping","Maid","Housekeeper","Valet","Barista"};
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel2 = new JPanel();
        label_image = new JLabel();
        label1 = new JLabel();
        panel1 = new JPanel();
        label_name = new JLabel();
        textFieldname = new JTextField();
        label_codemeli = new JLabel();
        textFieldcodemeli = new JTextField();
        label_phone = new JLabel();
        textFieldnumber = new JTextField();
        label_salary = new JLabel();
        textField_salary = new JTextField();
        label_address = new JLabel();
        textField_address = new JTextField();
        label_jobtitle = new JLabel();
        comboBox_jobtitle = new JComboBox(job);
        buttonsubmit = new JButton();
        button_edit = new JButton();
        button_delete = new JButton();

        //======== this ========
        setBackground(new Color(0, 204, 153));
        setTitle("Employees");
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
            panel2.setBackground(new Color(72, 38, 72, 211));
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
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
                "[]" +
                "[]" +
                "[]"));
            panel2.add(label_image, "cell 11 0 7 3");

            //---- label1 ----
            label1.setText("Employees Mangment");
            label1.setFont(new Font("Noteworthy", Font.BOLD, 15));
            label1.setForeground(Color.white);
            panel2.add(label1, "cell 0 1");
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
                "[67,fill]" +
                "[54,fill]" +
                "[41,fill]" +
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
                "[]"));

            //---- label_name ----
            label_name.setText("FullName = ");
            label_name.setFont(new Font("Noteworthy", Font.PLAIN, 18));
            label_name.setForeground(Color.white);
            panel1.add(label_name, "cell 0 0");

            //---- textFieldname ----
            textFieldname.setFont(textFieldname.getFont().deriveFont(textFieldname.getFont().getSize() + 2f));
            panel1.add(textFieldname, "cell 1 0 2 1");

            //---- label_codemeli ----
            label_codemeli.setText("Meli Code = ");
            label_codemeli.setFont(new Font("Noteworthy", Font.PLAIN, 18));
            label_codemeli.setForeground(Color.white);
            panel1.add(label_codemeli, "cell 0 1");

            //---- textFieldcodemeli ----
            textFieldcodemeli.setFont(textFieldcodemeli.getFont().deriveFont(textFieldcodemeli.getFont().getSize() + 2f));
            panel1.add(textFieldcodemeli, "cell 1 1 2 1");

            //---- label_phone ----
            label_phone.setText("Phone Number = ");
            label_phone.setFont(new Font("Noteworthy", Font.PLAIN, 18));
            label_phone.setForeground(Color.white);
            panel1.add(label_phone, "cell 0 2,aligny center,growy 0");

            //---- textFieldnumber ----
            textFieldnumber.setFont(textFieldnumber.getFont().deriveFont(textFieldnumber.getFont().getSize() + 2f));
            panel1.add(textFieldnumber, "cell 1 2 2 1");

            //---- label_salary ----
            label_salary.setText("Salary (Tooman) =");
            label_salary.setForeground(Color.white);
            label_salary.setFont(new Font("Noteworthy", Font.PLAIN, 18));
            panel1.add(label_salary, "cell 0 3");

            //---- textField_salary ----
            textField_salary.setFont(textField_salary.getFont().deriveFont(textField_salary.getFont().getSize() + 2f));
            panel1.add(textField_salary, "cell 1 3 2 1");

            //---- label_address ----
            label_address.setFont(new Font("Noteworthy", Font.PLAIN, 18));
            label_address.setForeground(Color.white);
            label_address.setText("Address = ");
            panel1.add(label_address, "cell 0 4");

            //---- textField_address ----
            textField_address.setFont(textField_address.getFont().deriveFont(textField_address.getFont().getSize() + 3f));
            panel1.add(textField_address, "cell 1 4 2 1");

            //---- label_jobtitle ----
            label_jobtitle.setText("Job Title =");
            label_jobtitle.setFont(new Font("Noteworthy", Font.PLAIN, 18));
            label_jobtitle.setForeground(Color.white);
            panel1.add(label_jobtitle, "cell 0 5");
            panel1.add(comboBox_jobtitle, "cell 1 5 2 1");

            //---- buttonsubmit ----
            buttonsubmit.setText("Submit");
            buttonsubmit.addActionListener(e -> buttonsubmitActionPerformed());
            panel1.add(buttonsubmit, "cell 0 6 1 2");

            //---- button_edit ----
            button_edit.setText("Edit");
            button_edit.addActionListener(e -> {
			button_editActionPerformed();
		});
            panel1.add(button_edit, "cell 1 6 1 2");

            //---- button_delete ----
            button_delete.setText("Delete");
            button_delete.addActionListener(e -> button_deleteActionPerformed());
            panel1.add(button_delete, "cell 2 6 2 2");
        }
        contentPane.add(panel1, "cell 0 1 1 2");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel2;
    private JLabel label_image;
    private JLabel label1;
    private JPanel panel1;
    private JLabel label_name;
    private JTextField textFieldname;
    private JLabel label_codemeli;
    private JTextField textFieldcodemeli;
    private JLabel label_phone;
    private JTextField textFieldnumber;
    private JLabel label_salary;
    private JTextField textField_salary;
    private JLabel label_address;
    private JTextField textField_address;
    private JLabel label_jobtitle;
    private JComboBox comboBox_jobtitle;
    private JButton buttonsubmit;
    private JButton button_edit;
    private JButton button_delete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

