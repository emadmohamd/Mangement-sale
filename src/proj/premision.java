/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import java.awt.Color;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static proj.Connections.con;

/**
 *
 * @author emada
 */
public class premision extends javax.swing.JFrame {

   int xx;
   int yy;
    public premision() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("تحديد صلاحيات المستخدمين");
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proj/ok.png"))); // NOI18N
        jButton1.setText("تطبيق");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(108, 122, 137));
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("أسم المستخدم");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("التصريح");

        c3.setBackground(new java.awt.Color(44, 62, 80));
        c3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setText("المخزن");

        c4.setBackground(new java.awt.Color(44, 62, 80));
        c4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setText("الحسابات");

        c1.setBackground(new java.awt.Color(44, 62, 80));
        c1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setText("المبيعات");

        c2.setBackground(new java.awt.Color(44, 62, 80));
        c2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setText("المشتريات");

        c5.setBackground(new java.awt.Color(44, 62, 80));
        c5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 255));
        c5.setText("مستخدم عام");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(c5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(c3)
                                            .addGap(71, 71, 71)
                                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(c4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(c2))))
                                .addGap(53, 53, 53)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c3)
                            .addComponent(c1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c4)
                            .addComponent(c2))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(c5)
                .addGap(102, 102, 102)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(244, 128, 36));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(244, 128, 36));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 536, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String ee=jTextField1.getText();
      String p="";
   if(c1.isSelected()){
     p="USE mbeaat1\n" +
" GRANT ALL PRIVILEGES  ON Table_2 TO "+ee+"";  
       
   }
   if(c2.isSelected()){
     p+="USE mbeaat1\n" +
" GRANT ALL PRIVILEGES  ON DITEM TO "+ee+"";  
       
   }
   if(c3.isSelected()){
     p+="USE mbeaat1\n" +
" GRANT ALL PRIVILEGES  ON makhzn TO "+ee+"";  
       
   }
    if(c4.isSelected()){
     p+="USE mbeaat1\n" +
" GRANT ALL PRIVILEGES  ON deon TO "+ee+"";  
       
   }
    if(c5.isSelected()){
    
        p+="use mbeaat1\n" +
"GO\n" +
"GRANT DELETE ON [dbo].[Table_2]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT INSERT ON [dbo].[Table_2]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT SELECT ON [dbo].[Table_2]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT UPDATE ON [dbo].[Table_2]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT DELETE ON [dbo].[ITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT INSERT ON [dbo].[ITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT SELECT ON [dbo].[ITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT UPDATE ON [dbo].[ITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT DELETE ON [dbo].[DITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT INSERT ON [dbo].[DITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT SELECT ON [dbo].[DITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT UPDATE ON [dbo].[DITEM]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT DELETE ON [dbo].[deon]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT INSERT ON [dbo].[deon]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT SELECT ON [dbo].[deon]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT UPDATE ON [dbo].[deon]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT DELETE ON [dbo].[makhzn]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT INSERT ON [dbo].[makhzn]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT SELECT ON [dbo].[makhzn]TO "+ee+"\n" +
"GO\n" +
"use mbeaat1\n" +
"GO\n" +
"GRANT UPDATE ON [dbo].[makhzn]TO "+ee+"\n" +
"GO";
        
    }
    
       con=Connections.getConnection();
         try{  
             Statement stmt = con.createStatement();
              int rs = stmt.executeUpdate(""+p+"");
                       
                 
                      
                     String SMessage = "تم أضافةتصريح لهذا المستخدم";

                            JOptionPane.showMessageDialog(null,SMessage,"Message",JOptionPane.PLAIN_MESSAGE); 
                
      
      
         }
      catch(Exception ex){
          
          
         }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    
    }//GEN-LAST:event_formWindowClosed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground((new Color(44,62,80)));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground((new Color(244,128,36)));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        page1 pp=new page1();
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx=evt.getX();
        yy=evt.getY();

    }//GEN-LAST:event_jPanel3MousePressed

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
            java.util.logging.Logger.getLogger(premision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(premision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(premision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(premision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new premision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
