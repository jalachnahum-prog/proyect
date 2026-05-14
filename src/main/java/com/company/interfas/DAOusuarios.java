
package com.company.interfas;

import com.mycompany.modelos.Usuarios;
import java.util.List;


public interface DAOusuarios {
    public void registrar(Usuarios usuario) throws Exception;
    public void modificar(Usuarios usuario) throws Exception;
    public void eliminar(int usuarioId) throws Exception;
    public List<Usuarios> listar() throws Exception;
    public Usuarios getUsuarioById(int usuarioId) throws Exception;
    Usuarios obtenerPorId(int id) throws Exception;
}
