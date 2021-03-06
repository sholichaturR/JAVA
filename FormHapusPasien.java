/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author AMRI
 */
public class FormHapusPasien extends javax.swing.JFrame {
koneksi kon;
    /**
     * Creates new form FormHapusPasien
     */
    public FormHapusPasien() {
        kon = new koneksi();
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

        jLabel2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelHapus = new javax.swing.JLabel();
        jLabelTombolBack = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel2.setText("ID Pasien          :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 220, 30));

        jLabelHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/LogoSampah.png"))); // NOI18N
        jLabelHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHapusMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 70, 70));

        jLabelTombolBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/button_back(1).png"))); // NOI18N
        jLabelTombolBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTombolBackMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelTombolBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, 50));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/FormHapusPasien.PNG"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHapusMouseClicked
        // TODO add your handling code here:
        String id;
        id = jTextFieldID.getText();
        int pilih = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data");
        if(pilih == 0){
            try{
                String delete = "delete from tb_pasien where id ='"+id+"'";
                Statement st = kon.con.createStatement();
                st.executeUpdate(delete);
                JOptionPane.showMessageDialog(this, "Data ID Pasien"+id+" berhasil dihapus");
                this.setVisible(false);
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jLabelHapusMouseClicked

    private void jLabelTombolBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTombolBackMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanDataPasien().setVisible(true);
    }//GEN-LAST:event_jLabelTombolBackMouseClicked

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
            java.util.logging.Logger.getLogger(FormHapusPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHapusPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHapusPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHapusPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHapusPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelHapus;
    private javax.swing.JLabel jLabelTombolBack;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
