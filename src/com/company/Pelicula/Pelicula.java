package com.company.Pelicula;

import java.util.ArrayList;

public class Pelicula {

    private String genero;
    private String titulo;
    private String fechaLanzamiento;
    private double duracion;
    private String clasificacionAudiencia;
    private String paisOrigen;
    private String descripcion;
    private int stock;

    public Pelicula(String genero, String titulo, String fechaLanzamiento, double duracion, String clasificacionAudiencia, String paisOrigen, String descripcion, int stock) {
        this.genero = genero;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.clasificacionAudiencia = clasificacionAudiencia;
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
        this.stock = stock;
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

    public boolean corroborarPelicula(ArrayList<Pelicula> listaPeliculas, String pelicula){
        return listaPeliculas.contains(pelicula);
    }

    public int corroborarStock(ArrayList<Pelicula>  listaPeliculas, String pelicula){
        for (int i=0;i<listaPeliculas.size();i++) {

            if(listaPeliculas.get(i).titulo==pelicula){
                return stock;
            }
        }

        return 0;
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
}
