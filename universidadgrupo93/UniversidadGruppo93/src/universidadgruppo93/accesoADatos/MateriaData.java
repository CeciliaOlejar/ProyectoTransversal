package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgruppo93.Entidades.Materia;

public class MateriaData {

    private Connection con;

    public MateriaData() {
        con = universidadgruppo93.AccesoADatos.Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void guardarMateria(Materia materia) {

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
                materia.setAnioMateria(rs.getInt("Anio"));
                materia.setActivo(true);
                System.out.println("Encontramos tu materia: " + materia.getNombre());

            } else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar Materia" + ex);
        }
        return materia;
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre=? WHERE idMateria=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getIdMateria());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia nro de id: " + materia.getIdMateria() + " no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar Materia" + ex);
        }
    }

    public void eliminarMateria(Materia materia) {
        String sql = "DELETE FROM materia WHERE idMateria=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, materia.getIdMateria());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Borrada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar la materia");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error encontrando la materia");
        }

    }
     
    public List<Materia> listarMateria(Materia materia){
        List<Materia> materias = new ArrayList<Materia>();
        
        String sql = "SELECT * from materia";
        PreparedStatement ps = null;
        
        try {
           ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               materia = new Materia();
               materia.setNombre(rs.getString("nombre"));
               materia.setAnioMateria(rs.getInt("anio"));
               materia.setIdMateria(rs.getInt("idMateria"));
               materia.setActivo(rs.getBoolean("estado"));
               materias.add(materia);
           }
           ps.close();
           JOptionPane.showMessageDialog(null, "Su lista de materias es: "+materias);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error haciendo la lista de materias");
        }        
        return materias;
    }
}
