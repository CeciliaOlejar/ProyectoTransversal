/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgruppo93.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgruppo93.Entidades.Materia;

public class MateriaData {

    private Connection con;

    public MateriaData() {
        con = universidadgruppo93.AccesoADatos.Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public MateriaData(String matematica, int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void guardarMateria(Materia materia) throws SQLException {

        try {
            //1.Inserción de datos a la tabla:
            String sql = "INSERT INTO materia (idMateria, nombre, anio, estado ) "
                    + "VALUES (?, ?, ?, ?)"; //Plantilla de datos DB SQL.

            /*2.interfaz en Java que se utiliza para ejecutar consultas
            SQL parametrizadas en bases de datos relacionales */
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            /*2.5 Permite crear consultas SQL con marcadores de posición en
            lugar de valores concretos*/
            ps.setInt(1, materia.getIdMateria()); //Campo 1.
            ps.setString(2, materia.getNombre()); //Campo 2.
            ps.setInt(3, materia.getAnioMateria()); //Campo 3.
            ps.setBoolean(4, materia.isActivo()); //Campo 4.

            /*3.Ejecuta una consulta SQL que modifica datos
            en una base de datos, como una consulta de:
            - Inserción('INSERT'), [✓]
            - Actualización ('UPDATE') [X]
            - Eliminación ('DELETE'). [X]*/
            ps.executeUpdate();

            //4.Obtiene la clave generada a Alumno.
            ResultSet rs;
            rs = ps.getGeneratedKeys();
            //5.Verifica si al menos hay una fila de datos (almacenado en ResultSet).
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                /*Obtiene n° de clave generada*/
                JOptionPane.showMessageDialog(null, "Materia guardada con exito!!.");
            }

            //6.Finaliza el objeto 'PrepareStatement'.
            ps.close();

        } catch (SQLException ex) { //Posible error n°1:
            JOptionPane.showMessageDialog(null, "Error al insertar Materia.");
        }

    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT idmateria, nombre, anio FROM materia WHERE "
                + "idMateria = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("Nombre"));
                materia.setAnioMateria(rs.getInt("Año"));
                materia.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "Materia Creada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Materia");
        }
        return materia;
    }

    public void guardarMateria(MateriaData materia1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
