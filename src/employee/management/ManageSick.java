/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package employee.management;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Kim Alfred
 */
public class ManageSick extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ManageSick() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
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
        search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        emplbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        empid = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        emplbl1 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        emplbl2 = new javax.swing.JLabel();
        emplbl3 = new javax.swing.JLabel();
        end = new com.toedter.calendar.JDateChooser();
        start = new com.toedter.calendar.JDateChooser();
        emplbl4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextArea();
        stat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        in = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emplbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emplbl.setText("Employee ID:");
        jPanel2.add(emplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 98, -1, -1));

        namelbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        namelbl.setText("Name:");
        jPanel2.add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 51, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Make Sure Your Data is Correct!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        empid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        empid.setForeground(new java.awt.Color(0, 0, 0));
        empid.setText("------");
        jPanel2.add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 104, 279, -1));

        uname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uname.setForeground(new java.awt.Color(0, 0, 0));
        uname.setText("------");
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 57, 415, -1));

        emplbl1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emplbl1.setText("Email:");
        jPanel2.add(emplbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 145, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("------");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 151, 279, -1));

        emplbl2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emplbl2.setText("Reason:");
        jPanel2.add(emplbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        emplbl3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emplbl3.setText("Start Date:");
        jPanel2.add(emplbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        jPanel2.add(end, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 210, 40));
        jPanel2.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, 40));

        emplbl4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emplbl4.setText("End Date:");
        jPanel2.add(emplbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        res.setColumns(20);
        res.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        res.setForeground(new java.awt.Color(0, 0, 0));
        res.setRows(5);
        jScrollPane1.setViewportView(res);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 400, 130));

        stat.setForeground(new java.awt.Color(102, 102, 102));
        stat.setText("Pending");
        jPanel2.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 540, 440));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        in.setBackground(new java.awt.Color(255, 255, 255));
        in.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        in.setForeground(new java.awt.Color(0, 0, 0));
        in.setText("Submit");
        in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inMouseExited(evt);
            }
        });
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Submit sick leave request");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String query = "SELECT * FROM emptb WHERE employee_id = ? OR name = ? OR email = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "@kimalfred22");

            String sql = "SELECT * FROM emptb WHERE employee_id = ? OR name = ? OR email = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, search.getText());
            pst.setString(2, search.getText());
            pst.setString(3, search.getText());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String setid = rs.getString("employee_id");
                empid.setText(setid);

                String setname = rs.getString("name");
                uname.setText(setname);
                
                String setemail = rs.getString("email");
                email.setText(setemail);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void inMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inMouseEntered
        Color clr=new Color(0,204,0);
        in.setBackground(clr);
    }//GEN-LAST:event_inMouseEntered

    private void inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inMouseExited
        Color clr=new Color(255,255,255);
        in.setBackground(clr);
    }//GEN-LAST:event_inMouseExited

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        try {
            String sname = uname.getText();
            String employeeId = empid.getText();
            String semail = email.getText();
            Date selectedstart = start.getDate();
            Date selectedend = end.getDate();
            String lres = res.getText();
            String lstat = stat.getText();

            if (sname.isEmpty() || employeeId.isEmpty() || semail.isEmpty() || selectedstart == null || selectedend == null || lres.isEmpty() || lstat.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return; 
            }

            String url = "jdbc:mysql://localhost/javadb";
            String dbUsername = "root";
            String dbPassword = "@kimalfred22";

            try (Connection con = DriverManager.getConnection(url, dbUsername, dbPassword)) {
                con.setAutoCommit(false);


                String checkQuery = "SELECT COUNT(*) FROM emp_leave WHERE email = ? AND status = 'Pending'";
                try (PreparedStatement checkPst = con.prepareStatement(checkQuery)) {
                    checkPst.setString(1, semail);
                    ResultSet rs = checkPst.executeQuery();
                    if (rs.next() && rs.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(this, "You already have a pending sick leave request.");                       
                        return; 
                    }
                }

                String insertQuery = "INSERT INTO emp_leave (employee_id, name, email, start, end, reason, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement pst = con.prepareStatement(insertQuery)) {
                    pst.setString(1, employeeId);
                    pst.setString(2, sname);
                    pst.setString(3, semail);

                    java.sql.Date sqlStartDate = new java.sql.Date(selectedstart.getTime());
                    java.sql.Date sqlEndDate = new java.sql.Date(selectedend.getTime());

                    pst.setDate(4, sqlStartDate);
                    pst.setDate(5, sqlEndDate);
                    pst.setString(6, lres);
                    pst.setString(7, lstat);

                    int rowsAffected = pst.executeUpdate();

                    if (rowsAffected > 0) {
                        con.commit();
                        JOptionPane.showMessageDialog(this, "Sick Leave submitted, wait for approval.");
                        JOptionPane.showMessageDialog(this, "Check your address for approval");
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to submit Sick Leave.");
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please check console for details.");
                ex.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_inActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email;
    private javax.swing.JLabel empid;
    private javax.swing.JLabel emplbl;
    private javax.swing.JLabel emplbl1;
    private javax.swing.JLabel emplbl2;
    private javax.swing.JLabel emplbl3;
    private javax.swing.JLabel emplbl4;
    private com.toedter.calendar.JDateChooser end;
    private javax.swing.JButton in;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextArea res;
    public static javax.swing.JTextField search;
    private com.toedter.calendar.JDateChooser start;
    private javax.swing.JLabel stat;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
