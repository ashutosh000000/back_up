/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.station;

/**
 *
 * @author HP
 */

import java.awt.Color;
import static java.awt.PageAttributes.MediaType.C;
import java.lang.String;
import javax.swing.ImageIcon;
public class Station extends javax.swing.JFrame {

  
    /**
     * Creates new form Station
     */
    String s3; 
   String sid;
    public Station(String sid) {
        this.setUndecorated(true);
        initComponents();
        this.setBounds(150,110,1050,540);
     //   b2.setOpaque(false);
      /*  b3.setOpaque(false);
        b4.setOpaque(false);
        b5.setOpaque(false);
        b6.setOpaque(false);
        b7.setOpaque(false);
        b8.setOpaque(false);*/
      //  b2.setBorderPainted(false);
       // b2.setContentAreaFilled(false);
        b2.setBackground(new Color(0,0,0,0));
       /* b3.setBorderPainted(false);
        b3.setContentAreaFilled(false);
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b5.setBorderPainted(false);
        b5.setContentAreaFilled(false);
        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b7.setBorderPainted(false);
        b7.setContentAreaFilled(false);
        b8.setBorderPainted(false);
        b8.setContentAreaFilled(false); */
        //System.out.println(b2.getBounds());
        this.sid=sid;
       // jLabel2.setOpaque(false);
      //  jLabel2.setBackground(new Color(255,36,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b2.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\STATIOIN MASTER1.jpg")); // NOI18N
        b2.setBorder(new javax.swing.border.MatteBorder(null));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(70, 20, 240, 140);

        b3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\STAFFMANAGER1.jpg")); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(730, 365, 240, 140);

        b4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b4.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\CLEAN MANAGER.jpg")); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(730, 195, 240, 140);

        b5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b5.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\PANTRYMANAGER1.jpg")); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(730, 20, 240, 140);

        b6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b6.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\SECURITY MANAGER1.jpg")); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(70, 195, 240, 140);

        b7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b7.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\TRAIN MAINTAIN1.jpg")); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(70, 365, 240, 140);

        b8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b8.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\MEDICAL1.jpg")); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(420, 280, 240, 140);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\station\\TC OFFICE1.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 100, 240, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\kalka-shimla.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1050, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         EmployeLogin el;
        el=new EmployeLogin(this,true,sid,2,"StM");
         el.setVisible(true);
    }//GEN-LAST:event_b3ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       new EmployeLogin(this,true,sid,7,"HSM").setVisible(true); 
    }//GEN-LAST:event_b8ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        new EmployeLogin(this,true,sid,1,"SM").setVisible(true);
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        new EmployeLogin(this,true,sid,3,"CSM").setVisible(true);
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        new EmployeLogin(this,true,sid,5,"SSM").setVisible(true);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        new EmployeLogin(this,true,sid,6,"TMSM").setVisible(true);
    }//GEN-LAST:event_b7ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
           new EmployeLogin(this,true,sid,4,"PSM").setVisible(true);
            
    }//GEN-LAST:event_b5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             new EmployeLogin(this,true,sid,9,"TCSM").setVisible(true);    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}