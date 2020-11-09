/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import gastoelectrico.Conexion;
import ventanas.inicio_sesion;
import java.sql.*;

/**
 *
 * @author Red
 */
public class pnlAjustes extends javax.swing.JPanel {
    String user="";
    String nombreU, apellidoU, correoU, telefonoU;

    /**
     * Creates new form pnlAjustes
     */
    public pnlAjustes() {
        initComponents();
        user = inicio_sesion.user;
        
        try {
            Connection cn = Conexion.conectar();
            String sql = "SELECT user_name, user_lastname, correo, telefono FROM usuario WHERE arias= '" + user + "'";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                nombreU = rs.getString("user_name");
                user_name.setText(nombreU);
                
                apellidoU = rs.getString("user_lastname");
                user_lastname.setText(apellidoU);
                
                arias.setText(user);
                
                correoU = rs.getString("correo");
                correo.setText(correoU);
                
                telefonoU = rs.getString("telefono");
                telefono.setText(telefonoU);
            }
            
            cn.close();
        } catch (SQLException e) {
             System.err.println("Error" + e);
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

        jPanel2 = new javax.swing.JPanel();
        rSPanelBorder2 = new RSMaterialComponent.RSPanelBorder();
        rSPanelMaterialImage1 = new RSMaterialComponent.RSPanelMaterialImage();
        rSPanelMaterialGradient1 = new RSMaterialComponent.RSPanelMaterialGradient();
        rSPanelMaterial2 = new RSMaterialComponent.RSPanelMaterial();
        rSLabelTextIcon4 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon5 = new RSMaterialComponent.RSLabelTextIcon();
        user_lastname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        arias = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon2 = new RSMaterialComponent.RSLabelTextIcon();
        rSLabelTextIcon3 = new RSMaterialComponent.RSLabelTextIcon();
        rSButtonIconTwo1 = new RSMaterialComponent.RSButtonIconTwo();
        rSButtonIconTwo2 = new RSMaterialComponent.RSButtonIconTwo();

        rSPanelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelBorder2.setBgBorder(new java.awt.Color(255, 102, 0));

        rSPanelMaterialImage1.setBackground(new java.awt.Color(0, 0, 0));
        rSPanelMaterialImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/iconoUser.png"))); // NOI18N
        rSPanelMaterialImage1.setShadowBottom(false);
        rSPanelMaterialImage1.setShadowLeft(false);
        rSPanelMaterialImage1.setShadowRight(false);
        rSPanelMaterialImage1.setShadowTop(false);
        rSPanelMaterialImage1.setShapePanel(rojeru_san.efectos.ValoresEnum.PANEL_FORMA.CIRCLE);

        javax.swing.GroupLayout rSPanelMaterialImage1Layout = new javax.swing.GroupLayout(rSPanelMaterialImage1);
        rSPanelMaterialImage1.setLayout(rSPanelMaterialImage1Layout);
        rSPanelMaterialImage1Layout.setHorizontalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        rSPanelMaterialImage1Layout.setVerticalGroup(
            rSPanelMaterialImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        rSPanelMaterialGradient1.setColorPrimario(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout rSPanelMaterialGradient1Layout = new javax.swing.GroupLayout(rSPanelMaterialGradient1);
        rSPanelMaterialGradient1.setLayout(rSPanelMaterialGradient1Layout);
        rSPanelMaterialGradient1Layout.setHorizontalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rSPanelMaterialGradient1Layout.setVerticalGroup(
            rSPanelMaterialGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        rSPanelMaterial2.setBackground(new java.awt.Color(255, 255, 255));

        rSLabelTextIcon4.setBackground(new java.awt.Color(255, 255, 255));
        rSLabelTextIcon4.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelTextIcon4.setText("Correo:");
        rSLabelTextIcon4.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSLabelTextIcon4.setIconTextGap(5);
        rSLabelTextIcon4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EMAIL);
        rSLabelTextIcon4.setSizeIcon(25.0F);

        rSLabelTextIcon5.setBackground(new java.awt.Color(255, 255, 255));
        rSLabelTextIcon5.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelTextIcon5.setText("Nombre Completo:");
        rSLabelTextIcon5.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSLabelTextIcon5.setIconTextGap(5);
        rSLabelTextIcon5.setSizeIcon(25.0F);

        user_lastname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        user_lastname.setText("Apellido");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Fecha (En proceso)");

        user_name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        user_name.setText("Nombre");

        arias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        arias.setText("Nick");

        correo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        correo.setText("Correo");

        telefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        telefono.setText("Telefono");

        rSLabelTextIcon1.setBackground(new java.awt.Color(255, 255, 255));
        rSLabelTextIcon1.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelTextIcon1.setText("Teléfono:");
        rSLabelTextIcon1.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSLabelTextIcon1.setIconTextGap(5);
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PHONE);
        rSLabelTextIcon1.setInheritsPopupMenu(false);
        rSLabelTextIcon1.setSizeIcon(25.0F);

        rSLabelTextIcon2.setBackground(new java.awt.Color(255, 255, 255));
        rSLabelTextIcon2.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelTextIcon2.setText("Nick usuario:");
        rSLabelTextIcon2.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSLabelTextIcon2.setIconTextGap(5);
        rSLabelTextIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.STAR);
        rSLabelTextIcon2.setSizeIcon(25.0F);

        rSLabelTextIcon3.setBackground(new java.awt.Color(255, 255, 255));
        rSLabelTextIcon3.setForeground(new java.awt.Color(0, 0, 0));
        rSLabelTextIcon3.setText("Fecha de ingreso:");
        rSLabelTextIcon3.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSLabelTextIcon3.setIconTextGap(5);
        rSLabelTextIcon3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOUD_DONE);
        rSLabelTextIcon3.setInheritsPopupMenu(false);
        rSLabelTextIcon3.setSizeIcon(25.0F);

        javax.swing.GroupLayout rSPanelMaterial2Layout = new javax.swing.GroupLayout(rSPanelMaterial2);
        rSPanelMaterial2.setLayout(rSPanelMaterial2Layout);
        rSPanelMaterial2Layout.setHorizontalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(telefono))
                    .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                        .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(correo))
                    .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                                .addComponent(rSLabelTextIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(arias))
                            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                                .addComponent(rSLabelTextIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(user_lastname)))))
                .addGap(0, 82, Short.MAX_VALUE))
        );
        rSPanelMaterial2Layout.setVerticalGroup(
            rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelMaterial2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSLabelTextIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSLabelTextIcon5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_name)
                    .addComponent(user_lastname))
                .addGap(12, 12, 12)
                .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelTextIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo))
                .addGap(10, 10, 10)
                .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono))
                .addGap(10, 10, 10)
                .addGroup(rSPanelMaterial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSLabelTextIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        rSButtonIconTwo1.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonIconTwo1.setToolTipText("Editar usuario");
        rSButtonIconTwo1.setBackgroundHover(new java.awt.Color(51, 255, 204));
        rSButtonIconTwo1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        rSButtonIconTwo1.setSizeIcon(40.0F);
        rSButtonIconTwo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo1ActionPerformed(evt);
            }
        });

        rSButtonIconTwo2.setBackground(new java.awt.Color(234, 190, 63));
        rSButtonIconTwo2.setToolTipText("Cambiar contraseña");
        rSButtonIconTwo2.setBackgroundHover(new java.awt.Color(255, 215, 0));
        rSButtonIconTwo2.setEffectFocus(true);
        rSButtonIconTwo2.setFocusCycleRoot(true);
        rSButtonIconTwo2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);
        rSButtonIconTwo2.setSizeIcon(40.0F);
        rSButtonIconTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconTwo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelBorder2Layout = new javax.swing.GroupLayout(rSPanelBorder2);
        rSPanelBorder2.setLayout(rSPanelBorder2Layout);
        rSPanelBorder2Layout.setHorizontalGroup(
            rSPanelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelBorder2Layout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(rSButtonIconTwo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rSButtonIconTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(179, Short.MAX_VALUE))
                .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rSPanelBorder2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(rSPanelMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rSPanelBorder2Layout.setVerticalGroup(
            rSPanelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorder2Layout.createSequentialGroup()
                .addGroup(rSPanelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rSPanelBorder2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(rSPanelMaterialImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelBorder2Layout.createSequentialGroup()
                        .addComponent(rSPanelMaterialGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rSPanelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButtonIconTwo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonIconTwo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addComponent(rSPanelMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconTwo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo1ActionPerformed
        // TODO add your handling code here:
        new ventanas.actualizar().setVisible(true);
    }//GEN-LAST:event_rSButtonIconTwo1ActionPerformed

    private void rSButtonIconTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconTwo2ActionPerformed
        // TODO add your handling code here:
        new ventanas.cambiarC().setVisible(true);
    }//GEN-LAST:event_rSButtonIconTwo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arias;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo1;
    private RSMaterialComponent.RSButtonIconTwo rSButtonIconTwo2;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon2;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon3;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon4;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon5;
    private RSMaterialComponent.RSPanelBorder rSPanelBorder2;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial2;
    private RSMaterialComponent.RSPanelMaterialGradient rSPanelMaterialGradient1;
    private RSMaterialComponent.RSPanelMaterialImage rSPanelMaterialImage1;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel user_lastname;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
