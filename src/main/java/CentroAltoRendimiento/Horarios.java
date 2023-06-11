/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CentroAltoRendimiento;

import Conexiones.CConexion;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ALVARO
 */
public class Horarios {

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora_in() {
        return hora_in;
    }

    public void setHora_in(Time hora_in) {
        this.hora_in = hora_in;
    }

    public Time getHora_sal() {
        return hora_sal;
    }

    public void setHora_sal(Time hora_sal) {
        this.hora_sal = hora_sal;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    int ci_atleta;
    String nombre_atleta;
    Date fecha;
    Time hora_in;
    Time hora_sal;
    String entrenador;
    String descripcion;
    
    public void MostrarHorarios(JTable paramTablaHorario){
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String sql = "";
        
        modelo.addColumn("CI");
        modelo.addColumn("Nombre Atleta");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora Ingreso");
        modelo.addColumn("Hora Salida");
        modelo.addColumn("Entrenador");
        modelo.addColumn("Descripcion");


        paramTablaHorario.setModel(modelo);
        
        sql = "SELECT * FROM entrenamientos";
        
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
    
     public void insertarHorarios(JTextField paramCi, JTextField paramNombre, 
            JTextField paramFecha, JTextField paramHoraIn,
            JTextField paramHoraSal, JTextField paramEntrenador, JTextArea paramDescripcion){
          
        String FechaString = paramFecha.getText();
        Date FechaRegis = Date.valueOf(FechaString);
        
        String Horain = paramHoraIn.getText();
        Time formatoHoraIn = Time.valueOf(Horain);
        
        String Horasal = paramHoraSal.getText();
        Time formatoHoraSal = Time.valueOf(Horasal);

        setCi_atleta(Integer.parseInt(paramCi.getText()));
        setNombre_atleta(paramNombre.getText());
        setFecha(FechaRegis);
        setHora_in(formatoHoraIn);
        setHora_sal(formatoHoraSal);
        setEntrenador(paramEntrenador.getText());
        setDescripcion(paramDescripcion.getText());
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "INSERT INTO entrenamientos (ci_atleta, nombre_atleta,"
                + "fecha, hora_ingreso, hora_salida, entrenador, descripcion) "
                + "values (?,?,?,?,?,?,?);";
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_atleta());
            cs.setString(2, getNombre_atleta());
            cs.setDate(3, getFecha());
            cs.setTime(4, getHora_in());
            cs.setTime(5, getHora_sal());
            cs.setString(6, getEntrenador());
            cs.setString(7, getDescripcion());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se inserto correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
     
     public void SeleccionarHorarios(JTable paramTablaHorario, JTextField paramCi,
            JTextField paramNombre, JTextField paramFecha, JTextField paramHoraIn,
            JTextField paramHoraSal, JTextField paramEntrenador, JTextArea paramDescripcion){
        
        try{
            
            int fila = paramTablaHorario.getSelectedRow();
            
            if (fila>=0) {
                
                paramCi.setText(paramTablaHorario.getValueAt(fila,0).toString());
                paramNombre.setText(paramTablaHorario.getValueAt(fila,1).toString());
                paramFecha.setText(paramTablaHorario.getValueAt(fila,2).toString());
                paramHoraIn.setText(paramTablaHorario.getValueAt(fila,3).toString());
                paramHoraSal.setText(paramTablaHorario.getValueAt(fila,4).toString());
                paramEntrenador.setText(paramTablaHorario.getValueAt(fila,5).toString());
                paramDescripcion.setText(paramTablaHorario.getValueAt(fila,6).toString());
            }
            else{
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
        
    }
     
     public void ModificarHorarios(JTextField paramCi, JTextField paramNombre, 
            JTextField paramFecha, JTextField paramHoraIn,
            JTextField paramHoraSal, JTextField paramEntrenador, JTextArea paramDescripcion){
        
        String FechaString = paramFecha.getText();
        Date FechaRegis = Date.valueOf(FechaString);
        
        String Horain = paramHoraIn.getText();
        Time formatoHoraIn = Time.valueOf(Horain);
        
        String Horasal = paramHoraSal.getText();
        Time formatoHoraSal = Time.valueOf(Horasal);

    
        setCi_atleta(Integer.parseInt(paramCi.getText()));
        setNombre_atleta(paramNombre.getText());
        setFecha(FechaRegis);
        setHora_in(formatoHoraIn);
        setHora_sal(formatoHoraSal);
        setEntrenador(paramEntrenador.getText());
        setDescripcion(paramDescripcion.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE entrenamientos SET fecha=?, hora_ingreso=?,"
                + " hora_salida=?, entrenador=?, descripcion=? "
                + "WHERE entrenamientos.nombre_atleta=?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setDate(1, getFecha());
            cs.setTime(2, getHora_in());
            cs.setTime(3, getHora_sal());
            cs.setString(4, getEntrenador());
            cs.setString(5, getDescripcion());
            cs.setString(6, getNombre_atleta());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se modifico correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    public void EliminarHorarios(JTextField paramCi){
        
        setCi_atleta(Integer.parseInt(paramCi.getText()));
                
        CConexion objetoConexion = new CConexion();
        
        String consulta = "DELETE FROM entrenamientos WHERE entrenamientos.ci_atleta = ?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            
            cs.setInt(1, getCi_atleta());
                
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.toString());
        }
    }
    
    
}
