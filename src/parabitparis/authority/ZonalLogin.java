/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitparis.authority;
import java.awt.Color;
import java.awt.Toolkit;
import parabitparis.PbtDbConn;

/**
 *
 * @author HP
 */

public class ZonalLogin extends javax.swing.JDialog{

    /**
     * Creates new form ZonalLogin1
     */
    
    int cas,zid;
    String did;
    PbtDbConn mycon1;

    public ZonalLogin(java.awt.Frame parent, boolean modal,int cas) {
        super(parent, modal);
//        this.setUndecorated(true);
        initComponents();
        jTextField.getText();
          jTextField.setOpaque(false);
        jPasswordField.setOpaque(false);
        jTextField.setBackground(new Color(0,0,0,0));
        jPasswordField.setBackground(new Color(0,0,0,0));
        jButton1.setBackground(new Color(0,0,0,0));
        this.setBounds(450,260,420,280);
        mycon1=new PbtDbConn();
        this.cas=cas;
      setIconImage();
//        jButton1.setIcon(new javax.swing.ImageIcon("file:\\C:\\ParabitPARIS\\assects\\buttons\\SUBMIT.jpg"));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\gradi\\zon-login\\zon-login.jpg"));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\ParabitPARIS\\assects\\buttons\\SUBMIT.jpg"));
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
        jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("EID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 80, 30);
        getContentPane().add(jTextField);
        jTextField.setBounds(140, 80, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 130, 90, 30);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 180, 120, 40);
        getContentPane().add(jPasswordField);
        jPasswordField.setBounds(140, 130, 220, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   switch(cas){
    case 1:
String str="select * from emp where EID='"+jTextField.getText()+"' and Pswd='"+jPasswordField.getText()+"' and Des='DRM'";
String str1="select DID from emp where EID='"+jTextField.getText()+"' and Pswd='"+jPasswordField.getText()+"' and Des='DRM'";
try{mycon1.rs=mycon1.stm.executeQuery(str);
if(mycon1.rs.next()){
mycon1.rs=mycon1.stm.executeQuery(str1);
if(mycon1.rs.next()){
did=mycon1.rs.getString("DID");
this.dispose();
new DivisionalRailManag(did).setVisible(true);

}
}
    
}catch(Exception e){
//    e.printStackTrace();
}
    break;
        
    case 2:
        
       
        try{
            String str2="select * from emp where EID='"+jTextField.getText()+"' and Pswd='"+jPasswordField.getText()+"' and Des='GM'";
           System.out.println(str2);
            mycon1.rs=mycon1.stm.executeQuery(str2);
if(mycon1.rs.next()){
    String str3="select ZID from emp where EID='"+jTextField.getText()+"' and Pswd='"+jPasswordField.getText()+"' and Des='GM'";
        System.out.println(str3);
    mycon1.rs=mycon1.stm.executeQuery(str3);
 if(mycon1.rs.next())
 {
 zid=mycon1.rs.getInt("ZID");
 System.out.println(zid);
 }  

    this.dispose();
 new GeneralManager(zid).setVisible(true);    

}
}catch(Exception e){
//    e.printStackTrace();
}
    break;
}
                                            
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ZonalLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ZonalLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ZonalLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ZonalLogin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ZonalLogin1 dialog = new ZonalLogin1(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
  //  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables

    
    private void setIconImage()
    {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("FLAG22.png")));
    }
}
