package com.company.Boleta;

import com.company.Cliente.Cliente;
import com.company.Pelicula.Pelicula;

import java.time.LocalDate;

public class Boleta {
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;
    private Cliente cliente;
    private Pelicula peliula;

    public Boleta(Cliente cliente, Pelicula pelicula){
        this.fechaRetiro = fechaRetiro();
        this.fechaDevolucion = fechaDevolucion();
        this.cliente = cliente;
        this.peliula = pelicula;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPeliula() {
        return peliula;
    }

    private LocalDate fechaRetiro(){
        return LocalDate.now();
    }

    private LocalDate fechaDevolucion(){
        return LocalDate.now().plusMonths(1);
    }

    public String toString(Cliente cliente, Pelicula pelicula) {
        return"Cliente: " + cliente.getNombre() +
                "\nNombre de pelicula: " + pelicula.getTitulo() + "Genero: " + pelicula.getGenero() +
                "\nFecha de retiro: " + getFechaRetiro() +
                "\nFecha de devolucion: " + getFechaDevolucion();
    }
}
