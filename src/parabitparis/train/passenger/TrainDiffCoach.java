/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.train.passenger;

import parabitparis.train.passenger.TrainCorruption;
import parabitparis.train.passenger.TrainClean;
import java.awt.Toolkit;
/*
 *
 * @author HP
 */
public class TrainDiffCoach extends javax.swing.JDialog {

    /**
     * Creates new form TrainBogi
     */
    
    java.awt.Frame f;
    boolean b;
    //Document h;
    String na,bn,g,l,mob,tn,gh,se;
    public TrainDiffCoach(java.awt.Frame parent, boolean modal,String n,String o,String u,String mo,String trn,String set) {
        super(parent, modal);
        initComponents();
        setIconImage();
        this.setBounds(430,230,440,250);
        
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
       /* gh="You Do not Belong To this Bogi \n" +
"Choose The Bogi You Want \n" +
"To Complain \n";*/
       //jtc.setText(gh);
        na=n;
       b=modal;
       f=parent;
       l=o;
       g=u;
       mob=mo;
       tn=trn;
       se=set;
       try{
       
       }catch(Exception e){
//           System.out.println(e);
       }
       jButton1.setText(l);
       jButton2.setText(g);
       //jTextArea1.setText("dshffgj");
      
       jTextArea1.setEditable(false);
       jTextArea1.setVisible(true);
       jTextArea1.setAutoscrolls(false);
    
       
    }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 102, 225));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(225, 225, 225));
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 145, 101, 40);

        jButton2.setBackground(new java.awt.Color(102, 102, 225));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 145, 101, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("You Are Not From This \nBogi Select the Bogi From\nBelow For Which You\nWant To Complain");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 22, 233, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\20 gradi\\photo-1508796079212-a4b83cbf734d.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 460, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if(evt.getSource()==jButton1){
                bn=l;
                read();
            }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(evt.getSource()==jButton2){
            bn=g;
            read();
        }
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void read(){
        if(na.equals("TrainWater")){
        this.dispose();
            TrainWater ob1;
        ob1=new TrainWater(f,b,bn,mob,tn,se);
        ob1.setVisible(true);
        
        }
        if(na.equals("TrainClean"))
        {
            this.dispose();
            TrainClean tc;
            tc=new TrainClean(f,b,bn,mob,tn,se);
            tc.setVisible(true);
            
        }
        if(na.equals("TrainMechanical")){
           
            this.dispose();
            TrainMechanical mec;
     mec=new TrainMechanical(f,b,bn,mob,tn,se);
     mec.setVisible(true);
     
        }
        if(na.equals("TrainPantry")){
           this.dispose();
            TrainPantry tp;
        tp=new TrainPantry(f,b,bn,mob,tn,se);
        tp.setVisible(true);
        
        }
        if(na.equals("TrainMissBehave")){
         this.dispose();
            TrainMisBehave tmb;
        tmb=new TrainMisBehave(f,b,bn,mob,tn,se);
        tmb.setVisible(true);
        
        }
        if(na.equals("TrainCorrupton")){
            this.dispose();
            TrainCorruption tc;
       tc=new TrainCorruption(f,b,bn,mob,tn,se);
       tc.setVisible(true);
       
        }
        if(na.equals("TrainSecurity")){
       this.dispose();
            TrainSecurity ts;
          ts=new TrainSecurity(f,b,bn,mob,tn,se);
          ts.setVisible(true);
          
        }
        if(na.equals("TrainElectrical")){
          this.dispose();
            TrainElectrical te;
        te=new TrainElectrical(f,b,bn,mob,tn,se);
        te.setVisible(true);
       
        }
        if(na.equals("TrainOther"))
        {
             this.dispose();
            TrainOther to;
            to=new TrainOther(f,b,bn,mob,tn,se);
            to.setVisible(true);

        }
        if(na.equals("TrainHealth")){
      
            this.dispose();
//            TrainHealth th;
        new TrainHealth(f,b,bn,mob,tn,se).setVisible(true);
        
        }
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }

}