package universidadgruppo93;

import java.time.LocalDate;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.Entidades.Alumno;

/**
 *
 * @author aldio
 */
public class UniversidadGruppo93 {

    public static void main(String[] args) {
        //Connection con = Conexion.getConexion();
        Alumno luis=new Alumno("Majul", "Luis", 24332743, LocalDate.of(1985, 4, 12), true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(luis);
    }
}
