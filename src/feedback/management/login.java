/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback.management;

//import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        choosecombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("USERNAME");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 140, 240, 60);

        usertxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(usertxt);
        usertxt.setBounds(260, 210, 250, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 280, 250, 50);

        passtxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(passtxt);
        passtxt.setBounds(260, 350, 260, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("TYPE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 440, 70, 30);

        choosecombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choosecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff", "Student" }));
        jPanel1.add(choosecombo);
        choosecombo.setBounds(340, 440, 180, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 520, 130, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 910, 110);

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\anjana\\4thsem project\\pro pics\\log1.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 110, 1450, 630);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String type=choosecombo.getSelectedItem().toString();
    String user=usertxt.getText();
            String password=passtxt.getText(); 
             System.out.println("Username "+user);
            System.out.println("Password "+password);
     if(type.equals("Admin")){
        try   
     {
           Connection con=dbconnection.getconnection();
            Statement st=con.createStatement();
String Query="select * from adminpage where username='"+user+"' and password='"+password+"' ";
ResultSet r=st.executeQuery(Query);
if(r.next()){
    JOptionPane.showMessageDialog(rootPane," login success");
    new admin_page().setVisible(true);
    this.setVisible(false);
}else{
   JOptionPane.showMessageDialog(rootPane," login failed"); 
}

    }//GEN-LAST:event_jButton1ActionPerformed
catch (SQLException ex) {
    //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
}
     }else if(type.equals("Student")){
        try   
     {
           Connection con=dbconnection.getconnection();
            Statement st=con.createStatement();
String Query="select * from std_reg where username='"+user+"' and password='"+password+"' ";
ResultSet r=st.executeQuery(Query);
if(r.next()){
    JOptionPane.showMessageDialog(rootPane," login success");
    new std_page().setVisible(true);
    
}else{
   JOptionPane.showMessageDialog(rootPane," login failed"); 
}

    }                                        
catch (SQLException ex) {
    //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
}
     }else if(type.equals("Staff")){
        try   
     {
           Connection con=dbconnection.getconnection();
            Statement st=con.createStatement();
String Query="select * from staff_reg where username='"+user+"' and password='"+password+"' ";
ResultSet r=st.executeQuery(Query);
if(r.next()){
    JOptionPane.showMessageDialog(rootPane," login success");
    new staff_page().setVisible(true);
    this.setVisible(false);
}else{
   JOptionPane.showMessageDialog(rootPane," login failed"); 
}

    }                                        
catch (SQLException ex) {
    //Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
}
     }
}
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> choosecombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables

    private void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
