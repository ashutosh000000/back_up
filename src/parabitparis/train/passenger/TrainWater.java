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
public class TrainWater extends javax.swing.JDialog {

    /**
     * Creates new form Water
     */
    LocalDate ld;
    LocalTime lt;
    String bu1,bu2,bu3,bn,mob,bu4,reseid,bu5,prs,tn,se;
    int c,v,b;
    PbtDbConn mycon1,mycon2,mycon3,mycon4;
    public TrainWater(java.awt.Frame parent, boolean modal,String sr,String no,String mm,String set) {
        super(parent, modal);
        initComponents();
        setIconImage();
        this.setBounds(500,220,400,330);
        b42.setOpaque(false);
        b42.setContentAreaFilled(false);
        b42.setBorderPainted(false);
        b43.setOpaque(false);
        b43.setContentAreaFilled(false);
        b43.setBorderPainted(false);
        bn=sr;
        mob=no;
        tn=mm;
        se=set;
        mycon1=new PbtDbConn();
        mycon2=new PbtDbConn();
        mycon3=new PbtDbConn();
        mycon4=new PbtDbConn();
       // ld= LocalDate.now();
        //lt= LocalTime.now();
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
        /*bu3="select MAX(CompNo) from rtproblem";
        try
        {
        mycon1.rs=mycon1.stm.executeQuery(bu3);
        if(mycon1.rs.next()){
            v=mycon1.rs.getInt("MAX(CompNo)");
        }
        }catch(Exception e)
        {System.out.println(e);}*/
        
        bu4="select a.EID from dutyreg a,emp b where b.EID=a.EID and b.Des='CS' and a.Res like('%"+bn+" "+"%')";
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
        //bu5="select PrevSID from currentstatus where SNo=(select MAX(SNO) from currentstatus)"; 
        
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        b42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b42.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Water\\TROILET1.jpg")); // NOI18N
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        getContentPane().add(b42);
        b42.setBounds(120, 60, 150, 70);

        b43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b43.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\Water\\BASIN1.jpg")); // NOI18N
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        getContentPane().add(b43);
        b43.setBounds(120, 170, 150, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\new.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        //v=v+1;
        //String prs;
        
         ld= LocalDate.now();
        lt= LocalTime.now();
        
        bu5="select PrevSID from currentstatus where TrNo='"+tn+"'";
        try{
        mycon3.rs=mycon3.stm.executeQuery(bu5);
        if(mycon3.rs.next())
        {
            prs=mycon3.rs.getString("PrevSID");
            
        }
                }
        catch(Exception e)
        {
//            System.out.println(e);
        }
        String bu6="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 25'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu6);
        if(mycon4.rs.next())
        {
            mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 25'";
                mycon4.stm.executeUpdate(re);
            } 
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
                JOptionPane.showMessageDialog(null, "This Problem is ALREADY REGISTERED");
            }else{
                JOptionPane.showMessageDialog(null,"DONE");
            String su="insert into rtproblem values('null','PR 25','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
            c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
        }}
        }catch(Exception e)
        {
//            e.printStackTrace();
        }
       /* String su="insert into rtproblem values(null,'PR 25','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',null,'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,0)";
      System.out.println(su);
         try
       {
           
        
       }catch(Exception e){
       System.out.println(e);}*/
           
       
       // TODO add your handling code here:
    }//GEN-LAST:event_b42ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
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
                }
        catch(Exception e)
        {
//            System.out.println(e);
        }
        String bu5="select PNR,Count from rtproblem where Coach='"+bn+"' and PrID='PR 26'";
        try
        {
        mycon4.rs=mycon4.stm.executeQuery(bu5);
        if(mycon4.rs.next())
        {   mycon4.rs.getString("PNR");
            int w=mycon4.rs.getInt("Count");
            if(mycon4.rs.getString("PNR")!=bu1){
            w=w+1;
            String re="update rtproblem set Count='"+w+"' where Coach='"+bn+"' and PrID='PR 26'";
                mycon4.stm.executeUpdate(re);
            }
           
        }
        else
        {
            if(mycon4.rs.next()&&mycon4.rs.getString("PNR").equals(bu1)){
                JOptionPane.showMessageDialog(null, "This Problem is already rugistered");
            }else{
                 JOptionPane.showMessageDialog(null,"DONE");
        String su="insert into rtproblem values(null,'PR 26','"+bu2+"','"+ld+"','"+lt+"','"+bn+"',"+se+",'"+mob+"',"+reseid+",'N',"+prs+",null,null,null,1)";
      System.out.println(su);
        c=mycon1.stm.executeUpdate(su);
       System.out.println(c);
         }}
        }catch(Exception e)
        {
//            e.printStackTrace();
        }
      
        // TODO add your handling code here:
    }//GEN-LAST:event_b43ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }

}
