
package com.mycompany.bibio;

import com.company.interfas.DAOprestamos;
import com.mycompany.db.Database;
import com.mycompany.modelos.Prestamos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOprestamosImpl extends Database implements DAOprestamos{

   @Override
public void registrar(Prestamos prestamo) throws Exception {

    try {

        this.conectar();

        // Verificar disponibles
        PreparedStatement verificar =
        this.conexion.prepareStatement(
            "SELECT disponibles FROM libros WHERE id_libro=?"
        );

        verificar.setInt(1, prestamo.getId_libro());

        ResultSet rs = verificar.executeQuery();

        if(rs.next()){

            int disponibles = rs.getInt("disponibles");

            if(disponibles <= 0){

                throw new Exception("No hay libros disponibles");
            }
        }

        rs.close();
        verificar.close();

        // Registrar préstamo
        PreparedStatement st =
        this.conexion.prepareStatement(
            "INSERT INTO prestamos(id_usuario, id_libro) VALUES(?,?)"
        );

        st.setInt(1, prestamo.getId_usuario());
        st.setInt(2, prestamo.getId_libro());

        st.executeUpdate();

        st.close();

        // Disminuir disponibles
        PreparedStatement st2 =
        this.conexion.prepareStatement(
            "UPDATE libros SET disponibles = disponibles - 1 WHERE id_libro=?"
        );

        st2.setInt(1, prestamo.getId_libro());

        st2.executeUpdate();

        st2.close();

    } catch(Exception e){

        throw e;

    } finally{

        this.Cerrar();
    }
}

@Override
public void modificar(Prestamos prestamo) throws Exception {

    try {

        this.conectar();

        PreparedStatement st = this.conexion.prepareStatement(
            "UPDATE prestamos " +
            "SET fecha_devolucion = CURRENT_DATE, " +
            "estado = 'DEVUELTO' " +
            "WHERE id_usuario = ? " +
            "AND id_libro = ? " +
            "AND estado = 'PRESTADO'"
        );

        st.setInt(1, prestamo.getId_usuario());
        st.setInt(2, prestamo.getId_libro());

        int filas = st.executeUpdate();

        st.close();

        if(filas == 0){

            throw new Exception("No existe préstamo");
        }

        PreparedStatement st2 = this.conexion.prepareStatement(
            "UPDATE libros SET disponibles = disponibles + 1 WHERE id_libro=?"
        );

        st2.setInt(1, prestamo.getId_libro());

        st2.executeUpdate();

        st2.close();

    } catch(Exception e) {

        throw e;

    } finally {

        this.Cerrar();
    }
}

    @Override
public List<Prestamos> listar() throws Exception {

    List<Prestamos> lista = new ArrayList<>();

    try {

        this.conectar();

        PreparedStatement st =
        this.conexion.prepareStatement(
            "SELECT * FROM prestamos"
        );

        ResultSet rs = st.executeQuery();

        while(rs.next()){

            Prestamos p = new Prestamos();

            p.setId_prestamo(rs.getInt("id_prestamo"));
            p.setId_usuario(rs.getInt("id_usuario"));
            p.setId_libro(rs.getInt("id_libro"));
            p.setFecha_prestamo(rs.getString("fecha_prestamo"));
            p.setFecha_devolucion(rs.getString("fecha_devolucion"));
            p.setEstado(rs.getString("estado"));

            lista.add(p);
        }

        rs.close();
        st.close();

    } catch(Exception e){

        throw e;

    } finally{

        this.Cerrar();
    }

    return lista;
}
    
}
