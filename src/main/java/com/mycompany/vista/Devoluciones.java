
package com.mycompany.vista;

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
        text_folio = new javax.swing.JTextField();
        text_id_libro = new javax.swing.JTextField();
        bot_panel_prestar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Devolución de libros");

        folio_prestar.setText("FOLIO DEL USUARIO ");

        id_libro_prestar.setText("LIBRO ID ");

        text_folio.addActionListener(this::text_folioActionPerformed);

        text_id_libro.addActionListener(this::text_id_libroActionPerformed);

        bot_panel_prestar.setBackground(new java.awt.Color(0, 102, 102));
        bot_panel_prestar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bot_panel_prestar.setForeground(new java.awt.Color(255, 255, 255));
        bot_panel_prestar.setText("Devolver");
        bot_panel_prestar.setBorderPainted(false);
        bot_panel_prestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                    .addComponent(text_folio)
                    .addComponent(bot_panel_prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(text_folio)
                .addGap(45, 45, 45)
                .addComponent(id_libro_prestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_id_libro)
                .addGap(32, 32, 32)
                .addComponent(bot_panel_prestar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
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

    private void text_folioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_folioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_folioActionPerformed

    private void text_id_libroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_id_libroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_id_libroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot_panel_prestar;
    private javax.swing.JLabel folio_prestar;
    private javax.swing.JLabel id_libro_prestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField text_folio;
    private javax.swing.JTextField text_id_libro;
    // End of variables declaration//GEN-END:variables
}
