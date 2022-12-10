/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NutriPage;

import SignUpPage.UserSignPage;
import UserPage.UserRecipe;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author iris
 */
public class NutriRecipe_1 extends javax.swing.JFrame {

    /**
     * Creates new form NutriRecipe
     */
    public NutriRecipe_1() {
        initComponents();
        Connect();
        recipe_table ();
    }
    
    public NutriRecipe_1(int id, String uname, String role) {
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
    
    
    public void recipe_table ()
    {
        try {
            pst = con.prepareStatement("select * from recipe");
            rs = pst.executeQuery();
        
            ResultSetMetaData Rsm = (ResultSetMetaData)rs.getMetaData();
            int c;
             c = Rsm.getColumnCount();
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            
            while(rs.next()) 
            {
                Vector v2 = new Vector();
                
                for(int i = 1; i <= c; i++) 
                
                {
                    v2.add(rs.getString("recipeno"));
                    v2.add(rs.getString("pname"));
                    v2.add(rs.getString("page"));
                    v2.add(rs.getString("ptype"));
                    v2.add(rs.getString("meat"));
                    v2.add(rs.getString("bone"));
                    v2.add(rs.getString("liver"));
                    v2.add(rs.getString("organ"));
                    v2.add(rs.getString("veg"));
                    v2.add(rs.getString("seed"));
                    v2.add(rs.getString("fruit"));
                    v2.add(rs.getString("supplement"));
                    v2.add(rs.getString("org1_comment"));                    

                }
                
                model.addRow(v2);
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserRecipe.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblpname = new javax.swing.JLabel();
        lblage = new javax.swing.JLabel();
        lblptype = new javax.swing.JLabel();
        lblmeat = new javax.swing.JLabel();
        lblbone = new javax.swing.JLabel();
        lblliver = new javax.swing.JLabel();
        lblorgan = new javax.swing.JLabel();
        lblveg = new javax.swing.JLabel();
        lblseed = new javax.swing.JLabel();
        lblfruit = new javax.swing.JLabel();
        lblsup = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        rdbdog = new javax.swing.JRadioButton();
        rdbcat = new javax.swing.JRadioButton();
        txtmeat = new javax.swing.JTextField();
        txtbone = new javax.swing.JTextField();
        txtliver = new javax.swing.JTextField();
        txtorgan = new javax.swing.JTextField();
        txtveg = new javax.swing.JTextField();
        txtseed = new javax.swing.JTextField();
        txtfruit = new javax.swing.JTextField();
        cbkale = new javax.swing.JCheckBox();
        cbvb = new javax.swing.JCheckBox();
        cbzinc = new javax.swing.JCheckBox();
        lblcomment1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcomment1 = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Review Food Recipe");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Recipe No", "Pet Name", "Pet Age", "Pet Type", "Muscle Meat", "Raw Bone", "Liver", "Other Organs", "Vegetables", "Seeds", "Fruit", "Supplement", "Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblpname.setText("Pet Name:");

        lblage.setText("Pet Age:");

        lblptype.setText("Pet Type:");

        lblmeat.setText("Muscle Meat:");

        lblbone.setText("Raw Bone:");

        lblliver.setText("Liver:");

        lblorgan.setText("Secreting Organs:");

        lblveg.setText("Vegetables:");

        lblseed.setText("Seeds or Nuts:");

        lblfruit.setText("Fruit:");

        lblsup.setText("Supplement:");

        txtpname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpnameMouseClicked(evt);
            }
        });

        txtage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtageMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdbdog);
        rdbdog.setText("Dog");
        rdbdog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbdogMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdbdogMousePressed(evt);
            }
        });

        buttonGroup1.add(rdbcat);
        rdbcat.setText("Cat");
        rdbcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbcatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rdbcatMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rdbcatMouseReleased(evt);
            }
        });

        txtmeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmeatMouseClicked(evt);
            }
        });

        txtbone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtboneMouseClicked(evt);
            }
        });

        txtliver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtliverMouseClicked(evt);
            }
        });

        txtorgan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtorganMouseClicked(evt);
            }
        });

        txtveg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtvegMouseClicked(evt);
            }
        });

        txtseed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtseedMouseClicked(evt);
            }
        });

        txtfruit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfruitMouseClicked(evt);
            }
        });

        cbkale.setText("Kale");
        cbkale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbkaleMousePressed(evt);
            }
        });

        cbvb.setText("Vitamin B");
        cbvb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbvbMousePressed(evt);
            }
        });

        cbzinc.setText("Zinc");
        cbzinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbzincMousePressed(evt);
            }
        });

        lblcomment1.setText("Write Your Comment Here:");

        txtcomment1.setColumns(20);
        txtcomment1.setRows(5);
        txtcomment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcomment1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtcomment1);

        btnadd.setText("Submit");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnback.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(365, 365, 365))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpname)
                            .addComponent(lblmeat)
                            .addComponent(lblage)
                            .addComponent(lblptype)
                            .addComponent(lblbone)
                            .addComponent(lblliver))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbdog, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdbcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(255, 255, 255))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtmeat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(txtbone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtpname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtliver, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblsup)
                            .addComponent(lblseed)
                            .addComponent(lblfruit)
                            .addComponent(lblcomment1)
                            .addComponent(lblorgan)
                            .addComponent(lblveg))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnback))
                            .addComponent(txtorgan)
                            .addComponent(txtveg)
                            .addComponent(txtseed)
                            .addComponent(txtfruit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbkale)
                                .addGap(18, 18, 18)
                                .addComponent(cbvb)
                                .addGap(18, 18, 18)
                                .addComponent(cbzinc))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblage)
                                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblpname)
                                .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblptype)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdbdog)
                                .addComponent(rdbcat)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblmeat)
                            .addComponent(txtmeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtbone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lblbone))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblorgan)
                            .addComponent(txtorgan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblveg)
                            .addComponent(txtveg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblseed)
                            .addComponent(txtseed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfruit)
                            .addComponent(txtfruit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblsup)
                            .addComponent(cbkale)
                            .addComponent(cbvb)
                            .addComponent(cbzinc))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblliver)
                            .addComponent(txtliver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcomment1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnback))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();

        txtpname.setText(model.getValueAt(SelectIndex, 1).toString());
        txtage.setText(model.getValueAt(SelectIndex, 2).toString());

        String ptype = model.getValueAt(SelectIndex, 3).toString();
        if (ptype.equals("Dog")){

            rdbdog.setSelected(true);

        }
        else{

            rdbcat.setSelected(true);

        }

        txtmeat.setText(model.getValueAt(SelectIndex, 4).toString());
        txtbone.setText(model.getValueAt(SelectIndex, 5).toString());
        txtliver.setText(model.getValueAt(SelectIndex, 6).toString());
        txtorgan.setText(model.getValueAt(SelectIndex, 7).toString());
        txtveg.setText(model.getValueAt(SelectIndex, 8).toString());
        txtseed.setText(model.getValueAt(SelectIndex, 9).toString());
        txtfruit.setText(model.getValueAt(SelectIndex, 10).toString());

        String supplement = model.getValueAt(SelectIndex, 11).toString();
        switch(supplement){

            case "Kale " :
            cbkale.setSelected(true);
            cbvb.setSelected(false);
            cbzinc.setSelected(false);
            break;

            case "Vitamin B " :
            cbkale.setSelected(false);
            cbvb.setSelected(true);
            cbzinc.setSelected(false);
            break;

            case "Zinc " :
            cbkale.setSelected(false);
            cbvb.setSelected(false);
            cbzinc.setSelected(true);
            break;

            case "Kale Vitamin B " :
            cbkale.setSelected(true);
            cbvb.setSelected(true);
            cbzinc.setSelected(false);
            break;

            case "Kale Zinc " :
            cbkale.setSelected(true);
            cbvb.setSelected(false);
            cbzinc.setSelected(true);
            break;

            case "Vitamin B Zinc " :
            cbkale.setSelected(false);
            cbvb.setSelected(true);
            cbzinc.setSelected(true);
            break;

            default :
            cbkale.setSelected(true);
            cbvb.setSelected(true);
            cbzinc.setSelected(true);
            break;

        }
        
        txtcomment1.setText(model.getValueAt(SelectIndex, 12).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
        
        String org1_comment = txtcomment1.getText();
        
        try {
            pst = con.prepareStatement("update recipe set org1_comment = ? where recipeno = ?");
            
            int recipeno = Integer.parseInt(model.getValueAt(SelectIndex, 0).toString());
            
            pst.setString(1, org1_comment);
            pst.setInt(2, recipeno);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Comment Submitted!");
            
            txtpname.setText("");
            txtage.setText("");
            buttonGroup1.clearSelection();
            txtmeat.setText("");
            txtbone.setText("");
            txtliver.setText("");
            txtorgan.setText("");
            txtveg.setText("");
            txtseed.setText("");
            txtfruit.setText("");
            cbkale.setSelected(false);
            cbvb.setSelected(false);
            cbzinc.setSelected(false);
            txtcomment1.setText("");
            txtcomment1.requestFocus();
            
            recipe_table ();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(NutriRecipe_1.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnaddActionPerformed

    private void txtpnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpnameMouseClicked
        // TODO add your handling code here:
        txtpname.setEditable(false);
    }//GEN-LAST:event_txtpnameMouseClicked

    private void txtcomment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcomment1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomment1MouseClicked

    private void txtageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtageMouseClicked
        // TODO add your handling code here:
        txtage.setEditable(false);
    }//GEN-LAST:event_txtageMouseClicked

    private void rdbdogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbdogMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rdbdogMouseClicked

    private void rdbcatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbcatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbcatMouseClicked

    private void rdbdogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbdogMousePressed
        // TODO add your handling code here:
        rdbdog.setEnabled(false);
    }//GEN-LAST:event_rdbdogMousePressed

    private void rdbcatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbcatMousePressed
        // TODO add your handling code here:
        rdbcat.setEnabled(false);
    }//GEN-LAST:event_rdbcatMousePressed

    private void rdbcatMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbcatMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbcatMouseReleased

    private void txtmeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmeatMouseClicked
        // TODO add your handling code here:
        txtmeat.setEditable(false);
    }//GEN-LAST:event_txtmeatMouseClicked

    private void txtboneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtboneMouseClicked
        // TODO add your handling code here:
        txtbone.setEditable(false);
    }//GEN-LAST:event_txtboneMouseClicked

    private void txtliverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtliverMouseClicked
        // TODO add your handling code here:
        txtliver.setEditable(false);
    }//GEN-LAST:event_txtliverMouseClicked

    private void txtorganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtorganMouseClicked
        // TODO add your handling code here:
        txtorgan.setEditable(false);
    }//GEN-LAST:event_txtorganMouseClicked

    private void txtvegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtvegMouseClicked
        // TODO add your handling code here:
        txtveg.setEditable(false);
    }//GEN-LAST:event_txtvegMouseClicked

    private void txtseedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtseedMouseClicked
        // TODO add your handling code here:
        txtseed.setEditable(false);
    }//GEN-LAST:event_txtseedMouseClicked

    private void txtfruitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfruitMouseClicked
        // TODO add your handling code here:
        txtfruit.setEditable(false);
    }//GEN-LAST:event_txtfruitMouseClicked

    private void cbkaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbkaleMousePressed
        // TODO add your handling code here:
        cbkale.setEnabled(false);
    }//GEN-LAST:event_cbkaleMousePressed

    private void cbvbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbvbMousePressed
        // TODO add your handling code here:
        cbvb.setEnabled(false);
    }//GEN-LAST:event_cbvbMousePressed

    private void cbzincMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbzincMousePressed
        // TODO add your handling code here:
        cbzinc.setEnabled(false);
    }//GEN-LAST:event_cbzincMousePressed

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
            java.util.logging.Logger.getLogger(NutriRecipe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NutriRecipe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NutriRecipe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NutriRecipe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutriRecipe_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbkale;
    private javax.swing.JCheckBox cbvb;
    private javax.swing.JCheckBox cbzinc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblbone;
    private javax.swing.JLabel lblcomment1;
    private javax.swing.JLabel lblfruit;
    private javax.swing.JLabel lblliver;
    private javax.swing.JLabel lblmeat;
    private javax.swing.JLabel lblorgan;
    private javax.swing.JLabel lblpname;
    private javax.swing.JLabel lblptype;
    private javax.swing.JLabel lblseed;
    private javax.swing.JLabel lblsup;
    private javax.swing.JLabel lblveg;
    private javax.swing.JRadioButton rdbcat;
    private javax.swing.JRadioButton rdbdog;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbone;
    private javax.swing.JTextArea txtcomment1;
    private javax.swing.JTextField txtfruit;
    private javax.swing.JTextField txtliver;
    private javax.swing.JTextField txtmeat;
    private javax.swing.JTextField txtorgan;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtseed;
    private javax.swing.JTextField txtveg;
    // End of variables declaration//GEN-END:variables
}
