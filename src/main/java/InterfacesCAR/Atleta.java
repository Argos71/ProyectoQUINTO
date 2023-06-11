/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesCAR;

import InterfacesCAR.Principal;
import Conexiones.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALVARO
 */
public class Atleta extends javax.swing.JFrame {

    /**
     * Creates new form Atleta
     */
    public Atleta() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtImc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtObsMedico = new javax.swing.JTextField();
        txtDieta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAtleta = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHorarioAtleta = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCi = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtImc.setEditable(false);
        txtImc.setBackground(new java.awt.Color(51, 51, 51));
        txtImc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtImc.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtImc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HORARIO DE ENTRENAMIENTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 370, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BIENVENIDO : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 110, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTROL MEDICO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 370, 30));

        txtObsMedico.setBackground(new java.awt.Color(51, 51, 51));
        txtObsMedico.setForeground(new java.awt.Color(255, 255, 255));
        txtObsMedico.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtObsMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "OBSERVACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtObsMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 520, 200));

        txtDieta.setBackground(new java.awt.Color(51, 51, 51));
        txtDieta.setForeground(new java.awt.Color(255, 255, 255));
        txtDieta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDieta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "OBSERVACIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(txtDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 530, 190));

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IMC : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 130, 30));

        txtNombreAtleta.setEditable(false);
        txtNombreAtleta.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreAtleta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombreAtleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 420, 30));

        jPanel2.setBackground(new java.awt.Color(13, 26, 35));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(51, 51, 51));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 530, 170, 130));

        tblHorarioAtleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FECHA", "HORA INGRESO", "HORA SALIDA", "ENTRENADOR"
            }
        ));
        jScrollPane2.setViewportView(tblHorarioAtleta);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 510, 120));

        jPanel4.setBackground(new java.awt.Color(13, 26, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ATLETA / DEPORTISTA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CARNET :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 130, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PESO kg :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TALLA cm :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ALIMENTOS QUE SE DEBEN CONSUMIR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 370, 30));

        txtCi.setBackground(new java.awt.Color(51, 51, 51));
        txtCi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, 30));

        txtPeso.setEditable(false);
        txtPeso.setBackground(new java.awt.Color(51, 51, 51));
        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 180, 30));

        txtTalla.setEditable(false);
        txtTalla.setBackground(new java.awt.Color(51, 51, 51));
        txtTalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTalla.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Proyecto QUINTO\\ProyectoCuarto\\src\\main\\java\\CentroAltoRendimiento\\FondoSecretaria.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal prin = new Principal();
        prin.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String ci;
        ci=txtCi.getText();
        
        String url1 = "SELECT ci_atleta, nombres_atleta, apellidos_atleta"
                + " FROM atletas WHERE ci_atleta = '"+ci+"'";
        
        String url2 = "SELECT ci_atleta, dieta_atleta FROM dieta WHERE ci_atleta = '"+ci+"'";
        
        String url3 = "SELECT ci_atleta, peso_atleta_kg, talla_atleta_cm, imc_atleta, observaciones "
                + "FROM obsmedico WHERE ci_atleta = '"+ci+"'";
        
        String url4 = "SELECT ci_atleta, fecha, hora_ingreso, hora_salida, entrenador "
                + "FROM entrenamientos WHERE ci_atleta = '"+ci+"'";
        //OBTENER NOMBRE DEL ATLETA
        try{
            CConexion objetoConexion = new CConexion();
            objetoConexion.establecerConexion();
            Connection con = objetoConexion.establecerConexion();
            
            PreparedStatement ps = con.prepareStatement(url1);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //PARA VER SI EXISTE EL ATLETA
                String carnet = rs.getString("ci_atleta");
                String nombre = rs.getString("nombres_atleta");
                String apellido = rs.getString("apellidos_atleta");
                if(ci.equals(carnet)){
                    //Obtenemos el nombre del Atleta
                    JOptionPane.showMessageDialog(null,"EL"
                            + " ATLETA FUE ENCONTRADO EXITOSAMENTE");
                    
                    txtNombreAtleta.setText(nombre + " " + apellido);
                    
                }
            }else{
                //SI EL USUARIO NO EXISTE
                JOptionPane.showMessageDialog(null,"EL "
                        + "ATLETA NO EXISTE");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar "
                    + "a la base de datos error: "+e.toString());
        }
        
        //OBTENER DIETA DEL ATLETA
        
        try{
            CConexion objetoConexion = new CConexion();
            objetoConexion.establecerConexion();
            Connection con = objetoConexion.establecerConexion();
            
            PreparedStatement ps = con.prepareStatement(url2);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //PARA VER SI EXISTE EL ATLETA
                String carnet = rs.getString("ci_atleta");
                String dieta = rs.getString("dieta_atleta");

                if(ci.equals(carnet)){
                    //Obtenemos el nombre del Atleta
                                        
                    txtDieta.setText(dieta);
                    
                }
            }else{
                //SI EL USUARIO NO EXISTE
                JOptionPane.showMessageDialog(null,"EL "
                        + "ATLETA NO EXISTE");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar "
                    + "a la base de datos error: "+e.toString());
        }
        
        //OBTENER OBSERVACIONES MEDICAS DEL ATLETA
        
        try{
            CConexion objetoConexion = new CConexion();
            objetoConexion.establecerConexion();
            Connection con = objetoConexion.establecerConexion();
            
            PreparedStatement ps = con.prepareStatement(url3);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //PARA VER SI EXISTE EL ATLETA
                String carnet = rs.getString("ci_atleta");
                String peso = rs.getString("peso_atleta_kg");
                String talla = rs.getString("talla_atleta_cm");
                String imc = rs.getString("imc_atleta");
                String obs = rs.getString("observaciones");
                if(ci.equals(carnet)){
                    //Obtenemos el nombre del Atleta

                    txtPeso.setText(peso);
                    txtTalla.setText(talla);
                    txtImc.setText(imc);
                    txtObsMedico.setText(obs);

                    
                }
            }else{
                //SI EL USUARIO NO EXISTE
                JOptionPane.showMessageDialog(null,"EL "
                        + "ATLETA NO EXISTE");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar "
                    + "a la base de datos error: "+e.toString());
        }
        
        //OBTENER LOS HORARIOS DE ENTRENAMIENTO
        
        try{
            CConexion objetoConexion = new CConexion();
            objetoConexion.establecerConexion();
            Connection con = objetoConexion.establecerConexion();
            
            PreparedStatement ps = con.prepareStatement(url4);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //PARA VER SI EXISTE EL ATLETA
                String carnet = rs.getString("ci_atleta");
                String fecha = rs.getString("fecha");
                String horain = rs.getString("hora_ingreso");
                String horasal = rs.getString("hora_salida");
                String entrenador = rs.getString("entrenador");
                
                if(ci.equals(carnet)){
                    //Obtenemos la info de entrenamientos
                    
                    DefaultTableModel modelo = new DefaultTableModel();

                        modelo.addColumn("FECHA");
                        modelo.addColumn("HORA INGRESO");
                        modelo.addColumn("HORA SALIDA");
                        modelo.addColumn("ENTRENADOR");

                        tblHorarioAtleta.setModel(modelo);

                        String [] datos = new String[4];
                        datos[0] = fecha;
                        datos[1] = horain;
                        datos[2] = horasal;
                        datos[3] = entrenador;
                        
                        modelo.addRow(datos);
                    
                }
            }else{
                //SI EL USUARIO NO EXISTE
                JOptionPane.showMessageDialog(null,"EL "
                        + "ATLETA NO EXISTE");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar "
                    + "a la base de datos error: "+e.toString());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblHorarioAtleta;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextField txtDieta;
    private javax.swing.JTextField txtImc;
    private javax.swing.JTextField txtNombreAtleta;
    private javax.swing.JTextField txtObsMedico;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
