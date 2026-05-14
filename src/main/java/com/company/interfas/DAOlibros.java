
package com.company.interfas;

import com.mycompany.modelos.Libros;
import java.util.List;


public interface DAOlibros {
    public void registrar(Libros usuario) throws Exception;
    public void modificar(Libros usuario) throws Exception;
    public void eliminar(Libros usuario) throws Exception;
    public List<Libros> listar() throws Exception;
}