/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import middleware.ServerDesktop;
import middleware.ServerWeb;

/**
 *
 * @author patri
 */
public class ControlPanel extends javax.swing.JFrame {

    /**
     * Creates new form ControlPanel
     */
    public ControlPanel() {
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

        lblWebClient = new javax.swing.JLabel();
        btnTurnOnWeb = new javax.swing.JToggleButton();
        lblDesktopClient = new javax.swing.JLabel();
        btnTurnOnDesktop = new javax.swing.JToggleButton();
        lblAdvertisement = new javax.swing.JLabel();
        btnAdvertisement = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWebClient.setText("Server for Web Client:");

        btnTurnOnWeb.setText("Turn On");
        btnTurnOnWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnOnWebActionPerformed(evt);
            }
        });

        lblDesktopClient.setText("Server for Desktop Client:");

        btnTurnOnDesktop.setText("Turn On");
        btnTurnOnDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnOnDesktopActionPerformed(evt);
            }
        });

        lblAdvertisement.setText("Advertisement:");

        btnAdvertisement.setText("Turn On");
        btnAdvertisement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvertisementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesktopClient, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWebClient, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvertisement, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdvertisement, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTurnOnWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTurnOnDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWebClient)
                    .addComponent(btnTurnOnWeb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesktopClient)
                    .addComponent(btnTurnOnDesktop))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdvertisement)
                    .addComponent(btnAdvertisement))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTurnOnWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnOnWebActionPerformed
        // TODO add your handling code here:
        if (btnTurnOnWeb.isSelected()) {
            ServerWeb server = new ServerWeb();
            server.startServer();
            btnTurnOnWeb.setText("Turn Off");
        } else {
            btnTurnOnWeb.setText("Turn On");
        }
    }//GEN-LAST:event_btnTurnOnWebActionPerformed

    private void btnTurnOnDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnOnDesktopActionPerformed
        // TODO add your handling code here:
        if (btnTurnOnDesktop.isSelected()) {
            ServerDesktop server = new ServerDesktop();
            server.startServer();
            btnTurnOnDesktop.setText("Turn Off");
        } else {
            btnTurnOnDesktop.setText("Turn On");
        }
    }//GEN-LAST:event_btnTurnOnDesktopActionPerformed

    private void btnAdvertisementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvertisementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdvertisementActionPerformed

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
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdvertisement;
    private javax.swing.JToggleButton btnTurnOnDesktop;
    private javax.swing.JToggleButton btnTurnOnWeb;
    private javax.swing.JLabel lblAdvertisement;
    private javax.swing.JLabel lblDesktopClient;
    private javax.swing.JLabel lblWebClient;
    // End of variables declaration//GEN-END:variables
}
