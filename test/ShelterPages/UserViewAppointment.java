/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ShelterPages;

/**
 *
 * @author pkuhore
 */

import SignUpPage.UserSignPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import UserPage.UserRecipe;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.Statement;


public class UserViewAppointment extends javax.swing.JFrame {

    /**
     * Creates new form UserViewAppointment
     */
    public UserViewAppointment() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        Connect();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    PreparedStatement idList;
    
    
    public void Connect() 
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserSignPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserSignPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jlblinput = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlblinput.setText("Input your ID to check your appointment");

        jtxtarea.setColumns(20);
        jtxtarea.setRows(5);
        jScrollPane1.setViewportView(jtxtarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jlblinput, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jtxtid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jlblinput)
                    .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id = jtxtid.getText();
//        System.out.println(id);
        Connection conn =null;
        Statement stmt =null;
        
        try {
            
            
            String sql = "select * from appointment where id = ?";
            idList = con.prepareStatement(sql);
            idList.setString(1, id);
            ResultSet rs = idList.executeQuery();
            
            
          if (rs.next()){
              
              jtxtarea.setText("***********YOUR APPOINTMENT******************");
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "NAME: "+ rs.getString("name"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "ID: "+rs.getString("id"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "GENDER: "+rs.getString("gender"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "AGE: "+rs.getString("age"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "PHONE: "+rs.getString("phonenumber"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "ADDRESS: "+rs.getString("homeaddress"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "PET NAME: "+rs.getString("shelterpetname"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "ORGANIZE: "+rs.getString("organize"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "APPOINTMENT STATUS: "+rs.getString("appointmentstatus"));
              jtxtarea.setText(jtxtarea.getText() + "\n"+ "******************Welcome!!!********************");
              
               System.out.println(rs.getString("homeaddress"));
              
            } else {
              
               JOptionPane.showMessageDialog(null, "You didn't make an appointment!");
            }
            
            
//            rs = pst.executeQuery();
//            
//            while(rs.next())
//            {
//                System.out.println(rs.getString("id"));
//                System.out.println(rs.getString("运行啦"));
//            
//            }
            
//            else
//            {
//                JOptionPane.showMessageDialog(this, "You didn't make an appoinment before.");
//               
//               
//            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserViewAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblinput;
    private javax.swing.JTextArea jtxtarea;
    private javax.swing.JTextField jtxtid;
    // End of variables declaration//GEN-END:variables
}
