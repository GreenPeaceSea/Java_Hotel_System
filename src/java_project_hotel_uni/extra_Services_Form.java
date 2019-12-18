/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project_hotel_uni;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kom6i
 */
public class extra_Services_Form extends javax.swing.JFrame {
          
    my_SQL_Connect_Class mycon1 = new my_SQL_Connect_Class();
    
    public extra_Services_Form() {
        initComponents();
        
        addingExtraServicesIntoTable(jTable1); 
        extra_services_id_textBox1.setEditable(false);
    }
    
    public void addingExtraServicesIntoTable(JTable myGuestTable) 
    {                        
        String slctQry_1 = "SELECT * FROM `extra_services`";
        try {
            PreparedStatement PrepaSt_1 = mycon1.devConnect().prepareStatement(slctQry_1);
            ResultSet ResSet_1 = PrepaSt_1.executeQuery();
            DefaultTableModel DftTM1 = (DefaultTableModel)myGuestTable.getModel();
            Object[] line;
            while(ResSet_1.next() )
            {
                line = new Object[3]; 
                line[0] = ResSet_1.getInt(1);
                line[1] = ResSet_1.getString(2);
                line[2] = ResSet_1.getInt(3);
                                   
                DftTM1.addRow(line);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuestClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        quantity_Spinner1 = new javax.swing.JSpinner();
        add_btn1 = new javax.swing.JButton();
        update_btn1 = new javax.swing.JButton();
        delete_btn1 = new javax.swing.JButton();
        add_update_delete_textBox1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confirm_btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        price_textBox1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        extra_services_id_textBox1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        delete_from_list_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        add_btn1.setText("Add");
        add_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn1ActionPerformed(evt);
            }
        });

        update_btn1.setText("Update");
        update_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btn1ActionPerformed(evt);
            }
        });

        delete_btn1.setText("DELETE");
        delete_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btn1ActionPerformed(evt);
            }
        });

        add_update_delete_textBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_update_delete_textBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantity :");

        confirm_btn1.setText("Confirm");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price"
            }
        )

    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jLabel2.setText("Name of the extra service:");

    jLabel3.setText("Price :");

    jLabel4.setText("ID :");

    jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
    jLabel5.setText("EXTRA SERVICES");

    jScrollPane2.setViewportView(jList1);

    delete_from_list_btn1.setText("DELETE");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(delete_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(update_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add_update_delete_textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(price_textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(extra_services_id_textBox1)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(confirm_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantity_Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(0, 166, Short.MAX_VALUE)
                            .addComponent(delete_from_list_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25))))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(add_btn1)
                .addComponent(add_update_delete_textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(price_textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(extra_services_id_textBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(delete_from_list_btn1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(update_btn1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(delete_btn1)
                    .addGap(211, 211, 211))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(quantity_Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(confirm_btn1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGap(112, 112, 112))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void add_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn1ActionPerformed
              
        try
        {             
            String nameOfTheService = add_update_delete_textBox1.getText();
            int price = Integer.valueOf(price_textBox1.getText());
                                    
            if(AddingExtraServices(nameOfTheService, price) == true)
            {
                showMessageDialog(null, "You have added a service successfully! ", "Successful", INFORMATION_MESSAGE);
                refresh_table();
            }else
            {
                showMessageDialog(null, "You have NOT added a service successfully! ", "ERROR", ERROR_MESSAGE);
            }
            
        }catch(NumberFormatException e)
        {
            showMessageDialog(null, e.getMessage(), "ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_add_btn1ActionPerformed

    public boolean AddingExtraServices(String name_Service, int price_Service)
    {
        ResultSet RstSt_1 = null;
        String qry = "INSERT INTO `extra_services`(`es_name`, `es_price`) VALUES (?,?)";
        
        try {
            PreparedStatement PpdSt_1 = mycon1.devConnect().prepareStatement(qry);
            
            PpdSt_1.setString(1, name_Service);
            PpdSt_1.setInt(2, price_Service);
                        
            return (PpdSt_1.executeUpdate()>0);            
            
        } catch (SQLException ex) {
            Logger.getLogger(GuestClass.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }                
    }
    
    private void add_update_delete_textBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_update_delete_textBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_update_delete_textBox1ActionPerformed

    private void update_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btn1ActionPerformed
            String nameOfTheService = add_update_delete_textBox1.getText();
            int price = Integer.valueOf(price_textBox1.getText());
            
            if(editingSelectedExtraService(nameOfTheService, price))
            {
                showMessageDialog(null, "You have edited it successfully! ", "Successful", INFORMATION_MESSAGE);
                refresh_table();
            }else
            {
                showMessageDialog(null, "You have NOT edited it successfully! ", "Error", ERROR_MESSAGE);
            }
    }//GEN-LAST:event_update_btn1ActionPerformed

    public boolean editingSelectedExtraService(String name_Service, int price_Service) 
    {

        ResultSet RstSt_1 = null;
        String qry_editingSelectedGuest = String.format("UPDATE `extra_services` SET `es_name`=?,`es_price`=? WHERE `es_id`='%s'", extra_services_id_textBox1.getText());
        
        try {
            PreparedStatement PpdSt_1 = mycon1.devConnect().prepareStatement(qry_editingSelectedGuest);
            
            PpdSt_1.setString(1, name_Service);            
            PpdSt_1.setInt(2, price_Service);
            
            return (PpdSt_1.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GuestClass.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }
    
    private void delete_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btn1ActionPerformed
        int extra_service_id = Integer.valueOf(extra_services_id_textBox1.getText());    
            
        if(delExtraService(extra_service_id))
            {
                showMessageDialog(null, "You have deleted it successfully! ", "Successful", INFORMATION_MESSAGE);
                refresh_table();
            }else
            {
                showMessageDialog(null, "You have NOT deleted it successfully! ", "Error", ERROR_MESSAGE);
            }
    }//GEN-LAST:event_delete_btn1ActionPerformed

    public boolean delExtraService(int extra_ser_id) 
    {        
        ResultSet RstSt_1 = null;
        String qryDELETE = String.format("DELETE FROM `extra_services` WHERE `es_id`='%s'", extra_ser_id);
        
        try {
            PreparedStatement PpdSt_1 = mycon1.devConnect().prepareStatement(qryDELETE);
                        
            PpdSt_1.setInt(1, extra_ser_id);
            
            return (PpdSt_1.executeUpdate() > 0);
            
        } catch (SQLException ex) {
            Logger.getLogger(GuestClass.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel DfTblMl_1 = (DefaultTableModel)jTable1.getModel();

        int selectedLine = jTable1.getSelectedRow();
        
        extra_services_id_textBox1.setText(DfTblMl_1.getValueAt(selectedLine, 0).toString());
        add_update_delete_textBox1.setText(DfTblMl_1.getValueAt(selectedLine, 1).toString());
        price_textBox1.setText(DfTblMl_1.getValueAt(selectedLine, 2).toString());

        // String isRes = DfTblMl_1.getValueAt(selectedLine, 3).toString();
        
    }//GEN-LAST:event_jTable1MouseClicked

    // Refresh table method
    private void refresh_table(){                                                   
       jTable1.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Price"})); 
        
       addingExtraServicesIntoTable(jTable1);
    } 
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(extra_Services_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(extra_Services_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(extra_Services_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(extra_Services_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new extra_Services_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn1;
    private javax.swing.JTextField add_update_delete_textBox1;
    private javax.swing.JButton confirm_btn1;
    private javax.swing.JButton delete_btn1;
    private javax.swing.JButton delete_from_list_btn1;
    private javax.swing.JTextField extra_services_id_textBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField price_textBox1;
    private javax.swing.JSpinner quantity_Spinner1;
    private javax.swing.JButton update_btn1;
    // End of variables declaration//GEN-END:variables
}
