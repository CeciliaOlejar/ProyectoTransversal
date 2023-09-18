package universidadgruppo93.AccesoADatos;

import java.sql.Connection;

public class InscripcionData {

    private Connection con = null; //Se agrega una conexión.

    public InscripcionData() {

        this.con = Conexion.getConexion();
        
    }
};
