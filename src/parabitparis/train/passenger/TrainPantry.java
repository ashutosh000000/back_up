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
public class TrainPantry extends javax.swing.JDialog {

    /**
     * Creates new form Pantry
     */
    LocalDate ld;
    LocalTime lt;
    PbtDbConn mycon1,mycon2,mycon4,mycon3;
    String bn,mob,bu1,bu2,bu3,bu4,reseid,tn,bu5,prs,se;
    int c,v;
    public TrainPantry(java.awt.Frame parent, boolean modal,String sr,String no,String mm,String set) {
        super(parent, modal);
        initComponents();
        setIconImage();
        this.setBounds(500,220,400,330);
        b61.setOpaque(false);
        b61.setContentAreaFilled(false);
        b61.setBorderPainted(false);
        b62.setOpaque(false);
        b62.setContentAreaFilled(false);
        b62.setBorderPainted(false);
        b63.setOpaque(false);
        b63.setContentAreaFilled(false);
        b63.setBorderPainted(false);
        b60.setOpaque(false);
        b60.setContentAreaFilled(false);
        b60.setBorderPainted(false);
        bn=sr;
        mob=no;
        se=set;
        tn=mm;
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
        
         bu4="select a.EID from dutyreg a,emp b where b.EID=a.EID and b.Des='TC' and a.Res like('%"+bn+" "+"%')";
        System.out.println(bu4);
        try
        {
        mycon1.rs=mycon1.stm.executeQuery(bu4);
        if(mycon1.rs.next())
        {
            reseid=(String)mycon1.rs.getString("a.EID");
        }
        }catch(Exception e)
        {
            System.out.println(e);
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

        b60 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        b60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b60.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Pantry\\FOOD QUALITY1.jpg")); // NOI18N
        b60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b60ActionPerformed(evt);
            }
        });
        getContentPane().add(b60);
        b60.setBounds(60, 170, 120, 80);

        b61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b61.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Pantry\\DELAY1.jpg")); // NOI18N
        b61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b61ActionPerformed(evt);
            }
        });
        getContentPane().add(b61);
        b61.setBounds(230, 50, 120, 80);

        b62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b62.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Pantry\\BOTH1.jpg")); // NOI18N
        b62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b62ActionPerformed(evt);
            }
        });
        getContentPane().add(b62);
        b62.setBounds(60, 50, 120, 80);

        b63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b63.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Pantry\\NO PANTRY1.jpg")); // NOI18N
        b63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b63ActionPerformed(evt);
            }
        });
        getContentPane().add(b63);
        b63.setBounds(230, 170, 120, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\new.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b60ActionPerformed
      // v=v+1;
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 15'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 15'";
                mycon4.stm.executeUpdate(re);
            }
            
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 15','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
  
        // TODO add your handling code here:
    }//GEN-LAST:event_b60ActionPerformed

    private void b61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b61ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 16'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR").equals(bu1)){
                w=w+1;
            
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 16'";
                mycon4.stm.executeUpdate(re);
        }
           
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                 JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 16','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_b61ActionPerformed

    private void b62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b62ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 17'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
                        
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 17'";
                mycon4.stm.executeUpdate(re);
            }
            
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 17','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b62ActionPerformed

    private void b63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b63ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 18'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 18'";
                mycon4.stm.executeUpdate(re);
            }
           
        }
        else
        {
         if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
              JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 18','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
  
        // TODO add your handling code here:
    }//GEN-LAST:event_b63ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b60;
    private javax.swing.JButton b61;
    private javax.swing.JButton b62;
    private javax.swing.JButton b63;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }

}
