
package com.mycompany.bibio;

import com.company.interfas.DAOlibros;
import com.mycompany.db.Database;
import com.mycompany.modelos.Libros;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOlibrosImpl extends Database implements DAOlibros{

    @Override
    public void registrar(Libros libros) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO libros(id_libro, titulo, fecha_publicacion, autor, categoria, edicion, idioma, paginas, descripcion, disponibles, ejemplares) VALUES(?,?,?,?,?,?,?,?,?,?,?);");
            
            st.setInt(1, libros.getId_libro());
            st.setString(2, libros.getTitulo());
            st.setString(3, libros.getFecha_publicacion());
            st.setString(4, libros.getAutor());
            st.setString(5, libros.getCategoria());
            st.setString(6, libros.getEdicion());
            st.setString(7, libros.getIdioma());
            st.setInt(8, libros.getPaginas());
            st.setString(9, libros.getDescripcion());
            st.setInt(10, libros.getDisponibles());
            st.setInt(11, libros.getEjemplares());
            
            st.executeUpdate();
            st.close(); 
            
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Libros libros) throws Exception {
  }

    @Override
    public void eliminar(int idLibros) throws Exception {
        try{

        this.conectar();

        PreparedStatement st =
        this.conexion.prepareStatement(
        "DELETE FROM libros WHERE id_libro=?"
        );

        st.setInt(1, idLibros);

        st.executeUpdate();

        st.close();

    }catch(Exception e){

        throw e;

    }finally{

        this.Cerrar();
    }
    }

    @Override
    public List<Libros> listar() throws Exception {
        List<Libros> lista = null;

    try{

        this.conectar();

        PreparedStatement st =
        this.conexion.prepareStatement(
        "SELECT * FROM libros"
        );
        ResultSet rs = st.executeQuery();
        lista = new ArrayList<>();
        while(rs.next()){
            Libros libro = new Libros();
            libro.setId_libro(rs.getInt("id_libro"));
            libro.setTitulo(rs.getString("titulo"));
            libro.setFecha_publicacion(rs.getString("fecha_publicacion"));
            libro.setAutor(rs.getString("autor"));
            libro.setCategoria(rs.getString("categoria"));
            libro.setEdicion(rs.getString("edicion"));
            libro.setIdioma(rs.getString("idioma"));
            libro.setPaginas(rs.getInt("paginas"));
            libro.setDescripcion(rs.getString("descripcion"));
            libro.setDisponibles(rs.getInt("disponibles"));
            libro.setEjemplares(rs.getInt("ejemplares"));
            lista.add(libro);
        }
         rs.close();
        st.close();
    }catch(Exception e){
        throw e;
    }finally{
        this.Cerrar();
    }
    return lista;
    }

    @Override
    public void actualizar(Libros libros) throws Exception {
       try {

        this.conectar();

        PreparedStatement st =
        this.conexion.prepareStatement(
            "UPDATE libros SET titulo=?, fecha_publicacion=?, autor=?, categoria=?, edicion=?, idioma=?, paginas=?, descripcion=?, disponibles=?, ejemplares=? WHERE id_libro=?"
        );

        st.setString(1, libros.getTitulo());
        st.setString(2, libros.getFecha_publicacion());
        st.setString(3, libros.getAutor());
        st.setString(4, libros.getCategoria());
        st.setString(5, libros.getEdicion());
        st.setString(6, libros.getIdioma());
        st.setInt(7, libros.getPaginas());
        st.setString(8, libros.getDescripcion());
        st.setInt(9, libros.getDisponibles());
        st.setInt(10, libros.getEjemplares());
        st.setInt(11, libros.getId_libro());
        st.executeUpdate();
        st.close();

    } catch(Exception e){

        throw e;

    } finally{

        this.Cerrar();
    }

    }

    @Override
    public Libros obtenerPorId(int id) throws Exception {
         Libros libro = null;

        try{

            this.conectar();

            PreparedStatement st = this.conexion.prepareStatement( "SELECT * FROM libros WHERE id_libro=?" );
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
             if(rs.next()){
                libro = new Libros();
                libro.setId_libro(rs.getInt("id_libro"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setFecha_publicacion(rs.getString("fecha_publicacion"));
                libro.setAutor(rs.getString("autor"));
                libro.setCategoria(rs.getString("categoria"));
                libro.setEdicion(rs.getString("edicion"));
                libro.setIdioma(rs.getString("idioma"));
                libro.setPaginas(rs.getInt("paginas"));
                libro.setDescripcion(rs.getString("descripcion"));
                libro.setDisponibles(rs.getInt("disponibles"));
                libro.setEjemplares(rs.getInt("ejemplares"));
            }
            rs.close();
            st.close();
        }catch(Exception e){

        System.out.println(e.getMessage());

    }finally{

        this.Cerrar();
    }

    return libro;
    }

    @Override
    public List<Libros> buscar(String texto) throws Exception {
        List<Libros> lista = new ArrayList<>();

    try{

        this.conectar();

        PreparedStatement st = this.conexion.prepareStatement(
        "SELECT * FROM libros WHERE titulo LIKE ? OR autor LIKE ? OR categoria LIKE ?"
        );

        String busqueda = "%" + texto + "%";

        st.setString(1, busqueda);
        st.setString(2, busqueda);
        st.setString(3, busqueda);

        ResultSet rs = st.executeQuery();

        while(rs.next()){

            Libros libro = new Libros();

            libro.setId_libro(rs.getInt("id_libro"));
            libro.setTitulo(rs.getString("titulo"));
            libro.setFecha_publicacion(rs.getString("fecha_publicacion"));
            libro.setAutor(rs.getString("autor"));
            libro.setCategoria(rs.getString("categoria"));
            libro.setEdicion(rs.getString("edicion"));
            libro.setIdioma(rs.getString("idioma"));
            libro.setPaginas(rs.getInt("paginas"));
            libro.setDescripcion(rs.getString("descripcion"));
            libro.setDisponibles(rs.getInt("disponibles"));
            libro.setEjemplares(rs.getInt("ejemplares"));

            lista.add(libro);
        }

        rs.close();
        st.close();

    }catch(Exception e){

        throw e;

    }finally{

        this.Cerrar();
    }

    return lista;
    }
}
