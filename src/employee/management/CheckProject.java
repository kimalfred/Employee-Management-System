/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.management;

import static employee.management.LeaveApp.label;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kim Alfred
 */
public class CheckProject extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String path2 = null;
    
    public CheckProject() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        project = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        assign = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descript = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        imagetxt = new javax.swing.JLabel();
        submit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        mark = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        project.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        project.setText("Project Submitted");

        exit1.setBackground(new java.awt.Color(204, 0, 0));
        exit1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit1.setForeground(new java.awt.Color(0, 0, 0));
        exit1.setText("Exit");
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit1MouseExited(evt);
            }
        });
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(project)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(project)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(exit1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Search Employee ID");

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setEnabled(false);

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setEnabled(false);

        post.setBackground(new java.awt.Color(255, 255, 255));
        post.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        post.setForeground(new java.awt.Color(0, 0, 0));
        post.setEnabled(false);

        dept.setBackground(new java.awt.Color(255, 255, 255));
        dept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dept.setForeground(new java.awt.Color(0, 0, 0));
        dept.setEnabled(false);

        assign.setBackground(new java.awt.Color(255, 255, 255));
        assign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        assign.setForeground(new java.awt.Color(0, 0, 0));
        assign.setEnabled(false);

        due.setBackground(new java.awt.Color(255, 255, 255));
        due.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        due.setForeground(new java.awt.Color(0, 0, 0));
        due.setEnabled(false);

        descript.setBackground(new java.awt.Color(255, 255, 255));
        descript.setColumns(20);
        descript.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        descript.setForeground(new java.awt.Color(0, 0, 0));
        descript.setRows(5);
        jScrollPane1.setViewportView(descript);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(234, 179));

        message.setBackground(new java.awt.Color(255, 255, 255));
        message.setColumns(20);
        message.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(0, 0, 0));
        message.setRows(5);
        message.setEnabled(false);
        jScrollPane3.setViewportView(message);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Position");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Department");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Assign Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Due Date");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Project Description");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Project Message");

        imagetxt.setBackground(new java.awt.Color(255, 255, 255));
        imagetxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imagetxt.setForeground(new java.awt.Color(0, 0, 0));
        imagetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        imagetxt.setPreferredSize(new java.awt.Dimension(200, 200));

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 0, 0));
        submit.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Submitted");

        mark.setBackground(new java.awt.Color(255, 255, 255));
        mark.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mark.setForeground(new java.awt.Color(0, 0, 0));
        mark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Very Good", "Good", "Fair", "Poor" }));

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        status.setForeground(new java.awt.Color(0, 0, 0));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Working", "Approved", "Rejected" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Mark");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Status");

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("Update Project");
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(194, 194, 194))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(due, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(assign, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(submit, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(mark, 0, 200, Short.MAX_VALUE)
                                .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(imagetxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addComponent(jLabel12))
                        .addGap(51, 51, 51))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(imagetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(assign, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(mark))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(due, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(status)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String query = "SELECT * FROM project_db WHERE employee_id = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "@kimalfred22");

            String sql = query;
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, search.getText());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String setname = rs.getString("name");
                name.setText(setname);

                String setemail = rs.getString("email");
                email.setText(setemail);

                String setPosition = rs.getString("position");
                post.setText(setPosition);

                String setDepartment = rs.getString("department");
                dept.setText(setDepartment);

                Blob blob = rs.getBlob("picture");
                if (blob != null) {
                    byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    Image image = imageIcon.getImage();
                    Image newImg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
                    imageIcon = new ImageIcon(newImg);
                    imagetxt.setIcon(imageIcon);
                }

                String setAssign = rs.getString("assigndate");
                assign.setText(setAssign);

                String setDue = rs.getString("duedate");
                due.setText(setDue);

                String setSubmit = rs.getString("submitted");
                submit.setText(setSubmit);

                String setDescript = rs.getString("proj_desc");
                descript.setText(setDescript);

                String setMessage = rs.getString("proj_msg");
                message.setText(setMessage);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        dispose();
    }//GEN-LAST:event_exit1ActionPerformed

    private void exit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseExited
        Color clr=new Color(204, 0 , 0 );
        exit1.setBackground(clr);
    }//GEN-LAST:event_exit1MouseExited

    private void exit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseEntered
        Color clr=new Color(255,255,255);
        exit1.setBackground(clr);
    }//GEN-LAST:event_exit1MouseEntered

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        Color clr=new Color(0,0,255);
        update.setBackground(clr);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        Color clr=new Color(255,255,255);
        update.setBackground(clr);
    }//GEN-LAST:event_updateMouseExited

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            String emplo = search.getText();
            String uname = name.getText();
            String uemail = email.getText();
            String position = post.getText();
            String department = dept.getText();
            String assigndate = assign.getText();
            String duedate = due.getText();
            String desc = descript.getText();
            String msg = message.getText();
            String datesub = submit.getText();
            String marks = (String) mark.getSelectedItem();
            String stat = (String) status.getSelectedItem();

            String url = "jdbc:mysql://localhost/javadb";
            String dbUsername = "root";
            String dbPassword = "@kimalfred22";

            try (Connection con = DriverManager.getConnection(url, dbUsername, dbPassword)) {
                String updateQuery;
                boolean updatePicture = path2 != null && !path2.isEmpty();

                if (updatePicture) {
                    updateQuery = "UPDATE project_db SET name = ?, email = ?, position = ?, department = ?, picture = ?, assigndate = ?, duedate = ?, proj_desc = ?, proj_msg = ?, submitted = ?, mark = ?, status = ? WHERE employee_id = ?";
                } else {
                    updateQuery = "UPDATE project_db SET name = ?, email = ?, position = ?, department = ?, assigndate = ?, duedate = ?, proj_desc = ?, proj_msg = ?, submitted = ?, mark = ?, status = ? WHERE employee_id = ?";
                }

                try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
                    pst.setString(1, uname);
                    pst.setString(2, uemail);
                    pst.setString(3, position);
                    pst.setString(4, department);

                    int parameterIndex = 5;

                    if (updatePicture) {
                        File pictureFile = new File(path2);
                        if (pictureFile.exists() && pictureFile.isFile()) {
                            try (InputStream is = new FileInputStream(pictureFile)) {
                                pst.setBlob(parameterIndex++, is);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(this, "Picture file not found.");
                                return;
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid picture file path.");
                            return;
                        }
                    }

                    pst.setString(parameterIndex++, assigndate);
                    pst.setString(parameterIndex++, duedate);
                    pst.setString(parameterIndex++, desc);
                    pst.setString(parameterIndex++, msg);
                    pst.setString(parameterIndex++, datesub);
                    pst.setString(parameterIndex++, marks);
                    pst.setString(parameterIndex++, stat);
                    pst.setString(parameterIndex++, emplo);

                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Updated Record Successfully!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No records updated. Employee ID not found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(UserProject.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "An error occurred while updating the record.");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please check the console for details.");
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An unexpected error occurred. Please check the console for details.");
            ex.printStackTrace();
        }
        Email x = new Email();
        x.setVisible(true);
        x.txtSubject.setText(project.getText());
        dispose(); 
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(CheckProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assign;
    private javax.swing.JTextField dept;
    private javax.swing.JTextArea descript;
    private javax.swing.JTextField due;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel imagetxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> mark;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField name;
    private javax.swing.JTextField post;
    private javax.swing.JLabel project;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
