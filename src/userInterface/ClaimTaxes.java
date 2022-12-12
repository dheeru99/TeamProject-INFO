/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.UserDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.MONTHS;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dheer
 */
public class ClaimTaxes extends javax.swing.JPanel {

    /**
     * Creates new form CliamTaxes
     */
  JPanel innerLayout;
    UserDirectory userDirectory;
    String id;
    public ClaimTaxes(JPanel innerLayout, UserDirectory userDirectory, String id) {
        this.innerLayout= innerLayout;
        this.id=id;
        this.userDirectory=userDirectory;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt12 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt15 = new javax.swing.JTextField();
        txt14 = new com.toedter.calendar.JDateChooser();
        txt13 = new com.toedter.calendar.JDateChooser();
        txt2 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt17 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLAIM YOUR PAYS");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 46);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NAME OF CLAIM");
        add(jLabel2);
        jLabel2.setBounds(380, 60, 125, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(":");
        add(jLabel3);
        jLabel3.setBounds(510, 60, 15, 40);
        add(txt12);
        txt12.setBounds(530, 160, 250, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(":");
        add(jLabel4);
        jLabel4.setBounds(510, 160, 15, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SIN");
        add(jLabel5);
        jLabel5.setBounds(380, 160, 125, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText(":");
        add(jLabel6);
        jLabel6.setBounds(510, 260, 15, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("START DURATION");
        add(jLabel7);
        jLabel7.setBounds(380, 260, 125, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("END DURATION");
        add(jLabel8);
        jLabel8.setBounds(380, 310, 125, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText(":");
        add(jLabel9);
        jLabel9.setBounds(510, 310, 15, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("TAXES PAID");
        add(jLabel10);
        jLabel10.setBounds(380, 410, 125, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText(":");
        add(jLabel11);
        jLabel11.setBounds(510, 410, 15, 40);
        add(txt16);
        txt16.setBounds(530, 410, 250, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CLAIM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(530, 460, 101, 40);

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(640, 460, 101, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ANNUAL INCOME");
        add(jLabel12);
        jLabel12.setBounds(380, 360, 125, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText(":");
        add(jLabel13);
        jLabel13.setBounds(510, 360, 15, 40);
        add(txt15);
        txt15.setBounds(530, 360, 250, 40);

        txt14.setDateFormatString("yyyy-MM-dd");
        add(txt14);
        txt14.setBounds(530, 310, 250, 40);

        txt13.setDateFormatString("yyyy-MM-dd");
        add(txt13);
        txt13.setBounds(530, 260, 250, 40);
        add(txt2);
        txt2.setBounds(530, 360, 250, 40);

        txt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt11MouseClicked(evt);
            }
        });
        txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt11ActionPerformed(evt);
            }
        });
        add(txt11);
        txt11.setBounds(530, 60, 250, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(380, 460, 101, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("TAX_ID");
        add(jLabel14);
        jLabel14.setBounds(380, 110, 125, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText(":");
        add(jLabel15);
        jLabel15.setBounds(510, 110, 15, 40);
        add(txt17);
        txt17.setBounds(530, 210, 250, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText(":");
        add(jLabel16);
        jLabel16.setBounds(510, 210, 15, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("BANK ACCOUNT NUMBER");
        add(jLabel17);
        jLabel17.setBounds(345, 210, 160, 40);
        add(txt9);
        txt9.setBounds(530, 110, 250, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name= txt11.getText();
        String sin= txt12.getText();
        String start= String.valueOf(txt13.getDate());
        String end= String.valueOf(txt14.getDate());
        String amount= txt15.getText();
        String tax = txt16.getText();
        String id1= txt9.getText();
        String account= txt17.getText();
        
         if(name.equals("")){
                JOptionPane.showMessageDialog(this, "Name of Claim is Mandatory..!!");
            }else if(sin.equals("")){
                JOptionPane.showMessageDialog(this, "SIN is Mandatory..!!");
            }else if(amount.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this, "amount is Mandatory..!!");
            }else if(tax.equals("")){
                JOptionPane.showMessageDialog(this, "tax is Mandatory..!!");
            }else if(account.equals("")){
                JOptionPane.showMessageDialog(this, "tax is Mandatory..!!");
            }else{ 
        
        Date date1 = new Date(start);
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String regDate=f.format(date1);
        LocalDate newDate = LocalDate.now();
        String newDate1 = String.valueOf(newDate);
        Integer year = Integer.parseInt(regDate.substring(0,4));
        Integer month = Integer.parseInt(regDate.substring(5,7));
        Integer day = Integer.parseInt(regDate.substring(8,10));

        Integer newYear = Integer.parseInt(newDate1.substring(0,4));
        Integer newMonth = Integer.parseInt(newDate1.substring(5,7));
        Integer newDay = Integer.parseInt(newDate1.substring(8,10));
        
        if(year>newYear){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else if(year<=newYear && month>newMonth){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else if(year<newYear && month<=newMonth && day>newDay){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else if(year.equals(newYear) && month<=newMonth && day>newDay){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else{
            
            
            Date date2 = new Date(end);
        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
        String regDate1=f1.format(date2);
        LocalDate newDate3 = LocalDate.now();
        String newDate2 = String.valueOf(newDate3);
        Integer year1 = Integer.parseInt(regDate1.substring(0,4));
        Integer month1 = Integer.parseInt(regDate1.substring(5,7));
        Integer day1 = Integer.parseInt(regDate1.substring(8,10));

        Integer newYear1 = Integer.parseInt(newDate2.substring(0,4));
        Integer newMonth1 = Integer.parseInt(newDate2.substring(5,7));
        Integer newDay1 = Integer.parseInt(newDate2.substring(8,10));
        
         if(year1>newYear1){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else if(year1<=newYear1 && month1>newMonth1){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else if(year1<newYear1 && month1<=newMonth1 && day1>newDay1){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else if(year1.equals(newYear1) && month1<=newMonth1 && day1>newDay1){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
        }else{
        
        
        String s="";
        try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
      
     Statement st= cn.createStatement();
      String sql = "select * from user";
      ResultSet ps= st.executeQuery(sql);
       while(ps.next()){
        if(String.valueOf(ps.getString("ID")).matches(id))  {
            s=ps.getString("SIN");
        } 
       }  
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        
        
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
       }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
        
        
        
                if(!name.matches("^[a-zA-z ]*$")){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Claim Name");
                }else if((year1-year )<0){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Date. End Date should come after Start Date");
                }else if((year1-year )>=0 && (month1-month)<0){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Date. End Date should come after Start Date");
                }else if((year1-year )>0 && (month1-month)>=0 && (day1-day)<0){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Date. End Date should come after Start Date");
                }else if((year1-year )==0 && (month1-month)>=0 && (day1-day)<0){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Date. End Date should come after Start Date");
                }else if(sin.matches("[a-zA-Z]+") || !sin.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid SIN Number");
                }else if(!sin.matches(s)){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid SIN Number");
                }else if(amount.matches("[a-zA-Z]+") || !amount.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Amount");
                }else if(tax.matches("[a-zA-Z]+") || !tax.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Tax Amount");
                }else if(a<=0){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Account Number. If you dont have any bank account please create Bank Account");
                }else {

            try{
                Connection cn=  db_connection.DatabaseConnector.getConnection();
                String sql = "INSERT INTO TAXES(USERID,CLAIM_NAME,TAX_ID, SIN,ACCOUNT_NUMBER,START_DURATION,END_DURATION,ANNUAL_INCOME,TAXES_PAID,STATUS) values(?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps= cn.prepareStatement(sql);
                ps.setString(1,id);
                ps.setString(2,name);
                ps.setString(3,id1);
                ps.setString(4,sin);
                ps.setString(5, account);
                ps.setString(6,start.substring(0, 10));
                ps.setString(7, end.substring(0, 10));
                ps.setString(8,amount);
                ps.setString(9,tax);
                ps.setString(10, "IN_PROGRESS");
                ps.execute();
                JOptionPane.showMessageDialog(this,""+name+" raised Created Successfully..!!");
                clear();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
        }
        }
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        innerLayout.remove(this);
        Component [] componentArray = innerLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        ListTaxClaim ms = (ListTaxClaim) c;
        ms.table();
        CardLayout layout = (CardLayout) innerLayout.getLayout();
        layout.previous(innerLayout);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt11MouseClicked


          int z=0;
        String userId1 =null;

        try{
      Connection cn= db_connection.DatabaseConnector.getConnection();

     Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);
       while(ps.next()){
           if(id.matches(ps.getString("USERID"))){
                  if(String.valueOf(ps.getString("TAX_ID")).isEmpty()){
                       txt9.setText("U00"+id+"T0"+"1"); 
                  }else{
                  userId1=String.valueOf(ps.getString("TAX_ID").substring(6));
                   z= Integer.parseInt(userId1);
                }}}
         
              txt9.setText("U00"+id+"T0"+String.valueOf(++z));

        }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }

        // TODO add your handling code here:
    }//GEN-LAST:event_txt11MouseClicked

    private void txt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt11ActionPerformed
         


        // TODO add your handling code here:
    }//GEN-LAST:event_txt11ActionPerformed
public void clear(){
    txt11.setText("");
    txt12.setText("");
    txt13.setDate(null);
    txt14.setDate(null);
    txt15.setText("");
    txt16.setText("");
    txt9.setText("");
    txt17.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private com.toedter.calendar.JDateChooser txt13;
    private com.toedter.calendar.JDateChooser txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt2;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}
