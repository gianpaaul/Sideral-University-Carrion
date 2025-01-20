/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package USC;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FrmMenuAlumno extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuAlumno
     */
    public FrmMenuAlumno(){
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Menu de alumno");
        this.setDefaultCloseOperation(0);
        this.setResizable(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(Fondo,"src/Recursos/fondomenualumnos.jpg");
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
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jmatricula = new javax.swing.JMenu();
        Jvermatricula = new javax.swing.JMenuItem();
        Jagrematricula = new javax.swing.JMenuItem();
        Jcerrar = new javax.swing.JMenu();
        JSalir = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(711, 521));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(711, 521));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        Jmatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/matrículas.png"))); // NOI18N
        Jmatricula.setText("Matrícula");
        Jmatricula.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        Jvermatricula.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        Jvermatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/vermatricula.png"))); // NOI18N
        Jvermatricula.setText("Ver Matrícula");
        Jvermatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JvermatriculaActionPerformed(evt);
            }
        });
        Jmatricula.add(Jvermatricula);

        Jagrematricula.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        Jagrematricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agrematricu.png"))); // NOI18N
        Jagrematricula.setText("Agregar Matrícula");
        Jagrematricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JagrematriculaActionPerformed(evt);
            }
        });
        Jmatricula.add(Jagrematricula);

        jMenuBar1.add(Jmatricula);

        Jcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/dejar.png"))); // NOI18N
        Jcerrar.setText("Cerrar");
        Jcerrar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N

        JSalir.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        JSalir.setSelected(true);
        JSalir.setText("Salir ");
        JSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir-alt.png"))); // NOI18N
        JSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSalirActionPerformed(evt);
            }
        });
        Jcerrar.add(JSalir);

        jMenuBar1.add(Jcerrar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JvermatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JvermatriculaActionPerformed
    FrmVerMatricula frm = new FrmVerMatricula();
    frm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_JvermatriculaActionPerformed

    private void JSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSalirActionPerformed
    int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de salir?");
    if (JOptionPane.OK_OPTION==confirmado)
    {
         this.setVisible(false);
         Login login = new Login();
         login.setVisible(true);
    }
    }//GEN-LAST:event_JSalirActionPerformed

    private void JagrematriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JagrematriculaActionPerformed
    FrmAgregarMatricula frm = new FrmAgregarMatricula();
    frm.setVisible(true);
    this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_JagrematriculaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JRadioButtonMenuItem JSalir;
    private javax.swing.JMenuItem Jagrematricula;
    private javax.swing.JMenu Jcerrar;
    private javax.swing.JMenu Jmatricula;
    private javax.swing.JMenuItem Jvermatricula;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
