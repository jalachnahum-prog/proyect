
package com.mycompany.modelos;


public class Prestamos {
    private int id_prestamos;
    private int id_usuario;
    private int id_libro;
    private String fecha_prestamo;
    private String fecha_devolucion;
    private String estado;

    public void setId_prestamos(int id_prestamos) {
        this.id_prestamos = id_prestamos;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_prestamos() {
        return id_prestamos;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public int getId_libro() {
        return id_libro;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public String getEstado() {
        return estado;
    }
}
