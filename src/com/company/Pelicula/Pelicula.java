package com.company.Pelicula;

enum genero{
    Acción, Aventura, Comedia,
    Drama, Horror , Documenta
}
enum clasificacionAudiencia{
    G, //(Apta para todos los públicos)
    PG, //(Sugiere la compañía de un adulto para los menores de 10 años)
    PG13, //(Sugiere la compañía de un adulto para los menores de 13 años)
    R ,//(Restringido a menores de 17 años si no es con la compañía de un adulto)
    NC17, //(Contenido sólo para mayores de 18 años)
    UNRATED //(Películas que no han pasado el proceso de calificación)

}

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

    public int getAlquiladas() {
        return alquiladas;
    }

    public String toString() {
        return "Titulo: " + getTitulo() +
                "\nGenero: " + getGenero() +
                "\nDuracion: " + getDuracion() +
                "\nFecha de lanzamiento: " + getFechaLanzamiento() +
                "\nPais de origen: " + getPaisOrigen() +
                "\nDescripcion: " + getDescripcion();

    }

    public void peliculaAlquilada(Pelicula pelicula){
        pelicula.alquiladas += + 1;
    }
}
