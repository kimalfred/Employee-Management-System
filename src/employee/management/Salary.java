/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package employee.management;

import static employee.management.ManageSick.search;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Kim Alfred
 */
public class Salary extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Salary() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root", "@kimalfred22");
            pst=con.prepareStatement("Select * from payslip_tb");
            rs=pst.executeQuery();
            ResultSetMetaData rsmd =rs.getMetaData();
            int n=rsmd.getColumnCount();
            DefaultTableModel dtm=(DefaultTableModel) paysliptb.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector v=new Vector();
                for(int i=1;i<=n;i++){
                    v.add(rs.getString("id"));
                    v.add(rs.getString("emp_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("email"));
                    v.add(rs.getString("position"));
                    v.add(rs.getString("payrec"));
                    v.add(rs.getString("ot_pay")); 
                    v.add(rs.getString("deduction"));
                    v.add(rs.getString("salary"));
                }
                //System.out.print(v);
                dtm.addRow(v);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);            
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        empid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        otpay = new javax.swing.JTextField();
        deduc = new javax.swing.JTextField();
        net = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        month = new com.toedter.calendar.JDateChooser();
        del = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        paysliptb = new javax.swing.JTable();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)));

        empid.setBackground(new java.awt.Color(255, 255, 255));
        empid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empid.setForeground(new java.awt.Color(0, 0, 0));
        empid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        empid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empidKeyReleased(evt);
            }
        });

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.setEnabled(false);

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        email.setEnabled(false);

        post.setBackground(new java.awt.Color(255, 255, 255));
        post.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        post.setForeground(new java.awt.Color(0, 0, 0));
        post.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        post.setEnabled(false);

        otpay.setBackground(new java.awt.Color(255, 255, 255));
        otpay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        otpay.setForeground(new java.awt.Color(0, 0, 0));
        otpay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deduc.setBackground(new java.awt.Color(255, 255, 255));
        deduc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deduc.setForeground(new java.awt.Color(0, 0, 0));
        deduc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        net.setBackground(new java.awt.Color(255, 255, 255));
        net.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        net.setForeground(new java.awt.Color(0, 0, 0));
        net.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Payslip");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Position");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Month");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Overtime Pay");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Deduction");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary");

        month.setBackground(new java.awt.Color(255, 255, 255));
        month.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        month.setForeground(new java.awt.Color(0, 0, 0));
        month.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        del.setBackground(new java.awt.Color(255, 255, 255));
        del.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        del.setForeground(new java.awt.Color(0, 0, 0));
        del.setText("Delete");
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delMouseExited(evt);
            }
        });
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(net, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deduc)
                            .addComponent(otpay)
                            .addComponent(post)
                            .addComponent(email)
                            .addComponent(name)
                            .addComponent(empid)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otpay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deduc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(net, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        paysliptb.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        paysliptb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Employee ID", "Name", "Email", "Position", "Date Release", "Overtime Pay", "Deduction", "Salary"
            }
        ));
        paysliptb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paysliptbMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(paysliptb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empidKeyReleased
        try {
            String query = "SELECT * FROM emptb WHERE employee_id = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "@kimalfred22");

            String sql = "SELECT * FROM emptb WHERE employee_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, empid.getText());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String setid = rs.getString("employee_id");
                empid.setText(setid);

                String setname = rs.getString("name");
                name.setText(setname);
                
                String setemail = rs.getString("email");
                email.setText(setemail);
                
                String setpost = rs.getString("position");
                post.setText(setpost);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_empidKeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            String sname = name.getText();
            String employeeId = empid.getText();
            String semail = email.getText();
            String posts = post.getText();
            Date months = month.getDate();
            String otpays = otpay.getText();
            String deducs = deduc.getText();
            String nets = net.getText();

            if (sname.isEmpty() || employeeId.isEmpty() || semail.isEmpty() || posts.isEmpty() || months == null || otpays.isEmpty() || deducs.isEmpty() || nets.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return;
            }

            String url = "jdbc:mysql://localhost/javadb";
            String dbUsername = "root";
            String dbPassword = "@kimalfred22";

            try (Connection con = DriverManager.getConnection(url, dbUsername, dbPassword)) {
                con.setAutoCommit(false);

                String checkQuery = "SELECT COUNT(*) FROM payslip_tb WHERE emp_id = ?";
                try (PreparedStatement checkPst = con.prepareStatement(checkQuery)) {
                    checkPst.setString(1, employeeId);
                    ResultSet rs = checkPst.executeQuery();
                    if (rs.next() && rs.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(this, "Employee already has a Payslip");
                        return;
                    }
                }

                String insertQuery = "INSERT INTO payslip_tb (emp_id, name, email, position, payrec, ot_pay, deduction, salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement pst = con.prepareStatement(insertQuery)) {
                    pst.setString(1, employeeId);
                    pst.setString(2, sname);
                    pst.setString(3, semail);
                    pst.setString(4, posts);

                    java.sql.Date sqlStartDate = new java.sql.Date(months.getTime());
                    pst.setDate(5, sqlStartDate);

                    pst.setString(6, otpays);
                    pst.setString(7, deducs);
                    pst.setString(8, nets);

                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        con.commit();
                        JOptionPane.showMessageDialog(this, "Payslip Added to Employee");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to add Payslip.");
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please check console for details.");
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_addActionPerformed

    private void paysliptbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paysliptbMouseClicked
        DefaultTableModel model = (DefaultTableModel) paysliptb.getModel();
        int selectedIndex = paysliptb.getSelectedRow();

        empid.setText(model.getValueAt(selectedIndex, 1).toString());
        name.setText(model.getValueAt(selectedIndex, 2).toString());
        email.setText(model.getValueAt(selectedIndex, 3).toString());
        post.setText(model.getValueAt(selectedIndex, 4).toString());

        String dateString = model.getValueAt(selectedIndex, 5).toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(dateString);
            month.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        otpay.setText(model.getValueAt(selectedIndex, 6).toString());
        deduc.setText(model.getValueAt(selectedIndex, 7).toString());
        net.setText(model.getValueAt(selectedIndex, 8).toString());

    }//GEN-LAST:event_paysliptbMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String sname = name.getText();
            String employeeId = empid.getText();
            String semail = email.getText();
            String posts = post.getText();
            Date months = month.getDate();
            String otpays = otpay.getText();
            String deducs = deduc.getText();
            String nets = net.getText();

            if (sname.isEmpty() || employeeId.isEmpty() || semail.isEmpty() || posts.isEmpty() || months == null ||
                    otpays.isEmpty() || deducs.isEmpty() || nets.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return;
            }

            String url = "jdbc:mysql://localhost/javadb";
            String dbUsername = "root";
            String dbPassword = "@kimalfred22";

            try (Connection con = DriverManager.getConnection(url, dbUsername, dbPassword)) {
                String updateQuery = "UPDATE payslip_tb SET name = ?, email = ?, position = ?, payrec = ?, ot_pay = ?, deduction = ?, salary = ? WHERE emp_id = ?";

                try (PreparedStatement pst = con.prepareStatement(updateQuery)) {                   
                    pst.setString(1, sname);
                    pst.setString(2, semail);
                    pst.setString(3, posts);

                    java.sql.Date sqlStartDate = new java.sql.Date(months.getTime());
                    pst.setDate(4, sqlStartDate);

                    pst.setString(5, otpays);
                    pst.setString(6, deducs);
                    pst.setString(7, nets);

                    pst.setString(8, employeeId);
                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Update Successful!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No records updated. Employee ID not found.");
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred. Please check console for details.");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        try {
            String idToDelete = empid.getText();

            if (!idToDelete.isEmpty()) {
                String sql = "DELETE FROM payslip_tb WHERE emp_id =?";
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "@kimalfred22");
                pst = con.prepareStatement(sql);
                pst.setString(1, idToDelete);
                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Delete Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "No records found with the specified Employee ID");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter Employee ID to delete");
            }
        } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_delActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        empid.setText(""); 
        name.setText("");  
        email.setText(""); 
        post.setText("");           
        month.setDate(null);
        otpay.setText("");
        deduc.setText("");
        net.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        Color clr=new Color(0, 0, 255);
        add.setBackground(clr);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        Color clr=new Color(255,255,255);
        add.setBackground(clr);
    }//GEN-LAST:event_addMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        Color clr=new Color(0, 0, 255);
        update.setBackground(clr);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        Color clr=new Color(255,255,255);
        update.setBackground(clr);
    }//GEN-LAST:event_updateMouseExited

    private void delMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseEntered
        Color clr=new Color(0, 0, 255);
        del.setBackground(clr);
    }//GEN-LAST:event_delMouseEntered

    private void delMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseExited
        Color clr=new Color(255,255,255);
        del.setBackground(clr);
    }//GEN-LAST:event_delMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        Color clr=new Color(0, 0, 255);
        clear.setBackground(clr);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        Color clr=new Color(255,255,255);
        clear.setBackground(clr);
    }//GEN-LAST:event_clearMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JTextField deduc;
    private javax.swing.JButton del;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField net;
    private javax.swing.JTextField otpay;
    private javax.swing.JTable paysliptb;
    private javax.swing.JTextField post;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
