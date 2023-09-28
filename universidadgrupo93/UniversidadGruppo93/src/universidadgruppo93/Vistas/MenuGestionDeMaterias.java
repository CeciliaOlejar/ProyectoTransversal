package universidadgruppo93.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadgruppo93.AccesoADatos.MateriaData;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;

public class MenuGestionDeMaterias extends javax.swing.JInternalFrame {

    private MateriaData mate = new MateriaData();
    private Materia mateactual = null;

    public MenuGestionDeMaterias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrEstado = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtpNombreMateria = new javax.swing.JTextPane();
        jbEliminarMateria = new javax.swing.JButton();
        jbNuevaMateria = new javax.swing.JButton();
        jbGuardarMateria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbSalirMenuMateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCodigo = new javax.swing.JTextPane();
        janio = new javax.swing.JScrollPane();
        jtpanio = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Materia");

        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jtpNombreMateria);

        jbEliminarMateria.setText("Eliminar");
        jbEliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarMateriaActionPerformed(evt);
            }
        });

        jbNuevaMateria.setText("Nuevo");
        jbNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMateriaActionPerformed(evt);
            }
        });

        jbGuardarMateria.setText("Guardar");
        jbGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMateriaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");

        jLabel4.setText("Año");

        jLabel2.setText("Codigo");

        jbSalirMenuMateria.setText("Salir");
        jbSalirMenuMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMenuMateriaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jtpCodigo);

        janio.setViewportView(jtpanio);

        jLabel5.setText("Estado");

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(janio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBuscar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jScrollPane2)
                                            .addGap(8, 8, 8))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrEstado))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbNuevaMateria)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbEliminarMateria)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbGuardarMateria)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbSalirMenuMateria)))
                            .addGap(12, 12, 12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1)))
                .addContainerGap(11, Short.MAX_VALUE))
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
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(janio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbGuardarMateria)
                        .addComponent(jbSalirMenuMateria))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEliminarMateria)
                            .addComponent(jbNuevaMateria))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed

    }//GEN-LAST:event_jrEstadoActionPerformed

    private void jbEliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarMateriaActionPerformed
    if (mateactual !=null){
        mate.eliminarMateria(mateactual);
        mateactual = null;
        limpiarCampos();
        }else{
        JOptionPane.showMessageDialog(this, "Debe primero buscar un alumno");
        }
    }//GEN-LAST:event_jbEliminarMateriaActionPerformed

    private void jbNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMateriaActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevaMateriaActionPerformed

    private void jbGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarMateriaActionPerformed
        try {
            Integer codigo = Integer.parseInt(jtpCodigo.getText());
            String nombre = jtpNombreMateria.getText();
            Integer anio = Integer.parseInt(jtpanio.getText());
            if (anio==null || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios.");
                return;
            }
            Boolean estado = jrEstado.isSelected();
            if (mateactual == null) {
                mateactual = new Materia(nombre,anio,true); 
                mate.guardarMateria(mateactual);
                JOptionPane.showMessageDialog(null, "Se guardo la materia con Exito!");
            } else {
                mateactual.setNombre(nombre);
                mateactual.setAnioMateria(anio);
                mateactual.setIdMateria(codigo);
                mate.modificarMateria(mateactual);
                JOptionPane.showMessageDialog(null, "Se modifico la materia con EXITO!");
                
            }
            limpiarCampos();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbGuardarMateriaActionPerformed

    private void jbSalirMenuMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMenuMateriaActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirMenuMateriaActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            Integer codigo = Integer.parseInt(jtpCodigo.getText());
            mateactual = mate.buscarMateria(codigo);
            if (mateactual != null) {
                jtpNombreMateria.setText(mateactual.getNombre());
                jrEstado.setSelected(mateactual.isActivo());
                jtpanio.setText(String.valueOf(mateactual.getAnioMateria()));
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un codigo de materia");
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane janio;
    private javax.swing.JButton jbEliminarMateria;
    private javax.swing.JButton jbGuardarMateria;
    private javax.swing.JButton jbNuevaMateria;
    private javax.swing.JButton jbSalirMenuMateria;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextPane jtpCodigo;
    private javax.swing.JTextPane jtpNombreMateria;
    private javax.swing.JTextPane jtpanio;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtpCodigo.setText("");
        jrEstado.setSelected(true);
        jtpanio.setText("");
        jtpNombreMateria.setText("");

    }
}
