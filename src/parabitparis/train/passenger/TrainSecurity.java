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
public class TrainSecurity extends javax.swing.JDialog {

    /**
     * Creates new form Security
     */
    LocalDate ld;
    LocalTime lt;
    PbtDbConn mycon1,mycon2,mycon3,mycon4;
    String bn,mob,bu1,bu2,bu3,bu4,reseid,tn,prs,bu5,se;
    int c,v;
    public TrainSecurity(java.awt.Frame parent, boolean modal,String sr,String no,String mm,String set) {
        super(parent, modal);
        initComponents();
        setIconImage();
        this.setBounds(330,240,700,350);
//        b68.setOpaque(false);
//        b68.setContentAreaFilled(false);
//        b68.setBorderPainted(false);
//        b69.setOpaque(false);
//        b69.setContentAreaFilled(false);
//        b69.setBorderPainted(false);
//        b70.setOpaque(false);
//        b70.setContentAreaFilled(false);
//        b70.setBorderPainted(false);
//        b71.setOpaque(false);
//        b71.setContentAreaFilled(false);
//        b71.setBorderPainted(false);
//        b72.setOpaque(false);
//        b72.setContentAreaFilled(false);
//        b72.setBorderPainted(false);
//        b73.setOpaque(false);
//        b73.setContentAreaFilled(false);
//        b73.setBorderPainted(false);
        b69.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Security\\SNATACHING1.jpg"));
        mob=no;
        bn=sr;
        tn=mm;
        se=set;
        mycon1=new PbtDbConn();
        mycon2=new PbtDbConn();
         mycon3=new PbtDbConn();
          mycon4=new PbtDbConn();
        ld=LocalDate.now();
        lt=LocalTime.now();
        
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
        
      /*  bu3="select MAX(CompNo) from rtproblem";
        try
        {
        mycon1.rs=mycon1.stm.executeQuery(bu3);
        if(mycon1.rs.next()){
            v=mycon1.rs.getInt("MAX(CompNo)");
            System.out.println(v);
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

        b68 = new javax.swing.JButton();
        b70 = new javax.swing.JButton();
        b69 = new javax.swing.JButton();
        b71 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        b68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b68.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Security\\THEFT1.jpg")); // NOI18N
        b68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b68ActionPerformed(evt);
            }
        });
        getContentPane().add(b68);
        b68.setBounds(60, 50, 130, 80);

        b70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b70.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Security\\fight1.jpg")); // NOI18N
        b70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b70ActionPerformed(evt);
            }
        });
        getContentPane().add(b70);
        b70.setBounds(60, 190, 130, 80);

        b69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b69ActionPerformed(evt);
            }
        });
        getContentPane().add(b69);
        b69.setBounds(490, 190, 130, 80);

        b71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b71.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Security\\FEMALE HARASSMENT1.jpg")); // NOI18N
        b71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b71ActionPerformed(evt);
            }
        });
        getContentPane().add(b71);
        b71.setBounds(270, 50, 170, 70);

        b72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b72.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Security\\SENIOR1.jpg")); // NOI18N
        b72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b72ActionPerformed(evt);
            }
        });
        getContentPane().add(b72);
        b72.setBounds(270, 200, 170, 70);

        b73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b73.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Security\\seat1.jpg")); // NOI18N
        b73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b73ActionPerformed(evt);
            }
        });
        getContentPane().add(b73);
        b73.setBounds(490, 50, 130, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\new.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b69ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 21'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
           if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 21'";
                mycon4.stm.executeUpdate(re);
           }
          
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }
            else{
                 JOptionPane.showMessageDialog(null,"DONE");
        String su="insert into rtproblem values(null,'PR 21','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"','"+reseid+"','N',"+prs+",null,null,null,1)";
      System.out.println(su);
        c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
       }catch(Exception e){
//       System.out.println(e);
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_b69ActionPerformed

    private void b68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b68ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 19'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 19'";
                mycon4.stm.executeUpdate(re);
                
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 19','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b68ActionPerformed

    private void b70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b70ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 20'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 20'";
                mycon4.stm.executeUpdate(re);
            }
            
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 20','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b70ActionPerformed

    private void b71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b71ActionPerformed
      //v=v+1;
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 22'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 22'";
                mycon4.stm.executeUpdate(re);
            }
            
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 22','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b71ActionPerformed

    private void b72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b72ActionPerformed
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 23'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 23'";
                mycon4.stm.executeUpdate(re);
            }
            
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 23','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b72ActionPerformed

    private void b73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b73ActionPerformed
       //v=v+1;
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
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 24'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
           if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 24'";
                mycon4.stm.executeUpdate(re);
           }
           
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
            JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values(null,'PR 24','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            System.out.println(e);
        }
  
        // TODO add your handling code here:
    }//GEN-LAST:event_b73ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b68;
    private javax.swing.JButton b69;
    private javax.swing.JButton b70;
    private javax.swing.JButton b71;
    private javax.swing.JButton b72;
    private javax.swing.JButton b73;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }

}
