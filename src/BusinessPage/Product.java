/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BusinessPage;

import SignUpPage.UserSignPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Tool.JTextFieldHintListener;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author iris
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        Connect();
        product_table ();
    }
    
    public Product(int id, String uname, String role) {
        initComponents();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    
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
    
    public void product_table ()
    {
        try {
            pst = con.prepareStatement("select * from product");
            rs = pst.executeQuery();
        
            ResultSetMetaData Rsm = (ResultSetMetaData)rs.getMetaData();
            int c;
             c = Rsm.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)productTable.getModel();
            model.setRowCount(0);
            
            while(rs.next()) 
            {
                Vector v2 = new Vector();
                
                for(int i = 1; i <= c; i++) 
                
                {
                    v2.add(rs.getString("product_id"));
                    v2.add(rs.getString("product_name"));
                    v2.add(rs.getString("descri"));
                    v2.add(rs.getString("category"));
                    v2.add(rs.getString("cost"));
                    v2.add(rs.getDouble("price"));
                    v2.add(rs.getString("qty"));
                    v2.add(rs.getString("barcode"));
                    v2.add(rs.getString("status"));
 
                }
                
                model.addRow(v2);

            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblproname = new javax.swing.JLabel();
        lbldesc = new javax.swing.JLabel();
        lblcateg = new javax.swing.JLabel();
        lblprice = new javax.swing.JLabel();
        lblqty = new javax.swing.JLabel();
        lblbarcode = new javax.swing.JLabel();
        txtproname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        txtcateg = new javax.swing.JComboBox<>();
        lblcost = new javax.swing.JLabel();
        txtcost = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtbarcode = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox<>();
        btnreset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        lblsearch = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Product");

        lblproname.setText("Product Name:");

        lbldesc.setText("Description:");

        lblcateg.setText("Category:");

        lblprice.setText("Retail Price:");

        lblqty.setText("Qty:");

        lblbarcode.setText("Barcode:");

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        txtcateg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muscle Meat", "Raw Bone", "Liver", "Organ", "Vegetable", "Seed", "Fruit", "Supplement" }));

        lblcost.setText("Cost Price:");

        txtbarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbarcodeActionPerformed(evt);
            }
        });

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Status:");

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblproname))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcateg)
                                    .addComponent(lbldesc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcost))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcateg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcost)
                            .addComponent(txtproname))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblprice)
                            .addComponent(lblqty)
                            .addComponent(lblbarcode)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtprice)
                                .addComponent(txtqty)
                                .addComponent(txtbarcode, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(424, 424, 424)
                        .addComponent(btnadd)
                        .addGap(18, 18, 18)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblproname)
                    .addComponent(lblprice)
                    .addComponent(txtproname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldesc))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblqty)
                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcateg)
                            .addComponent(txtcateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbarcode)
                            .addComponent(txtbarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcost)
                    .addComponent(txtcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnedit)
                    .addComponent(btndelete)
                    .addComponent(btnreset))
                .addGap(14, 14, 14))
        );

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Product Name", "Description", "Category", "Cost Price", "Retail Price", "Qty", "Barcode", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(productTable);

        lblsearch.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblsearch.setText("Search:");

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(390, 390, 390))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(213, 213, 213)
                            .addComponent(lblsearch)
                            .addGap(42, 42, 42)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsearch)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbarcodeActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
 
        
        if("".equals(txtproname.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input the product name");
        
        }
        else if("".equals(txtdesc.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input the descripton of the product");
        
        }
        else if("".equals(txtcateg.getSelectedItem().toString())){
                
                 JOptionPane.showMessageDialog(this, "Please select a category");
                
                }
        else if("".equals(txtcost.getText().trim())){
            JOptionPane.showMessageDialog(this, "Please input the cost price");
        }
        else if("".equals(txtprice.getText().trim())){
                
                 JOptionPane.showMessageDialog(this, "Please input the retail price");
                
                }
        else if("".equals(txtqty.getText().trim())){
                
                 JOptionPane.showMessageDialog(this, "Please input the qty");
                
                }
        else if("".equals(txtbarcode.getText().trim())){
                
                 JOptionPane.showMessageDialog(this, "Please input the barcode");
                
                }
        
        else if("".equals(txtstatus.getSelectedItem().toString().trim())){
        
            JOptionPane.showMessageDialog(this, "Please select the status");
        
        }
        
        else{
        
        try {
            
            System.out.println("结果是"+txtproname.getText());
            pst = con.prepareStatement("insert into product (product_name,descri,category,cost,price,qty,barcode,status)values(?,?,?,?,?,?,?,?)");
            
            pst.setString(1,txtproname.getText());
            pst.setString(2, txtdesc.getText());
            pst.setString(3, txtcateg.getSelectedItem().toString());
            pst.setInt(4, Integer.parseInt(txtcost.getText()));
            pst.setDouble(5, Double.parseDouble(txtprice.getText()));
            pst.setInt(6, Integer.parseInt(txtqty.getText()));
            pst.setString(7, txtbarcode.getText());
            pst.setString(8, txtstatus.getSelectedItem().toString());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Add Successfully!");
            
            txtproname.setText("");
            txtdesc.setText("");
            txtcateg.setSelectedIndex(0);
            txtcost.setText("");
            txtprice.setText("");
            txtqty.setText("");
            txtbarcode.setText("");
            txtstatus.setSelectedIndex(0);
            txtproname.requestFocus();
            
            product_table ();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

        }    
        
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        int SelectIndex = productTable.getSelectedRow();
        
        String product_name = txtproname.getText();
        String descri = txtdesc.getText();
        String category = txtcateg.getSelectedItem().toString();
        int cost = Integer.parseInt(txtcost.getText());
        double price = Double.parseDouble(txtprice.getText());
        int qty = Integer.parseInt(txtqty.getText());
        String barcode = txtbarcode.getText();
        String status = txtstatus.getSelectedItem().toString();
        
        try {
            pst = con.prepareStatement("update product set product_name = ?, descri = ?, category = ?, cost = ?, price = ?, qty = ?, barcode = ?, status = ? where product_id= ?");
            
            int product_id = Integer.parseInt(model.getValueAt(SelectIndex, 0).toString());
            
            pst.setString(1, product_name);
            pst.setString(2, descri);
            pst.setString(3, category);
            pst.setInt(4, cost);
            pst.setDouble(5, price);
            pst.setInt(6, qty);
            pst.setString(7, barcode);
            pst.setString(8, status);
            pst.setInt(9, product_id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Product Information Edited!");
            
            txtproname.setText("");
            txtdesc.setText("");
            txtcateg.setSelectedIndex(0);
            txtcost.setText("");
            txtprice.setText("");
            txtqty.setText("");
            txtbarcode.setText("");
            txtstatus.setSelectedIndex(0);
            txtproname.requestFocus();
            
            product_table ();
            
            btnadd.setEnabled(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_btneditActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        int SelectIndex = productTable.getSelectedRow();
        
        txtproname.setText(model.getValueAt(SelectIndex, 1).toString());
        txtdesc.setText(model.getValueAt(SelectIndex, 2).toString());
        txtcateg.setSelectedItem(model.getValueAt(SelectIndex, 3).toString());
        txtcost.setText(model.getValueAt(SelectIndex, 4).toString());
        txtprice.setText(model.getValueAt(SelectIndex, 5).toString());
        txtqty.setText(model.getValueAt(SelectIndex, 6).toString());
        txtbarcode.setText(model.getValueAt(SelectIndex, 7).toString());
        txtstatus.setSelectedItem(model.getValueAt(SelectIndex, 8).toString());
        
        btnadd.setEnabled(false);

    }//GEN-LAST:event_productTableMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete it ?", "Delete",JOptionPane.YES_NO_OPTION);
        
        if (opt==0){
            DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        int SelectIndex = productTable.getSelectedRow();
        
        try {
            pst = con.prepareStatement("delete from product where product_id = ?");
            
            int product_id = Integer.parseInt(model.getValueAt(SelectIndex, 0).toString());
            
            pst.setInt(1, product_id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Product Information Deleted!");
            
            txtproname.setText("");
            txtdesc.setText("");
            txtcateg.setSelectedIndex(0);
            txtcost.setText("");
            txtprice.setText("");
            txtqty.setText("");
            txtbarcode.setText("");
            txtstatus.setSelectedIndex(0);
            txtproname.requestFocus();
            
            product_table ();
            
            btnadd.setEnabled(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        }
 
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        productTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtsearch.getText()));
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        
        txtproname.setText("");
        txtdesc.setText("");
        txtcateg.setSelectedIndex(0);
        txtcost.setText("");
        txtprice.setText("");
        txtqty.setText("");
        txtbarcode.setText("");
        txtstatus.setSelectedIndex(0);
        txtproname.requestFocus();
            
        product_table ();
            
        btnadd.setEnabled(true);
        
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblbarcode;
    private javax.swing.JLabel lblcateg;
    private javax.swing.JLabel lblcost;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblproname;
    private javax.swing.JLabel lblqty;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField txtbarcode;
    private javax.swing.JComboBox<String> txtcateg;
    private javax.swing.JTextField txtcost;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproname;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JComboBox<String> txtstatus;
    // End of variables declaration//GEN-END:variables
}
