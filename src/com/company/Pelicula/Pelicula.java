package com.company.Pelicula;

public class Pelicula {

    private String genero;
    private String titulo;
    private String fechaLanzamiento;
    private double duracion;
    private String clasificacionAudiencia;
    private String paisOrigen;
    private String descripcion;
    private int stock;
    private int alquiladas;

    public Pelicula(String genero, String titulo, String fechaLanzamiento, double duracion, String clasificacionAudiencia, String paisOrigen, String descripcion, int stock) {
        this.genero = genero;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.clasificacionAudiencia = clasificacionAudiencia;
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
        this.stock = stock;
        this.alquiladas = 0;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public double getDuracion() {
        return duracion;
    }

    public String getClasificacionAudiencia() {
        return clasificacionAudiencia;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public String toString() {
        return "Pelicula{" +
                "genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", duracion=" + duracion +
                ", clasificacionAudiencia='" + clasificacionAudiencia + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                '}';
    }

    public void peliculaAlquilada(Pelicula pelicula){
        pelicula.alquiladas += + 1;
    }
}
