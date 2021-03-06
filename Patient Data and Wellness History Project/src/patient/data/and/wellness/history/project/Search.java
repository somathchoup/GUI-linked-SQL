package patient.data.and.wellness.history.project;

/**
 * @author Somath
 */

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static patient.data.and.wellness.history.project.Login.con;

public class Search extends javax.swing.JFrame {

    private String[] args;
    private Statement stmt;
    public String columnValue;
    ArrayList<String> info = new ArrayList<String>();
    
    // Create an ArrayList that holds references to String
    PatientInformation list = new PatientInformation();
   
    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlblSearch = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtLast = new javax.swing.JTextField();
        txtFirst = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Search");
        setName("framePatient"); // NOI18N

        JlblSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlblSearch.setText("Patient Search Screen");
        JlblSearch.setToolTipText("");
        JlblSearch.setName(""); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        txtLast.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLast.setToolTipText("Enter Patient First Name");
        txtLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastActionPerformed(evt);
            }
        });

        txtFirst.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFirst.setToolTipText("Enter Patient First Name");

        jLabel1.setText("Last Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(29, 29, 29)
                        .addComponent(btnLogout)
                        .addGap(33, 33, 33)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnLogout)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        txtLast.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JlblSearch)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showMessageDialog(null,"Exiting Applicaion", "Exit",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            // TODO add your handling code here:          
            String lastName = txtLast.getText();
            String firstName = txtFirst.getText();
            String query = null;
        
            // Decides which name is present
            if (lastName.isEmpty() && firstName.isEmpty()){
                System.out.println("BOTH EMPTY");
                JOptionPane.showMessageDialog(null, "Please enter either last or first name.", "Retry",JOptionPane.INFORMATION_MESSAGE);
              
            }
            else if (lastName.isEmpty()) {
                System.out.println("LAST EMPTY");
                
                //Creates query
                query = "SELECT * FROM patient WHERE FirstName = '" + firstName +"'";
                
                         // getting Statement object to execute query
                stmt = con.createStatement();
                
                // executing SELECT query
                ResultSet rs = stmt.executeQuery(query);        
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                while (rs.next()) {
                    for (int i = 0; i <= columnsNumber; i++) {
                        if (i > 0) {
                            columnValue = rs.getString(i);                            
                            info.add("\"" + columnValue + "\"");
                        }
                    }                               
                }
                if (info.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No Patient Found.");
                }
                else if (info.size() > 10) {
                    JOptionPane.showMessageDialog(null, "Duplicate names, retry.");
                    
                    new Search().setVisible(true);
                    setVisible(false); 
                }
                    else{                
                        list.setInformation(info);     
                        new controlPanel(list.getInformation()).setVisible(true);            
                        setVisible(false); 
                    }
            }
                     
            else if (firstName.isEmpty()) {
                System.out.println("FIRST IS empty");
      
                //Creates query
                query = "SELECT * FROM patient WHERE LastName ='"+ lastName + "'";
                
                // getting Statement object to execute query
                stmt = con.createStatement();
                
                // executing SELECT query
                ResultSet rs = stmt.executeQuery(query);        
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                while (rs.next()) {
                    for (int i = 0; i <= columnsNumber; i++) {
                        if (i > 0) {
                            String columnValue = rs.getString(i);                  
                            info.add("\"" + columnValue + "\"");
                        }
                    }                   
                }
                    if (info.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No Patient Found.");
                    }
                    
                    else if (info.size() > 10) {
                    JOptionPane.showMessageDialog(null, "Duplicate names, retry.");
                    new Search().setVisible(true);
                    setVisible(false); 
                    }
                    else{                                          
                            list.setInformation(info);     
                            new controlPanel(list.getInformation()).setVisible(true);            
                            setVisible(false);  
                    }
            }
            else {            
                //Creates query
                query = "SELECT * FROM patient WHERE FirstName = '" + firstName + "' AND LastName ='"+ lastName + "'";
                // getting Statement object to execute query
                stmt = con.createStatement(); 
                // executing SELECT query
                ResultSet rs = stmt.executeQuery(query);        
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();          
                while (rs.next()) {
                    for (int i = 0; i <= columnsNumber; i++) {
                        if (i > 0) {
                            String columnValue = rs.getString(i); 
                            info.add("\"" + columnValue + "\"");                                  
                        } 
                    }
                }              
                if (info.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No Patient Found.");
                }
                else{                
                    list.setInformation(info);     
                    new controlPanel(list.getInformation()).setVisible(true);
                    setVisible(false);
                }                        
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Retry",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e) {
             JOptionPane.showMessageDialog(null, e, "Retry",JOptionPane.INFORMATION_MESSAGE);
        }  
    }//GEN-LAST:event_btnSearchActionPerformed
  
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:       
        
        JOptionPane.showMessageDialog(null, "Logging Out", "Logging Out",JOptionPane.INFORMATION_MESSAGE);
        PatientDataAndWellnessHistoryProject.main(args);
        Login field= new Login();
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlblSearch;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtLast;
    // End of variables declaration//GEN-END:variables
}

