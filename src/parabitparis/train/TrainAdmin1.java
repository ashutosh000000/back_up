/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.train;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import parabitparis.PbtDbConn;

/**
 *
 * @author HP
 */
public class TrainAdmin1 extends javax.swing.JDialog {

    /**
     * Creates new form TrainMain1
     */
            int v,k;
    String al,tr,bn,sub2,sub,nextsid,sid,stop,sno;
    PbtDbConn mycon1,mycon3,mycon4,mycon2;
  
    public TrainAdmin1(java.awt.Frame parent, boolean modal,String ss,String sr) {
        super(parent, modal);
        initComponents();
        setIconImage();
          this.setBounds(370,140,600,430);
          jTextField1.setOpaque(false);
          jTextField1.setBackground(new Color(0,0,0,0));
          jPasswordField1.setOpaque(false);
          jPasswordField1.setBackground(new Color(0,0,0,0));
          jButton1.setOpaque(false);
          jButton1.setContentAreaFilled(false);
          jButton1.setBorderPainted(false);
        mycon1=new PbtDbConn();
        mycon2=new PbtDbConn();
        mycon3=new PbtDbConn();
        mycon4=new PbtDbConn();
        tr=ss;
        bn=sr;
        System.out.println(tr);
        sub2="select RID from troute where TrNo='"+tr+"'";
        try
        {  
           mycon3.rs=mycon3.stm.executeQuery(sub2);
           if(mycon3.rs.next())
           {
           v=mycon3.rs.getInt("RID");
           }
        }catch(Exception e)
        {
//            System.out.println(e);
        }
 
sub="select a.SID,a.Stop,c.SName,b.RID,a.SNo from rstdetail a,troute b,station c where b.TrNo='"+tr+"' and a.RID=b.RID and c.SID=a.SID group by SNo";
       System.out.println(sub);
     
       try
       {   
           mycon1.rs=mycon1.stm.executeQuery(sub);                     
           if(mycon1.rs.next())
           {
               sid=mycon1.rs.getString("a.SID")+" "+mycon1.rs.getString("c.SName");
               stop=mycon1.rs.getString("a.Stop");
               sno=mycon1.rs.getString("a.SNo"); 
              
           }
       }catch(Exception e)
       {
//           System.out.println(e); 
       }
k=Integer.parseInt(sno)+1;
       String d="select a.SID,a.Stop,c.SName,b.RID,a.SNo from rstdetail a,troute b,station c where b.TrNo='"+tr+"' and a.RID=b.RID and c.SID=a.SID and SNo='"+k+"'";
       System.out.println(d);
       try
       {
        mycon4.rs=mycon4.stm.executeQuery(d);
        if(mycon4.rs.next())
        {
           nextsid=mycon4.rs.getString("a.SID")+" "+mycon4.rs.getString("SName");
        }
       }catch(Exception e)
       {
//           System.out.println(e);
       }
 String p="insert into currentstatus values("+v+","+tr+","+sid.substring(0,4)+","+nextsid.substring(0,4)+","+sno+",'"+stop+"')";
         System.out.println(p);
            try
             {int l;
              l=mycon2.stm.executeUpdate(p);  
             }catch(Exception e)
             {
//                 System.out.println(e);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Admin :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 150, 62, 24);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\ICONS\\lock.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 220, 50, 38);

        jTextField1.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 140, 200, 36);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\SUBMIT.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 300, 130, 40);

        jPasswordField1.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(240, 220, 200, 38);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\login-page.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
//        this.dispose();
//        TrainMain ob2;
//        ob2=new TrainMain(tr,bn);
//        ob2.setVisible(true);
//        
        
        
        al="Select * from dutyreg a,emp b where a.TrNo='"+tr+"' and a.EID='"+jTextField1.getText()+"' and b.EID=a.EID  and b.Pswd='"+jPasswordField1.getText()+"' and b.Des='TA'";
      System.out.println(al);
        try
        {
        mycon1.rs=mycon1.stm.executeQuery(al);
        if(mycon1.rs.next())
        {
            this.dispose();
//          TrainMain ob2;
        new TrainMain(tr,bn).setVisible(true);
        
        }
        
        }catch(Exception e)
        {
//            System.out.println(e);
                JOptionPane.showMessageDialog(null,"WRONG PASSWORD\n OR USERNAME");
        }

   
    }//GEN-LAST:event_jButton1ActionPerformed

       

        /* Create and display the dialog */
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }
    
}