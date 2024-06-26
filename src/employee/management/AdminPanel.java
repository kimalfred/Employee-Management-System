/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.management;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Kim Alfred
 */
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        Container c=this.getContentPane();
        Color clr=new Color(255,255,255);
        c.setBackground(clr);
        showDate();
        showTime();
    }
        void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        date.setText(s.format(d));

    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss a");
                time.setText(s.format(d));
            }
        }
        ).start();

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
        jLabel3 = new javax.swing.JLabel();
        emp = new javax.swing.JPanel();
        ELBL = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        attend = new javax.swing.JPanel();
        ALBL = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        staff = new javax.swing.JPanel();
        SLBL = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        salary = new javax.swing.JPanel();
        S2LBL = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dept = new javax.swing.JPanel();
        DLBL = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        proj = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        PLBL = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        HLBL = new javax.swing.JLabel();
        Info = new javax.swing.JLabel();
        log = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        Admin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/candidate.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        emp.setBackground(new java.awt.Color(102, 0, 0));
        emp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ELBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ELBL.setText("Employee");
        ELBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ELBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ELBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ELBLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ELBLMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/emp.png"))); // NOI18N

        javax.swing.GroupLayout empLayout = new javax.swing.GroupLayout(emp);
        emp.setLayout(empLayout);
        empLayout.setHorizontalGroup(
            empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ELBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        empLayout.setVerticalGroup(
            empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ELBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        attend.setBackground(new java.awt.Color(102, 0, 0));
        attend.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ALBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ALBL.setText("Attendance");
        ALBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ALBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ALBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ALBLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ALBLMousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/attendance.png"))); // NOI18N

        javax.swing.GroupLayout attendLayout = new javax.swing.GroupLayout(attend);
        attend.setLayout(attendLayout);
        attendLayout.setHorizontalGroup(
            attendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ALBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        attendLayout.setVerticalGroup(
            attendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ALBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        staff.setBackground(new java.awt.Color(102, 0, 0));
        staff.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SLBL.setText("Staff Leave");
        SLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SLBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SLBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SLBLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SLBLMousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/sick.png"))); // NOI18N

        javax.swing.GroupLayout staffLayout = new javax.swing.GroupLayout(staff);
        staff.setLayout(staffLayout);
        staffLayout.setHorizontalGroup(
            staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SLBL)
                .addGap(66, 66, 66))
        );
        staffLayout.setVerticalGroup(
            staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SLBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        salary.setBackground(new java.awt.Color(102, 0, 0));
        salary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        S2LBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        S2LBL.setText("Salary");
        S2LBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                S2LBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                S2LBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                S2LBLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                S2LBLMousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/download.png"))); // NOI18N

        javax.swing.GroupLayout salaryLayout = new javax.swing.GroupLayout(salary);
        salary.setLayout(salaryLayout);
        salaryLayout.setHorizontalGroup(
            salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(S2LBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        salaryLayout.setVerticalGroup(
            salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salaryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14))
            .addGroup(salaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(S2LBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dept.setBackground(new java.awt.Color(102, 0, 0));
        dept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DLBL.setText("Department");
        DLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DLBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DLBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DLBLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DLBLMousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/dept.png"))); // NOI18N

        javax.swing.GroupLayout deptLayout = new javax.swing.GroupLayout(dept);
        dept.setLayout(deptLayout);
        deptLayout.setHorizontalGroup(
            deptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DLBL)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        deptLayout.setVerticalGroup(
            deptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DLBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deptLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15))
        );

        proj.setBackground(new java.awt.Color(102, 0, 0));
        proj.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/proj2.png"))); // NOI18N

        PLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PLBL.setText("Projects");
        PLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PLBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PLBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PLBLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PLBLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout projLayout = new javax.swing.GroupLayout(proj);
        proj.setLayout(projLayout);
        projLayout.setHorizontalGroup(
            projLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(PLBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        projLayout.setVerticalGroup(
            projLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16))
            .addGroup(projLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PLBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        home.setBackground(new java.awt.Color(102, 0, 0));
        home.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/home.png"))); // NOI18N

        HLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HLBL.setText("Home");
        HLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HLBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HLBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HLBLMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HLBLMousePressed(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HLBL)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13))
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HLBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Info.setBackground(new java.awt.Color(255, 255, 0));
        Info.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Info.setForeground(new java.awt.Color(0, 0, 102));
        Info.setText("Dashboard");

        log.setBackground(new java.awt.Color(102, 0, 0));
        log.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        log.setForeground(new java.awt.Color(0, 0, 0));
        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/log.png"))); // NOI18N
        log.setText("Logout");
        log.setBorder(new javax.swing.border.MatteBorder(null));
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logMouseExited(evt);
            }
        });
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(staff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(salary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Info, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Info)
                .addGap(33, 33, 33)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(attend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(log)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 800));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("CBZ Corporation");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/1.png"))); // NOI18N

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 102));
        date.setText("Date");

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 102));
        time.setText("Time");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(time))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(time)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(date)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1120, 80));

        Admin.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Welcome Admin!");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/Stock.png"))); // NOI18N

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5)))
                .addContainerGap(547, Short.MAX_VALUE))
        );

        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 1120, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HLBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HLBLMouseEntered
        Color clr=new Color(0, 0, 255);
        home.setBackground(clr);
    }//GEN-LAST:event_HLBLMouseEntered

    private void ELBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELBLMouseEntered
        Color clr=new Color(0, 0, 255);
        emp.setBackground(clr);
    }//GEN-LAST:event_ELBLMouseEntered

    private void ELBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELBLMouseExited
        Color clr = new Color(102, 0, 0);  
        emp.setBackground(clr);
    }//GEN-LAST:event_ELBLMouseExited

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        Color clr = new Color(102, 0, 0);
        home.setBackground(clr);
    }//GEN-LAST:event_homeMouseExited

    private void HLBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HLBLMouseExited
        Color clr = new Color(102, 0, 0);
        home.setBackground(clr);
    }//GEN-LAST:event_HLBLMouseExited

    private void ALBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALBLMouseEntered
        Color clr=new Color(0, 0, 255);
        attend.setBackground(clr);
    }//GEN-LAST:event_ALBLMouseEntered

    private void ALBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALBLMouseExited
        Color clr = new Color(102, 0, 0);
        attend.setBackground(clr);
    }//GEN-LAST:event_ALBLMouseExited

    private void SLBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLBLMouseEntered
        Color clr=new Color(0, 0, 255);
        staff.setBackground(clr);
    }//GEN-LAST:event_SLBLMouseEntered

    private void SLBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLBLMouseExited
        Color clr = new Color(102, 0, 0);
        staff.setBackground(clr);
    }//GEN-LAST:event_SLBLMouseExited

    private void S2LBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S2LBLMouseEntered
       Color clr=new Color(0, 0, 255);
       salary.setBackground(clr);
    }//GEN-LAST:event_S2LBLMouseEntered

    private void S2LBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S2LBLMouseExited
        Color clr = new Color(102, 0, 0);
        salary.setBackground(clr);
    }//GEN-LAST:event_S2LBLMouseExited

    private void DLBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLBLMouseEntered
        Color clr=new Color(0, 0, 255);
       dept.setBackground(clr);
    }//GEN-LAST:event_DLBLMouseEntered

    private void DLBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLBLMouseExited
        Color clr = new Color(102, 0, 0);
        dept.setBackground(clr);
    }//GEN-LAST:event_DLBLMouseExited

    private void PLBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLBLMouseEntered
        Color clr=new Color(0, 0, 255);
        proj.setBackground(clr);
    }//GEN-LAST:event_PLBLMouseEntered

    private void PLBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLBLMouseExited
       Color clr = new Color(102, 0, 0);
       proj.setBackground(clr);
    }//GEN-LAST:event_PLBLMouseExited

    private void HLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HLBLMouseClicked
        Home home=new Home();
        Admin.removeAll();
        Admin.add(home).setVisible(true);
    }//GEN-LAST:event_HLBLMouseClicked

    private void ELBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELBLMouseClicked
        try {
            Employee emp=new Employee();
            Admin.removeAll();
            Admin.add(emp).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ELBLMouseClicked

    private void HLBLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HLBLMousePressed
        Info.setText("Home");
    }//GEN-LAST:event_HLBLMousePressed

    private void ELBLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELBLMousePressed
        Info.setText("Employee List");
    }//GEN-LAST:event_ELBLMousePressed

    private void ALBLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALBLMousePressed
        Info.setText("Employee Attendance");
    }//GEN-LAST:event_ALBLMousePressed

    private void SLBLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLBLMousePressed
        Info.setText("Staff Leaves");
    }//GEN-LAST:event_SLBLMousePressed

    private void S2LBLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S2LBLMousePressed
        Info.setText("Employee Salary");
    }//GEN-LAST:event_S2LBLMousePressed

    private void DLBLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLBLMousePressed
        Info.setText("Departments");
    }//GEN-LAST:event_DLBLMousePressed

    private void PLBLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLBLMousePressed
        Info.setText("Projects Assign");
    }//GEN-LAST:event_PLBLMousePressed

    private void ALBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ALBLMouseClicked
        Attendance attend=new Attendance();
        Admin.removeAll();
        Admin.add(attend).setVisible(true);
    }//GEN-LAST:event_ALBLMouseClicked

    private void SLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SLBLMouseClicked
        StaffLeave staff=new StaffLeave();
        Admin.removeAll();
        Admin.add(staff).setVisible(true);
    }//GEN-LAST:event_SLBLMouseClicked

    private void S2LBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S2LBLMouseClicked
        Salary sal=new Salary();
        Admin.removeAll();
        Admin.add(sal).setVisible(true);
    }//GEN-LAST:event_S2LBLMouseClicked

    private void DLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLBLMouseClicked
        Department dept=new Department();
        Admin.removeAll();
        Admin.add(dept).setVisible(true);
    }//GEN-LAST:event_DLBLMouseClicked

    private void PLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PLBLMouseClicked
        Project proj=new Project();
        Admin.removeAll();
        Admin.add(proj).setVisible(true);
    }//GEN-LAST:event_PLBLMouseClicked

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        Login x = new Login();
        x.setVisible(true);
        dispose();        
    }//GEN-LAST:event_logActionPerformed

    private void logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseEntered
        Color clr=new Color(0, 0, 255);
        log.setBackground(clr);
    }//GEN-LAST:event_logMouseEntered

    private void logMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseExited
        Color clr = new Color(102, 0, 0);
        log.setBackground(clr);
    }//GEN-LAST:event_logMouseExited

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALBL;
    private javax.swing.JPanel Admin;
    private javax.swing.JLabel DLBL;
    private javax.swing.JLabel ELBL;
    private javax.swing.JLabel HLBL;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel PLBL;
    private javax.swing.JLabel S2LBL;
    private javax.swing.JLabel SLBL;
    private javax.swing.JPanel attend;
    private javax.swing.JLabel date;
    private javax.swing.JPanel dept;
    private javax.swing.JPanel emp;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton log;
    private javax.swing.JPanel proj;
    private javax.swing.JPanel salary;
    private javax.swing.JPanel staff;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
