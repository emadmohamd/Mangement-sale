/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj;

import com.sun.javafx.scene.control.skin.TableHeaderRow;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PrintJob;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import java.beans.Statement;
import java.text.DateFormat;
import static java.text.DateFormat.DEFAULT;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import static proj.Connections.con;

import ttable.modeel;
import ttable.query11;
import ttable.t1;
/**
 *
 * @author emada
 */
public class panel2 extends javax.swing.JPanel {

  
    Statement stmt;
    ResultSet rs;
    
    private static int headeer=40;
    
    public panel2() {
        
         try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(panel2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(panel2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(panel2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(panel2.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        /*................*/
        
       
        
        
        initComponents();
         db();
         
         
         
         
         
         
         
         
       //................table 1..................  
         
         
         
  
    //.....................tabel2...............................
         
       jTable2.getTableHeader().setReorderingAllowed(false);
       
   JTableHeader theaderr = jTable2.getTableHeader();
   theaderr.setBackground(Color.ORANGE);
     theaderr.setPreferredSize(new Dimension(100, headeer));
    
       theaderr.setForeground(Color.WHITE);
       
          Font fd = new Font("Arial", Font.BOLD, 20);
           theaderr.setFont(fd);
            ((DefaultTableCellRenderer)theaderr.getDefaultRenderer())
             .setHorizontalAlignment(JLabel.CENTER);
         /*.....>.......................................................................*/
             DefaultTableCellRenderer rightRendererr = new DefaultTableCellRenderer();
          rightRendererr.setHorizontalAlignment((int) CENTER_ALIGNMENT);
       TableModel ttableModel = jTable2.getModel();
      for (int columnIndex = 0; columnIndex < ttableModel.getColumnCount(); columnIndex++)
   {
    jTable2.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRendererr);
 }
         
         
      //...............table3...........................  
      
     String ttm=(String) jComboBox3.getSelectedItem();
        
        try{
 
   String sql="SELECT name,typee,priceremain,kmeaa\n" +
"FROM ITEM,DITEM,makhzn";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("priceremain");
   String qw=Integer.toString(ww);
   jsaar.setText(qw);
    int uu=rs.getInt("kmeaa");
    String tt=jjkmea.getText();
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel7.setText(u);
    
}
      
      }catch(Exception e){
           System.out.print(e); 
        }
      //.........................................................................
      
      String tm=(String) jComboBox1.getSelectedItem();
        con=Connections.getConnection();
        try{
        
   
   String sql="SELECT name,typee,price,kmeaa\n" +
"FROM ITEM,DITEM,makhzn";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("price");
   String qw=Integer.toString(ww);
   jTextField5.setText(qw);
    int uu=rs.getInt("kmeaa");
    String tt=jkmea.getText();
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel2.setText(u);
    
    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    } 
        
      
      
      //...................................................
      panelbody.removeAll();
      panelbody.repaint();
      panelbody.revalidate();
    
      // Here Table Style
      
       jScrollPane1.getVerticalScrollBar().setUI(new MyScrollBarUI());
       jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollBarUI());
       jScrollPane2.getVerticalScrollBar().setUI(new MyScrollBarUI());
       jScrollPane2.getHorizontalScrollBar().setUI(new MyScrollBarUI());
      
       jScrollPane4.getVerticalScrollBar().setUI(new MyScrollBarUI());
       jScrollPane4.getHorizontalScrollBar().setUI(new MyScrollBarUI());
      
       
       
     
       
       /////////////////////////////////////////////////
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelbody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jkmea = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblsub = new javax.swing.JLabel();
        jtype = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jjkmea = new javax.swing.JTextField();
        jpaid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jtotal = new javax.swing.JTextField();
        jremain = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jsaar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();

        jLabel5.setText("jLabel5");

        setBackground(new java.awt.Color(44, 62, 80));
        setPreferredSize(new java.awt.Dimension(1088, 665));

        jLabel1.setBackground(new java.awt.Color(44, 62, 80));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("المبيعات");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setOpaque(true);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guest-64.png"))); // NOI18N
        jButton1.setText("زبون");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guest-64.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgg/guest-64(1).png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checked-user-64.png"))); // NOI18N
        jButton2.setText("عميل");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checked-user-64.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgg/checked-user-64(1).png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panelbody.setBackground(new java.awt.Color(44, 62, 80));
        panelbody.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                panelbodyComponentRemoved(evt);
            }
        });
        panelbody.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelbodyMouseMoved(evt);
            }
        });
        panelbody.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("اسم المادة");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("الكمية");

        jkmea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jkmea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkmeaActionPerformed(evt);
            }
        });
        jkmea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jkmeaKeyPressed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("السعر");

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton3.setText("بيع");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea2.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton6.setBackground(new java.awt.Color(51, 102, 255));
        jButton6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        jButton6.setText("طباعة");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jComboBox1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBox1MouseMoved(evt);
            }
        });
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-icon.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("المجموع");

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "المادة", "النوعية", "الكمية", "السعر", "المجموع"
            }
        ));
        jTable2.setRowHeight(25);
        jScrollPane4.setViewportView(jTable2);

        lblsub.setBackground(new java.awt.Color(44, 62, 80));
        lblsub.setForeground(new java.awt.Color(44, 62, 80));
        lblsub.setText("jLabel2");

        jtype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtypeActionPerformed(evt);
            }
        });
        jtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtypeKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("النوعية");

        jLabel2.setBackground(new java.awt.Color(44, 62, 80));
        jLabel2.setForeground(new java.awt.Color(44, 62, 80));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblsub)
                                        .addGap(163, 163, 163))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(215, 215, 215)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtype)
                                    .addComponent(jkmea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jButton7))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jkmea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addComponent(lblsub))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        panelbody.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("اسم المادة");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("الكمية");

        jjkmea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jpaid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jpaid.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("المبلغ المتبقي");

        jButton4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton4.setText("بيع");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("اسم المشتري");

        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        jButton5.setText("طباعة");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-icon.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jComboBox3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jComboBox3MouseMoved(evt);
            }
        });
        jComboBox3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtotal.setText("0");

        jremain.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jremain.setText("0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("المبلغ المدفوع");

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1564226442101L), null, java.util.Calendar.DAY_OF_MONTH));

        jLabel18.setForeground(new java.awt.Color(49, 60, 60));
        jLabel18.setText("jLabel18");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("المجموع");

        jsaar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jsaar.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("السعر");

        jLabel7.setBackground(new java.awt.Color(44, 62, 80));
        jLabel7.setForeground(new java.awt.Color(44, 62, 80));
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpaid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jjkmea, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jsaar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(160, 160, 160)
                                .addComponent(jremain, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jjkmea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsaar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jremain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jSpinner1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelbody.add(jPanel2, "card3");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelbody.add(jComboBox5, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelbodyComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_panelbodyComponentRemoved
       
        
    
     

        
        
        
        
    }//GEN-LAST:event_panelbodyComponentRemoved

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       jButton1.setIcon(jButton1.getSelectedIcon());
       jButton1.setBackground(new Color(49,60,60));
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton2.setIcon(jButton2.getRolloverSelectedIcon());
       jButton2.setBackground(new Color(0,153,153));
             jButton1.setIcon(jButton1.getSelectedIcon());
             jButton1.setBackground(new Color(49,60,60));
             
             
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jButton2.setIcon(jButton2.getSelectedIcon());
       jButton2.setBackground(new Color(49,60,60));
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setIcon(jButton2.getSelectedIcon());
       jButton2.setBackground(new Color(49,60,60));
       
             jButton1.setIcon(jButton1.getRolloverSelectedIcon());
             jButton1.setBackground(new Color(0,153,153));
             
             
             
              
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
    
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
     
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       panelbody.removeAll();  /* Add panel1 one */
              panelbody.repaint();
              panelbody.revalidate();
              panelbody.add(jPanel1);
              panelbody.repaint();
              panelbody.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      
       
       DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
       int row=dtm.getRowCount();
       int col=dtm.getColumnCount();
       Object [][] rco= new Object[row][col];
        for (int i = 0 ; i < row ; i++) for (int j = 0 ; j < col ; j++) rco[i][j] = dtm.getValueAt(i,j); for (int i = 0 ; i < row ; i++)
       { for (int j = 0 ; j < col ; j++){ jTextArea2.append((String) rco[i][j] ); jTextArea2.append("\n"); } } 
       
       
       
       
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      jTextArea1.setText(jTextField11.getText()+"\n"+jComboBox3.getSelectedItem()+"\n"+jjkmea.getText()+"\n"+jpaid.getText()+"\n"+jremain.getText()+"\n"+jtotal.getText());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


 
//.................................

        vvv();
     String val1=jComboBox1.getSelectedItem().toString();
     String val2=jtype.getText();
     String val3=jkmea.getText();
     String val4=jTextField5.getText();
 
     int v2=Integer.parseInt(val3);
     int v3=Integer.parseInt(val4);
     int v4=v2 * v3;
     String val5=Integer.toString(v4);
     
     
     
     
     Object[] row={val1,val2,val3,val4,val5};
       DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
       model.addRow(row);
       JTableHeader theader = jTable2.getTableHeader();
   theader.setBackground(Color.darkGray);
     theader.setPreferredSize(new Dimension(70, headeer));
    
       theader.setForeground(Color.WHITE);
       
          Font f = new Font("Arial", Font.BOLD, 20);
           theader.setFont(f);
            ((DefaultTableCellRenderer)theader.getDefaultRenderer())
             .setHorizontalAlignment(JLabel.CENTER);
         /*.....>.......................................................................*/
             DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
          rightRenderer.setHorizontalAlignment((int) CENTER_ALIGNMENT);
       TableModel tableModel = jTable2.getModel();
      for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
   {
    jTable2.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
 }

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      panelbody.removeAll();  /* Add panel1 one */
              panelbody.repaint();
              panelbody.revalidate();
              panelbody.add(jPanel2);
              panelbody.repaint();
              panelbody.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
               con=Connections.getConnection();
               
                    try{
        
  
   String sql="Insert into deon (nname,name,kmea,price,pricepaid,priceremain,totalprice,date)values(?,?,?,?,?,?,?,?)";
   PreparedStatement pst=con.prepareStatement(sql);
     
 

   pst.setString(1,jTextField11.getText());
      String bb= jComboBox3.getSelectedItem().toString();
   pst.setString(2,bb);
      
      String d=jjkmea.getText();
      int dd=Integer.parseInt(d);
   pst.setInt(3, dd);
      String  e=jsaar.getText();
      int ee=Integer.parseInt(e);
   pst.setInt(4,ee);
      String f=jpaid.getText();
      int ff=Integer.parseInt(f);
   pst.setInt(5, ff);
   
   
   
   int eee=Integer.parseInt(d);
   int fff=Integer.parseInt(e);
   int ggg=Integer.parseInt(f);
   int sss=eee * fff;
   
   int qqq=sss-ggg;
   pst.setInt(6, qqq);
   
   
   
   //.......................
   String qwe=jsaar.getText();
   int ewq=Integer.parseInt(qwe);
   String ert=jjkmea.getText();
   int tre=Integer.parseInt(ert);
   
   int zzz=ewq * tre;

   
      pst.setInt(7,zzz );
 
   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   String dateformat=sdf.format(jSpinner1.getValue());
  jLabel18.setText(dateformat);
  String sas=jLabel18.getText();
  Timestamp sa=Timestamp.valueOf(sas);
  pst.setTimestamp(8,sa);
   
   
   pst.executeUpdate();
    String ssql="UPDATE makhzn SET kmeaa=? WHERE namee=? ";
   PreparedStatement pssst=con.prepareStatement(ssql);
  String qa=jLabel7.getText();
  int aq=Integer.parseInt(qa);
  
  pssst.setInt(1, aq);
  pssst.setString(2,bb);
   pssst.executeUpdate();
   
   
   
   JOptionPane.showMessageDialog(null,"تم البيع وحفظ في سجل الديون");
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    }
            
               
           
           
           
           
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      String aa=jTextArea2.getText();
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setJobName("Printing:  "+aa);
        job.setPrintable(new Printable() {
          @Override
          public int print(Graphics pg, PageFormat pf, int pageIndex) throws PrinterException {
           
             if(pageIndex>0){
                 
                 return Printable.NO_SUCH_PAGE;
                 
             } 
             Graphics2D gg=(Graphics2D)pg;
             gg.translate(pf.getImageableX(), pf.getImageableY());
             jTextArea2.print(gg);
             return Printable.PAGE_EXISTS;
          }
      });
       boolean ok=job.printDialog();
       if(ok){
        try{
          job.print();
            
        }   
        catch(PrinterException ex){
            
        }   
           
           
           
       }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String aa=jTextArea1.getText();
        
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setJobName("Printing:  "+aa);
        job.setPrintable(new Printable() {
          @Override
          public int print(Graphics pg, PageFormat pf, int pageIndex) throws PrinterException {
           
             if(pageIndex>0){
                 
                 return Printable.NO_SUCH_PAGE;
                 
             } 
             Graphics2D gg=(Graphics2D)pg;
             gg.translate(pf.getImageableX(), pf.getImageableY());
             jTextArea2.print(gg);
             return Printable.PAGE_EXISTS;
          }
      });
       boolean ok=job.printDialog();
       if(ok){
        try{
          job.print();
            
        }   
        catch(PrinterException ex){
            
        }   
           
           
           
       }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
       
        String tm=(String) jComboBox1.getSelectedItem();
        con=Connections.getConnection();
        try{
        
  
   String sql="SELECT namee,typeee,kmeaa,priceremain\n" +
"FROM makhzn,DITEM";
PreparedStatement pst=con.prepareStatement(sql);
pst.setString(1, tm);
rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("priceremain");
   String qw=Integer.toString(ww);
   jTextField5.setText(qw);
    int uu=rs.getInt("kmeaa");
    String tt=jkmea.getText();
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel2.setText(u);
    
    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    } 
        
        
        
        
        
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jkmeaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jkmeaKeyPressed
    
    }//GEN-LAST:event_jkmeaKeyPressed

    private void jkmeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkmeaActionPerformed
     
    }//GEN-LAST:event_jkmeaActionPerformed

    private void jComboBox3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeInvisible
      String tm=(String) jComboBox3.getSelectedItem();
        
        try{
        
   con=Connections.getConnection();
   String sql="SELECT name,typee,priceremain,kmeaa\n" +
"FROM ITEM,DITEM,makhzn";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("priceremain");
   String qw=Integer.toString(ww);
   jsaar.setText(qw);
    int uu=rs.getInt("kmeaa");
    String tt=jjkmea.getText();
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel7.setText(u);
    
    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    } 
        
    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeInvisible

    private void jtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtypeActionPerformed

    private void jtypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtypeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtypeKeyPressed

    private void jComboBox1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseMoved
       String tm=(String) jComboBox1.getSelectedItem();
        con=Connections.getConnection();
        try{
    
   String sql="SELECT namee,typeee,kmeaa,priceremain\n" +
"FROM makhzn,DITEM";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("priceremain");
   String qw=Integer.toString(ww);
   jTextField5.setText(qw);
  
    int uu=rs.getInt("kmeaa");
    String tt=jkmea.getText();
    
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel2.setText(u);

    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    } 
        
    }//GEN-LAST:event_jComboBox1MouseMoved

    private void panelbodyMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbodyMouseMoved
      String tm=(String) jComboBox1.getSelectedItem();
        con=Connections.getConnection();
        try{
    
   String sql="SELECT namee,typeee,kmeaa,priceremain\n" +
"FROM makhzn,DITEM";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("priceremain");
   String qw=Integer.toString(ww);
   jTextField5.setText(qw);
  
    int uu=rs.getInt("kmeaa");
    String tt=jkmea.getText();
    
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel2.setText(u);

    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    }
      //......................................................................................
       String ttm=(String) jComboBox3.getSelectedItem();
        
        try{
 
   String sql="SELECT name,typee,priceremain,kmeaa\n" +
"FROM ITEM,DITEM,makhzn";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("priceremain");
   String qw=Integer.toString(ww);
   jsaar.setText(qw);
    int uu=rs.getInt("kmeaa");
    String tt=jjkmea.getText();
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel7.setText(u);
    
}
      
      }catch(Exception e){
           System.out.print(e); 
        }
      
      
      
    }//GEN-LAST:event_panelbodyMouseMoved

    private void jComboBox3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseMoved
       String tm=(String) jComboBox3.getSelectedItem();
        
        try{
        
   con=Connections.getConnection();
   String sql="SELECT name,typee,priceremain,kmeaa\n" +
"FROM ITEM,DITEM,makhzn";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    
    int ww=rs.getInt("priceremain");
   String qw=Integer.toString(ww);
   jsaar.setText(qw);
    int uu=rs.getInt("kmeaa");
    String tt=jjkmea.getText();
    int ty=Integer.parseInt(tt);
    int ert=uu - ty;
    
    
    
    
    String u=Integer.toString(ert);
    jLabel7.setText(u);
    
    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    } 
        
    }//GEN-LAST:event_jComboBox3MouseMoved
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jjkmea;
    private javax.swing.JTextField jkmea;
    private javax.swing.JTextField jpaid;
    private javax.swing.JTextField jremain;
    private javax.swing.JTextField jsaar;
    private javax.swing.JTextField jtotal;
    private javax.swing.JTextField jtype;
    private javax.swing.JLabel lblsub;
    private javax.swing.JPanel panelbody;
    // End of variables declaration//GEN-END:variables

public void db(){
   con=Connections.getConnection();
    try{
        
  
   String sql="SELECT name,typee,priceremain,kmeaa\n" +
"FROM ITEM,DITEM,makhzn";
PreparedStatement pst=con.prepareStatement(sql);

rs=pst.executeQuery();
while(rs.next()){
    String nm=rs.getString("name");
    jComboBox1.addItem(nm);
    jComboBox3.addItem(nm);
   
    
    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    }
 
    
} 
 public void sub(){
     con=Connections.getConnection();
      try{
        
   
   String sqll="SELECT [kmea]\n" +
"  FROM [dbo].[makhzn]";
   PreparedStatement pst=con.prepareStatement(sqll);
     
    rs=pst.executeQuery();
    
  
  
   //.............................
   
       String tm=(String) jComboBox1.getSelectedItem();
        con=Connections.getConnection();
        try{
        
   
   String sql="SELECT * FROM makhzn WHERE name=?";
PreparedStatement ppst=con.prepareStatement(sql);
pst.setString(1, tm);
rs=ppst.executeQuery();
if(rs.next()){
       int ee=rs.getInt("kmea");
       String ss=jkmea.getText();
       int dd=Integer.parseInt(ss);
       int ff=ee - dd;
       String gg=Integer.toString(ff);
       jLabel2.setText(gg);
   
    
    
}
 
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    } 
  
   
   //............................................   
   pst.executeUpdate();
   JOptionPane.showMessageDialog(null,"تم البيع");
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
     
     
 }

 }

public void vvv(){
    
    
      
    con=Connections.getConnection();
    
  try{
        
   
   String sql="Insert into Table_2(name,kmea,typ,price,totalprice)values(?,?,?,?,?)";
   PreparedStatement pst=con.prepareStatement(sql);
  
  String tm=(String) jComboBox1.getSelectedItem();
      String bb= jComboBox1.getSelectedItem().toString();
   pst.setString(1,bb);
    
      String d=jkmea.getText();
      int dd=Integer.parseInt(d);
   pst.setInt(2, dd);
     
   pst.setString(3,jtype.getText());
    String  e=jTextField5.getText();
      int ee=Integer.parseInt(e);
   pst.setInt(4, ee);
int rr=Integer.parseInt(d);
int rrr=Integer.parseInt(e);
int rrrr=rr*ee;

   pst.setInt(5, rrrr);
   pst.executeUpdate();
  //....... 
   
   String ssql="UPDATE makhzn SET kmeaa=? WHERE namee=? ";
   PreparedStatement pssst=con.prepareStatement(ssql);
  String qa=jLabel2.getText();
  int aq=Integer.parseInt(qa);

  
  
  pssst.setInt(1, aq);
  pssst.setString(2,bb);
   pssst.executeUpdate();
   //.............
   
  

   
   //.....
   JOptionPane.showMessageDialog(null,"تم البيع");
    }
    catch(Exception e){
        
        System.out.print(e.getMessage());
        
    }
   
}

    
    
}


    
    










