package universidadgruppo93.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.AccesoADatos.InscripcionData;
import universidadgruppo93.AccesoADatos.MateriaData;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;

public class MenuConsultaAlumnosMateria extends javax.swing.JInternalFrame {
private InscripcionData inscripData;
private MateriaData mateData;
private AlumnoData aluData;
private DefaultTableModel tablamodelo;
private ArrayList<Alumno> listaA;
private ArrayList<Materia> listaM;
  
    public MenuConsultaAlumnosMateria() {
        initComponents();
        aluData = new AlumnoData();
        inscripData = new InscripcionData();
        mateData = new MateriaData();
        listaA = (ArrayList<Alumno>) aluData.listarAlumnos();
        listaM = (ArrayList<Materia>) mateData.listarMateria();
        tablamodelo = new DefaultTableModel();
        
        cargaMateria();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jbSalirAlumnosPorMateria = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbcMateria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jbBuscarMaterias = new javax.swing.JButton();

        setTitle("Listado de Alumnos por Materia");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Listado de Alumnos por Materia");

        jbSalirAlumnosPorMateria.setText("Salir");
        jbSalirAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirAlumnosPorMateriaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbcMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcMateriaActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecciona una materia:");

        jbBuscarMaterias.setText("Buscar");
        jbBuscarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbBuscarMaterias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalirAlumnosPorMateria))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbcMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbcMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalirAlumnosPorMateria)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbBuscarMaterias)
                        .addContainerGap())))
        );

        jbcMateria.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirAlumnosPorMateriaActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirAlumnosPorMateriaActionPerformed

    private void jbcMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbcMateriaActionPerformed

    private void jbBuscarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarMateriasActionPerformed
        borrarFila();
        cargaAlumno();
    }//GEN-LAST:event_jbBuscarMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscarMaterias;
    private javax.swing.JButton jbSalirAlumnosPorMateria;
    private javax.swing.JComboBox<Materia> jbcMateria;
    // End of variables declaration//GEN-END:variables

private void cargaAlumno(){
        Materia seleccionado = (Materia)jbcMateria.getSelectedItem();
        listaA = (ArrayList) inscripData.obtenerAlumnosXMateria(seleccionado.getIdMateria());
        for (Alumno a: listaA){
            tablamodelo.addRow(new Object[] {a.getApellido(), a.getNombre(), a.getDni()});
        }
    
    }
private void cargaMateria() {
        for (Materia item : listaM) {
            jbcMateria.addItem(item);
        }
    }

    private void borrarFila() {
       int indice = tablamodelo.getRowCount() -1;
        
        for (int i = indice; i>=0; i--){
            tablamodelo.removeRow(i);
        }
    }
    private void armarCabeceraTabla() {
        ArrayList<Object> cabecera = new ArrayList<>();
        cabecera.add("Apellido");
        cabecera.add("Nombre");
        for (Object it: cabecera){
            tablamodelo.addColumn(it);
        }
        jTable1.setModel(tablamodelo);
    }
}
