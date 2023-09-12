/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgruppo93;

import java.sql.Connection;
import universidadgruppo93.AccesoADatos.Conexion;

/**
 *
 * @author aldio
 */
public class UniversidadGruppo93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con = Conexion.getConexion();
    }
    
}
