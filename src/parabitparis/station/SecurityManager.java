/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.station;

import java.awt.Toolkit;
import parabitparis.PbtDbConn;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class SecurityManager extends javax.swing.JDialog implements Runnable {

    /**
     * Creates new form SecurityManager
     */
    
    boolean f;
    java.awt.Frame p;
    String sid;
    boolean b=true;
    DefaultTableModel dtm1;
    PbtDbConn mycon1,mycon2;
    Thread th;
    String y="";
    public SecurityManager(java.awt.Frame parent, boolean modal,String sid) {
        super(parent, modal);
        initComponents();
        f=modal;
        p=parent;
        setIconImage();
        this.setBounds(250,130,815,520);
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        this.sid=sid;
        dtm1=(DefaultTableModel)jTable2.getModel();
        mycon1=new PbtDbConn();
        th=new Thread(this);
        y="select a.TrNo,b.PNR,b.Seat,b.Coach,c.Problem from ps a,rtproblem b,problemrt c where a.PNR=b.PNR and c.PrID=b.PrID and ((b.PrID='PR 19') or (b.PrID='PR 20') or (b.PrID='PR 21') or (b.PrID='PR 22') or (b.PrID='PR 23') or (b.PrID='PR 24') or (b.PrID='PR 11') or (b.PrID='PR 12') or (b.PrID='PR 13') or (b.PrID='PR 14')) and b.Status='PS-"+sid+"' group by b.PrID";
        System.out.println(y);
        try{
            dtm1.setRowCount(0);
            mycon1.rs=mycon1.stm.executeQuery(y);
            while(mycon1.rs.next()){
            dtm1.addRow(new Object[]{mycon1.rs.getString("TrNo"),mycon1.rs.getString("PNR"),mycon1.rs.getString("Seat"),mycon1.rs.getString("Coach"),mycon1.rs.getString("Problem")});
            
            }
            jTable2.setModel(dtm1);
        }catch(SQLException e){e.printStackTrace();}
        th.start();
    }
    public void run(){
    while(b){
     try{
         th.sleep(15000);
         dtm1.setRowCount(0);
            mycon1.rs=mycon1.stm.executeQuery(y);
            while(mycon1.rs.next()){
            dtm1.addRow(new Object[]{mycon1.rs.getString("TrNo"),mycon1.rs.getString("PNR"),mycon1.rs.getString("Seat"),mycon1.rs.getString("Coach"),mycon1.rs.getString("Problem")});
            }
            jTable2.setModel(dtm1);
        }catch(SQLException e){e.printStackTrace();}
     catch(Exception e){e.printStackTrace();}
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TrNo", "PNR", "SeatNo", "Coach", "Problem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 50, 708, 360);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\solved1.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 420, 130, 40);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\Pass.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 420, 130, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Security Manager:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(59, 11, 210, 40);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\view.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(600, 420, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\new.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String str="update rtproblem a,problemrt b set a.Status='PS1-"+sid+"' where where a.PNR='"+dtm1.getValueAt(jTable2.getSelectedRow(),1)+"'and a.PrID=b.PrID and b.Problem='"+dtm1.getValueAt(jTable2.getSelectedRow(),4)+"' and a.coach='"+dtm1.getValueAt(jTable2.getSelectedRow(),3)+"'";
     System.out.println(str);
     try{
     mycon2.stm.executeUpdate(str);
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"PLEASE SELECT ");
//     e.printStackTrace();
     }
     dtm1.removeRow(jTable2.getSelectedRow());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dtm1.getValueAt(jTable2.getSelectedRow(),1);
        String rt="update rtproblem a,problemrt b set a.status='S' where a.PNR='"+dtm1.getValueAt(jTable2.getSelectedRow(),1)+"'and a.PrID=b.PrID and b.Problem='"+dtm1.getValueAt(jTable2.getSelectedRow(),4)+"' and a.coach='"+dtm1.getValueAt(jTable2.getSelectedRow(),3)+"'";
        System.out.println(rt);
        try{
           mycon2.stm.executeUpdate(rt);
        }   catch(SQLException e){
           JOptionPane.showMessageDialog(null,"PLEASE SELECT ");
            e.printStackTrace();
        }         
                dtm1.removeRow(jTable2.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            new SecurityManagerAll(p,f).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }
}