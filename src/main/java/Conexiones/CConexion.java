
package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ALVARO
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "postgres";
    String password = "midoris";
    String bd = "CentroAltoRendimiento";
    String ip = "localhost";
    String puerto = "5433";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        
        try{
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena,usuario, password);
            JOptionPane.showMessageDialog(null,"Se conectó correctamente a la "
                    + "Base de Datos");
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error al conectar a la base "
                + "de datos error: "+e.toString());
        }
        return conectar;
    }
}        

