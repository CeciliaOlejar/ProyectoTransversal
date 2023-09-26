package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Inscripcion;
import universidadgruppo93.Entidades.Materia;

public class InscripcionData {

    private Connection con;
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idMateria, idAlumno) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
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

    }

    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();

        String sql = "SELECT * FROM inscripcion";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setIdInscripto(rs.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getDouble("nota"));
                inscripciones.add(ins);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {

        List<Inscripcion> inscripcionesporAlumno = new ArrayList<Inscripcion>();

        String sql = "SELECT * FROM inscripciones WHERE idAlumno=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion ins = new Inscripcion();
                ins.setIdInscripto(rs.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(alu);
                ins.setMateria(mat);
                ins.setNota(rs.getDouble("nota"));
                inscripcionesporAlumno.add(ins);
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Sus inscripciones son: " + inscripcionesporAlumno);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
        return inscripcionesporAlumno;
    }

    public List<Materia> obtenerMateriasSICursadas(int id) {

        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT inscripcion.idMateria, nombre,anio FROM inscripcion,"
                + "materia WHERE inscripcion.idMateria = materia.idMateria"
                + "AND inscripcion.idAlumno = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Sus inscripciones son: " + materias);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
        return materias;

    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {

        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado=1 AND idmateria not in"
                + "SELECT idMateria FROM inscripcion WHERE idAlumno =?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Sus inscripciones son: " + materias);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
        return materias;
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT alumno.idAlumno, dni, nombre, apellido, fechaNacimeinto, estado"
                + "FROM inscripcion i,alumno a WHERE iinscripcion.idAlumno = alumno.idAlumno "
                + "AND idMateria =? AND estado=1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setActivo(rs.getBoolean("estado"));
                alumnos.add(alu);
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Materias por alumno: "+ alumnos);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error: " + ex);
        }
        return alumnos;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

    }
}
