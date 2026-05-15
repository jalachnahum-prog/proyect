
package com.mycompany.bibio;

import com.company.interfas.DAOusuarios;
import com.mycompany.db.Database;
import com.mycompany.modelos.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOusuariosImpl extends Database implements DAOusuarios {

    @Override
    public void registrar(Usuarios usuario) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO usuarios(nombres, apellido_paterno, apellido_materno, domicilio, telefono) VALUES(?,?,?,?,?);");
            
            st.setString(1, usuario.getNombres());
            st.setString(2, usuario.getApellido_paterno());
            st.setString(3, usuario.getApellido_materno());
            st.setString(4, usuario.getDomicilio());
            st.setString(5, usuario.getTelefono());
            
            st.executeUpdate();
            st.close(); 
            
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }
    @Override
    public void modificar(Usuarios usuario) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int usuarioId) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM usuarios WHERE id_usuario = ?;");
            
            st.setInt(1, usuarioId);
            
            st.executeUpdate();
            st.close(); 
            
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<Usuarios> listar() throws Exception {
        List<Usuarios> lista = null;
        try{
             this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios;");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Usuarios usuario = new Usuarios();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellido_paterno(rs.getString("apellido_paterno"));
                usuario.setApellido_materno(rs.getString("apellido_materno"));
                usuario.setDomicilio(rs.getString("domicilio"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setSanciones(rs.getInt("sanciones"));
                usuario.setDinero_sancion(rs.getInt("dinero_sancion"));
                lista.add(usuario);
            }
            rs.close();
            st.close();
        }catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public Usuarios getUsuarioById(int usuarioId) throws Exception {
      Usuarios usuario = new Usuarios();
      
        try{
             this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios WHERE id_usuario = ? LIMIT 1;");
            st.setInt(1, usuarioId); 
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellido_paterno(rs.getString("apellido_paterno"));
                usuario.setApellido_materno(rs.getString("apellido_materno"));
                usuario.setDomicilio(rs.getString("domicilio"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setSanciones(rs.getInt("sanciones"));
                usuario.setDinero_sancion(rs.getInt("dinero_sancion"));
            }
            rs.close();
            st.close();
        }catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
        return usuario;  
    }

    @Override
    public Usuarios obtenerPorId(int id) throws Exception {
          Usuarios usuario = null;

    try{

        this.conectar();

        PreparedStatement st =
        this.conexion.prepareStatement(
        "SELECT * FROM usuarios WHERE id_usuario=?"
        );

        st.setInt(1,id);

        ResultSet rs = st.executeQuery();

        if(rs.next()){

            usuario = new Usuarios();

            usuario.setId_usuario(
                    rs.getInt("id_usuario"));

            usuario.setNombres(
                    rs.getString("nombres"));

            usuario.setApellido_paterno(
                    rs.getString("apellido_paterno"));

            usuario.setApellido_materno(
                    rs.getString("apellido_materno"));

            usuario.setDomicilio(
                    rs.getString("domicilio"));

            usuario.setTelefono(
                    rs.getString("telefono"));
        }

    }catch(Exception e){

        System.out.println(e.getMessage());

    }

    return usuario;
    }

    @Override
    public void actualizar(Usuarios usuario) throws Exception {
         try {

            this.conectar();

            PreparedStatement st =
            this.conexion.prepareStatement(
                "UPDATE usuarios SET nombres=?, apellido_paterno=?, apellido_materno=?, domicilio=?, telefono=? WHERE id_usuario=?"
            );

            st.setString(1, usuario.getNombres());
            st.setString(2, usuario.getApellido_paterno());
            st.setString(3, usuario.getApellido_materno());
            st.setString(4, usuario.getDomicilio());
            st.setString(5, usuario.getTelefono());

            st.setInt(6, usuario.getId_usuario());

            st.executeUpdate();

            st.close();

        } catch(Exception e){

            throw e;

        } finally{

            this.Cerrar();
        }
    }

    @Override
    public List<Usuarios> buscar(String texto) throws Exception {
        
    List<Usuarios> lista = new ArrayList<>();

    try{

        this.conectar();

        PreparedStatement st = this.conexion.prepareStatement(
        "SELECT * FROM usuarios WHERE nombres LIKE ? OR apellido_paterno LIKE ? OR apellido_materno LIKE ?"
        );

        String busqueda = "%" + texto + "%";

        st.setString(1, busqueda);
        st.setString(2, busqueda);
        st.setString(3, busqueda);

        ResultSet rs = st.executeQuery();

        while(rs.next()){

            Usuarios usuario = new Usuarios();

            usuario.setId_usuario(rs.getInt("id_usuario"));
            usuario.setNombres(rs.getString("nombres"));
            usuario.setApellido_paterno(rs.getString("apellido_paterno"));
            usuario.setApellido_materno(rs.getString("apellido_materno"));
            usuario.setDomicilio(rs.getString("domicilio"));
            usuario.setTelefono(rs.getString("telefono"));

            lista.add(usuario);
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