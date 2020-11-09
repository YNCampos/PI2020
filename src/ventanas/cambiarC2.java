/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import gastoelectrico.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.sql.*;

/**
 *
 * @author Red
 */
public class cambiarC2 extends javax.swing.JFrame {

    int id_solicitud,id_user;
    String val="";

    /**
     * Creates new form cambiarC
     */
    public cambiarC2() {
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
         id_solicitud = paneles.pnlSolicitudes.id_solicitud;
        
        try {
            Connection cn = Conexion.conectar();
            String sql = "SELECT id_user FROM usuario NATURAL JOIN solicitud WHERE id_solicitud=" + id_solicitud;
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                id_user = rs.getInt("id_user");
            }
            cn.close();
        } catch (SQLException e) {
            System.err.println("Error " + e);
            JOptionPane.showMessageDialog(null, "Error al consultar informacion");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelBorder1 = new RSMaterialComponent.RSPanelBorder();
        rSPanelMaterialGradient1 = new RSMaterialComponent.RSPanelMaterialGradient();
        rSPanelMaterialImage1 = new RSMaterialComponent.RSPanelMaterialImage();
        jLabel7 = new javax.swing.JLabel();
        txtNC = new RSMaterialComponent.RSPasswordIconOne();
        txtCC = new RSMaterialComponent.RSPasswordIconOne();
        jLabel8 = new javax.swing.JLabel();
        BActualizarC = new RSMaterialComponent.RSButtonMaterialIconOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rSPanelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder1.setBgBorder(new java.awt.Color(153, 51, 0));

        rSPanelMaterialGradient1.setColorPrimario(new java.awt.Color(255, 215, 0));
        rSPanelMaterialGradient1.setColorSecundario(new java.awt.Color(204, 51, 0));

        rSPanelMaterialImage1.setBackground(new java.awt.Color(204, 51, 0));
        rSPanelMaterialImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/candado.png"))); // NOI18N
        rSPanelMaterialImage1.setShapePanel(rojeru_san.efectos.ValoresEnum.PANEL_FORMA.CIRCLE);

        javax.swing.GroupLayout rSPanelMaterialImage1Layout = new javax.swing.GroupLayout(rSPanelMaterialImage1);
        rSPanelMaterialImage1.setLayout(rSPanelMaterialImage1Layout);
        rSPanelMaterialImage1Layout.setHorizontalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        rSPanelMaterialImage1Layout.setVerticalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rSPanelMaterialGradient1Layout = new javax.swing.GroupLayout(rSPanelMaterialGradient1);
        rSPanelMaterialGradient1.setLayout(rSPanelMaterialGradient1Layout);
        rSPanelMaterialGradient1Layout.setHorizontalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterialGradient1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSPanelMaterialGradient1Layout.setVerticalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nueva contraseña:");

        txtNC.setForeground(new java.awt.Color(0, 0, 0));
        txtNC.setBorderColor(new java.awt.Color(153, 51, 0));
        txtNC.setColorIcon(new java.awt.Color(153, 51, 0));
        txtNC.setPlaceholder("");

        txtCC.setForeground(new java.awt.Color(0, 0, 0));
        txtCC.setBorderColor(new java.awt.Color(153, 51, 0));
        txtCC.setColorIcon(new java.awt.Color(153, 51, 0));
        txtCC.setPlaceholder("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Confirmar contraseña:");

        BActualizarC.setBackground(new java.awt.Color(255, 102, 0));
        BActualizarC.setText("Actualizar Contraseña");
        BActualizarC.setBackgroundHover(new java.awt.Color(51, 51, 255));
        BActualizarC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BActualizarC.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        BActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelBorder1Layout = new javax.swing.GroupLayout(rSPanelBorder1);
        rSPanelBorder1.setLayout(rSPanelBorder1Layout);
        rSPanelBorder1Layout.setHorizontalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addComponent(txtNC, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(BActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addComponent(jLabel7))
                        .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jLabel8))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        rSPanelBorder1Layout.setVerticalGroup(
            rSPanelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorder1Layout.createSequentialGroup()
                .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(BActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarCActionPerformed
        // TODO add your handling code here:
        String passNC, passCC;
        passNC = txtNC.getText().trim();
        passCC = txtCC.getText().trim();
        repaint();

        int aux = 0;

        
        if (passNC.equals("")) {
            txtNC.setBorderColor(Color.red);
            txtNC.setColorIcon(Color.red);
            aux++;
        }
        if (passCC.equals("")) {
            txtCC.setBorderColor(Color.red);
            txtCC.setColorIcon(Color.red);
            aux++;
        }
        
        if(!passNC.equals(passCC)){
            txtCC.setBorderColor(Color.red);
            txtCC.setColorIcon(Color.red);
            txtNC.setBorderColor(Color.red);
            txtNC.setColorIcon(Color.red);
            aux++;
        }

        

        if (aux == 0) {

            try {
                Connection cn = Conexion.conectar();
                String sql2 = "UPDATE usuario SET contraseña=? WHERE id_user = " + id_user;
                PreparedStatement pst = cn.prepareStatement(sql2);
                
                pst.setString(1,passNC);
                
                pst.executeUpdate();
                cn.close();
                
                
                txtNC.setBackground(Color.green);
                txtCC.setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Se ha actualizado la contraseña correctamente");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error" + e);
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
            aux=0;
        }
    }//GEN-LAST:event_BActualizarCActionPerformed

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
            java.util.logging.Logger.getLogger(cambiarC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiarC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiarC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiarC2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambiarC2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconOne BActualizarC;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder1;
    private RSMaterialComponent.RSPanelMaterialGradient rSPanelMaterialGradient1;
    private RSMaterialComponent.RSPanelMaterialImage rSPanelMaterialImage1;
    private RSMaterialComponent.RSPasswordIconOne txtCC;
    private RSMaterialComponent.RSPasswordIconOne txtNC;
    // End of variables declaration//GEN-END:variables
}
