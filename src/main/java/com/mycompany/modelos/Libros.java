package com.mycompany.modelos;


public class Libros {
    private int id_libro;
    private String titulo;
    private String fecha_publicacion;
    private String autor;
    private String categoria;
    private String edicion;
    private String idioma;
    private int paginas;
    private String descripcion;
    private int disponibles;
    private int ejemplares;

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getId_libro() {
        return id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public int getEjemplares() {
        return ejemplares;
    }
}
