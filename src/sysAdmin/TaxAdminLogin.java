/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sysAdmin;

import attributes.SystemAdmin;
import attributes.UserDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dheer
 */
public class TaxAdminLogin extends javax.swing.JPanel {

    /**
     * Creates new form UserPortal
     */
JPanel rightLayout;
    SystemAdmin sysAdmin;
    UserDirectory userDirectory;
    JPanel rightLayout1;
    
    public TaxAdminLogin(JPanel rightLayout1,JPanel rightLayout, SystemAdmin sysAdmin) {
        this.rightLayout=rightLayout;
        this.rightLayout1=rightLayout1;
        this.sysAdmin=sysAdmin;
        initComponents();
        userDirectory= sysAdmin.getUserDirectory();
        clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt2 = new javax.swing.JPasswordField();
        radio = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TAX ADMIN LOGIN");
        add(jLabel1);
        jLabel1.setBounds(520, 40, 550, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("USERNAME");
        add(jLabel3);
        jLabel3.setBounds(590, 90, 200, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(":");
        add(jLabel2);
        jLabel2.setBounds(790, 90, 13, 40);

        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });
        add(txt1);
        txt1.setBounds(820, 90, 250, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PASSWORD");
        add(jLabel4);
        jLabel4.setBounds(590, 140, 200, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(":");
        add(jLabel5);
        jLabel5.setBounds(790, 140, 13, 40);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(820, 200, 100, 40);

        jButton2.setBackground(new java.awt.Color(255, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(940, 200, 100, 40);
        add(txt2);
        txt2.setBounds(820, 140, 250, 40);

        radio.setBackground(new java.awt.Color(255, 255, 255));
        radio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radio.setText("VIEW");
        radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActionPerformed(evt);
            }
        });
        add(radio);
        radio.setBounds(1080, 140, 60, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaperflare.com_wallpaper.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1980, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
     

            // TODO add your handling code here:
    }//GEN-LAST:event_txt1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String userName= txt1.getText();
        String password= txt2.getText();
        
        try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
      
     Statement st= cn.createStatement();
      String sql = "select * from ADMIN";
      ResultSet ps= st.executeQuery(sql);
      String un="";
      String pass= "";
      String id="";
       while(ps.next()){
       if(String.valueOf(ps.getString("USERNAME")).matches(userName)){
           un=String.valueOf(ps.getString("USERNAME"));
           if(String.valueOf(ps.getString("PASSWORD")).matches(password)){
               pass=String.valueOf(ps.getString("PASSWORD"));
               id=String.valueOf(ps.getString("ADMINID"));
           }
       }
       }
       if(!un.matches("")){ 
                if(!pass.matches("")){
                    clear();
                    
        TaxAdminPage directory = new TaxAdminPage(rightLayout,userDirectory,id);
        rightLayout.add("TaxAdminPage",directory);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);  
                }
                else{
            JOptionPane.showMessageDialog(this,"Password is Invalid");
            clear();
           }
       }else{
            JOptionPane.showMessageDialog(this,"UserName doesn't exists. Please Enter valid credentials");
            clear();
       }
       
          }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActionPerformed
            if(radio.isSelected()){
                txt2.setEchoChar((char)0);
            }else{
                txt2.setEchoChar('*');
            }


        // TODO add your handling code here:
    }//GEN-LAST:event_radioActionPerformed
    public void clear(){
        txt1.setText("");
        txt2.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radio;
    private javax.swing.JTextField txt1;
    private javax.swing.JPasswordField txt2;
    // End of variables declaration//GEN-END:variables
}