/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback.management;

import feedback.management.dbconnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul
 */
public class display_library extends javax.swing.JFrame {

   
    public display_library() {
        initComponents();
        show_user();
        libsum.setText(Integer.toString(getSum()));
        libavg.setText(Float.toString(getAverage()));
    }
    public ArrayList<library> al(){
    ArrayList<library> al=new ArrayList<>();
    library disp;
     try {
                     
                    Connection con=dbconnection.getconnection();
                    Statement st=con.createStatement();
                    String query = "SELECT * FROM for_lib";
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next())
                    {
                         disp = new library(rs.getString("sttname"),rs.getString("dept"),rs.getString("course"),rs.getString("semester"),rs.getString("fl1"),rs.getString("fl2"),rs.getString("fl3"),rs.getString("fl4"),rs.getString("fl5"));
                         al.add(disp);
                        
                    }
                    
                    
     }
     catch (SQLException ex) {
                    Logger.getLogger(display_library.class.getName()).log(Level.SEVERE, null, ex);
                }
     return al;
    
}
    public void show_user(){
         ArrayList<library> list= al();
         DefaultTableModel model =(DefaultTableModel)libtable.getModel();
         Object [] row=new Object[9];
         for(int i=0;i<list.size();i++)
         {
             row[0]=list.get(i).getName();
             row[1]=list.get(i).getDep();
             row[2]=list.get(i).getCourse();
             row[3]=list.get(i).getSem();
             row[4]=list.get(i).getQ1();
             row[5]=list.get(i).getQ2();
             row[6]=list.get(i).getQ3();
             row[7]=list.get(i).getQ4();
             row[8]=list.get(i).getQ5();
             
             model.addRow(row);
         }
         
 }
 public int getSum(){
     int rowsCount = libtable.getRowCount();
     int sum = 0;
     for(int i = 0;i<rowsCount; i++){
         sum = sum+Integer.parseInt(libtable.getValueAt(i,4).toString());
         sum = sum+Integer.parseInt(libtable.getValueAt(i,5).toString());
         sum = sum+Integer.parseInt(libtable.getValueAt(i,6).toString());
         sum = sum+Integer.parseInt(libtable.getValueAt(i,7).toString());
         sum = sum+Integer.parseInt(libtable.getValueAt(i,8).toString());
         
     }
     return sum;
 }
 public float getAverage(){
     float sum = getSum();
     int rowsCount = libtable.getRowCount();
     float average = sum/rowsCount;
     return average;
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        libtable = new javax.swing.JTable();
        libsum = new javax.swing.JTextField();
        libavg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        libtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "dep", "course", "sem", "Q1", "Q2", "Q3", "Q4", "Q5"
            }
        ));
        jScrollPane1.setViewportView(libtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 810, 390);
        getContentPane().add(libsum);
        libsum.setBounds(440, 470, 140, 30);

        libavg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libavgActionPerformed(evt);
            }
        });
        getContentPane().add(libavg);
        libavg.setBounds(440, 520, 140, 30);

        jLabel1.setText("Sum");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 476, 100, 20);

        jLabel2.setText("Avg");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 530, 100, 14);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 453, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void libavgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libavgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libavgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new report_admin().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(display_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(display_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(display_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(display_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display_library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libavg;
    private javax.swing.JTextField libsum;
    private javax.swing.JTable libtable;
    // End of variables declaration//GEN-END:variables
}
