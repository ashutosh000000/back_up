/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.station;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import parabitparis.PbtDbConn;

/**
 *
 * @author HP
 */
public class HelpDesk extends javax.swing.JDialog {

     String y1="";
    
    boolean b=true;
    Thread th;
    PbtDbConn mycon1,mycon2;
    DefaultTableModel dtm1;
    java.awt.Frame f;
    boolean bo;
    String sid;

    public HelpDesk(java.awt.Frame parent, boolean modal,String sid) {
        super(parent, modal);
        initComponents();
        this.sid=sid;
        th=new Thread((Runnable)this);
        mycon1=new PbtDbConn();
        mycon2=new PbtDbConn();
        dtm1=(DefaultTableModel)jTable1.getModel();
        //dtm1.setColumnCount(5);
        dtm1.setRowCount(0);
        y1="select a.TrNo,b.PNR,b.Seat,b.Coach,c.Problem from ps a,rtproblem b,problemrt c where a.PNR=b.PNR and c.PrID=b.PrID and ((b.PrID='PR 28') or (b.PrID='PR 29') or (b.PrID='PR 30')) and b.Status='PS-"+sid+"' group by b.PrID";
       System.out.println(y1);
        try{
           mycon1.rs=mycon1.stm.executeQuery(y1);
       while(mycon1.rs.next()){
           dtm1.addRow(new Object[]{mycon1.rs.getString("TrNo"),mycon1.rs.getString("PNR"), mycon1.rs.getString("Seat"),mycon1.rs.getString("Coach"),mycon1.rs.getString("Problem")});
       }
       jTable1.setModel(dtm1);
       }catch(SQLException e){
       e.printStackTrace();
       }
        th.start();
        
    }
    public void run(){
     
        while(b){
            
    try{
        th.sleep(15000);
        System.out.println(y1);
         dtm1.setRowCount(0);
           mycon1.rs=mycon1.stm.executeQuery(y1);
        while(mycon1.rs.next()){
           dtm1.addRow(new Object[]{mycon1.rs.getString("TrNo"),mycon1.rs.getString("PNR"), mycon1.rs.getString("Seat"),mycon1.rs.getString("Coach"),mycon1.rs.getString("Problem")});
       }
       jTable1.setModel(dtm1);
       }catch(SQLException e){
       e.printStackTrace();
       }catch(Exception e){
       e.printStackTrace();
       }
    }
    }


     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TrainNo", "PNR", "SeatNo", "Coach", "Problem"
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

        jLabel1.setText("Help Desk:");

        jButton1.setText("Solved");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  dtm1.getValueAt(jTable1.getSelectedRow(),1);
        String rt="update rtproblem a,problemrt b set a.status='S' where a.PNR='"+dtm1.getValueAt(jTable1.getSelectedRow(),1)+"'and a.PrID=b.PrID and b.Problem='"+dtm1.getValueAt(jTable1.getSelectedRow(),4)+"' and a.coach='"+dtm1.getValueAt(jTable1.getSelectedRow(),3)+"'";
        System.out.println(rt);
        try{
           mycon2.stm.executeUpdate(rt);
        }   catch(SQLException e){
            e.printStackTrace();
        }         
                dtm1.removeRow(jTable1.getSelectedRow());
    
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
