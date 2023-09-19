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


public class InscripcionData {
     private Connection con;

    public InscripcionData() {
        con = Conexion.getConexion(); //Se conecta a la DB en caso de necesitarlo.
    }

}
