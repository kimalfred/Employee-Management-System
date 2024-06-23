/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package employee.management;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;



/**
 *
 * @author Kim Alfred
 */
public class UserSalary extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private double bHeight;
    
    
    public UserSalary() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
                
    }
   
    public PageFormat getPageFormat(PrinterJob pj){    
        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();    
        double bodyHeight = bHeight;  
        double headerHeight = 5.0;                  
        double footerHeight = 5.0;        
        double width = cm_to_pp(8); 
        double height = cm_to_pp(headerHeight+bodyHeight+footerHeight); 
        paper.setSize(width, height);
        paper.setImageableArea(0,10,width,height - cm_to_pp(1));        
        pf.setOrientation(PageFormat.PORTRAIT);  
        pf.setPaper(paper);    
        return pf;
    }
       
            
protected static double cm_to_pp(double cm)
    {            
	        return toPPI(cm * 0.393600787);            
    }
 
protected static double toPPI(double inch)
    {            
	        return inch * 72d;            

    }                         
    public class BillPrintable implements Printable {
    public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
    throws PrinterException 

    {

        int result = NO_SUCH_PAGE;    
          if (pageIndex == 0) {                    

              Graphics2D g2d = (Graphics2D) graphics;                    
              double width = pageFormat.getImageableWidth();                               
              g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 


            //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));

          try{
              int y=20;
              int yShift = 10;
              int headerRectHeight=15;
             // int headerRectHeighta=40;


              g2d.setFont(new Font("Monospaced",Font.PLAIN,9));

              g2d.drawString("--------------------------------------------------------", 12, y); y += yShift;
              g2d.drawString("                                                        ", 12, y); y += headerRectHeight;
              g2d.drawString("                         PAYSLIP          ", 12, y); y += yShift;
              g2d.drawString("                     [CBZ Tech Inc.]       ", 12, y); y += yShift;
              g2d.drawString("                  Central Signal Village         ", 12, y); y += yShift;
              g2d.drawString("                 Taguig City, Philippines         ", 12, y); y += yShift;
              g2d.drawString("                      +63 0931939392       ", 12, y); y += yShift;
              g2d.drawString("                                                        ", 12, y); y += headerRectHeight;
              g2d.drawString("--------------------------------------------------------", 12, y); y += headerRectHeight;
              g2d.drawString("                                                        ", 12, y); y += headerRectHeight;
              g2d.drawString("Employee Name: " + name.getText(), 10, y); y += yShift;
              g2d.drawString("Employee ID  : " + empid.getText(), 10, y); y += yShift;
              g2d.drawString("Email Address  : " + email.getText(), 10, y); y += yShift;
              g2d.drawString("Position  : " + post.getText(), 10, y); y += yShift;
              g2d.drawString("Pay Date  : " + release.getText(), 10, y); y += yShift;
              g2d.drawString("                                                        ", 12, y); y += headerRectHeight;
              g2d.drawString("--------------------------------------------------------", 10, y); y += headerRectHeight;
              g2d.drawString("Description                                       Amount", 10, y); y += yShift;
              g2d.drawString("--------------------------------------------------------", 10, y); y += headerRectHeight;
              g2d.drawString("Overtime Pay:          " + otpay.getText(), 10, y); y += yShift;
              g2d.drawString("Deduction:            " + deduc.getText(), 10, y); y += yShift;
              g2d.drawString("Salary:            " + salary.getText(), 10, y); y += yShift;
              g2d.drawString("--------------------------------------------------------", 10, y); y += yShift;
              g2d.drawString("Net Salary:            " + net.getText(), 10, y); y += yShift;  
              g2d.drawString("--------------------------------------------------------", 10, y); y += yShift;
              g2d.drawString("                                                        ", 12, y); y += headerRectHeight;
              g2d.drawString("********************************************************", 10, y); y += yShift;
              g2d.drawString("                        THANK YOU         ", 10, y); y += yShift;
              g2d.drawString("********************************************************", 10, y); y += yShift;
              g2d.drawString("                     [CBZ Tech Inc.]         ", 10, y); y += yShift;
              g2d.drawString("               CONTACT: [projecta245@gmail.com]       ", 10, y); y += yShift;  
              g2d.drawString("                     @2024 Copyright         ", 10, y); y += yShift;

      }
      catch(Exception e){
      e.printStackTrace();
      }

                result = PAGE_EXISTS;    
            }    
            return result;    
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
        search = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        stat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        otpay = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        deduc = new javax.swing.JTextField();
        release = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        net = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        print1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        stat.setBackground(new java.awt.Color(51, 51, 51));
        stat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stat.setForeground(new java.awt.Color(51, 51, 51));
        stat.setText("Pending");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");

        empid.setBackground(new java.awt.Color(255, 255, 255));
        empid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        empid.setForeground(new java.awt.Color(0, 0, 0));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));

        otpay.setBackground(new java.awt.Color(255, 255, 255));
        otpay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        otpay.setForeground(new java.awt.Color(0, 0, 0));

        post.setBackground(new java.awt.Color(255, 255, 255));
        post.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        post.setForeground(new java.awt.Color(0, 0, 0));

        deduc.setBackground(new java.awt.Color(255, 255, 255));
        deduc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deduc.setForeground(new java.awt.Color(0, 0, 0));

        release.setBackground(new java.awt.Color(255, 255, 255));
        release.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        release.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Release Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Deduction");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Overtime Pay");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Position");

        salary.setBackground(new java.awt.Color(255, 255, 255));
        salary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salary.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salary");

        print.setBackground(new java.awt.Color(0, 153, 0));
        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setForeground(new java.awt.Color(0, 0, 0));
        print.setText("Print Payslip");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        net.setBackground(new java.awt.Color(255, 255, 255));
        net.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        net.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Net Salary");

        print1.setBackground(new java.awt.Color(0, 153, 0));
        print1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print1.setForeground(new java.awt.Color(0, 0, 0));
        print1.setText("Calculate Salary");
        print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stat)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(net, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(release, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addComponent(otpay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(deduc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(print1)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(release, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otpay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deduc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(post, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(net, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(stat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 920, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String query = "SELECT * FROM payslip_tb WHERE email = ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/javadb", "root", "");

            String sql = "SELECT * FROM payslip_tb WHERE email = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, search.getText());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String setid = rs.getString("emp_id");
                empid.setText(setid);

                String setname = rs.getString("name");
                name.setText(setname);

                String setemail = rs.getString("email");
                email.setText(setemail);
                
                String setposition = rs.getString("position");
                post.setText(setposition);
                
                String setrel = rs.getString("release");
                release.setText(setrel);
                
                String setot = rs.getString("ot_pay");
                otpay.setText(setot);
                
                String setdeduc = rs.getString("deduction");
                deduc.setText(setdeduc);
                
                String setsalary = rs.getString("salary");
                salary.setText(setsalary);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
          
        try{
            pj.print();
        }
        catch(PrinterException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_printActionPerformed

    private void print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print1ActionPerformed
        double otPay = Double.parseDouble(otpay.getText());
        double salaryAmount = Double.parseDouble(salary.getText());
        double totalIncome = otPay + salaryAmount;

        double deduction = Double.parseDouble(deduc.getText());
        double netIncome = totalIncome - deduction;

        String totalString = String.valueOf(totalIncome);
        net.setText(totalString);
    }//GEN-LAST:event_print1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deduc;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField net;
    private javax.swing.JTextField otpay;
    private javax.swing.JTextField post;
    private javax.swing.JButton print;
    private javax.swing.JButton print1;
    private javax.swing.JTextField release;
    private javax.swing.JTextField salary;
    public static javax.swing.JTextField search;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables
}
