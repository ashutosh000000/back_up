/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.train.tc;

import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import parabitparis.PbtDbConn;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class TrainTcMain1 extends javax.swing.JDialog implements Runnable {

    /**
     * Creates new form TrainTcMain1
     */
    int sno;
    PbtDbConn mycon3;
    boolean b=true;
    Thread th;
    String mys,pn,sn,co;
    DefaultTableColumnModel m1,m2,m3;
    PbtDbConn mycon1,mycon2;
     Object[] m,h,s;
     DefaultTableModel dtm,dtm1,dtm2;
    String tn,bn,nn,prob;
    java.awt.Frame f;
    boolean g;
    public TrainTcMain1(java.awt.Frame parent, boolean modal,String sc,String se) {
        super(parent, modal);
        initComponents();
        setIconImage();
        this.setBounds(155,170,1020,510);
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setBorderPainted(false);
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
         tn=sc;
        bn=se;
        f=parent;
        g=modal;
        mycon1=new PbtDbConn();
        mycon2=new PbtDbConn();
        mycon3=new PbtDbConn();
        th=new Thread(this);
         dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setColumnCount(4);
        Object[] v=new Object[]{"PNR","Seat No","Coach","Problem"};
        dtm.setColumnIdentifiers(v);
        dtm.fireTableDataChanged();
        dtm1=(DefaultTableModel)jTable2.getModel();
        dtm1.setColumnCount(4);
        Object[] q=new Object[]{"PNR","Seat No","Coach","Problem"};
        dtm1.setColumnIdentifiers(q);
        dtm1.fireTableDataChanged();
        dtm2=(DefaultTableModel)jTable3.getModel();
        dtm2.setColumnCount(4);
        Object[] n=new Object[]{"PNR","Seat No","Coach","Problem"};
        dtm2.setColumnIdentifiers(n);
        dtm2.fireTableDataChanged();

        nn="Select a.PNR,a.Seat,a.Coach,a.PrId,b.Problem from rtproblem a,problemrt b where (a.PrID='PR 3' and b.PrID='PR 3')or(a.PrID='PR 4' and b.PrID='PR 4')or(a.PrID='PR 9' and b.PrID='PR 9')or(a.PrID='PR 10' and b.PrID='PR 10')or(a.PrID='PR 19' and b.PrID='PR 19')or(a.PrID='PR 20' and b.PrID='PR 20')or(a.PrID='PR 21' and b.PrID='PR 21')or(a.PrID='PR 22' and b.PrID='PR 22')or(a.PrID='PR 23' and b.PrID='PR 23')or(a.PrID='PR 24' and b.PrID='PR 24')";
        System.out.println(nn);
        try{
        mycon1.rs=mycon1.stm.executeQuery(nn);
        dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
         dtm1.setRowCount(0);
          dtm2.setRowCount(0);
       while(mycon1.rs.next())
       {
            mycon1.rs.getString("a.PrID");
            pn=mycon1.rs.getString("a.PNR");
            sn=mycon1.rs.getString("a.Seat");
            co=mycon1.rs.getString("a.Coach");
            prob=mycon1.rs.getString("b.Problem");
            System.out.println(prob+"-----");
       /* if(mycon1.rs.getString("PrID").equals("PR 9")||mycon1.rs.getString("PrID").equals("PR 10"));
        {
            m=new Object[]{prob};
            System.out.println(m);
            dtm.addRow(m);
            jTable1.setModel(dtm);
        }*/
        if(mycon1.rs.getString("PrID").equals("PR 9")||mycon1.rs.getString("PrID").equals("PR 10")){
            m=new Object[]{pn,sn,co,prob};
            System.out.println(m);
            dtm.addRow(m);
            jTable1.setModel(dtm);
        }
        else{
                
                
       if(mycon1.rs.getString("PrID").equals("PR 19")||mycon1.rs.getString("PrID").equals("PR 21")||mycon1.rs.getString("PrID").equals("PR 22")||mycon1.rs.getString("PrID").equals("PR 23")||mycon1.rs.getString("PrID").equals("PR 24")||mycon1.rs.getString("PrID").equals("PR 20"))
       {
       s=new Object[]{pn,sn,co,prob};
           dtm1.addRow(s);
           jTable2.setModel(dtm1);
       }
                else{
                
       if(mycon1.rs.getString("PrId").equals("PR 3")||mycon1.rs.getString("PrID").equals("PR 4"))
       {
           h=new Object[]{prob};
           dtm2.addRow(new Object[]{pn,sn,co,prob});
           jTable3.setModel(dtm2);
           
       }
                }
        }
                
        }  }catch(Exception e){System.out.println(e);}
      th.start();
    }

    
     public void run(){
        while(b){
        nn="Select a.PNR,a.Seat,a.Coach,a.PrId,b.Problem from rtproblem a,problemrt b where (a.PrID='PR 3' and b.PrID='PR 3')or(a.PrID='PR 4' and b.PrID='PR 4')or(a.PrID='PR 9' and b.PrID='PR 9')or(a.PrID='PR 10' and b.PrID='PR 10')or(a.PrID='PR 19' and b.PrID='PR 19')or(a.PrID='PR 20' and b.PrID='PR 20')or(a.PrID='PR 21' and b.PrID='PR 21')or(a.PrID='PR 22' and b.PrID='PR 22')or(a.PrID='PR 23' and b.PrID='PR 23')or(a.PrID='PR 24' and b.PrID='PR 24')";
        System.out.println(nn);
        try{
            th.sleep(15000);
        mycon1.rs=mycon1.stm.executeQuery(nn);
        dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
         dtm1.setRowCount(0);
          dtm2.setRowCount(0);
       while(mycon1.rs.next())
       {
            mycon1.rs.getString("a.PrID");
            pn=mycon1.rs.getString("a.PNR");
            sn=mycon1.rs.getString("a.Seat");
            co=mycon1.rs.getString("a.Coach");
            prob=mycon1.rs.getString("b.Problem");
            System.out.println(prob+"-----");
       /* if(mycon1.rs.getString("PrID").equals("PR 9")||mycon1.rs.getString("PrID").equals("PR 10"));
        {
            m=new Object[]{prob};
            System.out.println(m);
            dtm.addRow(m);
            jTable1.setModel(dtm);
        }*/
        if(mycon1.rs.getString("PrID").equals("PR 9")||mycon1.rs.getString("PrID").equals("PR 10")){
            m=new Object[]{pn,sn,co,prob};
            System.out.println(m);
            dtm.addRow(m);
            jTable1.setModel(dtm);
        }
        else{
                
                
       if(mycon1.rs.getString("PrID").equals("PR 19")||mycon1.rs.getString("PrID").equals("PR 21")||mycon1.rs.getString("PrID").equals("PR 22")||mycon1.rs.getString("PrID").equals("PR 23")||mycon1.rs.getString("PrID").equals("PR 24")||mycon1.rs.getString("PrID").equals("PR 20"))
       {
       s=new Object[]{pn,sn,co,prob};
           dtm1.addRow(s);
           jTable2.setModel(dtm1);
       }
                else{
                
       if(mycon1.rs.getString("PrId").equals("PR 3")||mycon1.rs.getString("PrID").equals("PR 4"))
       {
           h=new Object[]{prob};
           dtm2.addRow(new Object[]{pn,sn,co,prob});
           jTable3.setModel(dtm2);
           
       }
                }
        }
         
        }  }catch(Exception e){System.out.println(e);
        }
        if(this.isShowing()==false){
            System.out.println(this.isShowing()+" "+"ggg");
            th.stop();
           
        }
        }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\TCmain\\DROPREQ1.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 370, 150, 90);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\TCmain\\OTHER PROBLEM1.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(790, 370, 150, 90);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\TCmain\\PASSENGERCOM1.jpg")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 370, 150, 90);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\edit\\TCmain\\TC PROBLEM1.jpg")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(560, 370, 150, 90);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(42, 97, 280, 206);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 80, 290, 241);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(670, 100, 290, 206);

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Mechanical:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 310, 115, 23);

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Security:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 330, 71, 23);

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Helth:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 310, 46, 23);

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("TC Main:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(55, 45, 91, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\multi.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1020, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                String sid="";    
        String prevsid="";
        String eid="";
            String ud="";
            int rid=0;
            String g="",g1="";
            String h1="select a.UD,b.PrevSID,b.SNo,b.RID from troute a,currentstatus b where a.TrNo='"+tn+"'and b.TrNo='"+tn+"'";
            System.out.println(h1);
            try{
            mycon1.rs=mycon1.stm.executeQuery(h1);
            if(mycon1.rs.next()){
            ud=mycon1.rs.getString("UD");
            System.out.println(ud);
            prevsid=mycon1.rs.getString("PrevSID");
            sno=mycon1.rs.getInt("SNo");
            rid=mycon1.rs.getInt("RID");
            
            }
             if(ud.equals("u")){
             g="select SID,Stop from rstdetail where SNo>='"+sno+"'";
             
             try{mycon2.rs=mycon2.stm.executeQuery(g);
             while(mycon2.rs.next()){
             if(mycon2.rs.getString("Stop").equals("Y")){
             sid=mycon2.rs.getString("SID");
             break;
             }
             }
             String str3="select EID from dutyreg where Res like('%"+bn+"%') or Res like('"+bn+"%') or Res like('%"+bn+"') and TrNo='"+tn+"'";
             System.out.println(str3);
             mycon1.rs=mycon1.stm.executeQuery(str3);
             mycon1.rs.next();
             eid=mycon1.rs.getString("EID");
             String str4="update emp set OnDuty='DR-"+sid+"' where EID='"+eid+"'";
             System.out.println(str4);
             mycon3.stm.executeUpdate(str4);
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(null,"Please Select From Above");
//                 e.printStackTrace();
             }
             }else{
             g1="select SID,Stop from rstdetail wehere SNo<='"+sno+"'";
             try{mycon2.rs=mycon2.stm.executeQuery(g1);
             while(mycon2.rs.next()){
             if(mycon2.rs.getString("Stop").equals("Y")){
             sid=mycon2.rs.getString("SID");
             break;
             }
             }
             String str3="select EID from dutyreg where Res like('%"+bn+"%') or Res like('"+bn+"%') or Res like('%"+bn+"') and TrNo='"+tn+"'";
             System.out.println(str3);
             mycon1.rs=mycon1.stm.executeQuery(str3);
             mycon1.rs.next();
             eid=mycon1.rs.getString("EID");
             String str4="update emp set OnDuty='DR-"+sid+"' where EID='"+eid+"'";
             System.out.println(str4);
             mycon3.stm.executeUpdate(str4);
             }catch(Exception e){e.printStackTrace();}
             }   
            }
           catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.dispose();  
        TrainTcProb ttcp;
            ttcp=new TrainTcProb(f,g,tn,bn);
            ttcp.setVisible(true);
           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // passenger Problem
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // other problem
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }

}
