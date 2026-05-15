
package com.mycompany.vista;

import com.company.interfas.DAOlibros;
import com.mycompany.bibio.DAOlibrosImpl;

public class NuevoLibro extends javax.swing.JPanel {
    private com.mycompany.modelos.Libros librosEditar = null;
    public NuevoLibro() {
        initComponents();
    }
    public NuevoLibro(com.mycompany.modelos.Libros libros){
        initComponents();
        
        librosEditar = libros;
        id_libros.setText(String.valueOf(libros.getId_libro()));
        titulo.setText(libros.getTitulo());
        fecha_publicaion.setText(libros.getFecha_publicacion());
        autor.setText(libros.getAutor());
        categoria.setText(libros.getCategoria());
        edicion.setText(libros.getEdicion());
        idioma.setText(libros.getIdioma());
        paginas.setText(String.valueOf(libros.getPaginas()));
        descripcion.setText(libros.getDescripcion());
        disponible.setText(String.valueOf(libros.getDisponibles()));
        ejemplares.setText(String.valueOf(libros.getEjemplares()));

        bot_subir_libros.setText("Actualizar");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_libros = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        fecha_publicaion = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        edicion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idioma = new javax.swing.JTextField();
        paginas = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        disponible = new javax.swing.JTextField();
        ejemplares = new javax.swing.JTextField();
        bot_subir_libros = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Subir nuevo libro");

        jLabel2.setText("ID libro");

        jLabel3.setText("Titulo");

        jLabel4.setText("Fecha de publicacion ");

        jLabel5.setText("Autor");

        jLabel6.setText("Categoria");

        jLabel7.setText("Edicion");

        id_libros.addActionListener(this::id_librosActionPerformed);

        titulo.addActionListener(this::tituloActionPerformed);

        fecha_publicaion.addActionListener(this::fecha_publicaionActionPerformed);

        autor.addActionListener(this::autorActionPerformed);

        categoria.addActionListener(this::categoriaActionPerformed);

        edicion.addActionListener(this::edicionActionPerformed);

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setText("Idioma");

        jLabel9.setText("Paginas");

        jLabel10.setText("Descripcion");

        jLabel11.setText("Disponible");

        jLabel12.setText("Ejemplares");

        idioma.addActionListener(this::idiomaActionPerformed);

        paginas.addActionListener(this::paginasActionPerformed);

        descripcion.addActionListener(this::descripcionActionPerformed);

        disponible.addActionListener(this::disponibleActionPerformed);

        ejemplares.addActionListener(this::ejemplaresActionPerformed);

        bot_subir_libros.setBackground(new java.awt.Color(0, 102, 102));
        bot_subir_libros.setText("Subir");
        bot_subir_libros.addActionListener(this::bot_subir_librosActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(270, 270, 270))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(157, 157, 157))
                            .addComponent(id_libros)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(167, 167, 167))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(145, 145, 145))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(158, 158, 158))
                            .addComponent(fecha_publicaion)
                            .addComponent(autor)
                            .addComponent(categoria)
                            .addComponent(edicion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(167, 167, 167))
                            .addComponent(titulo))
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(124, 124, 124))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45))
                            .addComponent(idioma)
                            .addComponent(paginas)
                            .addComponent(descripcion)
                            .addComponent(disponible)
                            .addComponent(ejemplares)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bot_subir_libros, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_libros)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha_publicaion)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(autor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edicion)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idioma)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8)
                                .addComponent(paginas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(descripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(disponible)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ejemplares)
                                .addGap(18, 18, 18)
                                .addComponent(bot_subir_libros)
                                .addGap(30, 30, 30)))
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void id_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_librosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_librosActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void fecha_publicaionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_publicaionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_publicaionActionPerformed

    private void autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void edicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edicionActionPerformed

    private void idiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idiomaActionPerformed

    private void paginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paginasActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disponibleActionPerformed

    private void ejemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejemplaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ejemplaresActionPerformed

    private void bot_subir_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_subir_librosActionPerformed
        String idlibro = id_libros.getText();
        String titul = titulo.getText();
        String fechapublic = fecha_publicaion.getText();
        String auto = autor.getText();
        String categ = categoria.getText();
        String edic = edicion.getText();
        String idiom = idioma.getText();
        String pag = paginas.getText();
        String descrip = descripcion.getText();
        String dispo = disponible.getText();
        String ejem = ejemplares.getText();
        
        //validacion
        
    if(idlibro.isEmpty() || titul.isEmpty() || fechapublic.isEmpty() || auto.isEmpty() || categ.isEmpty() || edic.isEmpty() || idiom.isEmpty() || pag.isEmpty() || descrip.isEmpty() || dispo.isEmpty() || ejem.isEmpty()){
        javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        titulo.requestFocus();
        return;
    }
        
        com.mycompany.modelos.Libros libros;

// Si estamos editando
    if(librosEditar != null){

        libros = librosEditar;

    }else{

        libros = new com.mycompany.modelos.Libros();
    }

    libros.setId_libro(Integer.parseInt(idlibro));
    libros.setTitulo(titul);
    libros.setFecha_publicacion(fechapublic);
    libros.setAutor(auto);
    libros.setCategoria(categ);
    libros.setEdicion(edic);
    libros.setIdioma(idiom);
    libros.setPaginas(Integer.parseInt(pag));
    libros.setDescripcion(descrip);
    libros.setDisponibles(Integer.parseInt(dispo));
    libros.setEjemplares(Integer.parseInt(ejem));

    try{
        DAOlibros dao = new DAOlibrosImpl();

    // EDITAR
    if(librosEditar != null){

        dao.actualizar(libros);

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Usuario actualizado exitosamente",
                "AVISO",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );

    }else{

        // NUEVO
        dao.registrar(libros);

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Usuario registrado exitosamente",
                "AVISO",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
        );
    }

        id_libros.setText("");
        titulo.setText("");
        fecha_publicaion.setText("");
        autor.setText("");
        categoria.setText("");
        edicion.setText("");
        idioma.setText("");
        paginas.setText("");
        descripcion.setText("");
        disponible.setText("");
        ejemplares.setText("");

    }catch(Exception e){

        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Ocurrió un error",
            "AVISO",
            javax.swing.JOptionPane.ERROR_MESSAGE
        );

    System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_bot_subir_librosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor;
    private javax.swing.JButton bot_subir_libros;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField disponible;
    private javax.swing.JTextField edicion;
    private javax.swing.JTextField ejemplares;
    private javax.swing.JTextField fecha_publicaion;
    private javax.swing.JTextField id_libros;
    private javax.swing.JTextField idioma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField paginas;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
