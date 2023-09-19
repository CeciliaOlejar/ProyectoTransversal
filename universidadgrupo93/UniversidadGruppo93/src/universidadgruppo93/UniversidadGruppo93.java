package universidadgruppo93;

import java.time.LocalDate;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;
import universidadgruppo93.accesoADatos.MateriaData;

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
//        Alumno alumnoEncontrado= alu.buscarAlumnoPorDni(24332743);
//        System.out.println("dni: "+alumnoEncontrado.getDni());
//        System.out.println("Apellido: "+ alumnoEncontrado.getApellido());
//        System.out.println("Nombre: "+ alumnoEncontrado.getNombre());
          Materia materia1 = new Materia("Lengua",2,true);
          MateriaData md1= new MateriaData();
          md1.guardarMateria(materia1);
          md1.buscarMateria(2);
         // materia1.guardarMateria(materia1);
//          Materia buscarMateria = materia1.buscarMateria(3);            
        
    }
}
