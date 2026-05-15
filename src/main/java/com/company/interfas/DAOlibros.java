
package com.company.interfas;

import com.mycompany.modelos.Libros;
import java.util.List;


public interface DAOlibros {
    public void registrar(Libros libros) throws Exception;
    public void modificar(Libros libros) throws Exception;
    public void eliminar(int idLibros) throws Exception;
    public List<Libros> listar() throws Exception;
    Libros obtenerPorId(int id) throws Exception;
    void actualizar(Libros libros) throws Exception;
    public List<Libros> buscar(String texto) throws Exception;
}