/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulaires;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* Ouvre la fenêtre "A propos de".
 * @author Sandrine Ociepka
 * @author Stephane Coulon
 * @version 1.0
 */
public class aide extends javax.swing.JDialog {

   /**
    * Création de la fenêtre "A propos de"
     *@param parent : fenetrePrincipaleFrame
     * @param modal true ou false
     * @throws java.io.IOException erreur si le fichier parent n'existe pas
     */
    public aide(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initComponents();
        initialise () ;
         /**
        * Commande pour centrer la fenêtre dans l'écran
        */
       setLocationRelativeTo(null);
    }
 /**
        * changer l'icone de la fenêtre
        */   
private void initialise(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/logo.png")));
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagearbre = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondecran = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("A propos de");
        setFocusCycleRoot(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 300));
        jPanel1.setLayout(null);

        imagearbre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/téléchargement.jpg"))); // NOI18N
        jPanel1.add(imagearbre);
        imagearbre.setBounds(90, 120, 190, 190);

        titre.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        titre.setText("Gestion Tout Bois");
        jPanel1.add(titre);
        titre.setBounds(10, 10, 350, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("version 1.0");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 50, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("La Team SOC");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 90, 110, 17);

        fondecran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/meubles4.jpg"))); // NOI18N
        fondecran.setOpaque(true);
        jPanel1.add(fondecran);
        fondecran.setBounds(0, 0, 370, 310);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(aide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               aide dialog = null;
                try {
                    dialog = new aide(new javax.swing.JFrame(), true);
                } catch (IOException ex) {
                    Logger.getLogger(aide.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondecran;
    private javax.swing.JLabel imagearbre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
