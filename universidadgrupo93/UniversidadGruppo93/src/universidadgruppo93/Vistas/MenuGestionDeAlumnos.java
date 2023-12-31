package universidadgruppo93.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.Entidades.Alumno;

public class MenuGestionDeAlumnos extends javax.swing.JInternalFrame {
    private AlumnoData aluData=new AlumnoData();
    private Alumno alumnoActual=null;

    /**
     * Creates new form MenuGestionDeAlumnos2
     */
    public MenuGestionDeAlumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbBuscarPorDni = new javax.swing.JButton();
        jdtFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jbNuevoAlumno = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtpApellido = new javax.swing.JTextPane();
        jbEliminarAlumno = new javax.swing.JButton();
        jbGuardarAlumno = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbSalirMenuAlumnos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtpNombre = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpDocumento = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Alumno");

        jbBuscarPorDni.setText("Buscar");
        jbBuscarPorDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPorDniActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jbNuevoAlumno.setText("Nuevo");
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jtpApellido);

        jbEliminarAlumno.setText("Eliminar");
        jbEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAlumnoActionPerformed(evt);
            }
        });

        jbGuardarAlumno.setText("Guardar");
        jbGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarAlumnoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jbSalirMenuAlumnos.setText("Salir");
        jbSalirMenuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMenuAlumnosActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jtpNombre);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento");

        jLabel5.setText("Estado");

        jScrollPane1.setViewportView(jtpDocumento);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fecha de nacimiento");

        jrEstado.setSelected(true);
        jrEstado.setEnabled(false);
        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jbBuscarPorDni))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrEstado)
                                        .addComponent(jdtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbNuevoAlumno)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbEliminarAlumno)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbGuardarAlumno)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbSalirMenuAlumnos)))
                            .addGap(12, 12, 12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarPorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNuevoAlumno)
                            .addComponent(jbEliminarAlumno)
                            .addComponent(jbGuardarAlumno)
                            .addComponent(jbSalirMenuAlumnos)))
                    .addComponent(jdtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarPorDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPorDniActionPerformed
        try {
            Integer dni= Integer.parseInt(jtpDocumento.getText());
            alumnoActual=aluData.buscarAlumnoPorDni(dni);
            if(alumnoActual!=null){
                jtpApellido.setText(alumnoActual.getApellido());
                jtpNombre.setText(alumnoActual.getNombre());
                jrEstado.setSelected(alumnoActual.isActivo());
                
                LocalDate lc = alumnoActual.getFechaNac();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdtFecha.setDate(date);
            }else{
            JOptionPane.showMessageDialog(null, "Ingrese un documento");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error SQL"+ e);
        }
    }//GEN-LAST:event_jbBuscarPorDniActionPerformed

    private void jbNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumnoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoAlumnoActionPerformed

    private void jbEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAlumnoActionPerformed
        // TODO add your handling code here:
        if (alumnoActual !=null){
        aluData.eliminarAlumno(alumnoActual.getIdAlumno());
        alumnoActual = null;
        limpiarCampos();
        }else{
        JOptionPane.showMessageDialog(null, "Debe buscar un alumno");
        }
    }//GEN-LAST:event_jbEliminarAlumnoActionPerformed

    private void jbGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarAlumnoActionPerformed
        try {
            Integer dni = Integer.parseInt(jtpDocumento.getText());
            String nombre = jtpNombre.getText();
            String apellido = jtpApellido.getText();
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puede haber campos vacios.");
                return;
            }
            java.util.Date sFecha=jdtFecha.getDate();
            LocalDate fechaNac=sFecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado = jrEstado.isSelected();
            
            if (alumnoActual == null) {
                alumnoActual = new Alumno(apellido, nombre, dni, fechaNac, estado); 
                aluData.guardarAlumno(alumnoActual);
                JOptionPane.showMessageDialog(null, "Se guardo un nuevo alumno con Exito!");
            } else {
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNac(fechaNac);
                aluData.modificarAlumno(alumnoActual);
                JOptionPane.showMessageDialog(null, "Se guardaron las modificaciones al Alumno Correctamente");
            }
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbGuardarAlumnoActionPerformed

    private void jbSalirMenuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMenuAlumnosActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirMenuAlumnosActionPerformed

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscarPorDni;
    private javax.swing.JButton jbEliminarAlumno;
    private javax.swing.JButton jbGuardarAlumno;
    private javax.swing.JButton jbNuevoAlumno;
    private javax.swing.JButton jbSalirMenuAlumnos;
    private com.toedter.calendar.JDateChooser jdtFecha;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextPane jtpApellido;
    private javax.swing.JTextPane jtpDocumento;
    private javax.swing.JTextPane jtpNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtpDocumento.setText("");
        jtpApellido.setText("");
        jtpNombre.setText("");
        jrEstado.setSelected(true);
        jdtFecha.setDate(new Date());
    }
}
