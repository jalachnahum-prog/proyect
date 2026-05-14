
package com.mycompany.vista;

public class Libros extends javax.swing.JPanel {

    public Libros() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        text_buscar_libros = new javax.swing.JTextField();
        bot_buscar_libros = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bot_nuevo_libros = new javax.swing.JButton();
        bot_editar_libros = new javax.swing.JButton();
        bot_borrar_libros = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(668, 448));
        setPreferredSize(new java.awt.Dimension(668, 448));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("libros");

        text_buscar_libros.addActionListener(this::text_buscar_librosActionPerformed);

        bot_buscar_libros.setBackground(new java.awt.Color(0, 102, 102));
        bot_buscar_libros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bot_buscar_libros.setForeground(new java.awt.Color(255, 255, 255));
        bot_buscar_libros.setText("Buscar");
        bot_buscar_libros.setBorderPainted(false);
        bot_buscar_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bot_buscar_libros.addActionListener(this::bot_buscar_librosActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Fecha", "Autor", "Categoria ", "Edicion", "Idioma", "Paginas", "Descripcion", "Ejemplos", "Disponible"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        bot_nuevo_libros.setBackground(new java.awt.Color(0, 102, 102));
        bot_nuevo_libros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bot_nuevo_libros.setForeground(new java.awt.Color(255, 255, 255));
        bot_nuevo_libros.setText("Nuevo");
        bot_nuevo_libros.setBorderPainted(false);
        bot_nuevo_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bot_nuevo_libros.addActionListener(this::bot_nuevo_librosActionPerformed);

        bot_editar_libros.setBackground(new java.awt.Color(0, 102, 102));
        bot_editar_libros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bot_editar_libros.setForeground(new java.awt.Color(255, 255, 255));
        bot_editar_libros.setText("Editar");
        bot_editar_libros.setBorderPainted(false);
        bot_editar_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bot_editar_libros.addActionListener(this::bot_editar_librosActionPerformed);

        bot_borrar_libros.setBackground(new java.awt.Color(0, 102, 102));
        bot_borrar_libros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bot_borrar_libros.setForeground(new java.awt.Color(255, 255, 255));
        bot_borrar_libros.setText("Borrar");
        bot_borrar_libros.setBorderPainted(false);
        bot_borrar_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bot_borrar_libros.addActionListener(this::bot_borrar_librosActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(766, 766, 766))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_buscar_libros, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot_buscar_libros, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(bot_nuevo_libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(bot_editar_libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33)
                                .addComponent(bot_borrar_libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(39, 39, 39)))
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bot_buscar_libros, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(text_buscar_libros))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot_nuevo_libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bot_editar_libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bot_borrar_libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
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

    private void text_buscar_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_buscar_librosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_buscar_librosActionPerformed

    private void bot_buscar_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_buscar_librosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_buscar_librosActionPerformed

    private void bot_nuevo_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_nuevo_librosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_nuevo_librosActionPerformed

    private void bot_editar_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_editar_librosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_editar_librosActionPerformed

    private void bot_borrar_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_borrar_librosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bot_borrar_librosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_borrar_libros;
    private javax.swing.JButton bot_buscar_libros;
    private javax.swing.JButton bot_editar_libros;
    private javax.swing.JButton bot_nuevo_libros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField text_buscar_libros;
    // End of variables declaration//GEN-END:variables
}
