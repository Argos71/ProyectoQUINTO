/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CentroAltoRendimiento;
import Conexiones.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pamela
 */
public class RegistroAtleta {
    public void MostrarRegistroA(JTable paramTablaPersonal){
        //hacemos llamado a la clase conexion para realizar la conexion a la base de datos
        CConexion objetoConexion = new CConexion();
        // creamos el objeto modelo para crear las columnas en la interfaz
        DefaultTableModel modelo = new DefaultTableModel();
        // creamos la variable que almacenara la consulta SQL
        String sql = "";
        // nombramos a las columnas de la tabla
        modelo.addColumn("ID Atleta");
        modelo.addColumn("Fecha");
        
        //asignamos los parametros de la tabla
        paramTablaPersonal.setModel(modelo);
        //realizamos la consulta SQL
        sql = "SELECT * FROM RegistroAtleta;";
        //Variable que permite saber cuantas vueltas dara, para mostrar los datos en la tabla
        String [] datos = new String[2];
        
        Statement st;
            // try y catch permitaran hacernos saber si existira algun error en el proceso de 
            // la consulta
            try{
                st = objetoConexion.establecerConexion().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    //nos devuelve los datos obtenidos en result set o de la base de datos
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    //incorporamos a nuestro modelo los resultados obtenidos de la BD
                    modelo.addRow(datos);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+ e.toString());
            }
        
    }
}
