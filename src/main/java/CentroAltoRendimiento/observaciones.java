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
public class observaciones {

    public int getCi_obs() {
        return ci_obs;
    }

    public void setCi_obs(int ci_obs) {
        this.ci_obs = ci_obs;
    }

    public String getNombre_obs() {
        return nombre_obs;
    }

    public void setNombre_obs(String nombre_obs) {
        this.nombre_obs = nombre_obs;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getTalla() {
        return talla;
    }

    public void setTalla(Float talla) {
        this.talla = talla;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }
    
    int ci_obs;
    String nombre_obs;
    Float peso;
    Float talla;
    Float imc;
    String Obs;
    
    public void MostrarObs(JTable paramTablaObservaciones){
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("CI");
        modelo.addColumn("Nombre Atleta");
        modelo.addColumn("Peso Kg");
        modelo.addColumn("Talla Cm");
        modelo.addColumn("IMC");
        modelo.addColumn("Observaciones");


        paramTablaObservaciones.setModel(modelo);
        
        sql = "SELECT * FROM obsmedico";
        
        String [] datos = new String[6];
        
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

                    modelo.addRow(datos);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+ e.toString());
            }
        
    }
    
     public void insertarObs(JTextField paramCi, JTextField paramNombre, 
            JTextField paramPeso, JTextField paramTalla,
            JTextField paramImc, JTextArea paramObs){
        
        
        setCi_obs(Integer.parseInt(paramCi.getText()));
        setNombre_obs(paramNombre.getText());
        setPeso(Float.parseFloat(paramPeso.getText()));
        setTalla(Float.parseFloat(paramTalla.getText()));
        setImc(Float.parseFloat(paramImc.getText()));
        setObs(paramObs.getText());
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO obsmedico (ci_atleta, nombre_atleta,"
                + "peso_atleta_kg, talla_atleta_cm, imc_atleta, observaciones) "
                + "values (?,?,?,?,?,?);";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_obs());
            cs.setString(2, getNombre_obs());
            cs.setFloat(3, getPeso());
            cs.setFloat(4, getTalla());
            cs.setFloat(5, getImc());
            cs.setString(6, getObs());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
     
     public void SeleccionarObs(JTable paramTablaObs, JTextField paramCi,
            JTextField paramNombre, JTextField paramPeso, JTextField paramTalla,
            JTextField paramImc, JTextArea paramObs){
        
        try{
            
            int fila = paramTablaObs.getSelectedRow();
            
            if (fila>=0) {
                
                paramCi.setText(paramTablaObs.getValueAt(fila,0).toString());
                paramNombre.setText(paramTablaObs.getValueAt(fila,1).toString());
                paramPeso.setText(paramTablaObs.getValueAt(fila,2).toString());
                paramTalla.setText(paramTablaObs.getValueAt(fila,3).toString());
                paramImc.setText(paramTablaObs.getValueAt(fila,4).toString());
                paramObs.setText(paramTablaObs.getValueAt(fila,5).toString());
               
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
    }
     
     public void ModificarObs(JTextField paramCi, JTextField paramNombre, 
            JTextField paramPeso, JTextField paramTalla, 
            JTextField paramImc, JTextArea paramObs){
        
        setCi_obs(Integer.parseInt(paramCi.getText()));
        setNombre_obs(paramNombre.getText());
        setPeso(Float.parseFloat(paramPeso.getText()));
        setTalla(Float.parseFloat(paramTalla.getText()));
        setImc(Float.parseFloat(paramImc.getText()));
        setObs(paramObs.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE obsmedico SET ci_atleta=?, "
                + "peso_atleta_kg=?, talla_atleta_cm=?, imc_atleta=?, observaciones=? "
                + "WHERE obsmedico.nombre_atleta=?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_obs());
            cs.setFloat(2, getPeso());
            cs.setFloat(3, getTalla());
            cs.setFloat(4, getImc());
            cs.setString(5, getObs());
            cs.setString(6, getNombre_obs());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se modifico correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void EliminarObs(JTextField paramNombre){
        
        setNombre_obs(paramNombre.getText());
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "DELETE FROM obsmedico WHERE obsmedico.nombre_atleta = ?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setString(1, getNombre_obs());
                
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    } 
    
}
