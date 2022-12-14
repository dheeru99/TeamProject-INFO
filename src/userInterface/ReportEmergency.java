/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.UserDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dheer
 */
public class ReportEmergency extends javax.swing.JPanel {

    /**
     * Creates new form ReportEmergency
     */
     JPanel innerLayout;
    UserDirectory userDirectory;
    String id;
    public ReportEmergency(JPanel innerLayout, UserDirectory userDirectory,String id) {
        this.id=id;
        this.innerLayout= innerLayout;
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
        txt1 = new javax.swing.JTextField();
        txt2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        txt7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt10 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HELP PEOPLE HOW NEED HELP..!!");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 46);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("INCIDENT NAME");
        add(jLabel2);
        jLabel2.setBounds(380, 60, 125, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(":");
        add(jLabel3);
        jLabel3.setBounds(510, 60, 15, 40);

        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        add(txt1);
        txt1.setBounds(530, 60, 250, 40);

        txt2.setDateFormatString("yyyy-MM-dd");
        add(txt2);
        txt2.setBounds(530, 160, 250, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(":");
        add(jLabel4);
        jLabel4.setBounds(510, 210, 15, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("DATE");
        add(jLabel5);
        jLabel5.setBounds(380, 160, 125, 40);
        add(txt3);
        txt3.setBounds(530, 260, 250, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText(":");
        add(jLabel6);
        jLabel6.setBounds(510, 260, 15, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("STREET");
        add(jLabel7);
        jLabel7.setBounds(380, 260, 125, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CITY");
        add(jLabel8);
        jLabel8.setBounds(380, 310, 125, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText(":");
        add(jLabel9);
        jLabel9.setBounds(510, 310, 15, 40);
        add(txt4);
        txt4.setBounds(530, 310, 250, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("PICTURE");
        add(jLabel10);
        jLabel10.setBounds(380, 410, 125, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText(":");
        add(jLabel11);
        jLabel11.setBounds(510, 410, 15, 40);
        add(txt6);
        txt6.setBounds(530, 410, 250, 40);

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("UPLOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(800, 410, 84, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("REPORT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(530, 460, 101, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(380, 460, 101, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("POSTAL CODE");
        add(jLabel12);
        jLabel12.setBounds(380, 360, 125, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText(":");
        add(jLabel13);
        jLabel13.setBounds(510, 360, 15, 40);
        add(txt5);
        txt5.setBounds(530, 360, 250, 40);
        add(txt7);
        txt7.setBounds(900, 40, 300, 300);

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(640, 460, 101, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("INCIDENT TYPE");
        add(jLabel14);
        jLabel14.setBounds(380, 210, 125, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText(":");
        add(jLabel15);
        jLabel15.setBounds(510, 110, 15, 40);
        add(txt9);
        txt9.setBounds(530, 110, 250, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("INCIDENT ID");
        add(jLabel16);
        jLabel16.setBounds(380, 110, 125, 40);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText(":");
        add(jLabel17);
        jLabel17.setBounds(510, 160, 15, 40);

        txt10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "POLICE", "HOSPITAL", "FIRE_ENGINE" }));
        add(txt10);
        txt10.setBounds(530, 210, 250, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String incident= txt1.getText();
            String date= String.valueOf(txt2.getDate());
            String street= txt3.getText();
            String city= txt4.getText();
            String postalCode= txt5.getText();
             File path =new File(txt6.getText());
             String type = String.valueOf(txt10.getSelectedItem());
             String id1= txt9.getText();
            if(incident.equals("")){
                JOptionPane.showMessageDialog(this, "Incident is Mandatory..!!");
            }else if(type.matches("SELECT")){
                JOptionPane.showMessageDialog(this, "Incident Type is Mandatory..!!");
            }else if(street.equals("")){
                JOptionPane.showMessageDialog(this, "Street is Mandatory..!!");
            }else if(city.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this, "City is Mandatory..!!");
            }else if(postalCode.equals("")){
                JOptionPane.showMessageDialog(this, "PostalCode is Mandatory..!!");
            }else if(String.valueOf(path).equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(this, "Image is Mandatory..!!");
            }else if(txt7.getIcon()==null){
                JOptionPane.showMessageDialog(this, "Image is Mandatory..!!");
            }else{      
             
              Date date1 = new Date(date);
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
                }else if(year<=newYear && month<=newMonth && day>newDay){
                          JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
                }else{
                 
                     try{
        Connection cn=  db_connection.DatabaseConnector.getConnection();
            String sql = "INSERT INTO INCIDENT(USERID,INCIDENT,INCIDENT_ID,INCIDENT_DATE,INCIDENT_TYPE,STREET,CITY,POSTAL_CODE,PICTURE,STATUS) values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1,id);
            ps.setString(2,incident);
            ps.setString(3,id1);
            ps.setString(4,date.substring(0, 10));
            ps.setString(5, type);
            ps.setString(6,street);
            ps.setString(7, city);
            ps.setString(8,postalCode);
            ps.setString(9,String.valueOf(path));
            ps.setString(10, "IN_PROGRESS");
            ps.execute();
            JOptionPane.showMessageDialog(this,""+incident+" raised Created Successfully..!!");
            clear();
        }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }
                    
                }       
                }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
 byte[] image =null;
String imageName=null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser file = new JFileChooser();
            
            FileFilter alter = new FileNameExtensionFilter("JPG",ImageIO.getReaderFileSuffixes());
            FileFilter alter1 = new FileNameExtensionFilter("JPEG",ImageIO.getReaderFileSuffixes());
            FileFilter alter2 = new FileNameExtensionFilter("PNG",ImageIO.getReaderFileSuffixes());
            FileFilter alter3 = new FileNameExtensionFilter("TIFF",ImageIO.getReaderFileSuffixes());
            FileFilter alter4 = new FileNameExtensionFilter("EPS",ImageIO.getReaderFileSuffixes());
            FileFilter alter5 = new FileNameExtensionFilter("PSD",ImageIO.getReaderFileSuffixes());
            file.setFileFilter(alter);
            file.setFileFilter(alter1);
            file.setFileFilter(alter2);
            file.setFileFilter(alter3);
            file.setFileFilter(alter4);
            file.setFileFilter(alter5);
            file.showOpenDialog(null);
            File file1=file.getSelectedFile();
            if(file1 == null){
                JOptionPane.showMessageDialog(this, "Please Upload a Profile Picture");
            }else{
            imageName = file1.getAbsolutePath();
            txt6.setText(imageName);
            ImageIcon img = new ImageIcon(file1.toString());
            Image img1 = img.getImage();
            Image img2 = img1.getScaledInstance(300,200,Image.SCALE_SMOOTH);
            ImageIcon icon= new ImageIcon(img2); 
            txt7.setIcon(icon);
            }
        

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         innerLayout.remove(this);
        Component [] componentArray = innerLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        ListReportEmergency ms = (ListReportEmergency) c;
        ms.table();
        CardLayout layout = (CardLayout) innerLayout.getLayout();
        layout.previous(innerLayout);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked



            int z=0;
        String userId1 =null;

        try{
      Connection cn= db_connection.DatabaseConnector.getConnection();

     Statement st= cn.createStatement();
      String sql = "select * from INCIDENT";
      ResultSet ps= st.executeQuery(sql);
       while(ps.next()){
           if(id.matches(ps.getString("USERID"))){
                  if(String.valueOf(ps.getString("INCIDENT_ID")).isEmpty()){
                       txt9.setText("U00"+id+"I0"+"1"); 
                  }else{
                  userId1=String.valueOf(ps.getString("INCIDENT_ID").substring(6));
                   z= Integer.parseInt(userId1);
                }}}
         
              txt9.setText("U00"+id+"I0"+String.valueOf(++z));

        }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
      }




        // TODO add your handling code here:
    }//GEN-LAST:event_txt1MouseClicked

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
      

        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed


    public void clear(){
        txt1.setText("");
        txt2.setDate(null);
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setIcon(null);
        txt9.setText("");
        txt10.setSelectedIndex(0);
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txt1;
    private javax.swing.JComboBox<String> txt10;
    private com.toedter.calendar.JDateChooser txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt9;
    // End of variables declaration//GEN-END:variables
}
