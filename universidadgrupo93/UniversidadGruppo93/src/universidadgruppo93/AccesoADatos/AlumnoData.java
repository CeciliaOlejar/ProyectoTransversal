package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() { //Constructor.
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void guardarAlumno(Alumno alumno) {

        try {
            //1.Inserción de datos a la tabla:
            String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNac, estado) "
                    + "VALUES (?, ?, ?, ?, ?)"; //Plantilla de datos DB SQL.

            /*2.interfaz en Java que se utiliza para ejecutar consultas
            SQL parametrizadas en bases de datos relacionales */
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            /*2.5 Permite crear consultas SQL con marcadores de posición en
            lugar de valores concretos*/
            ps.setInt(1, alumno.getDni()); //Campo 1.
            ps.setString(2, alumno.getApellido()); //Campo 2.
            ps.setString(3, alumno.getNombre()); //Campo 3.
            ps.setDate(4, Date.valueOf(alumno.getFechaNac())); //Campo 4.
            ps.setBoolean(5, alumno.isActivo()); //Campo 5.

            /*3.Ejecuta una consulta SQL que modifica datos
            en una base de datos, como una consulta de:
            - Inserción('INSERT'), [✓] (linea 24)
            - Actualización ('UPDATE') [X]
            - Eliminación ('DELETE'). [X]*/
            ps.executeUpdate();

            //4.Obtiene la clave generada a Alumno.
            ResultSet rs = ps.getGeneratedKeys();

            //5.Verifica si al menos hay una fila de datos (almacenado en ResultSet).
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                /*Obtiene n° de clave generada*/
                JOptionPane.showMessageDialog(null, "Alumno guardado con exito.");
            }

            //6.Finaliza el objeto 'PrepareStatement'.
            ps.close();

        } catch (SQLException ex) { //Posible error n°1:
            JOptionPane.showMessageDialog(null, "Error al insertar alumno.");
        }
    }
    
    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNac FROM alumno WHERE "
                + "idAlumno = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe alumno con ese id");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar un alumno");
        }

        return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNac FROM alumno WHERE "
                + "dni = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe alumno con ese dni");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar un alumno por DNI");
        }

        return alumno;
    }
    
    //List<Alumno> listarAlumnos();

    public void modificarAlumno(Alumno alumno) {

        String sql = "UPDATE alumno SET apellido=?, nombre=?, "
                + "fechaNac=? WHERE dni=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, alumno.getApellido());
            ps.setString(2, alumno.getNombre());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(4, alumno.getDni());
            //ps.setInt(4, alumno.getIdAlumno());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "
                    + ex.getMessage());
        }
    }

    public void eliminarAlumno(int id) {

        String sql = "DELETE FROM alumno WHERE idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar un alumno");
        }
    }
    
    public ArrayList<Alumno> listarAlumnos(){
        ArrayList<Alumno> listarAlumnos = new ArrayList<Alumno>();
        
        String sql = "SELECT * from alumno";
        PreparedStatement ps = null;
        
        try {
           ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           while(rs.next()){
               Alumno alumno = new Alumno();
               alumno.setDni(rs.getInt("dni"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
               alumno.setActivo(rs.getBoolean("estado"));
               listarAlumnos.add(alumno);
           }
           ps.close();
           JOptionPane.showMessageDialog(null, "Su lista de alumnos es: "+listarAlumnos);
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error haciendo la lista de alumnos");
        }        
        return listarAlumnos;
    }
}
