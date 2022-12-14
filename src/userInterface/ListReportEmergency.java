/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.UserDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dheer
 */
public class ListReportEmergency extends javax.swing.JPanel {

    /**
     * Creates new form ListReportEmergency
     */
 JPanel innerLayout;
    UserDirectory userDirectory;
    String id;
    public ListReportEmergency(JPanel innerLayout, UserDirectory userDirectory,String id) {
        this.id=id;
        this.innerLayout= innerLayout;
        this.userDirectory=userDirectory;
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
        txt1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "INCIDENT", "INCIDENT_ID", "INDCIDENT_DATE", "INCIDENT TYPE", "STREET", "CITY", "POSTAL_CODE", "PICTURE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("FINE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 393, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
         int selected =table.getSelectedRow();
         if(selected<0){
             JOptionPane.showMessageDialog(this, "No Row has been selected");
             return;
         }
          DefaultTableModel tbl= (DefaultTableModel)table.getModel();
        ImageIcon img = new ImageIcon(tbl.getValueAt(selected, 7).toString());
            Image img1 = img.getImage();
            Image img2 = img1.getScaledInstance(300,200,Image.SCALE_SMOOTH);
            ImageIcon icon= new ImageIcon(img2); 
         txt1.setIcon(icon);

            
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            ReportEmergency directory = new ReportEmergency(innerLayout,userDirectory,id);
        innerLayout.add("ReportEmergency",directory);
        CardLayout layout = (CardLayout)innerLayout.getLayout();
        layout.next(innerLayout); 

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
                FinePage directory = new FinePage(innerLayout,userDirectory,id);
        innerLayout.add("FinePage",directory);
        CardLayout layout = (CardLayout)innerLayout.getLayout();
        layout.next(innerLayout); 


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void table(){
        DefaultTableModel tbl = (DefaultTableModel)table.getModel();
        tbl.setRowCount(0);
              try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
 
        Statement st= cn.createStatement();
      String sql = "select * from incident";
      ResultSet ps= st.executeQuery(sql);

            while(ps.next()){
                if(id.matches(ps.getString("USERID"))){

           Object[] row = new Object[20];
          row[0]=ps.getString("INCIDENT");
          row[1]=ps.getString("INCIDENT_ID");
          row[2]=ps.getString("INCIDENT_DATE");
          row[3]=ps.getString("INCIDENT_TYPE");
          row[4]=ps.getString("STREET");
          row[5]=ps.getString("CITY");
          row[6]=ps.getString("POSTAL_CODE");
          row[7]=ps.getString("PICTURE");
          row[8]=ps.getString("STATUS");
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
