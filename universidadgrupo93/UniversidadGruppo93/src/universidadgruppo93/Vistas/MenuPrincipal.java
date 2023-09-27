package universidadgruppo93.Vistas;

import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPAlumno = new javax.swing.JMenu();
        jMenuAlumnoOpc1 = new javax.swing.JMenuItem();
        jMenuPMateria = new javax.swing.JMenu();
        jMenuMateriaOpc1 = new javax.swing.JMenuItem();
        jMenuPAdministracion = new javax.swing.JMenu();
        jMenuAdminOpc1 = new javax.swing.JMenuItem();
        jMenuAdminOpc2 = new javax.swing.JMenuItem();
        jMenuPConsultas = new javax.swing.JMenu();
        jMenuConsultasOpc1 = new javax.swing.JMenuItem();
        jMenuPSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jMenuPAlumno.setText("Alumno");
        jMenuPAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPAlumnoActionPerformed(evt);
            }
        });

        jMenuAlumnoOpc1.setText("Formulario de Alumnos");
        jMenuAlumnoOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnoOpc1ActionPerformed(evt);
            }
        });
        jMenuPAlumno.add(jMenuAlumnoOpc1);

        jMenuBar1.add(jMenuPAlumno);

        jMenuPMateria.setText("Materia");

        jMenuMateriaOpc1.setText("Formulario de Materias");
        jMenuMateriaOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMateriaOpc1ActionPerformed(evt);
            }
        });
        jMenuPMateria.add(jMenuMateriaOpc1);

        jMenuBar1.add(jMenuPMateria);

        jMenuPAdministracion.setText("Administración");

        jMenuAdminOpc1.setText("Manejo de Inscripciones");
        jMenuAdminOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdminOpc1ActionPerformed(evt);
            }
        });
        jMenuPAdministracion.add(jMenuAdminOpc1);

        jMenuAdminOpc2.setText("Manipulaciones de notas");
        jMenuAdminOpc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdminOpc2ActionPerformed(evt);
            }
        });
        jMenuPAdministracion.add(jMenuAdminOpc2);

        jMenuBar1.add(jMenuPAdministracion);

        jMenuPConsultas.setText("Consultas");

        jMenuConsultasOpc1.setText("Alumnos por Materia");
        jMenuConsultasOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasOpc1ActionPerformed(evt);
            }
        });
        jMenuPConsultas.add(jMenuConsultasOpc1);

        jMenuBar1.add(jMenuPConsultas);

        jMenuPSalir.setText("Salir");
        jMenuPSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuPSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAlumnoOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnoOpc1ActionPerformed
        MenuGestionDeAlumnos abrirMenuGDA = new MenuGestionDeAlumnos();
        jDesktopPane1.add(abrirMenuGDA);
        abrirMenuGDA.show();
    }//GEN-LAST:event_jMenuAlumnoOpc1ActionPerformed

    private void jMenuPSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPSalirActionPerformed

    }//GEN-LAST:event_jMenuPSalirActionPerformed

    private void jMenuPAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPAlumnoActionPerformed

    }//GEN-LAST:event_jMenuPAlumnoActionPerformed

    private void jMenuMateriaOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMateriaOpc1ActionPerformed
        MenuGestionDeMaterias abrirMenuGDM = new MenuGestionDeMaterias();
        jDesktopPane1.add(abrirMenuGDM);
        abrirMenuGDM.show();
    }//GEN-LAST:event_jMenuMateriaOpc1ActionPerformed

    private void jMenuAdminOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdminOpc1ActionPerformed
        MenuInscripciones abrirMI = new MenuInscripciones();
        jDesktopPane1.add(abrirMI);
        abrirMI.show();
    }//GEN-LAST:event_jMenuAdminOpc1ActionPerformed

    private void jMenuAdminOpc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdminOpc2ActionPerformed
        MenuCargaDeNotas abrirMCDN = new MenuCargaDeNotas();
        jDesktopPane1.add(abrirMCDN);
        abrirMCDN.show();
    }//GEN-LAST:event_jMenuAdminOpc2ActionPerformed

    private void jMenuConsultasOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasOpc1ActionPerformed
        MenuConsultaAlumnosMateria abrirMCAM = new MenuConsultaAlumnosMateria();
        jDesktopPane1.add(abrirMCAM);
        abrirMCAM.show();
    }//GEN-LAST:event_jMenuConsultasOpc1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuAdminOpc1;
    private javax.swing.JMenuItem jMenuAdminOpc2;
    private javax.swing.JMenuItem jMenuAlumnoOpc1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultasOpc1;
    private javax.swing.JMenuItem jMenuMateriaOpc1;
    private javax.swing.JMenu jMenuPAdministracion;
    private javax.swing.JMenu jMenuPAlumno;
    private javax.swing.JMenu jMenuPConsultas;
    private javax.swing.JMenu jMenuPMateria;
    private javax.swing.JMenu jMenuPSalir;
    // End of variables declaration//GEN-END:variables
}
