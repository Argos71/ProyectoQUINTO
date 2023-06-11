/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesCAR;

import CentroAltoRendimiento.Dietas;
import Conexiones.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ALVARO
 */
public class Nutricionista extends javax.swing.JFrame {

    /**
     * Creates new form Nutricionista
     */
    public Nutricionista() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Dietas objetoPersonal = new Dietas();
        objetoPersonal.MostrarDieta(tblDieta);
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
        txtNombreAtleta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDieta = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTalla = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        txtCi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDieta = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtImc.setEditable(false);
        txtImc.setBackground(new java.awt.Color(51, 51, 51));
        txtImc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtImc.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtImc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 120, 30));

        txtNombreAtleta.setEditable(false);
        txtNombreAtleta.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreAtleta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreAtleta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombreAtleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 270, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IMC :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 30));

        txtDieta.setBackground(new java.awt.Color(51, 51, 51));
        txtDieta.setColumns(20);
        txtDieta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDieta.setForeground(new java.awt.Color(255, 255, 255));
        txtDieta.setLineWrap(true);
        txtDieta.setRows(5);
        txtDieta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "DESCRIPCION DE LA DIETA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jScrollPane2.setViewportView(txtDieta);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 490, 200));

        jPanel2.setBackground(new java.awt.Color(13, 26, 35));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        btnAñadir.setBackground(new java.awt.Color(51, 51, 51));
        btnAñadir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("AÑADIR");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

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
        btnAtras.setText("ATRÁS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 390, 160));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TALLA CM :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 80, 30));

        txtTalla.setEditable(false);
        txtTalla.setBackground(new java.awt.Color(51, 51, 51));
        txtTalla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTalla.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 120, 30));

        txtPeso.setEditable(false);
        txtPeso.setBackground(new java.awt.Color(51, 51, 51));
        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PESO KG :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE ATLETA :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CARNET ATLETA ENCONTRADO :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 30));

        txtCarnet.setEditable(false);
        txtCarnet.setBackground(new java.awt.Color(51, 51, 51));
        txtCarnet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCarnet.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 270, 30));

        txtCi.setBackground(new java.awt.Color(51, 51, 51));
        txtCi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCi.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARNET :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 30));

        btnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 110, 30));

        tblDieta.setAutoCreateRowSorter(true);
        tblDieta.setBackground(new java.awt.Color(51, 51, 51));
        tblDieta.setForeground(new java.awt.Color(255, 255, 255));
        tblDieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDietaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDieta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 560, 560));

        jPanel4.setBackground(new java.awt.Color(13, 26, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ALIMENTACION / NUTRICIÓN");

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

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        Dietas objetoPersonal = new Dietas();
        objetoPersonal.insertarDieta(txtCi, txtNombreAtleta,
            txtDieta);

        objetoPersonal.MostrarDieta(tblDieta);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal prin = new Principal();
        prin.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Dietas objetoPersonal = new Dietas();
        objetoPersonal.ModificarDieta(txtCi, txtNombreAtleta,
            txtDieta);

        objetoPersonal.MostrarDieta(tblDieta);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String ci;
        ci=txtCi.getText();
        
        String url = "SELECT ci_atleta, nombres_atleta, apellidos_atleta"
                + " FROM atletas WHERE ci_atleta = '"+ci+"'";
        
        try{
            CConexion objetoConexion = new CConexion();
            objetoConexion.establecerConexion();
            Connection con = objetoConexion.establecerConexion();
            
            PreparedStatement ps = con.prepareStatement(url);
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
                    txtCarnet.setText(carnet);
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
        
        String url2 = "SELECT ci_atleta, peso_atleta_kg, talla_atleta_cm, imc_atleta"
                + " FROM obsmedico WHERE ci_atleta = '"+ci+"'";
        
        try{
            CConexion objetoConexion = new CConexion();
            objetoConexion.establecerConexion();
            Connection con = objetoConexion.establecerConexion();
            
            PreparedStatement ps = con.prepareStatement(url2);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //PARA VER SI EXISTE EL ATLETA
                String carnet = rs.getString("ci_atleta");
                String peso = rs.getString("peso_atleta_kg");
                String talla = rs.getString("talla_atleta_cm");
                String imc = rs.getString("imc_atleta");
                if(ci.equals(carnet)){
                    //Obtenemos el nombre del Atleta
                                        
                    txtPeso.setText(peso);
                    txtTalla.setText(talla);
                    txtImc.setText(imc);

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

    private void tblDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDietaMouseClicked
        Dietas objetoPersonal = new Dietas();
        objetoPersonal.SeleccionarDieta(tblDieta, txtCarnet, 
                txtImc,txtDieta);
    }//GEN-LAST:event_tblDietaMouseClicked

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
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nutricionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutricionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDieta;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtCi;
    private javax.swing.JTextArea txtDieta;
    private javax.swing.JTextField txtImc;
    private javax.swing.JTextField txtNombreAtleta;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
