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
 * @author ALVARO
 */
public class InfoAtletas {

    public int getId_atleta() {
        return id_atleta;
    }

    public void setId_atleta(int id_atleta) {
        this.id_atleta = id_atleta;
    }
    
    int id_atleta;
    int ci_atleta;
    String nombre_atleta;
    String apellido_atleta;
    String genero_atleta;
    String direccion_atleta;
    int telefono_atleta;

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

    public String getApellido_atleta() {
        return apellido_atleta;
    }

    public void setApellido_atleta(String apellido_atleta) {
        this.apellido_atleta = apellido_atleta;
    }

    public String getGenero_atleta() {
        return genero_atleta;
    }

    public void setGenero_atleta(String genero_atleta) {
        this.genero_atleta = genero_atleta;
    }

    public String getDireccion_atleta() {
        return direccion_atleta;
    }

    public void setDireccion_atleta(String direccion_atleta) {
        this.direccion_atleta = direccion_atleta;
    }

    public int getTelefono_atleta() {
        return telefono_atleta;
    }

    public void setTelefono_atleta(int telefono_atleta) {
        this.telefono_atleta = telefono_atleta;
    }
    
    
    public void MostrarAtleta(JTable paramTablaAtleta){
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("ID");
        modelo.addColumn("CI");
        modelo.addColumn("Nombre(s)");
        modelo.addColumn("Apellido(s)");
        modelo.addColumn("Genero");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");

        paramTablaAtleta.setModel(modelo);
        
        sql = "SELECT * FROM atletas";
        
        String [] datos = new String[7];
        
        Statement st;
            
            try{
                st = objetoConexion.establecerConexion().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    datos[6] = rs.getString(7);
                    modelo.addRow(datos);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+ e.toString());
            }
        
    }
    
    public void insertarAtleta(JTextField paramCi, JTextField paramNombre, 
            JTextField paramApellido, JTextField paramGenero,
            JTextField paramDireccion, JTextField paramTelefono){
        
        
        setCi_atleta(Integer.parseInt(paramCi.getText()));
        setNombre_atleta(paramNombre.getText());
        setApellido_atleta(paramApellido.getText());
        setGenero_atleta(paramGenero.getText());
        setDireccion_atleta(paramDireccion.getText());
        setTelefono_atleta(Integer.parseInt(paramTelefono.getText()));
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO atletas (ci_atleta, nombres_atleta,"
                + "apellidos_atleta, genero_atleta, direccion_atleta, telefono_atleta) "
                + "values (?,?,?,?,?,?);";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_atleta());
            cs.setString(2, getNombre_atleta());
            cs.setString(3, getApellido_atleta());
            cs.setString(4, getGenero_atleta());
            cs.setString(5, getDireccion_atleta());
            cs.setInt(6, getTelefono_atleta());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void SeleccionarAtleta(JTable paramTablaAtleta, JTextField paramId, JTextField paramCi,
            JTextField paramNombre, JTextField paramApellido, JTextField paramGenero,
            JTextField paramDireccion, JTextField paramTelefono){
        
        try{
            
            int fila = paramTablaAtleta.getSelectedRow();
            
            if (fila>=0) {
                
                paramId.setText(paramTablaAtleta.getValueAt(fila,0).toString());
                paramCi.setText(paramTablaAtleta.getValueAt(fila,1).toString());
                paramNombre.setText(paramTablaAtleta.getValueAt(fila,2).toString());
                paramApellido.setText(paramTablaAtleta.getValueAt(fila,3).toString());
                paramGenero.setText(paramTablaAtleta.getValueAt(fila,4).toString());
                paramDireccion.setText(paramTablaAtleta.getValueAt(fila,5).toString());
                paramTelefono.setText(paramTablaAtleta.getValueAt(fila,6).toString());
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
    }
    
    public void ModificarAtleta(JTextField paramId, JTextField paramCi, JTextField paramNombre, 
            JTextField paramApellido, JTextField paramGenero, 
            JTextField paramDireccion, JTextField paramTelefono){
        
        setId_atleta(Integer.parseInt(paramId.getText()));
        setCi_atleta(Integer.parseInt(paramCi.getText()));
        setNombre_atleta(paramNombre.getText());
        setApellido_atleta(paramApellido.getText());
        setGenero_atleta(paramGenero.getText());
        setDireccion_atleta(paramDireccion.getText());
        setTelefono_atleta(Integer.parseInt(paramTelefono.getText()));
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE atletas SET ci_atleta=?, nombres_atleta=?,"
                + "apellidos_atleta=?, genero_atleta=?, direccion_atleta=?, telefono_atleta=? "
                + "WHERE atletas.id_atleta=?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_atleta());
            cs.setString(2, getNombre_atleta());
            cs.setString(3, getApellido_atleta());
            cs.setString(4, getGenero_atleta());
            cs.setString(5, getDireccion_atleta());
            cs.setInt(6, getTelefono_atleta());
            cs.setInt(7, getId_atleta());
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se modifico correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void EliminarAtleta(JTextField paramId){
        
        setId_atleta(Integer.parseInt(paramId.getText()));
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "DELETE FROM atletas WHERE atletas.id_atleta = ?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getId_atleta());
                
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
}
