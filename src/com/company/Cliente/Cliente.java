package com.company.Cliente;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private double telefono;
    private String direccion;

    public Cliente(String nombre, double telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean corroborarCliente(ArrayList<Cliente> listaClientes, String cliente){
        return listaClientes.contains(cliente);
    }

    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}

