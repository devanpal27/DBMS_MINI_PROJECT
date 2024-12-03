
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author niree
 */
public class DASHBOARD extends javax.swing.JFrame {

    /**
     * Creates new form DASHBOARD
     */
    public DASHBOARD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        parcelmanagements = new javax.swing.JButton();
        deliveryagent = new javax.swing.JButton();
        tracking = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        label1.setText("label1");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(55, 55, 55));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER DASHBOARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 20, 172, -1));

        parcelmanagements.setBackground(new java.awt.Color(55, 55, 55));
        parcelmanagements.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        parcelmanagements.setForeground(new java.awt.Color(252, 230, 148));
        parcelmanagements.setText("PARCEL MANAGEMENT");
        parcelmanagements.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        parcelmanagements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parcelmanagementsActionPerformed(evt);
            }
        });
        getContentPane().add(parcelmanagements, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 30));

        deliveryagent.setBackground(new java.awt.Color(55, 55, 55));
        deliveryagent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deliveryagent.setForeground(new java.awt.Color(252, 230, 148));
        deliveryagent.setText("DELIVERY AGENT");
        deliveryagent.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        deliveryagent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryagentActionPerformed(evt);
            }
        });
        getContentPane().add(deliveryagent, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 30));

        tracking.setBackground(new java.awt.Color(55, 55, 55));
        tracking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tracking.setForeground(new java.awt.Color(252, 230, 148));
        tracking.setText("TRACKING");
        tracking.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        tracking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackingActionPerformed(evt);
            }
        });
        getContentPane().add(tracking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 30));

        back.setBackground(new java.awt.Color(55, 55, 55));
        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(252, 230, 148));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gradient-Colors-4.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parcelmanagementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parcelmanagementsActionPerformed
        // TODO add your handling code here:
        userparcelinfo up = new userparcelinfo();
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_parcelmanagementsActionPerformed

    private void deliveryagentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryagentActionPerformed
    userdeliveryagentinfo da = new userdeliveryagentinfo();
    da.setVisible(true);
    this.dispose();// TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_deliveryagentActionPerformed

    private void trackingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackingActionPerformed
        usertrackinginfo uti =new usertrackinginfo();
        uti.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_trackingActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Login lg= new Login();
        lg.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DASHBOARD().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton deliveryagent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private javax.swing.JButton parcelmanagements;
    private javax.swing.JButton tracking;
    // End of variables declaration//GEN-END:variables
}