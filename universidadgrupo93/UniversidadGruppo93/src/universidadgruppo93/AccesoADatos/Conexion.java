package universidadgruppo93.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    //localhost = Esta pc.
    private static final String URL = "jdbc:mariadb://localhost/"; //Static = Constante.
    
    //Nombre base de datos:
    private static final String DB = "universidadgrupo93";

    //Usuario "root" es el default.
    private static final String USUARIO = "root";

    //Contraseña "" es la default.
    private static final String PASSWORD = "";
    /*------------------------------------------*/
    
    private static Connection connection;

    private Conexion() {}; //Constructor.
        
    public static Connection getConexion() { //Metodo para conectarse a la DB.

        if (connection == null) {
            /*1. Si no esta la conexión establecida,
            entra el el "TRYCATCH".*/

            try { //Intenta:
                //2.Verifica drivers de libreria.
                Class.forName("org.mariadb.jdbc.Driver");

                //3.Config base de datos. Verifica info.
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                
                JOptionPane.showMessageDialog(null, "Conexion establecida con exito!!!");
                
            } catch (ClassNotFoundException ex) { //Posible error n°1: Drivers.
                
                JOptionPane.showMessageDialog(null, "Error al carga el driver de conexión.");
                
            } catch (SQLException ex) { //Posible error n°2: Base de datos.
                
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos.");
                System.exit(0);
                
            } //Null en este caso: No se esta ejecutando desde ninguna ventana.

        }
        //4. Si la conexión esta establecida, retorna la linea 43.

        return connection;
    }
}
