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

    private LocalDate fechaRetiro(){
        return LocalDate.now();
    }

    private LocalDate fechaDevolucion(){
        return LocalDate.now().plusMonths(1);
    }


}
