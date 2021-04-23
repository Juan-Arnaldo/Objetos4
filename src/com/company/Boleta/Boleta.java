package com.company.Boleta;

import com.company.Cliente.Cliente;
import com.company.Pelicula.Pelicula;

import java.time.LocalDate;

public class Boleta {
    //Atributos
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;
    private Cliente cliente;
    private Pelicula peliula;

    //Constructor
    public Boleta(Cliente cliente, Pelicula pelicula){
        this.fechaRetiro = fechaRetiro();
        this.fechaDevolucion = fechaDevolucion();
        this.cliente = cliente;
        this.peliula = pelicula;
    }

    //Getters
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

    //Retorna el dia
    private LocalDate fechaRetiro(){
        return LocalDate.now();
    }

    //Retorna el dia pero 1 mes dsp
    private LocalDate fechaDevolucion(){
        return LocalDate.now().plusMonths(1);
    }

    //ToString de Boleta
    public String toString() {
        return"Cliente: " + cliente.getNombre() +
                "\nNombre de pelicula: " + getPeliula().getTitulo() + "\tGenero: " + getPeliula().getGenero() +
                "\nFecha de retiro: " + getFechaRetiro() +
                "\nFecha de devolucion: " + getFechaDevolucion();
    }
}
