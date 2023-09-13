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
        //Alumno luis=new Alumno("Sosa", "Julio", 24332743, LocalDate.of(1999, 4, 12), true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(luis);
        //alu.modificarAlumno(luis);
        //alu.eliminarAlumno(7);
        Alumno alumnoEncontrado= alu.buscarAlumnoPorDni(24332743);
        System.out.println("dni: "+alumnoEncontrado.getDni());
        System.out.println("Apellido: "+ alumnoEncontrado.getApellido());
        System.out.println("Nombre: "+ alumnoEncontrado.getNombre());
        
        
    }
}
