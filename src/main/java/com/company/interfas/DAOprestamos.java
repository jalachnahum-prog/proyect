
package com.company.interfas;

import com.mycompany.modelos.Prestamos;
import java.util.List;


public interface DAOprestamos {
    public void registrar(Prestamos usuario) throws Exception;
    public void modificar(Prestamos usuario) throws Exception;
    //public void eliminar(Prestamos usuario) throws Exception;
    public List<Prestamos> listar() throws Exception;
}