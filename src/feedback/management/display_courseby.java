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
public class display_courseby extends javax.swing.JFrame {

    String passedvl;
    String query, value;
    
    /**
     * Creates new form display
     */
    public display_courseby(String course) {
        initComponents();
        
        jTextField2.setText(course);
        value = course;
        
        show_user();
        sm1adm.setText(Integer.toString(getSum()));
        av1adm.setText(Float.toString(getAverage()));
//        throw new UnsupportedOperationException("Not supported yet."); 
    }


    public ArrayList<coursebyview> al(){
    ArrayList<coursebyview> al=new ArrayList<>();
    coursebyview disp;
     try {
         
                      if(value.equals("bvoc software development")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'BVoc.Software Development'";
       }else if(value.equals("bvoc multimedia")){
           System.out.println("hi");
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bvoc multimedia'"; 
       }else if(value.equals("bvoc accounting and taxation")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bvoc accounting and taxation'";
       }else if(value.equals("bvoc banking and finance")){
           query = "SELECT * FROM   form_staff WHERE cor LIKE 'bvoc banking and finance'";       
       }else if(value.equals("bvoc fashion technology")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bvoc fashion technology'";                      
       }else if(value.equals("bvoc agriculture")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bvoc agriculture'";                                
       }else if(value.equals("bsc maths")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bsc maths'";                                      
       }else if(value.equals("bsc physics")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bsc physics'";                                                     
       }else if(value.equals("bsc chemistry")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bsc chemistry'";                                                                 
       }else if(value.equals("bsc botany")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bsc botany'";                                                                            
       }else if(value.equals("bsc zoology")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bsc zoology'";                                                                                     
       }else if(value.equals("ba english")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'ba english'";                                                                                                 
       }else if(value.equals("ba sociology")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'ba sociology'";                                                                                                             
       }else if(value.equals("ba history")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'ba history'";                                                                                                                   
       }else if(value.equals("ba political science")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'ba political science'";                                                                                                                                 
       }else if(value.equals("bba")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bba'";                                                                                                                                          
       }else if(value.equals("bca")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bca'";                                                                                                                                
       }else if(value.equals("bcom computer application")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bcom computer application'";                                                                                                                                          
       }else if(value.equals("bcom finance")){
           query = "SELECT * FROM form_staff WHERE cor LIKE 'bcom finance'";                                                                                                                                                     
       }  
                     
                    Connection con=dbconnection.getconnection();
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next())
                    {
                            disp = new coursebyview(rs.getString("tname"),rs.getString("sname"),rs.getString("dep"),rs.getString("cor"),rs.getString("sem"),rs.getString("Q1"),rs.getString("Q2"),rs.getString("Q3"),rs.getString("Q4"),rs.getString("Q5"),rs.getString("Q6"),rs.getString("Q7"),rs.getString("Q8"),rs.getString("Q9"),rs.getString("Q10"));
                         al.add(disp);
                        
                    }
                    
                    
     }
     catch (SQLException ex) {
                    Logger.getLogger(display_courseby.class.getName()).log(Level.SEVERE, null, ex);
                }
     return al;
    
}
 public void show_user(){
         ArrayList<coursebyview> list= al();
         DefaultTableModel model =(DefaultTableModel)table.getModel();
         Object [] row=new Object[15];
         for(int i=0;i<list.size();i++)
         {
             row[0]=list.get(i).getLecture();
             row[1]=list.get(i).getName();
             row[2]=list.get(i).getDep();
             row[3]=list.get(i).getCourse();
             row[4]=list.get(i).getSem();
             row[5]=list.get(i).getQa1();
             row[6]=list.get(i).getQa2();
             row[7]=list.get(i).getQa3();
             row[8]=list.get(i).getQa4();
             row[9]=list.get(i).getQa5();
             row[10]=list.get(i).getQa6();
             row[11]=list.get(i).getQa7();
             row[12]=list.get(i).getQa8();
             row[13]=list.get(i).getQa9();
             row[14]=list.get(i).getQa10();
             
             model.addRow(row);
         }
         
 }
 public int getSum(){
     int rowsCount = table.getRowCount();
     int sum = 0;
     for(int i = 0;i<rowsCount; i++){
         sum = sum+Integer.parseInt(table.getValueAt(i,5).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,6).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,7).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,8).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,9).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,10).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,11).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,12).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,13).toString());
         sum = sum+Integer.parseInt(table.getValueAt(i,14).toString());
         
     }
     return sum;
 }
 public float getAverage(){
     float sum = getSum();
     int rowsCount = table.getRowCount();
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
        table = new javax.swing.JTable();
        av1adm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sm1adm = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "lecture", "name", "dep", "course", "sem", "Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9", "Q10"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setText("AVERAGE");

        jLabel2.setText("SUM");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(av1adm, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(sm1adm))
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(sm1adm, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(av1adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(display_courseby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(display_courseby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(display_courseby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(display_courseby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display_courseby(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField av1adm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField sm1adm;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    
}   

