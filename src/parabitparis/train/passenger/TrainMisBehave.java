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
public class TrainMisBehave extends javax.swing.JDialog {

    /**
     * Creates new form MissBehave
     */
    LocalDate ld;
    LocalTime lt;
    PbtDbConn mycon1,mycon2,mycon3,mycon4;
    String bn,mob,bu1,bu2,bu3,tn,bu5,reseid,prs,se;
    int c,v;
    public TrainMisBehave(java.awt.Frame parent, boolean modal,String sr,String no,String mm,String set) {
        super(parent, modal);
        initComponents();
        setIconImage();
       this.setBounds(410,190,520,330);
        b77.setOpaque(false);
        b77.setContentAreaFilled(false);
        b77.setBorderPainted(false);
        b78.setOpaque(false);
        b78.setContentAreaFilled(false);
        b78.setBorderPainted(false);
        b79.setOpaque(false);
        b79.setContentAreaFilled(false);
        b79.setBorderPainted(false);
        b80.setOpaque(false);
        b80.setContentAreaFilled(false);
        b80.setBorderPainted(false);
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
        {System.out.println(e);}
        
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

        jLabel2 = new javax.swing.JLabel();
        b77 = new javax.swing.JButton();
        b78 = new javax.swing.JButton();
        b79 = new javax.swing.JButton();
        b80 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("MISBEHAVE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 20, 160, 40);

        b77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b77.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Miss_Behave\\RELATEDTO TC1.jpg")); // NOI18N
        b77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b77ActionPerformed(evt);
            }
        });
        getContentPane().add(b77);
        b77.setBounds(60, 60, 170, 80);

        b78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b78.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Miss_Behave\\SECURITY1.jpg")); // NOI18N
        b78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b78ActionPerformed(evt);
            }
        });
        getContentPane().add(b78);
        b78.setBounds(290, 60, 160, 80);

        b79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b79.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Miss_Behave\\CLEAN1.jpg")); // NOI18N
        b79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b79ActionPerformed(evt);
            }
        });
        getContentPane().add(b79);
        b79.setBounds(60, 180, 170, 80);

        b80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b80.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Miss_Behave\\PANTRY1.jpg")); // NOI18N
        b80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b80ActionPerformed(evt);
            }
        });
        getContentPane().add(b80);
        b80.setBounds(290, 180, 160, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\new.png")); // NOI18N
        jLabel1.setText("MISS BEHAVE:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b77ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 11'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
           if(mycon4.rs.getString("PNR")!=bu1){
               
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 11'";
                mycon4.stm.executeUpdate(re);
           }
           
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 11','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b77ActionPerformed

    private void b78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b78ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 12'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 12'";
                mycon4.stm.executeUpdate(re);
            }
            
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 12','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b78ActionPerformed

    private void b79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b79ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 13'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
           if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 13'";
                mycon4.stm.executeUpdate(re);
           }
           
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 13','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }
        }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b79ActionPerformed

    private void b80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b80ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 14'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
           if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 14'";
                mycon4.stm.executeUpdate(re);
           }
           
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 14','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
          e.printStackTrace();
        }        
        // TODO add your handling code here:
    }//GEN-LAST:event_b80ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b77;
    private javax.swing.JButton b78;
    private javax.swing.JButton b79;
    private javax.swing.JButton b80;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }

}
