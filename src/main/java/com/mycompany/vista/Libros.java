
package com.mycompany.vista;

import com.company.interfas.DAOlibros;
import com.mycompany.bibio.DAOlibrosImpl;
import com.mycompany.bibio.panel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class Libros extends javax.swing.JPanel {

    public Libros() {
        initComponents();
        cargarLibros();
    }
    private void cargarLibros(){
        try{
            DAOlibros dao = new DAOlibrosImpl();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar().forEach((u)->model.addRow(new Object[]{u.getId_libro(), u.getTitulo(), u.getFecha_publicacion(), u.getAutor(), u.getCategoria(), u.getEdicion(), u.getIdioma(), u.getPaginas(), u.getDescripcion(), u.getDisponibles(), u.getEjemplares()}));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
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

            },
            new String [] {
                "ID", "Titulo", "Fecha", "Autor", "Categoria ", "Edicion", "Idioma", "Paginas", "Descripcion", "Disponibles", "ejemplares"
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
        try{

        String texto = text_buscar_libros.getText().trim();

        DAOlibros dao = new DAOlibrosImpl();

        DefaultTableModel model =
        (DefaultTableModel) jTable1.getModel();

        // Limpiar tabla
        model.setRowCount(0);

        List<com.mycompany.modelos.Libros> lista;

        if(texto.isEmpty()){

            lista = dao.listar();

        }else{

            lista = dao.buscar(texto);
        }

        for(com.mycompany.modelos.Libros l : lista){

            model.addRow(new Object[]{
                l.getId_libro(),
                l.getTitulo(),
                l.getFecha_publicacion(),
                l.getAutor(),
                l.getCategoria(),
                l.getEdicion(),
                l.getIdioma(),
                l.getPaginas(),
                l.getDescripcion(),
                l.getDisponibles(),
                l.getEjemplares()
            });
        }

    }catch(Exception e){

        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_bot_buscar_librosActionPerformed

    private void bot_nuevo_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_nuevo_librosActionPerformed
        panel.ShowJPanel(new NuevoLibro());
    }//GEN-LAST:event_bot_nuevo_librosActionPerformed

    private void bot_editar_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_editar_librosActionPerformed
         if(jTable1.getSelectedRow() > -1){
            try{
                int libroId =
                (int)jTable1.getValueAt(jTable1.getSelectedRow(),0);
                DAOlibros dao = new DAOlibrosImpl();
                com.mycompany.modelos.Libros libro =
                    dao.obtenerPorId(libroId);
            panel.ShowJPanel(
                    new NuevoLibro(libro)
            );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }else{

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Debes seleccionar un libro",
                "AVISO",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );

    }
    }//GEN-LAST:event_bot_editar_librosActionPerformed

    private void bot_borrar_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_borrar_librosActionPerformed
        if(jTable1.getSelectedRow() == -1){

            javax.swing.JOptionPane.showMessageDialog(
                this,
                "Debes seleccionar los libros a eliminar",
                "AVISO",
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
             return;
        }

        DAOlibros dao = new DAOlibrosImpl();
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
