/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SignUpPage;

import PrePage.HomePage;
import SignInPage.HospitalSignIn;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pkuhore
 */
public class HospitalSignPage extends javax.swing.JFrame {

    /**
     * Creates new form HospitalSignPage
     */
    public HospitalSignPage() {
        initComponents();
        Connect();
    }
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement unameList;
    
    
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

        jlbltitle = new javax.swing.JLabel();
        jlblusername = new javax.swing.JLabel();
        jlblpassword = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jtxtpassword = new javax.swing.JPasswordField();
        jtxthospitalname = new javax.swing.JTextField();
        jtxthname = new javax.swing.JComboBox<>();
        jtxtrole = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jbtnsignin = new javax.swing.JButton();
        jbtnsignup = new javax.swing.JButton();
        jbthomepage = new javax.swing.JButton();
        jlblsignin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HospitalPage");
        setBackground(new java.awt.Color(204, 204, 255));

        jlbltitle.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jlbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbltitle.setText("Sign Up Your Account");

        jlblusername.setText("User Name :");

        jlblpassword.setText("Password :");

        jtxthospitalname.setText("Hospital Name :");
        jtxthospitalname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxthospitalnameActionPerformed(evt);
            }
        });

        jtxthname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hos1", "Hos2", "Hos3" }));

        jtxtrole.setText("Role:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Nutritionist" }));

        jbtnsignin.setText("Sign In");
        jbtnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsigninActionPerformed(evt);
            }
        });

        jbtnsignup.setText("Sign Up");
        jbtnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsignupActionPerformed(evt);
            }
        });

        jbthomepage.setText("Back to Homepage");
        jbthomepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbthomepageActionPerformed(evt);
            }
        });

        jlblsignin.setText("Already have an account? Please sign in here!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbthomepage))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jlblusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlblpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtxthospitalname)
                                            .addComponent(jtxtrole))
                                        .addGap(108, 108, 108)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtxthname, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtxtpassword, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxtusername, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox2, 0, 206, Short.MAX_VALUE))))))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlblsignin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))))
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbthomepage)
                .addGap(25, 25, 25)
                .addComponent(jlbltitle)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblusername)
                    .addComponent(jtxtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblpassword)
                    .addComponent(jtxtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxthospitalname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxthname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jbtnsignup)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnsignin)
                    .addComponent(jlblsignin))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxthospitalnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxthospitalnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxthospitalnameActionPerformed

    private void jbtnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsigninActionPerformed
        // TODO add your handling code here:
        
        dispose();
        HospitalSignIn hs = new HospitalSignIn();
        hs.setVisible(true);

        
    }//GEN-LAST:event_jbtnsigninActionPerformed

    private void jbtnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsignupActionPerformed
        // TODO add your handling code here:
        
        String uname = jtxtusername.getText();
        String password = jtxtpassword.getText();
        String hname = jtxthname.getSelectedItem().toString();
        String role = jComboBox2.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("insert into hospital(uname,password,hname,role)value(?,?,?,?)");
            String sql = "select * from hospital where uname = ?";
            unameList = con.prepareStatement(sql);
            unameList.setString(1, uname);
            ResultSet rs = unameList.executeQuery();
            
            
 //DataValidation------cannot be null//////////////cannot be same////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (uname == null || uname.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Name.");
                return;}
            else if (!rs.next()){
            } else {
                JOptionPane.showMessageDialog(this, "The Name is Occupied.Please Change one.");
                return;
            }pst.setString(1, uname);
       
            if (password == null || password.trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Input Password.");
                return;
            }pst.setString(2, password);  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        
            pst.setString(3, hname); 
        
            pst.setString(4, role); 
            
       
         
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Successfully Sign Up!");
            
            jtxtusername.setText("");
            jtxtpassword.setText("");
            jtxthname.setSelectedIndex(-1);
            jComboBox2.setSelectedIndex(-1);
            jtxtusername.requestFocus();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(HospitalSignPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
    }//GEN-LAST:event_jbtnsignupActionPerformed

    private void jbthomepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbthomepageActionPerformed
        // TODO add your handling code here:
        dispose();
        HomePage homepage = new HomePage();
        homepage.setTitle("Pet Community");
        homepage.setVisible(true);
    }//GEN-LAST:event_jbthomepageActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalSignPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalSignPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JButton jbthomepage;
    private javax.swing.JButton jbtnsignin;
    private javax.swing.JButton jbtnsignup;
    private javax.swing.JLabel jlblpassword;
    private javax.swing.JLabel jlblsignin;
    private javax.swing.JLabel jlbltitle;
    private javax.swing.JLabel jlblusername;
    private javax.swing.JComboBox<String> jtxthname;
    private javax.swing.JTextField jtxthospitalname;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JTextField jtxtrole;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
