/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.SystemAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author dheer
 */
public class SinPage extends javax.swing.JPanel {

    /**
     * Creates new form BankPage1
     */
   JPanel rightLayout;
    SystemAdmin sysAdmin;
    public SinPage(JPanel rightLayout,SystemAdmin sysAdmin) {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIN OFFICE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 88, 182, 43);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SIN EMPLOYEE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(10, 137, 182, 43);

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
        jButton3.setBounds(10, 11, 100, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/7SAPMAWIYFHHVAO3LBPXCPXRXQ.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 0, 1980, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    
        SinOfficeLogin directory = new SinOfficeLogin(rightLayout,sysAdmin);
        rightLayout.add("SinOfficeLogin",directory);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        SinEmployeeLogin directory = new SinEmployeeLogin(rightLayout,sysAdmin);
        rightLayout.add("SinEmployeeLogin",directory);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        rightLayout.remove(this);
        Component [] componentArray = rightLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        CardLayout layout = (CardLayout) rightLayout.getLayout();
        layout.previous(rightLayout);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
