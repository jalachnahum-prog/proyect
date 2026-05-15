
package com.mycompany.vista;
import com.company.interfas.DAOprestamos;
import com.mycompany.bibio.DAOprestamosImpl;

public class Devoluciones extends javax.swing.JPanel {

    public Devoluciones() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        folio_prestar = new javax.swing.JLabel();
        id_libro_prestar = new javax.swing.JLabel();
        text_folio_usuario = new javax.swing.JTextField();
        text_id_libro = new javax.swing.JTextField();
        bot_devolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Devolución de libros");

        folio_prestar.setText("FOLIO DEL USUARIO ");

        id_libro_prestar.setText("LIBRO ID ");

        text_folio_usuario.addActionListener(this::text_folio_usuarioActionPerformed);

        text_id_libro.addActionListener(this::text_id_libroActionPerformed);

        bot_devolver.setBackground(new java.awt.Color(0, 102, 102));
        bot_devolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bot_devolver.setForeground(new java.awt.Color(255, 255, 255));
        bot_devolver.setText("Devolver");
        bot_devolver.setBorderPainted(false);
        bot_devolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bot_devolver.addActionListener(this::bot_devolverActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(766, 766, 766))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_id_libro)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_libro_prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(161, 161, 161))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(folio_prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(106, 106, 106))
                    .addComponent(text_folio_usuario)
                    .addComponent(bot_devolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(656, 656, 656))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(folio_prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_folio_usuario)
                .addGap(45, 45, 45)
                .addComponent(id_libro_prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_id_libro)
                .addGap(32, 32, 32)
                .addComponent(bot_devolver, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_folio_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_folio_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_folio_usuarioActionPerformed

    private void text_id_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_id_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_id_libroActionPerformed

    private void bot_devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_devolverActionPerformed
        try {

        DAOprestamos dao = new DAOprestamosImpl();

        com.mycompany.modelos.Prestamos p =
                new com.mycompany.modelos.Prestamos();

        p.setId_usuario(
                Integer.parseInt(text_folio_usuario.getText())
        );

        p.setId_libro(
                Integer.parseInt(text_id_libro.getText())
        );

        dao.modificar(p);
        javax.swing.JOptionPane.showMessageDialog(this,"El usuario devolvió el libro con éxito","ÉXITO",javax.swing.JOptionPane.INFORMATION_MESSAGE);

    } catch(Exception e) {

        javax.swing.JOptionPane.showMessageDialog(this,"No existe el prestamo correspondiente","ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bot_devolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_devolver;
    private javax.swing.JLabel folio_prestar;
    private javax.swing.JLabel id_libro_prestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text_folio_usuario;
    private javax.swing.JTextField text_id_libro;
    // End of variables declaration//GEN-END:variables
}
