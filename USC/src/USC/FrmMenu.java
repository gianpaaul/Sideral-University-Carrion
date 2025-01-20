
package USC;

import java.awt.Color;
import javax.swing.JOptionPane;


public class FrmMenu extends javax.swing.JFrame {

 
    public FrmMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Menu de administrador");
        this.setDefaultCloseOperation(0);
        this.setResizable(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo,"src/Recursos/Fondomenu.jpg");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jAlumnos = new javax.swing.JMenu();
        jAlumnosAgregar = new javax.swing.JMenuItem();
        jAlumnosConsultar = new javax.swing.JMenuItem();
        jDocentes = new javax.swing.JMenu();
        jDocentesAgregar = new javax.swing.JMenuItem();
        jDocentesConsultar = new javax.swing.JMenuItem();
        jCursos = new javax.swing.JMenu();
        jCursosAgregar = new javax.swing.JMenuItem();
        jasignar = new javax.swing.JMenu();
        jAsignarcurso = new javax.swing.JMenuItem();
        jCerrar = new javax.swing.JMenu();
        jCerrarSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);

        Menu.setBackground(new java.awt.Color(153, 255, 153));
        Menu.setBorder(null);
        Menu.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jAlumnos.setForeground(new java.awt.Color(30, 30, 30));
        jAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alumno.png"))); // NOI18N
        jAlumnos.setText("Alumnos");
        jAlumnos.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jAlumnosAgregar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jAlumnosAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar-usuario.png"))); // NOI18N
        jAlumnosAgregar.setText("Agregar");
        jAlumnosAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlumnosAgregarActionPerformed(evt);
            }
        });
        jAlumnos.add(jAlumnosAgregar);

        jAlumnosConsultar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jAlumnosConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda.png"))); // NOI18N
        jAlumnosConsultar.setText("Consultar");
        jAlumnosConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlumnosConsultarActionPerformed(evt);
            }
        });
        jAlumnos.add(jAlumnosConsultar);

        Menu.add(jAlumnos);

        jDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/docentes.png"))); // NOI18N
        jDocentes.setText("Docentes");
        jDocentes.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jDocentesAgregar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jDocentesAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agregar-usuario.png"))); // NOI18N
        jDocentesAgregar.setText("Agregar");
        jDocentesAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDocentesAgregarActionPerformed(evt);
            }
        });
        jDocentes.add(jDocentesAgregar);

        jDocentesConsultar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jDocentesConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda.png"))); // NOI18N
        jDocentesConsultar.setText("Consultar");
        jDocentesConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDocentesConsultarActionPerformed(evt);
            }
        });
        jDocentes.add(jDocentesConsultar);

        Menu.add(jDocentes);

        jCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cursos.png"))); // NOI18N
        jCursos.setText("Cursos");
        jCursos.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jCursosAgregar.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jCursosAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/asignarcurso.png"))); // NOI18N
        jCursosAgregar.setText("Agregar");
        jCursosAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCursosAgregarActionPerformed(evt);
            }
        });
        jCursos.add(jCursosAgregar);

        Menu.add(jCursos);

        jasignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icon cursos.png"))); // NOI18N
        jasignar.setText("Asignar ");

        jAsignarcurso.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jAsignarcurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/agrecurso.png"))); // NOI18N
        jAsignarcurso.setText("Asignar curso");
        jAsignarcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAsignarcursoActionPerformed(evt);
            }
        });
        jasignar.add(jAsignarcurso);

        Menu.add(jasignar);

        jCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/dejar.png"))); // NOI18N
        jCerrar.setText("Cerrar");
        jCerrar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        jCerrarSalir.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jCerrarSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir-alt.png"))); // NOI18N
        jCerrarSalir.setText("Salir");
        jCerrarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarSalirActionPerformed(evt);
            }
        });
        jCerrar.add(jCerrarSalir);

        Menu.add(jCerrar);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDocentesAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDocentesAgregarActionPerformed
    FrmAgregarDocente frm = new FrmAgregarDocente();
    frm.setVisible(true);
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jDocentesAgregarActionPerformed

    private void jDocentesConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDocentesConsultarActionPerformed
    FrmConsultarDocente frm = new FrmConsultarDocente();
    frm.setVisible(true);
    this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jDocentesConsultarActionPerformed

    private void jCursosAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCursosAgregarActionPerformed
    FrmAgregarCurso frm = new FrmAgregarCurso();
    frm.setVisible(true);
    this.dispose();
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jCursosAgregarActionPerformed

    private void jCerrarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarSalirActionPerformed
    int confirmado = JOptionPane.showConfirmDialog(null, "¿Está seguro de salir?");
    if (JOptionPane.OK_OPTION==confirmado)
    {
         this.setVisible(false);
         Login login = new Login();
         login.setVisible(true);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCerrarSalirActionPerformed

    private void jAlumnosConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlumnosConsultarActionPerformed
        FrmConsultarAlumno frm = new FrmConsultarAlumno();
        frm.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlumnosConsultarActionPerformed

    private void jAlumnosAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlumnosAgregarActionPerformed
        FrmAgregarAlumno frm = new FrmAgregarAlumno();
        frm.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jAlumnosAgregarActionPerformed

    private void jAsignarcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAsignarcursoActionPerformed

    FrmAsignar frm = new FrmAsignar();
    frm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jAsignarcursoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenu jAlumnos;
    private javax.swing.JMenuItem jAlumnosAgregar;
    private javax.swing.JMenuItem jAlumnosConsultar;
    private javax.swing.JMenuItem jAsignarcurso;
    private javax.swing.JMenu jCerrar;
    private javax.swing.JMenuItem jCerrarSalir;
    private javax.swing.JMenu jCursos;
    private javax.swing.JMenuItem jCursosAgregar;
    private javax.swing.JMenu jDocentes;
    private javax.swing.JMenuItem jDocentesAgregar;
    private javax.swing.JMenuItem jDocentesConsultar;
    private javax.swing.JMenu jasignar;
    // End of variables declaration//GEN-END:variables
}
