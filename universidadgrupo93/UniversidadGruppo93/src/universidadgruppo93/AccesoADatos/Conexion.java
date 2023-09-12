package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    //localhost = Esta pc.
    private static final String URL = "jdbc:mariadb://localhost/"; //Static = Constante.
    
    //Nombre base de datos:
    private static final String DB = "UniversidadULPGrupo93";
    
    //Usuario "root" es el default.
    private static final String USUARIO = "root";
    
    //Contraseña.
    private static final String PASSWORD = "";
    /*------------------------------------------*/
    private static Connection connection;
    
    private Conexion (){}; //Constructor.
        
    public static Connection getConexion(){
        
        if (connection == null) {
            
            try {
                Class.forName("org.mariadb.jdbc.Driver"); //Drivers de libreria.
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al carga el driver de conexión.");
            }
            
        }
        return null;
    }
    
}
