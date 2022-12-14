/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user;

import attributes.UserDirectory;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dheer
 */
public class ListTaxClaim extends javax.swing.JPanel {

    /**
     * Creates new form ListTaxClaim
     */
    JPanel innerLayout;
    UserDirectory userDirectory;
    String id;
    public ListTaxClaim(JPanel innerLayout, UserDirectory userDirectory, String id) {
        this.innerLayout= innerLayout;
        this.id=id;
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
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PAYER_NAME", "TAX_ID", "SIN", "ACCOUNT NUMBER", "START_DURATION", "END_DURATION", "ANNUAL_INCOME", "TAXES_PAID", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 502, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClaimTaxes directory = new ClaimTaxes(innerLayout,userDirectory,id);
        innerLayout.add("ClaimTaxes",directory);
        CardLayout layout = (CardLayout)innerLayout.getLayout();
        layout.next(innerLayout);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void table(){
        DefaultTableModel tbl = (DefaultTableModel)table.getModel();
        tbl.setRowCount(0);
              try{
      Connection cn= db_connection.DatabaseConnector.getConnection();
      
       
     
        Statement st= cn.createStatement();
      String sql = "select * from TAXES";
      ResultSet ps= st.executeQuery(sql);
      

      
          while(ps.next()){
                if(id.matches(ps.getString("USERID"))){
           Object[] row = new Object[20];
          row[0]=ps.getString("CLAIM_NAME");
          row[1]=ps.getString("TAX_ID");
          row[2]=ps.getString("SIN");
          row[3]=ps.getString("ACCOUNT_NUMBER");
          row[4]=ps.getString("START_DURATION");
          row[5]=ps.getString("END_DURATION");
          row[6]=ps.getString("ANNUAL_INCOME");
          row[7]=ps.getString("TAXES_PAID");
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
