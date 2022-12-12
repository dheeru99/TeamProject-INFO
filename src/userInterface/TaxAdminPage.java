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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
/**
 *
 * @author dheer
 */
public class TaxAdminPage extends javax.swing.JPanel {

    /**
     * Creates new form TaxAdminPage
     */
    JPanel sysLayout;
    UserDirectory userDirectory;
    String id;
    String from;
    String to;
    String host;
    String sub;
    String content;
    public TaxAdminPage(JPanel sysLayout,UserDirectory userDirectory,String id) {
        this.sysLayout=sysLayout;
        this.userDirectory=userDirectory;
        this.id=id;
        initComponents();
        table();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 1080));
        setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "USER ID", "PAYER_NAME", "TAX_ID", "SIN", "ACCOUNT NUMBER", "START_DURATION", "END_DURATION", "ANNUAL_INCOME", "TAXES_PAID", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 50, 1760, 170);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(0, 240, 105, 40);

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("REJECT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(120, 240, 105, 40);

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(1620, 0, 95, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaperflare.com_wallpaper.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1980, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selected =table.getSelectedRow();
         if(selected<0){
             JOptionPane.showMessageDialog(this, "No Row has been selected");
             return;
         }
          DefaultTableModel tbl= (DefaultTableModel)table.getModel();
          String id1= tbl.getValueAt(selected, 2).toString();
          String userId="";
          String claimName="";
          String taxId="";
          String sin="";
          String account="";
          String start="";
          String end="";
          String income="";
          String paid="";
          String status="";
           try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
           userId=ps.getString("USERID");
           claimName=ps.getString("CLAIM_NAME");
           taxId=ps.getString("TAX_ID");
           sin=ps.getString("SIN");
           account=ps.getString("ACCOUNT_NUMBER");
           start=ps.getString("START_DURATION");
           end=ps.getString("END_DURATION");
           income=ps.getString("ANNUAL_INCOME");
           paid=ps.getString("TAXES_PAID");
           status="SENT TO REVIEW FOR TAX_OFFICER PROCESS";
            }
                 }

       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
           
               int r=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("REJECTED")){
                       r++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
       if(r>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already Rejected");

       }else{
           
           
           
           
           
           int c=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("APPROVED")){
                       c++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
       if(c>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already Approved");

       }else{
           
                int p=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("SENT TO FINAL PROCESS")){
                       p++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
       if(p>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already in the Final Process");

       }else{
           
           
           
           
       int count=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("SENT TO REVIEW FOR TAX_OFFICER PROCESS")){
                       count++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
       if(count>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already sent to TAX_OFFICER");

       }else{
           try{
                Connection cn=  db_connection.DatabaseConnector.getConnection();
                String sql = "INSERT INTO TAX_OFFICER(USERID,CLAIM_NAME,TAX_ID, SIN,ACCOUNT_NUMBER,START_DURATION,END_DURATION,ANNUAL_INCOME,TAXES_PAID,STATUS,REFERRED) values(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps= cn.prepareStatement(sql);
                ps.setString(1,userId);
                ps.setString(2,claimName);
                ps.setString(3,taxId);
                ps.setString(4,sin);
                ps.setString(5,account);
                ps.setString(6,start);
                ps.setString(7, end);
                ps.setString(8,income);
                ps.setString(9,paid);
                ps.setString(10, status);
                ps.setString(11,id);
                ps.execute();
                
                try{
            Connection cn1=  db_connection.DatabaseConnector.getConnection();    
            String sql1= "UPDATE TAXES SET STATUS='"+status+"' WHERE TAX_ID='"+id1+"'";
            PreparedStatement ps1= cn1.prepareStatement(sql1);
             ps1.execute();
       
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
                
                JOptionPane.showMessageDialog(this,""+id1+" has successfully sent to TAX_OFFICER..!!");
                table();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
       }}
       }}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   int selected =table.getSelectedRow();
         if(selected<0){
             JOptionPane.showMessageDialog(this, "No Row has been selected");
             return;
         }
          DefaultTableModel tbl= (DefaultTableModel)table.getModel();
          String id1= tbl.getValueAt(selected, 2).toString();
          
          
           int a=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("REJETED") ){
                       a++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        if(a>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already Rejected");

       }else{
          
          
          
          
          
          
           int p1=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("APPROVED") ){
                       p1++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        if(p1>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already Approved");

       }else{
          
          
          
          
          
           int r=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("SENT TO FINAL PROCESS") ){
                       r++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        if(r>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already sent to Final Process");

       }else{
          
          
          
          
          
          
        int count=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("SENT TO REVIEW FOR TAX_OFFICER PROCESS") ){
                       count++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        if(count>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already sent to TAX_OFFICER");

       }else{
            
            int c=0;
       try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
                   if(ps.getString("STATUS").matches("REJECTED") ){
                       c++;
                   }
                 }

            }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        if(c>0){
                     JOptionPane.showMessageDialog(this,""+id1+" is Already Rejected..!!");

       }else{
            String userId="";
                String name="";
                String email="";
            try{
                
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);
      
      
       Statement st2= cn.createStatement();
      String sql2 = "select * from USER";
      ResultSet ps2= st2.executeQuery(sql2);
      
            while(ps.next()){
            if(ps.getString("TAX_ID").equalsIgnoreCase(id1)){
           userId=ps.getString("USERID");
            while(ps2.next()){
           if(userId.equalsIgnoreCase(ps2.getString("ID"))){
               email=ps2.getString("EMAIL");
               name=ps2.getString("NAME");
           }
           }
           
            }}
            }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
            
            
            
            try{
                
                Connection cn1=  db_connection.DatabaseConnector.getConnection();
                        String sql1=  "UPDATE TAXES SET STATUS='REJECTED' WHERE TAX_ID='"+id1+"'";
                        PreparedStatement ps1= cn1.prepareStatement(sql1);
                        ps1.execute();
                        table();
                        
             from ="dheerajjayanth@gmail.com";
             to=email;
             host="localhost";
             sub="Sorry Your claim got Rejected..!!. ";
             content= "Hi "+name+",\n"
                     + "\n"
                     + "We have Rejected your "+id1+" application. Can you please contact the IN NEED website for more information.\n"
                     + "\n"
                     + "Thanks and Regards,\n"
                     + "IN NEED \n"
                     + ""+id+"\n"
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
                        
                        
                        
                        
                        JOptionPane.showMessageDialog(this,""+id1+" has been Rejected Successfully");
                        
            }catch(Exception e){
                        JOptionPane.showMessageDialog(this,e);
                    }
        
        
        }


        }}}}





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         sysLayout.remove(this);
        Component [] componentArray = sysLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        CardLayout layout = (CardLayout) sysLayout.getLayout();
        layout.previous(sysLayout);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
      public void table(){
        DefaultTableModel tbl = (DefaultTableModel)table.getModel();
        tbl.setRowCount(0);
              try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
      
       
     
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);
      

      
          while(ps.next()){
           
           Object[] row = new Object[20];
          row[0]=ps.getString("USERID");
          row[1]=ps.getString("CLAIM_NAME");
          row[2]=ps.getString("TAX_ID");
          row[3]=ps.getString("SIN");
          row[4]=ps.getString("ACCOUNT_NUMBER");
          row[5]=ps.getString("START_DURATION");
          row[6]=ps.getString("END_DURATION");
          row[7]=ps.getString("ANNUAL_INCOME");
          row[8]=ps.getString("TAXES_PAID");
          row[9]=ps.getString("STATUS");
          tbl.addRow(row);
         
          }
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
