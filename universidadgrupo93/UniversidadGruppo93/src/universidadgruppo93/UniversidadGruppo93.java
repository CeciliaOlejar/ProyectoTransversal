package universidadgruppo93;

import java.time.LocalDate;
import universidadgruppo93.AccesoADatos.AlumnoData;
import universidadgruppo93.AccesoADatos.InscripcionData;
import universidadgruppo93.Entidades.Alumno;
import universidadgruppo93.Entidades.Materia;
import universidadgruppo93.AccesoADatos.MateriaData;
import universidadgruppo93.Entidades.Inscripcion;

public class UniversidadGruppo93 {

    public static void main(String[] args) {
        Alumno luis=new Alumno("Sosa", "ricardo", 24332753, LocalDate.of(1999, 4, 12), true);
        AlumnoData alu = new AlumnoData();
        MateriaData md1 = new MateriaData();
        Alumno alumno = new Alumno();
        AlumnoData alumno1 = new AlumnoData();
        InscripcionData id = new InscripcionData();

        
    }
}
