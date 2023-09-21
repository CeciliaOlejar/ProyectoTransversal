package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;
import universidadgruppo93.Entidades.Inscripcion;


public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;
    
    public InscripcionData() {
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }
    public void guardarInscripcion(Inscripcion insc){
        String sql = "INSERT INTO inscripcion (nota, idMateria, idAlumno) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setInt(3, insc.getAlumno().getIdAlumno());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                insc.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo su inscripción con exito.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar su inscripción.");
        }
    };
    
    //public List<Inscripcion> obtenerInscripciones(){};
    //public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){};
    //public List<Materia> obtenerMateriasCursadas(ind id);
    //public List<Materia> obtenerMateriasNOCursadas(ind id);
    //public void borrarInscripcionMateriaAlumno(ind idAlumno, int idMateria);
    //public void actualizarNota(int idAlumno, int idMateria, double nota);
    //public List <Alumno> obtenerAlumnosXMateria(int idMateria));
}
