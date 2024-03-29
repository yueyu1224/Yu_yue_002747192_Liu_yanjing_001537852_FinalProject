/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ShelterPages;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pkuhore
 */
public class Org1VolunteerPage extends javax.swing.JFrame {

    /**
     * Creates new form VolunteerPage
     */
    
    String gender;
    String spay;
    String disabled;
    String vaccination;
    String filename = null;
    byte[] strayanimals_image = null;
    
    
    public Org1VolunteerPage() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        show_strayanimals();
        show_appointment();
    }
    
    public ArrayList<StrayAnimals> strayanimalsList(){
        ArrayList<StrayAnimals> strayanimalsList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query1 = "SELECT * FROM strayanimals";
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(query1);
            
            StrayAnimals strayanimals;
            
            while(rs.next()){
            
                strayanimals = new StrayAnimals(rs.getInt("sno"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getDate("time_arrive"),rs.getString("spay"),rs.getString("disabled"),rs.getString("vaccination"),rs.getString("organization"),rs.getString("pettype"),rs.getBytes("images"));
                strayanimalsList.add(strayanimals);
            
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return strayanimalsList;
        
    }
    
     public ArrayList<Appointment> appointmentList(){
        ArrayList<Appointment> appointmentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query1 = "SELECT * FROM appointment";
            Statement st = con.createStatement();
            ResultSet rs =st.executeQuery(query1);
            
            Appointment appointment;
            
            while(rs.next()){
            
                appointment = new Appointment(rs.getInt("ano"),rs.getString("name"),rs.getString("id"),rs.getString("gender"),rs.getInt("age"),rs.getString("haveorhadpet"),rs.getString("numberofpet"),rs.getString("pettypenow"),rs.getString("phonenumber"),rs.getString("homeaddress"),rs.getString("shelterpetname"),rs.getString("organization"),rs.getString("appointmentstatus"));
                appointmentList.add(appointment);
            
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        return appointmentList;
        
    }
    
    public void show_strayanimals(){
    
        ArrayList<StrayAnimals> list = strayanimalsList();
        DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals3.getModel();
        Object[] row = new Object[10];
        for (int i=0; i<list.size();i++){
        
            row[0] = list.get(i).getSno();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getGender();
            row[3] = list.get(i).getAge();
            row[4] = list.get(i).getTime_Arrive();
            row[5] = list.get(i).getSpay();
            row[6] = list.get(i).getDisabled();
            row[7] = list.get(i).getVaccination();
            row[8]= list.get(i).getOrganization();
            row[9]= list.get(i).getPettype();
            model.addRow(row);
        }
    
        
    }
    
     public void show_appointment(){
    
        ArrayList<Appointment> list = appointmentList();
        DefaultTableModel model = (DefaultTableModel)jtb_display_appointment.getModel();
        Object[] row = new Object[13];
        for (int i=0; i<list.size();i++){
        
            row[0] = list.get(i).getAno();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getId();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getAge();
            row[5] = list.get(i).getHaveorhadpet();
            row[6] = list.get(i).getNumberofpet();
            row[7] = list.get(i).getPettypenow();
            row[8]= list.get(i).getPhonenumber();
            row[9]= list.get(i).getHomeaddress();
            row[10]= list.get(i).getShelterpetname();
            row[11]= list.get(i).getOrganization();
            row[12]= list.get(i).getAppointmentstatus();
            model.addRow(row);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlblname3 = new javax.swing.JLabel();
        jtxtname3 = new javax.swing.JTextField();
        jlblgender3 = new javax.swing.JLabel();
        jbtnfemale3 = new javax.swing.JRadioButton();
        jbtnmale3 = new javax.swing.JRadioButton();
        jlblage3 = new javax.swing.JLabel();
        jtxtage3 = new javax.swing.JTextField();
        jlbltimearrive3 = new javax.swing.JLabel();
        jdctimearrive3 = new com.toedter.calendar.JDateChooser();
        jlblspay3 = new javax.swing.JLabel();
        jbtnyes3 = new javax.swing.JRadioButton();
        jbtnno3 = new javax.swing.JRadioButton();
        jlbldisabled3 = new javax.swing.JLabel();
        jbtndyes3 = new javax.swing.JRadioButton();
        jbtndno3 = new javax.swing.JRadioButton();
        jlblvacci3 = new javax.swing.JLabel();
        jbtnvyes3 = new javax.swing.JRadioButton();
        jbtnvno3 = new javax.swing.JRadioButton();
        jlblpettype3 = new javax.swing.JLabel();
        jtxtpettype3 = new javax.swing.JTextField();
        jbtnsave3 = new javax.swing.JButton();
        jbtnreset3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtb_display_strayanimals3 = new javax.swing.JTable();
        jbtnupdate3 = new javax.swing.JButton();
        jbtndelete3 = new javax.swing.JButton();
        jlblimage3 = new javax.swing.JLabel();
        jbtnimage3 = new javax.swing.JButton();
        jtxtsearch3 = new javax.swing.JTextField();
        jlblsearch3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtb_display_appointment = new javax.swing.JTable();
        jlblname = new javax.swing.JLabel();
        jlblid = new javax.swing.JLabel();
        jlblgender = new javax.swing.JLabel();
        jlblage = new javax.swing.JLabel();
        jlblhaveorhad = new javax.swing.JLabel();
        jlblnumberofpet = new javax.swing.JLabel();
        jlblpettypenow = new javax.swing.JLabel();
        jlblphone = new javax.swing.JLabel();
        jlbladdress = new javax.swing.JLabel();
        jlblshelterpetname = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jtxtname = new javax.swing.JTextField();
        jtxtage = new javax.swing.JTextField();
        jtxtphone = new javax.swing.JTextField();
        jtxtaddress = new javax.swing.JTextField();
        jtxtshelterpetname = new javax.swing.JTextField();
        jbtnfemale = new javax.swing.JRadioButton();
        jbtnmale = new javax.swing.JRadioButton();
        jbtnnotsay = new javax.swing.JRadioButton();
        jbtnyes = new javax.swing.JRadioButton();
        jbtnno = new javax.swing.JRadioButton();
        jbtn0 = new javax.swing.JRadioButton();
        jbtn1 = new javax.swing.JRadioButton();
        jbtn2 = new javax.swing.JRadioButton();
        jbtn3 = new javax.swing.JRadioButton();
        jcbdog = new javax.swing.JCheckBox();
        jcbcat = new javax.swing.JCheckBox();
        jcbothers = new javax.swing.JCheckBox();
        jlblsearch = new javax.swing.JLabel();
        jtxtsearch = new javax.swing.JTextField();
        jlblstatus = new javax.swing.JLabel();
        jtxtstatus = new javax.swing.JTextField();
        jbtnstatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblname3.setText("Name :");

        jlblgender3.setText("Gender :");

        buttonGroup1.add(jbtnfemale3);
        jbtnfemale3.setText("Female");

        buttonGroup1.add(jbtnmale3);
        jbtnmale3.setText("Male");

        jlblage3.setText("Estimate Age :");

        jtxtage3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtage3KeyPressed(evt);
            }
        });

        jlbltimearrive3.setText("Time arrive Shelter :");

        jlblspay3.setText("Spay :");

        buttonGroup2.add(jbtnyes3);
        jbtnyes3.setText("Yes");

        buttonGroup2.add(jbtnno3);
        jbtnno3.setText("No");

        jlbldisabled3.setText("Disabled:");

        buttonGroup3.add(jbtndyes3);
        jbtndyes3.setText("Yes");

        buttonGroup3.add(jbtndno3);
        jbtndno3.setText("No");

        jlblvacci3.setText("Vaccination :");

        buttonGroup4.add(jbtnvyes3);
        jbtnvyes3.setText("Yes");

        buttonGroup4.add(jbtnvno3);
        jbtnvno3.setText("No");

        jlblpettype3.setText("Pet Type :");

        jbtnsave3.setText("Save");
        jbtnsave3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsaveActionPerformed(evt);
            }
        });

        jbtnreset3.setText("Reset");
        jbtnreset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        jtb_display_strayanimals3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno", "Name", "Gender", "Age", "TimeArrive", "Spay", "Disabled", "Vaccination", "Organization", "Pet Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_display_strayanimals3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_display_strayanimalsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jtb_display_strayanimals3);

        jbtnupdate3.setText("Update");
        jbtnupdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateActionPerformed(evt);
            }
        });

        jbtndelete3.setText("Delete");
        jbtndelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });

        jlblimage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbtnimage3.setText("Browse");
        jbtnimage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnimageActionPerformed(evt);
            }
        });

        jtxtsearch3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchKeyPressed(evt);
            }
        });

        jlblsearch3.setText("Search Here :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblpettype3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jlblage3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlblspay3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbltimearrive3)
                                            .addComponent(jlbldisabled3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblvacci3))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jbtnimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtxtage3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jdctimearrive3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnyes3)
                                    .addComponent(jbtndyes3)
                                    .addComponent(jbtnvyes3))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnvno3)
                                    .addComponent(jbtndno3)
                                    .addComponent(jbtnno3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtxtpettype3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlblimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblname3)
                                    .addComponent(jlblgender3))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jbtnfemale3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnmale3))
                                    .addComponent(jtxtname3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jbtnsave3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnupdate3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtndelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jbtnreset3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(388, 388, 388))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblname3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblgender3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnfemale3)
                                .addComponent(jbtnmale3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblage3)
                            .addComponent(jtxtage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbltimearrive3)
                            .addComponent(jdctimearrive3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblspay3)
                            .addComponent(jbtnyes3)
                            .addComponent(jbtnno3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbldisabled3)
                            .addComponent(jbtndyes3)
                            .addComponent(jbtndno3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblvacci3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnvyes3)
                                .addComponent(jbtnvno3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblpettype3)
                            .addComponent(jtxtpettype3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jbtnimage3)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblimage3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtndelete3)
                            .addComponent(jbtnupdate3)
                            .addComponent(jbtnsave3)
                            .addComponent(jbtnreset3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblsearch3)
                            .addComponent(jtxtsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pet Information", jPanel5);

        jtb_display_appointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ano", "name", "id", "gender", "age", "have or had a pet", "number of pet", "pet type now", "phone number", "home address", "shelter pet name", "org", "status"
            }
        ));
        jtb_display_appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_display_appointmentMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jtb_display_appointment);

        jlblname.setText("Name :");

        jlblid.setText("ID :");

        jlblgender.setText("Gender :");

        jlblage.setText("Age :");

        jlblhaveorhad.setText("Have or Had a Pet :");

        jlblnumberofpet.setText("Number of Pet :");

        jlblpettypenow.setText("Pet Type Now :");

        jlblphone.setText("Phone Number:");

        jlbladdress.setText("Home Address :");

        jlblshelterpetname.setText("Shelter Pet Name :");

        jtxtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnameActionPerformed(evt);
            }
        });

        buttonGroup5.add(jbtnfemale);
        jbtnfemale.setText("Female");

        buttonGroup5.add(jbtnmale);
        jbtnmale.setText("Male");

        buttonGroup5.add(jbtnnotsay);
        jbtnnotsay.setText("Prefer not to Say");

        buttonGroup6.add(jbtnyes);
        jbtnyes.setText("Yes");

        buttonGroup6.add(jbtnno);
        jbtnno.setText("No");

        buttonGroup7.add(jbtn0);
        jbtn0.setText("0");

        buttonGroup7.add(jbtn1);
        jbtn1.setText("1");

        buttonGroup7.add(jbtn2);
        jbtn2.setText("2");

        buttonGroup7.add(jbtn3);
        jbtn3.setText("More than 2");

        jcbdog.setText("Dog");

        jcbcat.setText("Cat");

        jcbothers.setText("Others");

        jlblsearch.setText("Search :");

        jtxtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearchKeyPressed1(evt);
            }
        });

        jlblstatus.setText("Status: ");

        jbtnstatus.setText("Submit");
        jbtnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblhaveorhad, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jlblnumberofpet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbladdress, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jlblphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblpettypenow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblshelterpetname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtage, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jbtnfemale)
                                .addGap(27, 27, 27)
                                .addComponent(jbtnmale)
                                .addGap(34, 34, 34)
                                .addComponent(jbtnnotsay))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jcbdog)
                                    .addGap(40, 40, 40)
                                    .addComponent(jcbcat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbothers))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jbtnyes)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jbtn0)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbtn1)))
                                    .addGap(34, 34, 34)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jbtn2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbtn3))
                                        .addComponent(jbtnno))))
                            .addComponent(jtxtshelterpetname, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jlblsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jtxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jlblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jtxtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jbtnstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblname)
                            .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblid)
                            .addComponent(jtxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblgender)
                                    .addComponent(jbtnfemale)
                                    .addComponent(jbtnmale)
                                    .addComponent(jbtnnotsay)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblstatus)
                                    .addComponent(jbtnstatus))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblage)
                            .addComponent(jtxtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblhaveorhad)
                            .addComponent(jbtnyes)
                            .addComponent(jbtnno))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblnumberofpet)
                            .addComponent(jbtn0)
                            .addComponent(jbtn1)
                            .addComponent(jbtn2)
                            .addComponent(jbtn3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblpettypenow)
                            .addComponent(jcbdog))
                        .addGap(18, 18, 18)
                        .addComponent(jlblphone))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbcat)
                            .addComponent(jcbothers))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbladdress)
                    .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblshelterpetname)
                    .addComponent(jtxtshelterpetname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblsearch)
                    .addComponent(jtxtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Appointments", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals3.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_display_strayanimals3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtsearch.getText().trim()));
    }//GEN-LAST:event_jtxtsearchKeyPressed

    private void jbtnimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnimageActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jlblimage3.getWidth(),jlblimage3.getHeight(),Image.SCALE_SMOOTH));
        jlblimage3.setIcon(imageIcon);

        try{

            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf))!=-1;){

                bos.write(buf,0,readNum);

            }
            strayanimals_image = bos.toByteArray();

        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jbtnimageActionPerformed

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete it ?", "Delete",JOptionPane.YES_NO_OPTION);
        if(opt==0){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
                int row = jtb_display_strayanimals3.getSelectedRow();
                String value = (jtb_display_strayanimals3.getModel().getValueAt(row, 0).toString());
                String query = "DELETE FROM strayanimals where sno="+value;
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals3.getModel();
                model.setRowCount(0);
                show_strayanimals();
                JOptionPane.showMessageDialog(null, "Deleted Successfully!");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
            jtxtname3.setText("");
            buttonGroup1.clearSelection();
            jtxtage3.setText("");

            jdctimearrive3.setDate(null);
       
            buttonGroup2.clearSelection();
            buttonGroup3.clearSelection();
            buttonGroup4.clearSelection();
            jtxtpettype3.setText("");
            jlblimage3.setIcon(null);
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void jbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateActionPerformed

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String time_arrive = dateformat.format(jdctimearrive3.getDate());

        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            int row = jtb_display_strayanimals3.getSelectedRow();
            String value = (jtb_display_strayanimals3.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE strayanimals SET name = ?,gender=?,age=?,time_arrive=?,spay=?,disabled=?,vaccination=?,pettype=? ,images = ? where sno="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, jtxtname3.getText());
            if(jbtnfemale3.isSelected()){
                gender = "Female";
            }
            if(jbtnmale3.isSelected()){
                gender = "Male";
            }
            pst.setString(2, gender);
            pst.setInt(3,Integer.parseInt(jtxtage3.getText()));  //这里的数据验证要判断integer

            pst.setString(4, time_arrive);

            if(jbtnyes3.isSelected()){
                spay = "Yes";
            }
            if(jbtnno3.isSelected()){
                spay = "No";
            }
            pst.setString(5, spay);

            if(jbtndyes3.isSelected()){
                disabled = "Yes";
            }
            if(jbtndno3.isSelected()){
                disabled = "No";
            }
            pst.setString(6, disabled);

            if(jbtnvyes3.isSelected()){
                vaccination = "Yes";
            }
            if(jbtnvno3.isSelected()){
                vaccination = "No";
            }
            pst.setString(7,vaccination);

            pst.setString(8,jtxtpettype3.getText());

            pst.setBytes(9,strayanimals_image);

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals3.getModel();
            model.setRowCount(0);
            show_strayanimals();
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
            jtxtname3.setText("");
            buttonGroup1.clearSelection();
            jtxtage3.setText("");

            jdctimearrive3.setDate(null);
       
            buttonGroup2.clearSelection();
            buttonGroup3.clearSelection();
            buttonGroup4.clearSelection();
            jtxtpettype3.setText("");
            jlblimage3.setIcon(null);
    }//GEN-LAST:event_jbtnupdateActionPerformed

    private void jtb_display_strayanimalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_display_strayanimalsMouseClicked
        // TODO add your handling code here:
        int i = jtb_display_strayanimals3.getSelectedRow();
        TableModel model = jtb_display_strayanimals3.getModel();
        jtxtname3.setText(model.getValueAt(i,1).toString());
        String sex = model.getValueAt(i, 2).toString();
        if (sex.equals("Female")){

            jbtnfemale3.setSelected(true);

        }
        else{

            jbtnmale3.setSelected(true);

        }
        
        jtxtage3.setText(model.getValueAt(i, 3).toString());

        String dateValue2 =model.getValueAt(i, 4).toString();
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue2);
        } catch (ParseException ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        jdctimearrive3.setDate(date);

        String spayy = model.getValueAt(i, 5).toString();
        if (spayy.equals("Yes")){

            jbtnyes3.setSelected(true);

        }
        else{

            jbtnno3.setSelected(true);

        }
        String disabledd = model.getValueAt(i, 6).toString();
        if (disabledd.equals("Yes")){

            jbtndyes3.setSelected(true);

        }
        else{

            jbtndno3.setSelected(true);

        }
        String vaccinationn = model.getValueAt(i, 7).toString();
        if (vaccinationn.equals("Yes")){

            jbtnvyes3.setSelected(true);

        }
        else{

            jbtnvno3.setSelected(true);

        }
        jtxtpettype3.setText(model.getValueAt(i, 9).toString());
        byte[] img = (strayanimalsList().get(i).getPicture());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jlblimage3.getWidth(),jlblimage3.getHeight(),Image.SCALE_SMOOTH));
        jlblimage3.setIcon(imageIcon);
    }//GEN-LAST:event_jtb_display_strayanimalsMouseClicked

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
            jtxtname3.setText("");
            buttonGroup1.clearSelection();
            jtxtage3.setText("");

            jdctimearrive3.setDate(null);
       
            buttonGroup2.clearSelection();
            buttonGroup3.clearSelection();
            buttonGroup4.clearSelection();
            jtxtpettype3.setText("");
            jlblimage3.setIcon(null);

    }//GEN-LAST:event_jbtnresetActionPerformed

    private void jbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsaveActionPerformed
        // **********************************************Data Validation*********************************************************
        if("".equals(jtxtname3.getText().trim())){
        
            JOptionPane.showMessageDialog(this, "Please input your name");
        
        }
        else if(jbtnfemale3.isSelected()==false&&jbtnmale3.isSelected()==false){
                
                 JOptionPane.showMessageDialog(this, "Please select your gender");
                
                }
        else if(jtxtage3.getText().trim()==null){
            JOptionPane.showMessageDialog(this, "Please input your age");
        }
        else if(jdctimearrive3.getDate()==null){
        
            JOptionPane.showMessageDialog(this, "Please select the date");

        }
        else if(jbtnyes3.isSelected()==false&&jbtnno3.isSelected()==false){
        
            JOptionPane.showMessageDialog(this, "Please input spay information");

        }
        else if(jbtndyes3.isSelected()==false&&jbtndno3.isSelected()==false){
        
            JOptionPane.showMessageDialog(this, "Please input disabled information");

        }
        else if(jbtnvyes3.isSelected()==false&&jbtnvno3.isSelected()==false){
        
            JOptionPane.showMessageDialog(this, "Please input vaccination information");

        }
        else if(jtxtpettype3.getText().trim()==null){
        
            JOptionPane.showMessageDialog(this, "Please input the pet type");
        
        }
        else if(strayanimals_image==null)
        {
            JOptionPane.showMessageDialog(this, "Please upload a photo");
        }
        
        
        else{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            String query = "insert into strayanimals(name,gender,age,time_arrive,spay,disabled,vaccination,pettype,images)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, jtxtname3.getText());
            if(jbtnfemale3.isSelected()){
                gender = "Female";
            }
            if(jbtnmale3.isSelected()){
                gender = "Male";
            }
            pst.setString(2, gender);
            pst.setInt(3,Integer.parseInt(jtxtage3.getText()));  //这里的数据验证要判断integer
             
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String time_arrive = dateformat.format(jdctimearrive3.getDate());

            pst.setString(4, time_arrive);

            if(jbtnyes3.isSelected()){
                spay = "Yes";
            }
            if(jbtnno3.isSelected()){
                spay = "No";
            }
            pst.setString(5, spay);

            if(jbtndyes3.isSelected()){
                disabled = "Yes";
            }
            if(jbtndno3.isSelected()){
                disabled = "No";
            }
            pst.setString(6, disabled);

            if(jbtnvyes3.isSelected()){
                vaccination = "Yes";
            }
            if(jbtnvno3.isSelected()){
                vaccination = "No";
            }
            pst.setString(7,vaccination);
           

            pst.setString(8,jtxtpettype3.getText());

            pst.setBytes(9,strayanimals_image);

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jtb_display_strayanimals3.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");

        }
        catch (Exception ex) {
            Logger.getLogger(Org1VolunteerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
      
            // TODO add your handling code here:
            jtxtname3.setText("");
            buttonGroup1.clearSelection();
            jtxtage3.setText("");

            jdctimearrive3.setDate(null);
       
            buttonGroup2.clearSelection();
            buttonGroup3.clearSelection();
            buttonGroup4.clearSelection();
            jtxtpettype3.setText("");
            jlblimage3.setIcon(null);
    }//GEN-LAST:event_jbtnsaveActionPerformed

    private void jtxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnameActionPerformed

    private void jtb_display_appointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_display_appointmentMouseClicked
        // TODO add your handling code here:
        int i = jtb_display_appointment.getSelectedRow();
        TableModel model = jtb_display_appointment.getModel();
        jtxtname.setText(model.getValueAt(i,1).toString());
        jtxtid.setText(model.getValueAt(i,2).toString());
        String sex = model.getValueAt(i, 3).toString();
        if (sex.equals("Female")){

            jbtnfemale.setSelected(true);

        }
        if (sex.equals("Prefer not to say")){

            jbtnnotsay.setSelected(true);

        }
        else{

            jbtnmale.setSelected(true);

        }
        jtxtage.setText(model.getValueAt(i, 4).toString());

        

        String haveorhadpet = model.getValueAt(i, 5).toString();
        if (haveorhadpet.equals("Yes")){

            jbtnyes.setSelected(true);

        }
        else{

            jbtnno.setSelected(true);

        }
        String numberofpet = model.getValueAt(i, 6).toString();
        if (numberofpet.equals("0")){

            jbtn0.setSelected(true);

        }
        if (numberofpet.equals("1")){

            jbtn1.setSelected(true);

        }
        if (numberofpet.equals("2")){

            jbtn2.setSelected(true);

        }
        else{

            jbtn3.setSelected(true);

        }
        
        String pettypenow = model.getValueAt(i, 7).toString();
            switch(pettypenow){
            
                case "Dog " :
                    jcbdog.setSelected(true);
                    jcbcat.setSelected(false);
                    jcbothers.setSelected(false);
                    break;
                case "Cat " :
                    jcbdog.setSelected(false);
                    jcbcat.setSelected(true);
                    jcbothers.setSelected(false);
                    break;
                case "Others(If you have no pet, just choose this.) " :
                    jcbdog.setSelected(false);
                    jcbcat.setSelected(false);
                    jcbothers.setSelected(true);
                    break;
                case "Dog Cat " :
                    jcbdog.setSelected(true);
                    jcbcat.setSelected(true);
                    jcbothers.setSelected(false);
                    break;
               case "Dog Others(If you have no pet, just choose this.) " :
                    jcbdog.setSelected(true);
                    jcbcat.setSelected(false);
                    jcbothers.setSelected(true);
                    break;
               case "Cat Others(If you have no pet, just choose this.) " :
                    jcbdog.setSelected(false);
                    jcbcat.setSelected(true);
                    jcbothers.setSelected(true);
                    break;
               default :
                    jcbdog.setSelected(true);
                    jcbcat.setSelected(true);
                    jcbothers.setSelected(true);
                    break;
         
            }
        
      
        jtxtphone.setText(model.getValueAt(i,8).toString());
        jtxtaddress.setText(model.getValueAt(i,9).toString());
        jtxtshelterpetname.setText(model.getValueAt(i,10).toString());
        jtxtstatus.setText(model.getValueAt(i,12).toString());
        
        
    }//GEN-LAST:event_jtb_display_appointmentMouseClicked

    private void jtxtsearchKeyPressed1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearchKeyPressed1
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jtb_display_appointment.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_display_appointment.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxtsearch.getText().trim()));
    }//GEN-LAST:event_jtxtsearchKeyPressed1

    private void jbtnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnstatusActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/petcommunity", "root", "");
            int row = jtb_display_appointment.getSelectedRow();
            String value = (jtb_display_appointment.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE appointment SET appointmentstatus=? where ano="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, jtxtstatus.getText());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jtb_display_appointment.getModel();
            model.setRowCount(0);
            show_appointment();
            JOptionPane.showMessageDialog(null, "Status Changed");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jbtnstatusActionPerformed

    private void jtxtage3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtage3KeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)){
            JOptionPane.showMessageDialog(this, "Please input an integer");
            jtxtage3.setText("");
        }
    }//GEN-LAST:event_jtxtage3KeyPressed

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
            java.util.logging.Logger.getLogger(Org1VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Org1VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Org1VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Org1VolunteerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Org1VolunteerPage().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jbtn0;
    private javax.swing.JRadioButton jbtn1;
    private javax.swing.JRadioButton jbtn2;
    private javax.swing.JRadioButton jbtn3;
    private javax.swing.JButton jbtndelete3;
    private javax.swing.JRadioButton jbtndno3;
    private javax.swing.JRadioButton jbtndyes3;
    private javax.swing.JRadioButton jbtnfemale;
    private javax.swing.JRadioButton jbtnfemale3;
    private javax.swing.JButton jbtnimage3;
    private javax.swing.JRadioButton jbtnmale;
    private javax.swing.JRadioButton jbtnmale3;
    private javax.swing.JRadioButton jbtnno;
    private javax.swing.JRadioButton jbtnno3;
    private javax.swing.JRadioButton jbtnnotsay;
    private javax.swing.JButton jbtnreset3;
    private javax.swing.JButton jbtnsave3;
    private javax.swing.JButton jbtnstatus;
    private javax.swing.JButton jbtnupdate3;
    private javax.swing.JRadioButton jbtnvno3;
    private javax.swing.JRadioButton jbtnvyes3;
    private javax.swing.JRadioButton jbtnyes;
    private javax.swing.JRadioButton jbtnyes3;
    private javax.swing.JCheckBox jcbcat;
    private javax.swing.JCheckBox jcbdog;
    private javax.swing.JCheckBox jcbothers;
    private com.toedter.calendar.JDateChooser jdctimearrive3;
    private javax.swing.JLabel jlbladdress;
    private javax.swing.JLabel jlblage;
    private javax.swing.JLabel jlblage3;
    private javax.swing.JLabel jlbldisabled3;
    private javax.swing.JLabel jlblgender;
    private javax.swing.JLabel jlblgender3;
    private javax.swing.JLabel jlblhaveorhad;
    private javax.swing.JLabel jlblid;
    private javax.swing.JLabel jlblimage3;
    private javax.swing.JLabel jlblname;
    private javax.swing.JLabel jlblname3;
    private javax.swing.JLabel jlblnumberofpet;
    private javax.swing.JLabel jlblpettype3;
    private javax.swing.JLabel jlblpettypenow;
    private javax.swing.JLabel jlblphone;
    private javax.swing.JLabel jlblsearch;
    private javax.swing.JLabel jlblsearch3;
    private javax.swing.JLabel jlblshelterpetname;
    private javax.swing.JLabel jlblspay3;
    private javax.swing.JLabel jlblstatus;
    private javax.swing.JLabel jlbltimearrive3;
    private javax.swing.JLabel jlblvacci3;
    private javax.swing.JTable jtb_display_appointment;
    private javax.swing.JTable jtb_display_strayanimals3;
    private javax.swing.JTextField jtxtaddress;
    private javax.swing.JTextField jtxtage;
    private javax.swing.JTextField jtxtage3;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtname3;
    private javax.swing.JTextField jtxtpettype3;
    private javax.swing.JTextField jtxtphone;
    private javax.swing.JTextField jtxtsearch;
    private javax.swing.JTextField jtxtsearch3;
    private javax.swing.JTextField jtxtshelterpetname;
    private javax.swing.JTextField jtxtstatus;
    // End of variables declaration//GEN-END:variables
}
