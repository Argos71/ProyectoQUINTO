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
public class InfoPersonal {

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public int getCi_personal() {
        return ci_personal;
    }

    public void setCi_personal(int ci_personal) {
        this.ci_personal = ci_personal;
    }

    public String getNombre_personal() {
        return nombre_personal;
    }

    public void setNombre_personal(String nombre_personal) {
        this.nombre_personal = nombre_personal;
    }

    public String getApellido_personal() {
        return apellido_personal;
    }

    public void setApellido_personal(String apellido_personal) {
        this.apellido_personal = apellido_personal;
    }

    public String getGenero_personal() {
        return genero_personal;
    }

    public void setGenero_personal(String genero_personal) {
        this.genero_personal = genero_personal;
    }

    public String getDireccion_personal() {
        return direccion_personal;
    }

    public void setDireccion_personal(String direccion_personal) {
        this.direccion_personal = direccion_personal;
    }

    public int getTelefono_personal() {
        return telefono_personal;
    }

    public void setTelefono_personal(int telefono_personal) {
        this.telefono_personal = telefono_personal;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario_personal() {
        return usuario_personal;
    }

    public void setUsuario_personal(String usuario_personal) {
        this.usuario_personal = usuario_personal;
    }

    public String getPassword_personal() {
        return password_personal;
    }

    public void setPassword_personal(String password_personal) {
        this.password_personal = password_personal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    int id_personal;
    int ci_personal;
    String nombre_personal;
    String apellido_personal;
    String genero_personal;
    String direccion_personal;
    int telefono_personal;
    String cargo;
    String usuario_personal;
    String password_personal;
    int estado;
    
    public void MostrarPersonal(JTable paramTablaPersonal){
        
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
        modelo.addColumn("Cargo");
        modelo.addColumn("Usuario");
        modelo.addColumn("Password");
        modelo.addColumn("Estado");
        
        paramTablaPersonal.setModel(modelo);
        
        sql = "SELECT * FROM personal";
        
        String [] datos = new String[11];
        
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
                    datos[7] = rs.getString(8);
                    datos[8] = rs.getString(9);
                    datos[9] = rs.getString(10);
                    datos[10] = rs.getString(11);
                    
                    modelo.addRow(datos);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+ e.toString());
            }
        
    }
    
    public void insertarPersonal( JTextField paramCi,
            JTextField paramNombre, JTextField paramApellido, JTextField paramGenero,
            JTextField paramDireccion, JTextField paramTelefono, JComboBox paramCargo,
            JTextField paramUsuario, JTextField paramPassword, JComboBox paramEstado){
        
        
        setCi_personal(Integer.parseInt(paramCi.getText()));
        setNombre_personal(paramNombre.getText());
        setApellido_personal(paramApellido.getText());
        setGenero_personal(paramGenero.getText());
        setDireccion_personal(paramDireccion.getText());
        setTelefono_personal(Integer.parseInt(paramTelefono.getText()));
        setCargo(paramCargo.getSelectedItem().toString());
        setUsuario_personal(paramUsuario.getText());
        setPassword_personal(paramPassword.getText());
        if(paramEstado.getSelectedItem().toString() == "Activo"){
            setEstado(1);
        }
        else{
            setEstado(0);
        }
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO personal (ci_personal, nombres_personal,"
                + "apellidos_personal, genero_personal, direccion_personal, telefono_personal,"
                + "cargo, usuario_personal, password_personal, estado) values (?,?,?,?,?,?,?,?,?,?);";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_personal());
            cs.setString(2, getNombre_personal());
            cs.setString(3, getApellido_personal());
            cs.setString(4, getGenero_personal());
            cs.setString(5, getDireccion_personal());
            cs.setInt(6, getTelefono_personal());
            cs.setString(7, getCargo());
            cs.setString(8, getUsuario_personal());
            cs.setString(9, getPassword_personal());
            cs.setInt(10,getEstado());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void SeleccionarPersonal(JTable paramTablaPersonal,JTextField paramId, JTextField paramCi,
            JTextField paramNombre, JTextField paramApellido, JTextField paramGenero,
            JTextField paramDireccion, JTextField paramTelefono, JComboBox paramCargo,
            JTextField paramUsuario, JTextField paramPassword, JComboBox paramEstado){
        
        try{
            
            int fila = paramTablaPersonal.getSelectedRow();
            
            if (fila>=0) {
                 
                paramId.setText(paramTablaPersonal.getValueAt(fila,0).toString());
                paramCi.setText(paramTablaPersonal.getValueAt(fila,1).toString());
                paramNombre.setText(paramTablaPersonal.getValueAt(fila,2).toString());
                paramApellido.setText(paramTablaPersonal.getValueAt(fila,3).toString());
                paramGenero.setText(paramTablaPersonal.getValueAt(fila,4).toString());
                paramDireccion.setText(paramTablaPersonal.getValueAt(fila,5).toString());
                paramTelefono.setText(paramTablaPersonal.getValueAt(fila,6).toString());
                paramCargo.setSelectedItem(paramTablaPersonal.getValueAt(fila,7).toString());
                paramUsuario.setText(paramTablaPersonal.getValueAt(fila,8).toString());
                paramPassword.setText(paramTablaPersonal.getValueAt(fila,9).toString());
                
                paramEstado.setSelectedItem(paramTablaPersonal.getValueAt(fila,10).toString());
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
    }
    
    public void ModificarPersonal(JTextField paramId, JTextField paramCi,
            JTextField paramNombre, JTextField paramApellido, JTextField paramGenero,
            JTextField paramDireccion, JTextField paramTelefono, JComboBox paramCargo,
            JTextField paramUsuario, JTextField paramPassword, JComboBox paramEstado){
        
        setId_personal(Integer.parseInt(paramId.getText()));     
        setCi_personal(Integer.parseInt(paramCi.getText()));
        setNombre_personal(paramNombre.getText());
        setApellido_personal(paramApellido.getText());
        setGenero_personal(paramGenero.getText());
        setDireccion_personal(paramDireccion.getText());
        setTelefono_personal(Integer.parseInt(paramTelefono.getText()));
        setCargo(paramCargo.getSelectedItem().toString());
        setUsuario_personal(paramUsuario.getText());
        setPassword_personal(paramPassword.getText());
        if(paramEstado.getSelectedItem().toString() == "Activo"){
            setEstado(1);
        }
        else{
            setEstado(0);
        }
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE personal SET ci_personal=?, nombres_personal=?,"
                + "apellidos_personal=?, genero_personal=?, direccion_personal=?, telefono_personal=?,"
                + "cargo=?, usuario_personal=?, password_personal=?, estado=? WHERE personal.id_personal=?";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_personal());
            cs.setString(2, getNombre_personal());
            cs.setString(3, getApellido_personal());
            cs.setString(4, getGenero_personal());
            cs.setString(5, getDireccion_personal());
            cs.setInt(6, getTelefono_personal());
            cs.setString(7, getCargo());
            cs.setString(8, getUsuario_personal());
            cs.setString(9, getPassword_personal());
            cs.setInt(10,getEstado());
            cs.setInt(11, getId_personal());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se modifico correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void EliminarPersonal(JTextField paramId){
        
        setId_personal(Integer.parseInt(paramId.getText()));
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "DELETE FROM personal WHERE personal.id_personal = ?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getId_personal());
            
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
}
