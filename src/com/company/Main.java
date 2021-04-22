package com.company;

import com.company.Cliente.Cliente;

import java.util.Scanner;
import com.company.Pelicula.Pelicula;
import com.company.VideoStore.VideoStore;

public class Main {

    public static void main(String[] args){

    public static Cliente crear(){
        Scanner sc = new Scanner(System.in);
        String nombre, direccion;
        double telefono;

        System.out.println("Ingrese el nombre del cliente: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese la direccion del cliente: ");
        direccion = sc.nextLine();

        System.out.println("Ingrese el telefono del cliente: ");
        telefono = sc.nextDouble();

        Cliente cliente = new Cliente(nombre, telefono, direccion);
        return cliente;

    VideoStore tiendaRoberto = new VideoStore();
    tiendaRoberto.alquilarPelicula("megamente","mina","repetto",223);
    }
}
