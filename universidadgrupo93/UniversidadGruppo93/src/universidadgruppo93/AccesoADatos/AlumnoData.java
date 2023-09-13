package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgruppo93.Entidades.Alumno;

public class AlumnoData {

    private Connection con;

    public AlumnoData() {
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
            
            //5.Verifica si almenos hay una fila de datos (almacenado en ResultSet).
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1)); /*Obtiene n° de clave generada*/
                JOptionPane.showMessageDialog(null, "Alumno guardado con exito!!.");
            }
            
            //6.Finaliza el objeto 'PrepareStatement'.
            ps.close();
            
        } catch (SQLException ex) { //Posible error n°1:
            JOptionPane.showMessageDialog(null, "Error al insertar alumno.");
        }
    }
    
}
