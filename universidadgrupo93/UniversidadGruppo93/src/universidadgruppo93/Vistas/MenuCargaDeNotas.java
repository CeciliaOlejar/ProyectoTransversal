package universidadgruppo93.Vistas;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.Entidades.Materia;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Inscripcion;
import universidadgruppo93.AccesoADatos.InscripcionData;
import universidadgruppo93.AccesoADatos.MateriaData;

public class MenuCargaDeNotas extends javax.swing.JInternalFrame {

    private ArrayList<Alumno> listaAlu;

    private AlumnoData aluData;
    private MateriaData mateData;
    private InscripcionData inscrData;
    private DefaultTableModel tablanotas;

    public MenuCargaDeNotas() {
        initComponents();

        aluData = new AlumnoData();
        inscrData = new InscripcionData();
        listaAlu = (ArrayList<Alumno>) aluData.listarAlumnos();
        tablanotas = new DefaultTableModel();
        mateData = new MateriaData();

        cargaAlumnos();
        armarCabeceraTabla();
        agregarFila();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbguardarNota = new javax.swing.JButton();
        jbcAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbSalirMenuNotas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setTitle("Carga de notas");

        jbguardarNota.setText("Guardar");
        jbguardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarNotaActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecciona un alumno:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Carga de notas");

        jbSalirMenuNotas.setText("Salir");
        jbSalirMenuNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirMenuNotasActionPerformed(evt);
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
                                .addComponent(jbguardarNota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSalirMenuNotas))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jbcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbcAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbguardarNota)
                    .addComponent(jbSalirMenuNotas))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbguardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarNotaActionPerformed

        int filaseleccionada = jTable1.getSelectedRow();
        if (filaseleccionada != -1) {
            agregarFila();

            Alumno a = (Alumno) jbcAlumnos.getSelectedItem();
            String idmateriaStr = (String) tablanotas.getValueAt(filaseleccionada, 0);
            String notaStr = (String) tablanotas.getValueAt(filaseleccionada, 2);

// Luego, puedes convertir estos Strings a Integer si es necesario
            Integer idmateria = Integer.parseInt(idmateriaStr);
            Integer nota = Integer.parseInt(notaStr);
            inscrData.actualizarNota(a.getIdAlumno(), idmateria, nota);

            borrarFila();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una nota");
        }
    }//GEN-LAST:event_jbguardarNotaActionPerformed

    private void jbSalirMenuNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirMenuNotasActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirMenuNotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbSalirMenuNotas;
    private javax.swing.JComboBox<Alumno> jbcAlumnos;
    private javax.swing.JButton jbguardarNota;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumnos() {
        for (Alumno item1 : listaAlu) {
            jbcAlumnos.addItem(item1); //acordarse de vincular la entidad ALUMNO con el comboBox
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> cabecera = new ArrayList<>();
//        cabecera.add("Id Alumno");
        cabecera.add("Id Materia");
        cabecera.add("Nombre");
        cabecera.add("Nota");
        for (Object it : cabecera) {
            tablanotas.addColumn(it);
        }

        jTable1.setModel(tablanotas);
    }

    private void borrarFila() {
        int indice = tablanotas.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            tablanotas.removeRow(i);
        }
    }

    private void agregarFila() {
        Object[] fila = new Object[]{"", "", ""};
        tablanotas.addRow(fila);
    }

}
