/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.SystemAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author dheer
 */
public class ForgetPasswordPage extends javax.swing.JPanel {

    /**
     * Creates new form ForgetPasswordPage
     */
    JPanel rightLayout;
    SystemAdmin sysAdmin;
     String from;
    String to;
    String host;
    String sub;
    String content;
    public ForgetPasswordPage(JPanel rightLayout,SystemAdmin sysAdmin) {
        this.rightLayout=rightLayout;
        this.sysAdmin=sysAdmin;
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

        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(":");

        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(":");

        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt2MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SEND CODE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(299, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        rightLayout.remove(this);
        Component [] componentArray = rightLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        CardLayout layout = (CardLayout) rightLayout.getLayout();
        layout.previous(rightLayout);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_txt1MouseClicked

    private void txt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String userName= txt1.getText();
        String email= txt2.getText();
        String name="";
        int min = 0;
        int max = 1000000;
        int b = (int)(Math.random()*(max-min+1)+min);
        String otp=String.valueOf(b);
        int count=0;
        try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from user";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
                if(userName.matches(ps.getString("USERNAME"))){
                    if(email.matches(ps.getString("EMAIL"))){
                        name=ps.getString("NAME");
                      count++;  
                    }
       
         }
            }

       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        if(count<=0){
            clear();
                      JOptionPane.showMessageDialog(this,"Please provide valid Information...!!!");

        }else{
           
            
             from ="dheerajjayanth@gmail.com";
                        to=email;
                        host="localhost";
                        sub="Forgot Password...!!";
                        content= "Hi "+name+",\n"
                        + "\n"
                        + "Your OTP is "+otp+". If you are not tried to change the password please contact the in need website for more information.\n"
                        + "\n"
                        + "Thanks and Regards,\n"
                        + "IN_NEED\n"
                        + "\n"
                        + "\n"
                        + "If you have any concerns. Please contact us by +1 4375184224 or dheerajjayanth@gmail.com";
                        Properties p= new Properties();
                        p.put("mail.smtp.auth", "true");
                        p.put("mail.smtp.starttls.enable", "true");
                        p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
                        p.put("mail.smtp.host", "smtp.gmail.com");
                        p.put("mail.smtp.port", "587");

                        Session s= Session.getDefaultInstance(p, new javax.mail.Authenticator(){
                            protected PasswordAuthentication getPasswordAuthentication(){
                                return new PasswordAuthentication("dheerajjayanth@gmail.com","rtowuvazupeivdmr");
                            }
                        });
                        try{
                            MimeMessage m = new MimeMessage(s);
                            m.setFrom(from);
                            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                            m.setSubject(sub);
                            m.setText(content);
                            Transport.send(m);
                        }catch(Exception e){
                            e.printStackTrace();
                        }
            
            
            JOptionPane.showMessageDialog(this,"OTP has sent your Email Id: "+email+"");
             clear();
        VerificationPage directory = new VerificationPage(rightLayout,sysAdmin,otp,userName);
        rightLayout.add("VerificationPage",directory);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);  
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void clear(){
        txt1.setText("");
        txt2.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}
