/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PrePage;

import SignUpPage.BussinessSignPage;
import SignUpPage.HospitalSignPage;
import SignUpPage.UserSignPage;
import SignUpPage.AnimalShelterSignPage;

/**
 *
 * @author pkuhore
 */
public class HomePage extends javax.swing.JFrame {
    

    /**
     * Creates new form FirstPage
     */
    public HomePage() {
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

        jPanel1 = new javax.swing.JPanel();
        jbtnmaster = new javax.swing.JButton();
        jbtnhospital = new javax.swing.JButton();
        jbtnbussiness = new javax.swing.JButton();
        jbtnstray = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnmaster.setText("User");
        jbtnmaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmasterActionPerformed(evt);
            }
        });

        jbtnhospital.setText("Hospital");
        jbtnhospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnhospitalActionPerformed(evt);
            }
        });

        jbtnbussiness.setText("Bussiness");
        jbtnbussiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbussinessActionPerformed(evt);
            }
        });

        jbtnstray.setText("Animal Shelter");
        jbtnstray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnstrayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnbussiness, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jbtnmaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jbtnhospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jbtnstray)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnmaster)
                    .addComponent(jbtnhospital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnbussiness)
                    .addComponent(jbtnstray))
                .addGap(214, 214, 214))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnmasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmasterActionPerformed
        // TODO add your handling code here:
        dispose();
        UserSignPage mastersignpage = new UserSignPage();
        mastersignpage.setTitle("User Sign");
        mastersignpage.setVisible(true);
    }//GEN-LAST:event_jbtnmasterActionPerformed

    private void jbtnhospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnhospitalActionPerformed
        // TODO add your handling code here:
        dispose();
        HospitalSignPage hospitalsignpage = new HospitalSignPage();
        hospitalsignpage.setTitle("Hospital Sign");
        hospitalsignpage.setVisible(true);
    }//GEN-LAST:event_jbtnhospitalActionPerformed

    private void jbtnbussinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbussinessActionPerformed
        // TODO add your handling code here:
        dispose();
        BussinessSignPage bussinesssignpage = new BussinessSignPage();
        bussinesssignpage.setTitle("Bussiness Sign");
        bussinesssignpage.setVisible(true);
    }//GEN-LAST:event_jbtnbussinessActionPerformed

    private void jbtnstrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnstrayActionPerformed
        // TODO add your handling code here:
        dispose();
        AnimalShelterSignPage strayanimalssignpage = new AnimalShelterSignPage();
        strayanimalssignpage.setTitle("Shelter Sign");
        strayanimalssignpage.setVisible(true);
    }//GEN-LAST:event_jbtnstrayActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            HomePage firstpage = new HomePage();
            firstpage.setTitle("Pet Community");
            firstpage.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnbussiness;
    private javax.swing.JButton jbtnhospital;
    private javax.swing.JButton jbtnmaster;
    private javax.swing.JButton jbtnstray;
    // End of variables declaration//GEN-END:variables
}
