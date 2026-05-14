
package com.mycompany.modelos;


public class Usuarios {
    private int id_usuario;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String domicilio;
    private String telefono;
    private int sanciones;
    private int dinero_sancion;

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSanciones(int sanciones) {
        this.sanciones = sanciones;
    }

    public void setDinero_sancion(int dinero_sancion) {
        this.dinero_sancion = dinero_sancion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getSanciones() {
        return sanciones;
    }

    public int getDinero_sancion() {
        return dinero_sancion;
    }
    
}
