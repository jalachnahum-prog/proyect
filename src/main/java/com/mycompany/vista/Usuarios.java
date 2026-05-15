
package com.mycompany.vista;

import com.company.interfas.DAOusuarios;
import com.mycompany.bibio.DAOusuariosImpl;
import com.mycompany.bibio.panel;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JPanel {

    public Usuarios() {
        initComponents();
        cargarUsuario();
    }
    
    private void cargarUsuario(){
        try{
            DAOusuarios dao = new DAOusuariosImpl();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar().forEach((u)->model.addRow(new Object[]{u.getId_usuario(), u.getNombres(), u.getApellido_paterno(), u.getApellido_materno(), u.getDomicilio(), u.getTelefono()}));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tex_usuar_buscar = new javax.swing.JTextField();
        bot_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bot_nuev = new javax.swing.JButton();
        bot_editar = new javax.swing.JButton();
        bot_eliminar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Usuarios ");

        tex_usuar_buscar.addActionListener(this::tex_usuar_buscarActionPerformed);

        bot_buscar.setBackground(new java.awt.Color(0, 102, 102));
        bot_buscar.setForeground(new java.awt.Color(255, 255, 255));
        bot_buscar.setText("Buscar");
        bot_buscar.addActionListener(this::bot_buscarActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido P.", "Apellido M.", "Domicilio", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        bot_nuev.setBackground(new java.awt.Color(0, 102, 102));
        bot_nuev.setForeground(new java.awt.Color(255, 255, 255));
        bot_nuev.setText("Nuevo");
        bot_nuev.addActionListener(this::bot_nuevActionPerformed);

        bot_editar.setBackground(new java.awt.Color(0, 102, 102));
        bot_editar.setForeground(new java.awt.Color(255, 255, 255));
        bot_editar.setText("Editar");
        bot_editar.addActionListener(this::bot_editarActionPerformed);

        bot_eliminar.setBackground(new java.awt.Color(0, 102, 102));
        bot_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        bot_eliminar.setText("Borrar");
        bot_eliminar.addActionListener(this::bot_eliminarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(557, 557, 557))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tex_usuar_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bot_buscar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(bot_nuev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bot_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bot_eliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bot_buscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tex_usuar_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot_nuev)
                    .addComponent(bot_editar)
                    .addComponent(bot_eliminar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tex_usuar_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_usuar_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_usuar_buscarActionPerformed

    private void bot_nuevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_nuevActionPerformed
        panel.ShowJPanel(new NuevoUsuario());
    }//GEN-LAST:event_bot_nuevActionPerformed

    private void bot_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_editarActionPerformed
         if(jTable1.getSelectedRow() > -1){
        try{
            int usuarioId =
            (int)jTable1.getValueAt(
                    jTable1.getSelectedRow(),0);
            DAOusuarios dao =
                    new DAOusuariosImpl();
            com.mycompany.modelos.Usuarios usuario =
                    dao.obtenerPorId(usuarioId);
            panel.ShowJPanel(
                    new NuevoUsuario(usuario)
            );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }else{

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Debes seleccionar un usuario",
                "AVISO",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );

    }
    }//GEN-LAST:event_bot_editarActionPerformed

    private void bot_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_eliminarActionPerformed

        if(jTable1.getSelectedRow() == -1){

            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Debes seleccionar los usuarios a eliminar",
                "AVISO",
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
             return;
        }

        DAOusuarios dao = new DAOusuariosImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();


        int[] filas = jTable1.getSelectedRows();

        for(int i = filas.length - 1; i >= 0; i--){
            try{
                int fila = filas[i];

                dao.eliminar((int)jTable1.getValueAt(fila, 0));
                model.removeRow(fila);

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_bot_eliminarActionPerformed

    private void bot_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscarActionPerformed
        
    try{

        String texto = tex_usuar_buscar.getText().trim();

        DAOusuarios dao = new DAOusuariosImpl();

        DefaultTableModel model =
        (DefaultTableModel) jTable1.getModel();

        // Limpiar tabla
        model.setRowCount(0);

        List<com.mycompany.modelos.Usuarios> lista;

        if(texto.isEmpty()){

            lista = dao.listar();

        }else{

            lista = dao.buscar(texto);
        }

        for(com.mycompany.modelos.Usuarios u : lista){

            model.addRow(new Object[]{
                u.getId_usuario(),
                u.getNombres(),
                u.getApellido_paterno(),
                u.getApellido_materno(),
                u.getDomicilio(),
                u.getTelefono()
            });
        }

    }catch(Exception e){

        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_bot_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_buscar;
    private javax.swing.JButton bot_editar;
    private javax.swing.JButton bot_eliminar;
    private javax.swing.JButton bot_nuev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tex_usuar_buscar;
    // End of variables declaration//GEN-END:variables
}
