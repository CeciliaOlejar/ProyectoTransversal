package universidadgruppo93;

import java.sql.Connection;
import java.time.LocalDate;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.AccesoADatos.Conexion;
import universidadgruppo93.Entidades.Alumno;

/**
 *
 * @author aldio
 */
public class UniversidadGruppo93 {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        Alumno juan=new Alumno("Lopez", "Juan", 24356457, LocalDate.of(1985, 5, 23), true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(juan);
    }
}
