/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.train.passenger;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import parabitparis.PbtDbConn;
import java.awt.Toolkit;
/**
 *
 * @author HP
 */
public class TrainElectrical extends javax.swing.JDialog {

    /**
     * Creates new form TrainElectrical
     */
    LocalTime lt;
    LocalDate ld;
    int c,v;
    PbtDbConn mycon1,mycon2,mycon3,mycon4;
    String bn,mob,bu1,bu2,bu3,bu5,tn,prs,reseid,se;
    public TrainElectrical(java.awt.Frame parent, boolean modal,String sr,String no,String mm,String set) {
        super(parent, modal);
        initComponents();
        setIconImage();
       this.setBounds(500,220,400,330);
        b66.setOpaque(false);
        b66.setContentAreaFilled(false);
        b66.setBorderPainted(false);
        b67.setOpaque(false);
        b67.setContentAreaFilled(false);
        b67.setBorderPainted(false);
        bn=sr;
        mob=no;
        tn=mm;
        se=set;
        mycon1=new PbtDbConn();
        mycon2=new PbtDbConn();
        mycon3=new PbtDbConn();
        mycon4=new PbtDbConn();
        //ld=LocalDate.now();
        //lt=LocalTime.now();
        
        bu1="select PNR from ps where PMob1='"+mob+"' or PMob2='"+mob+"'";
        try
        {
        mycon2.rs=mycon2.stm.executeQuery(bu1);
        if(mycon2.rs.next())
        {
         bu2=mycon2.rs.getString("PNR");
        }
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        
       /* bu3="select MAX(CompNo) from rtproblem";
        try
        {
        mycon1.rs=mycon1.stm.executeQuery(bu3);
        if(mycon1.rs.next()){
            v=mycon1.rs.getInt("MAX(CompNo)");
        }
        }catch(Exception e)
        {System.out.println(e);}*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b66 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        b66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b66.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\comb\\electrical\\COMPART1.jpg")); // NOI18N
        b66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b66ActionPerformed(evt);
            }
        });
        getContentPane().add(b66);
        b66.setBounds(90, 40, 200, 90);

        b67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b67.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\comb\\electrical\\INDI1.jpg")); // NOI18N
        b67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b67ActionPerformed(evt);
            }
        });
        getContentPane().add(b67);
        b67.setBounds(90, 170, 200, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\new.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 510, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b66ActionPerformed
          ld= LocalDate.now();
        lt= LocalTime.now();
        
        bu5="select PrevSID from currentstatus where TrNo='"+tn+"'";
        try{
        mycon3.rs=mycon3.stm.executeQuery(bu5);
        if(mycon3.rs.next())
        {
            prs=mycon3.rs.getString("PrevSID");
        }
                }catch(Exception e){System.out.println(e);}
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 7'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            
            if(mycon4.rs.getString("PNR")!=bu1){
                w=w+1;
            
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 7'";
                mycon4.stm.executeUpdate(re);
            }
           
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "ALREADY REGISTERED");
            }else{
                 JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 7','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
//      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
//       System.out.println(c);
        }
        }
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        //g code here:
    }//GEN-LAST:event_b66ActionPerformed

    private void b67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b67ActionPerformed
         ld= LocalDate.now();
        lt= LocalTime.now();
        
        bu5="select PrevSID from currentstatus where TrNo='"+tn+"'";
        try{
        mycon3.rs=mycon3.stm.executeQuery(bu5);
        if(mycon3.rs.next())
        {
            prs=mycon3.rs.getString("PrevSID");
        }
                }catch(Exception e){System.out.println(e);}
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 8'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 8'";
                mycon4.stm.executeUpdate(re);
            }
           
        }
        else
        {if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "ALREADY REGISTERED");
            }else{
             JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 8','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b67ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b66;
    private javax.swing.JButton b67;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }

}