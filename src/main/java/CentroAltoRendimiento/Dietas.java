/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CentroAltoRendimiento;

import Conexiones.CConexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALVARO
 */
public class Dietas {

    public int getCi_atleta() {
        return ci_atleta;
    }

    public void setCi_atleta(int ci_atleta) {
        this.ci_atleta = ci_atleta;
    }

    public String getNombre_atleta() {
        return nombre_atleta;
    }

    public void setNombre_atleta(String nombre_atleta) {
        this.nombre_atleta = nombre_atleta;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    
    int ci_atleta;
    String nombre_atleta;
    String dieta;
    
    public void MostrarDieta(JTable paramTablaDieta){
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("CI");
        modelo.addColumn("Nombre Atleta");
        modelo.addColumn("Dieta");


        paramTablaDieta.setModel(modelo);
        
        sql = "SELECT * FROM dieta";
        
        String [] datos = new String[3];
        
        Statement st;
            
            try{
                st = objetoConexion.establecerConexion().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);

                    modelo.addRow(datos);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+ e.toString());
            }
        
    }
    
     public void insertarDieta(JTextField paramCi, JTextField paramNombre, 
            JTextArea paramDieta){
        
        
        setCi_atleta(Integer.parseInt(paramCi.getText()));
        setNombre_atleta(paramNombre.getText());
        setDieta(paramDieta.getText());
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO dieta (ci_atleta, nombre_atleta,"
                + " dieta_atleta) values (?,?,?);";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_atleta());
            cs.setString(2, getNombre_atleta());
            cs.setString(3, getDieta());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
     
     public void SeleccionarDieta(JTable paramTablaDieta, JTextField paramCi,
            JTextField paramNombre, JTextArea paramDieta){
        
        try{
            
            int fila = paramTablaDieta.getSelectedRow();
            
            if (fila>=0) {
                
                paramCi.setText(paramTablaDieta.getValueAt(fila,0).toString());
                paramNombre.setText(paramTablaDieta.getValueAt(fila,1).toString());
                paramDieta.setText(paramTablaDieta.getValueAt(fila,2).toString());
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
    }
     
     public void ModificarDieta(JTextField paramCi, JTextField paramNombre, 
             JTextArea paramDieta){
        
        setCi_atleta(Integer.parseInt(paramCi.getText()));
        setNombre_atleta(paramNombre.getText());
        setDieta(paramDieta.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE dieta SET dieta_atleta=?, "
                + "WHERE dieta.ci_atleta=?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setString(1, getNombre_atleta());
            cs.setInt(2, getCi_atleta());
                
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se modifico correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void EliminarDieta(JTextField paramNombre){
        
        setNombre_atleta(paramNombre.getText());
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "DELETE FROM dieta WHERE dieta.nombre_atleta = ?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setString(1, getNombre_atleta());
                
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
}
