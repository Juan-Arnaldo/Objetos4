package com.company.Cliente;

import com.company.Boleta.Boleta;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private double telefono;
    private String direccion;
    private ArrayList<Boleta> boletas;

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

    public ArrayList<Boleta> getBoletas() {
        return boletas;
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

    public void agregarBoleta(ArrayList<Boleta> listaBoletas, Boleta nueva){
        listaBoletas.add(nueva);
    }
}

