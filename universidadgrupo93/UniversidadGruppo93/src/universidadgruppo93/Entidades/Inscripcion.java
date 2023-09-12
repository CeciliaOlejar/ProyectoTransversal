/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgruppo93.Entidades;

/**
 *
 * @author aldio
 */
public class Inscripcion {
    
    private int idInscripto;
    private double nota;
    private int materia;
    private int alumno;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripto, double nota, int idMateria, int idAlumno) {
        this.idInscripto = idInscripto;
        this.nota = nota;
        this.materia = idMateria;
        this.alumno = idAlumno;
    }

    public Inscripcion(double nota, int idMateria, int idAlumno) {
        this.nota = nota;
        this.materia = idMateria;
        this.alumno = idAlumno;
    }

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdMateria() {
        return materia;
    }

    public void setIdMateria(int idMateria) {
        this.materia = idMateria;
    }

    public int getIdAlumno() {
        return alumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.alumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripto=" + idInscripto + ", nota=" + nota + ", idMateria=" + materia + ", idAlumno=" + alumno + '}';
    }
    
    
}
