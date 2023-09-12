package universidadgruppo93;

import java.sql.Connection;
import universidadgruppo93.AccesoADatos.Conexion;

/**
 *
 * @author aldio
 */
public class UniversidadGruppo93 {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
    }
}
