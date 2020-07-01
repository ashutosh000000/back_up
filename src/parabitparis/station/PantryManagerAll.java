/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.station;

import javax.swing.table.DefaultTableModel;
import parabitparis.PbtDbConn;
import java.awt.Toolkit;

/**
 *
 * @author HP
 */

public class PantryManagerAll extends javax.swing.JDialog implements Runnable {

    /**
     * Creates new form PantryManagerAll
     */
     boolean b=true;
    Thread th;
    PbtDbConn mycon1,mycon2;
    String str="";
    DefaultTableModel dtm1;
    public PantryManagerAll(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage();
        this.setBounds(185,120,950,530);
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
          th=new Thread(this); 
        mycon1=new PbtDbConn();
        dtm1=(DefaultTableModel)jTable1.getModel();
    dtm1.setRowCount(0);
    str="select a.TrNo,b.PNR,b.Seat,b.Coach,c.Problem,b.Status,b.Count from ps a,rtproblem b,problemrt c where a.PNR=b.PNR and c.PrID=b.PrID and ((b.PrID='PR 15') or (b.PrID='PR 16') or (b.PrID='PR 17') or (b.PrID='PR 18') or (b.PrID='PR 14')) group by b.PrID";
        try{
            mycon1.rs=mycon1.stm.executeQuery(str);
            while(mycon1.rs.next()){
            dtm1.addRow(new Object[]{mycon1.rs.getString("TrNo"),mycon1.rs.getString("PNR"),mycon1.rs.getString("Seat"),mycon1.rs.getString("Coach"),mycon1.rs.getString("Problem"),mycon1.rs.getString("Status"),mycon1.rs.getString("Count")});
            
            }
           jTable1.setModel(dtm1);
        }catch(Exception e){
//            e.printStackTrace();
        }
        th.start();
    }

    public void run(){
while(b){
try{
    th.sleep(15000);
            dtm1.setRowCount(0);
            mycon1.rs=mycon1.stm.executeQuery(str);
            while(mycon1.rs.next()){
            dtm1.addRow(new Object[]{mycon1.rs.getString("TrNo"),mycon1.rs.getString("PNR"),mycon1.rs.getString("Seat"),mycon1.rs.getString("Coach"),mycon1.rs.getString("Problem"),mycon1.rs.getString("Status"),mycon1.rs.getString("Count")});
            
            }
           jTable1.setModel(dtm1);
        }catch(Exception e){
//            e.printStackTrace();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "TrainNo", "PNR", "SeatNo", "Coach", "Problem", "Status", "Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 858, 390);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\ICONS\\back-button1.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 430, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\dynamic-animation-smooth-gradient-background-footage-090800298_prevstill.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        b=false;
        this.dispose();
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

    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }
}