/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;

import com.aed.backend.FirstAssignment;
import java.awt.Image;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author tarush
 */
public class ViewEmployee extends javax.swing.JPanel {
    
    
    
    //String defaultPath = "default.jpg";
    /**
     * Creates new form ViewEmployee
     * @param data
     */
    
    String defaultImage = "/home/tarush/Desktop/Work/Java/firstAssignment/Tarush_Singh_001067923-main/firstAssignment/src/main/java/Images/default.png";
    
    public ViewEmployee() {
        //this.data = data;
        ImageIcon icon = new ImageIcon(defaultImage);
        initComponents();
        //DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        PhotoID.setIcon(icon);
        
        for (FirstAssignment data : HRTool.list){
            String dataIn[] = {data.getName(), data.getEmployeeID(), data.getAge(), data.getGender(), data.getStartDate(), data.getLevel(), data.getTeam(), data.getPosition(), data.getEmail(), data.getPhoneNumber(), data.getPath()};
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.addRow(dataIn);
        }
        
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        EmployeeIDLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        StartDateLabel = new javax.swing.JLabel();
        LevelLabel = new javax.swing.JLabel();
        TeamLabel = new javax.swing.JLabel();
        Position = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        MailID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        PhotoID = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        ViewPanel.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        Title.setText("View Employee");

        NameLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        NameLabel.setText("Name:");

        EmployeeIDLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        EmployeeIDLabel.setText("Employee ID:");

        AgeLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        AgeLabel.setText("Age:");

        GenderLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        GenderLabel.setText("Gender:");

        StartDateLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        StartDateLabel.setText("Start Date:");

        LevelLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        LevelLabel.setText("Level:");

        TeamLabel.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        TeamLabel.setText("Team Info:");

        Position.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Position.setText("Position:");

        PhoneNumber.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        PhoneNumber.setText("Ph. No:");

        MailID.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        MailID.setText("Email ID:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Age", "Gender", "Start date", "Level", "Team", "Position", "Email ID", "Phone number", "Image ID"
            }
        ));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Delete.setBackground(new java.awt.Color(255, 51, 51));
        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        PhotoID.setText("Photo ID");

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewPanelLayout.createSequentialGroup()
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewPanelLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Update))
                                    .addGroup(ViewPanelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(PhotoID, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                                .addComponent(StartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                                .addComponent(EmployeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                                .addComponent(TeamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TeamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PhotoID, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(Update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Delete)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateData(int a){
        int row = a;
        //System.out.println(row);
        //TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) jTable1.getModel()));
        String name = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String age = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String gender = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String date = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String level = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String team = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String position = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String email = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        String phone = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
        String path = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();;
        ImageIcon icon1 = new ImageIcon(path);
        Image icon = icon1.getImage().getScaledInstance(PhotoID.getWidth(), PhotoID.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconScaled = new ImageIcon(icon);
        PhotoID.setIcon(iconScaled);
        NameLabel.setText("Name: "+name);
        EmployeeIDLabel.setText("Employee ID: "+id);
        AgeLabel.setText("Age: "+age);
        GenderLabel.setText("Gender: "+gender);
        StartDateLabel.setText("Start Date: "+date);
        LevelLabel.setText("Level: "+level);
        TeamLabel.setText("Team Info: "+team);
        Position.setText("Position: "+position);
        MailID.setText("Email ID: "+email);
        PhoneNumber.setText("Ph. No.: "+phone);
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        //System.out.println(row);
        if (row != -1){
            populateData(row);
        }
    }//GEN-LAST:event_jTable1MouseClicked
        
    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        int row = jTable1.getSelectedRow();
        if (row != -1){
            DefaultTableModel mod = (DefaultTableModel)jTable1.getModel();
            mod.removeRow(row);
            NameLabel.setText("Name: ");
            EmployeeIDLabel.setText("Employee ID: ");
            AgeLabel.setText("Age: ");
            GenderLabel.setText("Gender: ");
            StartDateLabel.setText("Start Date: ");
            LevelLabel.setText("Level: ");
            TeamLabel.setText("Team Info: ");
            Position.setText("Position: ");
            MailID.setText("Email ID: ");
            PhoneNumber.setText("Ph. No.: ");
            ImageIcon icon = new ImageIcon(defaultImage);
            PhotoID.setIcon(icon);
            JOptionPane.showMessageDialog(this, "Employee deleted.");
            HRTool.list.remove(row);
        }
        else{
            JOptionPane.showMessageDialog(this, "No employee selected.");
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        Credit for the below code snippet: https://stackoverflow.com/a/37989058
        */
        String text = jTextField1.getText();
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) jTable1.getModel()));
        jTable1.setRowSorter(sorter);
        if (text.trim().length() != 0){
            sorter.setRowFilter(RowFilter.regexFilter(text));            
        }
        else{
            sorter.setRowFilter(null);
        }
        int row = jTable1.getSelectedRow();
        if (row != -1){
            populateData(row);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        int row = jTable1.getSelectedRow();
        if (row != -1){
            /*
            Create an instance of the employee class. 
            Using JTable get the latest data.
            Use the employee instance's setters to make a new array. 
            Replace the array at the index which is same as the row value.
            */
            FirstAssignment data = new FirstAssignment();
            data = HRTool.list.get(row);
            String name = jTable1.getModel().getValueAt(row, 0).toString();
            String id = jTable1.getModel().getValueAt(row, 1).toString();
            String age = jTable1.getModel().getValueAt(row, 2).toString();
            String gender = jTable1.getModel().getValueAt(row, 3).toString();
            String date = jTable1.getModel().getValueAt(row, 4).toString();
            String level = jTable1.getModel().getValueAt(row, 5).toString();
            String team = jTable1.getModel().getValueAt(row, 6).toString();
            String position = jTable1.getModel().getValueAt(row, 7).toString();
            String email = jTable1.getModel().getValueAt(row, 8).toString();
            String phone = jTable1.getModel().getValueAt(row, 9).toString();
            data.setName(name);
            data.setEmployeeID(id);
            data.setAge(age);
            data.setGender(gender);
            data.setStartDate(date);
            data.setLevel(level);
            data.setTeam(team);
            data.setPosition(position);
            data.setEmail(email);
            data.setPhoneNumber(phone);
            /*if (data.getErrors().size()>0){
                for (String d:data.getErrors()){
                    JOptionPane.showMessageDialog(this, d);
                }
            
            }
            else{
                JOptionPane.showMessageDialog(this, "Data updated with proper  successfully.");
            }*/
            
        }
        else{
            JOptionPane.showMessageDialog(this, "No row selected for updates.");
        }
    }//GEN-LAST:event_UpdateMouseClicked
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel EmployeeIDLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JLabel MailID;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PhoneNumber;
    public javax.swing.JLabel PhotoID;
    private javax.swing.JLabel Position;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JLabel TeamLabel;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Update;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
