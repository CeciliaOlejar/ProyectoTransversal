package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgruppo93.Entidades.Alumno;

public class AlumnoData {
    private Connection con;

    public AlumnoData() {
        con=Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        PreparedStatement ps=null;
        try {
            String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNac, estado) "
                    + "VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
                         
           ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado con exito!!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar alumno");
        
           
        }
     
    }
    
    
}
