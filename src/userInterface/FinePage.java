/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.UserDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dheer
 */
public class FinePage extends javax.swing.JPanel {

    /**
     * Creates new form FinePage
     */
    JPanel innerLayout;
    UserDirectory userDirectory;
    String id;
    String from;
    String to;
    String host;
    String sub;
    String content;
    public FinePage(JPanel innerLayout,UserDirectory userDirectory,String id) {
       this.innerLayout=innerLayout;
       this.id=id;
       this.userDirectory=userDirectory;
        initComponents();
        table();
         txt1.setEditable(false);
          txt2.setEditable(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "INCIDENT_ID", "FINE AMOUNT", "REASON"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 102));
        jLabel3.setText("INCIDENT ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setText("FINE AMOUNT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 102));
        jLabel6.setText("ACCOUNT NUMBER");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(":");

        txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt3MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });

        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(235, 235, 235)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selected =table.getSelectedRow();
         if(selected<0){
             JOptionPane.showMessageDialog(this, "No Row has been selected");
             return;
         }
          DefaultTableModel tbl= (DefaultTableModel)table.getModel();
        
        String incidentId=tbl.getValueAt(selected, 0).toString();
        try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from FINE";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
                if(incidentId.matches(ps.getString("INCIDENT_ID"))){
                    txt1.setText(ps.getString("INCIDENT_ID"));
                   
                    txt2.setText(ps.getString("FINE_AMOUNT"));
                   

         }
            }

       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void txt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int selected =table.getSelectedRow();
         if(selected<0){
             JOptionPane.showMessageDialog(this, "No Row has been selected");
             return;
         }
          DefaultTableModel tbl= (DefaultTableModel)table.getModel();
        
        String incidentId=tbl.getValueAt(selected, 0).toString();
        
        String fine=txt2.getText();
        String account=txt3.getText();

        if(account.matches("")){
                      JOptionPane.showMessageDialog(this,"Account Number is Mandatory...!!");

        }else{
            int a=0;
        try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
      
     Statement st= cn.createStatement();
      String sql = "select * from BANK";
      ResultSet ps= st.executeQuery(sql);
       while(ps.next()){
        if(String.valueOf(ps.getString("USERID")).matches(id))  {
            if(ps.getString("STATUS").matches("APPROVED")){
            if(account.matches(ps.getString("ACCOUNT_NUMBER"))){
                a++;
            }}
        } 
       }
       if(a<=0){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Account Number. If you dont have any bank account please create Bank Account");
                }else {
       String actual= "";
           try{
            
            Connection cn5= db_connection.DatabaseConnector.getConnection();

            Statement st8= cn5.createStatement();
            String sql8 = "select * from BANK";
            ResultSet ps8= st8.executeQuery(sql8);
            while(ps8.next()){
                if(ps8.getString("ACCOUNT_NUMBER").matches(account)){
                    actual= ps8.getString("AMOUNT");
                }
            }
            }catch(Exception e){
                            e.printStackTrace();
                        }
           int total =0;
           if(Integer.parseInt(fine)>Integer.parseInt(actual)){
                JOptionPane.showMessageDialog(this, "Your account doesn't have sufficient balance to pay the fine. Please try again..!");
           }else{
               total=Integer.parseInt(actual)-Integer.parseInt(fine);
               
              
                
                
                
                String userId="";
                    String name="";
                    String email="";
                    try{

                        Connection cn2= db_connection.DatabaseConnector.getConnection();

                        Statement st2= cn2.createStatement();
                        String sql2 = "select * from FINE";
                        ResultSet ps2= st2.executeQuery(sql2);

                        Statement st3= cn2.createStatement();
                        String sql3 = "select * from USER";
                        ResultSet ps3= st3.executeQuery(sql3);

                        while(ps2.next()){
                            if(ps2.getString("INCIDENT_ID").equalsIgnoreCase(incidentId)){
                                userId=ps2.getString("USERID");
                                while(ps3.next()){
                                    if(userId.equalsIgnoreCase(ps3.getString("ID"))){
                                        email=ps3.getString("EMAIL");
                                        name=ps3.getString("NAME");
                                    }
                                }

                            }}
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(this,e);
                        }

                


                        from ="dheerajjayanth@gmail.com";
                        to=email;
                        host="localhost";
                        sub="Payment was Successfull...!!!";
                        content= "Hi "+name+",\n"
                        + "\n"
                        + "Your payment has successfully completed. Your fine of "+fine+" CAD paid from your account. If you have any queries please visit the IN_NEED website.\n"
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
                        
                        
                         String sql6= "UPDATE BANK SET AMOUNT='"+total+"' WHERE ACCOUNT_NUMBER='"+account+"'";
                PreparedStatement ps6= cn.prepareStatement(sql6);
                ps6.execute();
               
               
               String sql7= "DELETE FROM FINE WHERE INCIDENT_ID='"+incidentId+"'";
                PreparedStatement ps7= cn.prepareStatement(sql7);
                ps7.execute();
                
                JOptionPane.showMessageDialog(this, "Your Fine has been Paid Successfully...!!");
                
                clear();
               table();
           }
       
       
       }
       
       
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        }




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1MouseClicked

    private void txt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        innerLayout.remove(this);
        Component [] componentArray = innerLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        CardLayout layout = (CardLayout) innerLayout.getLayout();
        layout.previous(innerLayout);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    public void clear(){
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
    } 
    public void table(){
        DefaultTableModel tbl = (DefaultTableModel)table.getModel();
        tbl.setRowCount(0);
              try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from FINE";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
                if(id.matches(ps.getString("USERID"))){

           Object[] row = new Object[20];
          row[0]=ps.getString("INCIDENT_ID");
          row[1]=ps.getString("FINE_AMOUNT");
          row[2]=ps.getString("REASON");
          tbl.addRow(row);
         }
            }

       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
