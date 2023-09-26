package universidadgruppo93;

import java.time.LocalDate;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.AccesoADatos.InscripcionData;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;
import universidadgruppo93.AccesoADatos.MateriaData;
import universidadgruppo93.Entidades.Inscripcion;

/**
 *
 * @author aldio
 */
public class UniversidadGruppo93 {

    public static void main(String[] args) {
        //Connection con = Conexion.getConexion();
        /*-----------------------------------------*/
        Alumno luis=new Alumno("Sosa", "ricardo", 24332753, LocalDate.of(1999, 4, 12), true);
        AlumnoData alu = new AlumnoData();
//        alu.guardarAlumno(luis);
        //alu.modificarAlumno(luis);
        //alu.eliminarAlumno(7);
        //Alumno alumnoEncontrado= alu.buscarAlumnoPorDni(24332743);
        //System.out.println("dni: "+alumnoEncontrado.getDni());
        //System.out.println("Apellido: "+ alumnoEncontrado.getApellido());
        //System.out.println("Nombre: "+ alumnoEncontrado.getNombre());
        /*-----------------------------------------*/
//        Materia materia1 = new Materia("HISTORIA", 9, true);
        MateriaData md1 = new MateriaData(); //esto hace tal cosa
        //md1.guardarMateria(materia1);
        //md1.buscarMateria(1);
        //md1.modificarMateria(materia1);
        //md1.eliminarMateria(materia1);

        //md1.listarMateria(materia1);
        /*-----------------------------------------*/
        Alumno alumno = new Alumno();
        AlumnoData alumno1 = new AlumnoData();
        //alumno1.listarAlumnos(alumno);
        /*-----------------------------------------*/
//        Alumno ricardo = alumno1.buscarAlumno(4);
//        Materia matematica = md1.buscarMateria(1);
//        Inscripcion insc = new Inscripcion(ricardo, matematica, 8);
        InscripcionData id = new InscripcionData();
//        id.guardarInscripcion(insc);
        //for (Inscripcion inscripcion:id.obtenerInscripciones()){
           // System.out.println("id" + inscripcion.getIdInscripto());
            //System.out.println("apellido" + inscripcion.getAlumno().getApellido());
            //System.out.println("nombre" + inscripcion.getAlumno().getNombre());
            //System.out.println("materia" + inscripcion.getMateria().getNombre());
            //System.out.println("año" + inscripcion.getMateria().getAnioMateria());
        //}//falla pero no 
    }
}
