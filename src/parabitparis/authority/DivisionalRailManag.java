/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.authority;

import parabitparis.PbtDbConn;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parabitparis.PbtDbConn;

/**
 *
 * @author HP
 */
public class DivisionalRailManag extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Zonal
     */
    
    String y1="";
    String y2="";
    boolean b=true;
    Thread th;
    String str;
    PbtDbConn mycon1,mycon2;
    DefaultTableModel dtm1;
    java.awt.Frame f;
    boolean bo;
    String did,sid;
    public DivisionalRailManag(String did) {
        this.setUndecorated(true);
        initComponents();
        this.setBounds(240,190,850,460);
        jButton1.setOpaque(false);
        jButton2.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        this.did=did;
       // this.sid=sid;
        th=new Thread( this);
        mycon1=new PbtDbConn();
        mycon2=new PbtDbConn();
        dtm1=(DefaultTableModel)jTable1.getModel();
        //dtm1.setColumnCount(5);
        dtm1.setRowCount(0);
        y2="select SID from station where (SCat='A'or SCat='B'or SCat='C') and DID='"+did+"'";
            
        try{
        mycon2.rs=mycon2.stm.executeQuery(y2);
        while(mycon2.rs.next()){
    y1="select a.TrNo,b.PNR,b.Seat,b.Coach,c.Problem from ps a,rtproblem b,problemrt c where a.PNR=b.PNR and c.PrID=b.PrID and b.Status='PS2-"+mycon2.rs.getString("SID")+"' group by b.PrID";
       System.out.println(y1);
        try{
           mycon1.rs=mycon1.stm.executeQuery(y1);
       while(mycon1.rs.next()){
           dtm1.addRow(new Object[]{mycon1.rs.getString("a.TrNo"),mycon1.rs.getString("b.PNR"), mycon1.rs.getString("b.Seat"),mycon1.rs.getString("b.Coach"),mycon1.rs.getString("c.Problem")});
       }
       jTable1.setModel(dtm1);
       }catch(SQLException e){
//       e.printStackTrace();
       }}}catch(SQLException e){}
        th.start();
       
    }

     
    public void run(){
     
        while(b){
            
    try{
        th.sleep(15000);
        System.out.println(y1);
         dtm1.setRowCount(0);
         y2="select SID from station where (SCat='A'or SCat='B'or SCat='C') and DID='"+did+"'";
          
        mycon2.rs=mycon2.stm.executeQuery(y2);
        while(mycon2.rs.next()){
      y1="select a.TrNo,b.PNR,b.Seat,b.Coach,c.Problem from ps a,rtproblem b,problemrt c where a.PNR=b.PNR and c.PrID=b.PrID and b.Status='PS2-"+mycon2.rs.getString("SID") +"' group by b.PrID";
//       System.out.println(y1);
        try{
           mycon1.rs=mycon1.stm.executeQuery(y1);
       while(mycon1.rs.next()){
           dtm1.addRow(new Object[]{mycon1.rs.getString("a.TrNo"),mycon1.rs.getString("b.PNR"), mycon1.rs.getString("b.Seat"),mycon1.rs.getString("b.Coach"),mycon1.rs.getString("c.Problem")});
       }
       jTable1.setModel(dtm1);
       }catch(SQLException e){
//       e.printStackTrace();
       }}
    }
    catch(SQLException e){
           e.printStackTrace();
       }
    catch(Exception e){
//       e.printStackTrace();
       }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Train no", "PNR", "Seatno", "Coach", "Problem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 30, 720, 360);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\Pass.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 410, 130, 40);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\ICONS\\back-button1.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 410, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\zong\\gh.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 860, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        dtm1.getSelectedValue(jTable1);
        str="update rtproblem a,problemrt b set a.Status='"+did+"' where a.PNR='"+dtm1.getValueAt(jTable1.getSelectedRow(), 1)+"' and a.PrID=b.PrID and b.Problem='"+dtm1.getValueAt(jTable1.getSelectedRow(),4)+"' and a.Coach='"+dtm1.getValueAt(jTable1.getSelectedRow(),3)+"'";
//        System.out.println(str);
        try{
        mycon2.stm.executeUpdate(str);
        }catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,"PLEASE SELECT");
        }
       dtm1.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
//        new Head().setVisible(true);   
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}