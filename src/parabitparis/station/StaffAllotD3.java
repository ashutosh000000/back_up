/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.station;
import java.awt.Color;
import java.awt.Toolkit;
import java.time.LocalDate;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import parabitparis.PbtDbConn;

/**
 *
 * @author HP
 */
public class StaffAllotD3 extends javax.swing.JDialog {

    /**
     * Creates new form StaffAllotD3
     */
    
    LocalDate Date;
    DefaultListModel dim,dim2;
    PbtDbConn mycon,mycon1,mycon3,mycon4,mycon5,mycon7,mycon8;
    String adm,ad1,ad2,adm3;
    java.awt.Frame f;
    boolean ob2;
    String req,w,s1,s2,s3,s4,s5,s6,sv,s7,s8,s9,s10,gs,gs2,ts,ts2,add,gs3,remo,add2,sid,tcod,dae2,gs4,add3,f1,f2,tcr,q1,q2,qt2,dae3,dae4,ad3,si3;
    int si,uc,ruc,ouc,i,qt1,a,b,auc,y;
   
    
    public StaffAllotD3(java.awt.Frame parent, boolean modal,String sid,String tn,String cn,String dis,String re) {
        super(parent, modal);
        initComponents();
        setIconImage();
        this.setBounds(390,130,550,497);
         b21.setOpaque(false);
        b21.setContentAreaFilled(false);
        b21.setBorderPainted(false);
        b22.setOpaque(false);
        b22.setContentAreaFilled(false);
        b22.setBorderPainted(false);
        b20.setOpaque(false);
        b20.setContentAreaFilled(false);
        b20.setBorderPainted(false);
         s1=sid;
         s2=tn;
         s3=dis;
         y=Integer.parseInt(re);
        f=parent;
        ob2=modal;
        l7.setText(cn);
        l8.setText(s2);
        Date= LocalDate.now();
        dim=new DefaultListModel();
        dim2=new DefaultListModel();
         mycon=new PbtDbConn();
         mycon1=new PbtDbConn();
         //mycon2=new PbtDbConn();
         mycon3=new PbtDbConn();
         mycon4=new PbtDbConn();
         mycon5=new PbtDbConn();
        
         mycon7=new PbtDbConn();
         mycon8=new PbtDbConn();
        // mycon9=new PbtDbConn();
         //mycon10=new PbtDbConn();
         //mycon11=new PbtDbConn();
         req="Required:"+re;
         b21.setEnabled(false);
         
          // s3="select
         

         s4="select EID,ENm from emp where SID='"+s1+"' and Des='"+s3+"'";
         System.out.println(s4);
         try
         {
         mycon1.rs=mycon1.stm.executeQuery(s4);
         while(mycon1.rs.next()==true)
         {
         s5=mycon1.rs.getString("ENm");
         f1=mycon1.rs.getString("EID");
         f2=f1+" "+s5;
         jcb2.addItem(f2);
         }
         }catch(Exception e)
         {
             System.out.println(e);
         }
         
         
         s8="select SName from station where SID='"+s1+"'";
        
         try
         {
         mycon1.rs=mycon1.stm.executeQuery(s8);
         System.out.println(s8);
         if(mycon1.rs.next()==true)
         {
         s9=mycon1.rs.getString("SName");
         l10.setText(s1+" "+s9);
         }
         }catch(Exception e)
         {
             System.out.println(e);
         }
       s9="select c.SID,c.SName from rstdetail a,train b,station c where b.TrNo='"+s2+"' and a.Stop='S' and a.RID=b.RID and c.SID=a.SID";  
       System.out.println(s9);
       try
       {
       mycon3.rs=mycon3.stm.executeQuery(s9);
       while(mycon3.rs.next()==true)
       {
           gs=mycon3.rs.getString("SName");
            gs3=mycon3.rs.getString("SID");
            gs4=gs3+"   "+gs;
            System.out.println();
            if(gs4.substring(0,4).equals(l10.getText().substring(0,4)))
            {
               
            }else
            {
                jcb3.addItem(gs4); 
            }
           
           
           
       }
       
       }catch(Exception e)
       {
           System.out.println(e);
       }
       
        tcod="select a.EID,b.ENm,b.Des,a.TrNo,a.Res from dutyreg a,emp b where b.onDuty='Y' and b.EID=a.EID and Des='"+s3+"'";
        System.out.println(tcod);
        
         try
         {
             mycon7.rs=mycon7.stm.executeQuery(tcod);
             while(mycon7.rs.next()==true)
             {
             dae2= mycon7.rs.getString("ENm");
             dae3= mycon7.rs.getString("EID");
             dae4=dae3+" "+dae2;
            
             if(mycon7.rs.getString("a.TrNo").equals(s2))
             {
                
                 if(mycon7.rs.getString("a.Res").startsWith("A")&&l7.getText().equals("TCAC"))
             {
                 dim.addElement(dae4);
              jcb2.removeItem(dae4);
             }else
             {
             if((mycon7.rs.getString("a.Res").startsWith("A")&&l7.getText().equals("TCSleeper"))||(mycon7.rs.getString("a.Res").startsWith("S")&&l7.getText().equals("TCAC")))
             {
               
              jcb2.removeItem(dae4);  
             }else
             {
              dim.addElement(dae4);
              jcb2.removeItem(dae4);   
             }
             }
                 
             
             }
             else
             {
             jcb2.removeItem(dae4);
             }
              }
             jl1.setModel(dim);
         }catch(Exception e)
         {
             System.out.println(e);
         }       
             l14.setText(req);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l7 = new javax.swing.JLabel();
        jcb2 = new javax.swing.JComboBox();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl1 = new javax.swing.JList();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        jcb3 = new javax.swing.JComboBox();
        l14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        l7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(240, 240, 240));
        l7.setText("Driver:");
        getContentPane().add(l7);
        l7.setBounds(131, 159, 75, 36);

        jcb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jcb2);
        jcb2.setBounds(210, 159, 207, 36);

        b20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b20.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\staffD3\\ADD1.jpg")); // NOI18N
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20);
        b20.setBounds(161, 321, 90, 40);

        b21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b21.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\OK1.jpg")); // NOI18N
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        getContentPane().add(b21);
        b21.setBounds(210, 390, 110, 38);

        b22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b22.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\staffD3\\REMOVE1.jpg")); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22);
        b22.setBounds(282, 321, 110, 40);

        jScrollPane1.setViewportView(jl1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(131, 200, 286, 103);

        l8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(240, 240, 240));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setText("Train Number");
        getContentPane().add(l8);
        l8.setBounds(119, 36, 142, 33);

        l9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l9.setForeground(new java.awt.Color(240, 240, 240));
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setText("From:");
        getContentPane().add(l9);
        l9.setBounds(131, 75, 51, 32);

        l11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l11.setForeground(new java.awt.Color(240, 240, 240));
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l11.setText("To:");
        getContentPane().add(l11);
        l11.setBounds(131, 113, 39, 35);

        l10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l10.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(l10);
        l10.setBounds(200, 75, 217, 32);

        jcb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jcb3);
        jcb3.setBounds(180, 113, 237, 35);

        l14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l14.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(l14);
        l14.setBounds(279, 36, 138, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\ashik-salim-492259.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb2ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
      if(evt.getSource()==b20)
      {
         
         // String w;
          s6=(String)jcb2.getSelectedItem();
          dim.addElement(s6);
         jl1.setModel(dim);
         jcb2.removeItem(s6);
         add="update emp set onDuty='Y' where ENm='"+s6.substring(5)+"'";
         System.out.println(add);
         try
         {
         uc=mycon5.stm.executeUpdate(add);
         System.out.println(uc);
                 
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"PLEASE SELECT");
//             System.out.println(e);
         }
         if(dim.getSize()==y)
        {
            b20.setEnabled(false);
            b21.setEnabled(true);
        }
      }
        

// TODO add your handling code here:
    }//GEN-LAST:event_b20ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
       if(evt.getSource()==b22)
       {    
           
          int si2;
          String si4;
           si=jl1.getSelectedIndex();
          //si=jl1.getSelectedIndex();
        // s7=(String)dim.getElementAt(si);
           //dim.removeElementAt(si);
           si4=(String)dim.getElementAt(si);
           jcb2.addItem(dim.getElementAt(si));
          dim.removeElement(dim.getElementAt(si));
       
          
         remo="update emp set onDuty='N' where ENm='"+si4.substring(5)+"'";
         System.out.println(remo);
         try
         {
         ruc=mycon5.stm.executeUpdate(remo);
         }
         catch(Exception e)
         {   
             JOptionPane.showMessageDialog(null,"PLEASE SELECT");
            // System.out.println("First select the item then press remove");
//             System.out.println(e);
         }
         if(dim.getSize()<=y)
        {
            b20.setEnabled(true);
            b21.setEnabled(false);
        }
         }
        

// TODO add your handling code here:
    }//GEN-LAST:event_b22ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
    
//     if(dim.getSize()<=y){
//     JOptionPane.showMessageDialog(null,"PLEASE SELECT");
//     }
        String d="select MAX(DRN)from dutyreg";
       int drn=0;
       
          try
          {
            mycon4.rs=mycon4.stm.executeQuery(d);
            if(mycon4.rs.next())
            {
                drn=mycon4.rs.getInt("MAX(DRN)");
                System.out.println(drn);
            }
          }catch(Exception e)
          {
              System.out.println(e);
          }
           String res[]=selectRes();
          for(i=0;i<dim.getSize();i++)
          {
            drn++;
            
             String fr=dim.getElementAt(i).toString();
             System.out.println(fr);
          
         String ok="insert into dutyreg values('"+drn+"','"+s1+"','"+Date +"','"+fr.substring(0,4)+"','"+s2+"','"+l10.getText().toString().substring(0,4)+"','"+ts.substring(0, 4)+"',null,null,null,'"+res[i]+"')";
       try
          {
         System.out.println(ok);
          ouc=mycon8.stm.executeUpdate(ok);
         System.out.println(ouc);
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
          }
     this.setVisible(false);
          
        
// TODO add your handling code here:
    }//GEN-LAST:event_b21ActionPerformed

    private void jcb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb3ActionPerformed
         if(evt.getSource()==jcb3)
         {
             ts=(String)jcb3.getSelectedItem();
}
        
// TODO add your handling code here:
    }//GEN-LAST:event_jcb3ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcb2;
    private javax.swing.JComboBox jcb3;
    private javax.swing.JList jl1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
    
  private String[] selectRes()
    {
        String p;
        String pa[]=new String[jl1.getModel().getSize()];
        if(l7.getText().equals("TCSleeper"))
        {
             p="SELECT NoGe,NoSC,TCSL FROM train WHERE TrNo='"+s2+"'";
            try{
          mycon.rs=mycon.stm.executeQuery(p);
          mycon.rs.next();
          int x=mycon.rs.getInt("NoGe")+mycon.rs.getInt("NoSC");
          int y=(int)(x/mycon.rs.getInt("TCSL"));
          System.out.println("y"+y+"x"+x);
          int z=1;
            int q=0;
            System.out.println(Integer.parseInt(l14.getText().substring(9)));
            for(int i=0;i<Integer.parseInt(l14.getText().substring(9));i++)
            {
                
                if(i==jl1.getModel().getSize()-1)
                {
                   q=x;
                }else
                {
                    q=y+z-1;
               }
                pa[i]="S-"+z+" ";
                z++;
                while(z<=q)
                {
                pa[i]=pa[i]+"S-"+z+" ";//+"*"+q;
                z++;
                }
                //z=z+y;
                System.out.println(pa[i]);
            }
            
          }catch(Exception e)
          {
             System.out.println(e);
            }
         }
        if(l7.getText().equals("TCAC"))
        {
             p="SELECT No1AC,No2AC,No3AC,TCAC FROM train WHERE TrNo='"+s2+"'";
             System.out.println(p);
            try{
          mycon.rs=mycon.stm.executeQuery(p);
          mycon.rs.next();
          int x=mycon.rs.getInt("No1AC")+mycon.rs.getInt("No2AC")+mycon.rs.getInt("No3AC");
          int y=(int)(x/mycon.rs.getInt("TCAC"));
            int z=1;
            int q=0;
            System.out.println(Integer.parseInt(l14.getText().substring(9)));
              for(int i=0;i<Integer.parseInt(l14.getText().substring(9));i++)               
            {
                if(i==Integer.parseInt(l14.getText().substring(9))-1)
                {
                   q=x;
                }else
                {
                    q=y+z-1;
                }
                pa[i]="A-"+z+" ";
                z++;
                while(z<=q){
                pa[i]=pa[i]+"A-"+z+" ";//+"*"+q;
                z++;
                }//z=z+y;
                System.out.println(pa[i]);
            }
            
          }catch(Exception e)
          {
             System.out.println(e);
            }
         }
        if(l7.getText().equals("Driver"))
        {
           p="SELECT DR FROM train WHERE TrNo='"+s2+"'";
           try{
          mycon.rs=mycon.stm.executeQuery(p);
          mycon.rs.next();
          int x=mycon.rs.getInt("DR");
          for(int i=0;i<x;i++)
           {
               pa[i]="ENGINE";
           }
           }catch(Exception e)
           {
               System.out.println(e);
               e.printStackTrace();
           }
           
        }
         if(l7.getText().equals("Guard"))
        {
           p="SELECT GR FROM train WHERE TrNo='"+s2+"'";
           try{
          mycon.rs=mycon.stm.executeQuery(p);
          mycon.rs.next();
          int x=mycon.rs.getInt("GR");
          for(int i=0;i<x;i++)
           {
               pa[i]="GC";
           }
           }catch(Exception e)
           {
               System.out.println(e);
               e.printStackTrace();
           }
           
        }
         if(l7.getText().equals("Security"))
        {
           p="SELECT SS FROM train WHERE TrNo='"+s2+"'";
           System.out.println(p);
           try{
          mycon.rs=mycon.stm.executeQuery(p);
          mycon.rs.next();
          int x=mycon.rs.getInt("SS");
          for(int i=0;i<x;i++)
           {
               pa[i]="GC";
           }
           }catch(Exception e)
           {
               System.out.println(e);
               e.printStackTrace();
           }
           
        }
         if(l7.getText().equals("Pantry"))
        {
           p="SELECT PS FROM train WHERE TrNo='"+s2+"'";
           try{
          mycon.rs=mycon.stm.executeQuery(p);
          mycon.rs.next();
          int x=mycon.rs.getInt("PS");
          for(int i=0;i<x;i++)
           {
               pa[i]="PANTRY";
           }
           }catch(Exception e)
           {
               System.out.println(e);
               e.printStackTrace();
           }
           
        }
         if(l7.getText().equals("Cleanliness"))
        {
             p="SELECT CS,TCNo,NoGe,NoSC FROM train WHERE TrNo='"+s2+"'";
            try{
          mycon.rs=mycon.stm.executeQuery(p);
          mycon.rs.next();
          int x=mycon.rs.getInt("TCNo");
          int f=mycon.rs.getInt("TCNo")+1;
          int y=(int)(x/mycon.rs.getInt("CS"));
          int w=mycon.rs.getInt("NoGe")+mycon.rs.getInt("NoSC");
            int z=1;
            int q=0;
            System.out.println(Integer.parseInt(l14.getText().substring(9)));
            for(int i=0;i<Integer.parseInt(l14.getText().substring(9));i++)
            {
                
                if(i==Integer.parseInt(l14.getText().substring(9))-1)
                {
                   q=x;
                }else
                {
                    q=y+z-1;
                }
                if(z<=w)
                {
                pa[i]="S-"+z+" ";//+"*"+q;
                z++;
                while(z<=q)
                {
                    if(z<=w)
                    {
                    pa[i]=pa[i]+"S-"+z+" ";
                    z++;
                    }else{
                    pa[i]=pa[i]+"A-"+(f-z)+" ";
                    z++;
                    }
                }
                }else{
                    //x=x-w;
                    pa[i]="A-"+(f-z)+" ";//+"*"+q;
                z++;
                while(z<=q)
                {
                    pa[i]=pa[i]+"A-"+(f-z)+" ";
                    z++;
                }
                }
                
//z=z+y;
                System.out.println(pa[i]);
            }
            
          }catch(Exception e)
          {
             System.out.println(e);
            }
         }
        
    return pa;
    }

  private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }
  
}
