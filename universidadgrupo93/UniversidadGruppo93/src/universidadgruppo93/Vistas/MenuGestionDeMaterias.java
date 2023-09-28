/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgruppo93.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadgruppo93.AccesoADatos.MateriaData;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;

/**
 *
 * @author Gabi
 */
public class MenuGestionDeMaterias extends javax.swing.JInternalFrame {

    private MateriaData mate = new MateriaData();
    private Materia mateactual = null;

    /**
     * Creates new form MenuMateria2
     */
    public MenuGestionDeMaterias() {
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

        jrEstado = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtpNombreMateria = new javax.swing.JTextPane();
        jbEliminarMateria = new javax.swing.JButton();
        jbNuevoAlumno = new javax.swing.JButton();
        jbGuardarAlumno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbSalirMenuAlumnos = new javax.swing.JButton();
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

        jbNuevoAlumno.setText("Nuevo");
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });

        jbGuardarAlumno.setText("Guardar");
        jbGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");

        jLabel4.setText("Año");

        jLabel2.setText("Codigo");

        jbSalirMenuAlumnos.setText("Salir");
        jbSalirMenuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMenuAlumnosActionPerformed(evt);
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
                                    .addComponent(jbNuevoAlumno)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbEliminarMateria)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbGuardarAlumno)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbSalirMenuAlumnos)))
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
                        .addComponent(jbGuardarAlumno)
                        .addComponent(jbSalirMenuAlumnos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEliminarMateria)
                            .addComponent(jbNuevoAlumno))
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
        JOptionPane.showMessageDialog(this, "Debe buscar un alumno");
        }
    }//GEN-LAST:event_jbEliminarMateriaActionPerformed

    private void jbNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumnoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoAlumnoActionPerformed

    private void jbGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarAlumnoActionPerformed
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
            } else {
                mateactual.setNombre(nombre);
                mateactual.setAnioMateria(anio);
                mateactual.setIdMateria(codigo);
                
            }
            limpiarCampos();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbGuardarAlumnoActionPerformed

    private void jbSalirMenuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMenuAlumnosActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirMenuAlumnosActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {
            Integer codigo = Integer.parseInt(jtpCodigo.getText());
            mateactual = mate.buscarMateria(codigo);
            if (mateactual != null) {
                jtpNombreMateria.setText(mateactual.getNombre());
                jrEstado.setSelected(mateactual.isActivo());
                jtpanio.setText(String.valueOf(mateactual.getAnioMateria()));
            } else {
                //agregar que no se ingreso codigo de materia 
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
    private javax.swing.JButton jbGuardarAlumno;
    private javax.swing.JButton jbNuevoAlumno;
    private javax.swing.JButton jbSalirMenuAlumnos;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextPane jtpCodigo;
    private javax.swing.JTextPane jtpNombreMateria;
    private javax.swing.JTextPane jtpanio;
    // End of variables declaration//GEN-END:variables

    void isIconifiable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void limpiarCampos() {
        jtpCodigo.setText("");
        jrEstado.setSelected(true);
        jtpanio.setText("");
        jtpNombreMateria.setText("");

    }
}
