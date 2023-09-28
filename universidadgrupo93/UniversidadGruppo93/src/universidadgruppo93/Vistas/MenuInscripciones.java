package universidadgruppo93.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.AccesoADatos.MateriaData;
import universidadgruppo93.AccesoADatos.InscripcionData;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;
import universidadgruppo93.Entidades.Inscripcion;

public class MenuInscripciones extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;

    private InscripcionData inscripData;
    private MateriaData mateData;
    private AlumnoData aluData;

    private DefaultTableModel tablamodelo;

    public MenuInscripciones() {
        initComponents();

        aluData = new AlumnoData();
        listaA = (ArrayList<Alumno>) aluData.listarAlumnos();
        tablamodelo = new DefaultTableModel();
        inscripData = new InscripcionData();
        mateData = new MateriaData();

        cargaAlumnos();
        armarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jbEliminarAlumno = new javax.swing.JButton();
        jbcAlumnos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbSalirMenuAlumnos = new javax.swing.JButton();
        jRadioMateriasInsriptas = new javax.swing.JRadioButton();
        jRadioMateriasNoInscriptas = new javax.swing.JRadioButton();
        jbNuevoAlumno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Formulario de Inscripcion");

        jbEliminarAlumno.setText("Anular inscripción");
        jbEliminarAlumno.setEnabled(false);
        jbEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAlumnoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Formulario de Inscripcion");

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

        jbSalirMenuAlumnos.setText("Salir");
        jbSalirMenuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMenuAlumnosActionPerformed(evt);
            }
        });

        jRadioMateriasInsriptas.setText("Materias inscriptas");
        jRadioMateriasInsriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMateriasInsriptasActionPerformed(evt);
            }
        });

        jRadioMateriasNoInscriptas.setText("Materias no inscriptas");
        jRadioMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jbNuevoAlumno.setText("Inscribir");
        jbNuevoAlumno.setEnabled(false);
        jbNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoAlumnoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de materias:");

        jLabel2.setText("Selecciona un alumno:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbNuevoAlumno)
                                        .addGap(26, 26, 26)
                                        .addComponent(jbEliminarAlumno)
                                        .addGap(61, 61, 61)
                                        .addComponent(jbSalirMenuAlumnos)
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioMateriasInsriptas)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioMateriasNoInscriptas)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioMateriasInsriptas)
                    .addComponent(jRadioMateriasNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevoAlumno)
                    .addComponent(jbEliminarAlumno)
                    .addComponent(jbSalirMenuAlumnos))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAlumnoActionPerformed
        int filaseleccionada = jTable1.getSelectedRow();
        if(filaseleccionada !=-1){
            Alumno alumn = (Alumno) jbcAlumnos.getSelectedItem();
            int idMateria = (Integer) tablamodelo.getValueAt(filaseleccionada,0);
            
            inscripData.borrarInscripcionMateriaAlumno(alumn.getIdAlumno(),idMateria);
            borrarFila();
        }else{
//            JPopupMenu.( "Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbEliminarAlumnoActionPerformed

    private void jbSalirMenuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMenuAlumnosActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirMenuAlumnosActionPerformed

    private void jbNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoAlumnoActionPerformed
        int filaseleccionada = jTable1.getSelectedRow();
        if(filaseleccionada !=-1){
            Alumno a = (Alumno) jbcAlumnos.getSelectedItem();
            
            int idMateria = (Integer) tablamodelo.getValueAt(filaseleccionada,0);
            String nombreMateria = (String) tablamodelo.getValueAt(filaseleccionada,1);
            int anio = (Integer)tablamodelo.getValueAt(filaseleccionada,2);
            Materia materiaselect = new Materia(idMateria,nombreMateria,anio,true);
            Inscripcion incrisp = new Inscripcion(a,materiaselect,0);
            inscripData.guardarInscripcion(incrisp);
            borrarFila();
        
        }else{
            
        }
    }//GEN-LAST:event_jbNuevoAlumnoActionPerformed

    private void jRadioMateriasInsriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMateriasInsriptasActionPerformed
        borrarFila();
        jRadioMateriasNoInscriptas.setSelected(false);
        cargaDatosInscriptos();
        jbNuevoAlumno.setEnabled(false);
        jbEliminarAlumno.setEnabled(true);
    }//GEN-LAST:event_jRadioMateriasInsriptasActionPerformed

    private void jRadioMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMateriasNoInscriptasActionPerformed
       borrarFila();
       jRadioMateriasInsriptas.setSelected(false);
       cargaDatosNoInscriptos();
       jbNuevoAlumno.setEnabled(true);
       jbEliminarAlumno.setEnabled(false);
    }//GEN-LAST:event_jRadioMateriasNoInscriptasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioMateriasInsriptas;
    private javax.swing.JRadioButton jRadioMateriasNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEliminarAlumno;
    private javax.swing.JButton jbNuevoAlumno;
    private javax.swing.JButton jbSalirMenuAlumnos;
    private javax.swing.JComboBox<Alumno> jbcAlumnos;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumnos() {
        for (Alumno item : listaA) {
            jbcAlumnos.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> cabecera = new ArrayList<>();
        cabecera.add("ID");
        cabecera.add("Nombre");
        cabecera.add("Año");
        for (Object it: cabecera){
            tablamodelo.addColumn(it);
        }
        jTable1.setModel(tablamodelo);
    }
    
    private void borrarFila(){
        int indice = tablamodelo.getRowCount() -1;
        
        for (int i = indice; i>=0; i--){
            tablamodelo.removeRow(i);
        }
    }
    
    private void cargaDatosNoInscriptos(){
        Alumno seleccionado = (Alumno)jbcAlumnos.getSelectedItem();
        listaM = (ArrayList)inscripData.obtenerMateriasNOCursadas(seleccionado.getIdAlumno());
        for (Materia m: listaM){
            tablamodelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(),m.getAnioMateria()});
        }
    }
    
    private void cargaDatosInscriptos(){
        Alumno seleccionado = (Alumno)jbcAlumnos.getSelectedItem();
        List <Materia> lista = inscripData.obtenerMateriasSICursadas(seleccionado.getIdAlumno());
        for (Materia m: lista){
            tablamodelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(),m.getAnioMateria()});
        }
    
    }
}
