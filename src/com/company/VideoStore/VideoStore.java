package com.company.VideoStore;

import com.company.Boleta.Boleta;
import com.company.Cliente.Cliente;
import com.company.Pelicula.Pelicula;


import java.time.LocalDate;
import java.util.ArrayList;

import static com.company.Main.crear;

public class VideoStore {
    private ArrayList<Pelicula> Listapelicula;
    private ArrayList<Cliente> Listacliente;

    public void VideoStore(ArrayList<Cliente> listacliente, ArrayList<Pelicula> listapelicula) {
        this.Listacliente = listacliente;
        this.Listapelicula = listapelicula;
    }

    public void solicitarPelicula(ArrayList<Pelicula> listaPeliculas, ArrayList<Cliente> listaClientes, String nombrePelicula, double telefonoCliente) {
        Cliente cliente = null;
        Pelicula pelicula = null;
        pelicula = corroborarPelicula(listaPeliculas, nombrePelicula);
        if (pelicula != null) {
            if (pelicula.getStock() > 0) {
                cliente = corroborarCliente(listaClientes, telefonoCliente);
                if (cliente != null) {
                    cliente.agregarBoleta(cliente.getBoletas(), new Boleta(cliente, pelicula));
                    pelicula.peliculaAlquilada(pelicula);
                } else {
                    cliente = crear();
                    cliente.agregarBoleta(cliente.getBoletas(), new Boleta(cliente, pelicula));
                    pelicula.peliculaAlquilada(pelicula);
                }
            } else {
                System.out.println("No hay stock de la pelicula ingresada, lo sentimos\n");
            }
        } else {
            System.out.println("La pelicula ingresada no esta disponible\n");
           /*System.out.println("Desea crear la pelicula? s/n");
            String flag=input.next();
            if(flag=="s"){
                crearPelicula();
            }
            else
                System.out.println("OKA BREO, NO HAY DRAMA");*/
        }
    }


    public Pelicula corroborarPelicula(ArrayList<Pelicula> listaPelicula, String titulaso) {
        Pelicula resultado = null;
        for (Pelicula pelicula : listaPelicula) {
            if (pelicula.getTitulo().equals(titulaso)) {
                resultado = pelicula;
                break;
            }
        }
        return resultado;
    }

    public Cliente corroborarCliente(ArrayList<Cliente> listaCliente, double telefono) {
        Cliente resultado = null;
        for (Cliente cliente : listaCliente) {  //RECORRE EL ARREGLO DE CLIENTES
            if (cliente.getTelefono() == telefono) { //EQUALS SE REFIERE ES COMO EL ==
                resultado = cliente;
                break;
            }
        }
        return resultado;
    }

    public void alquileresVigente(ArrayList<Cliente> listaCliente){
        for(Cliente cliente : listaCliente){
            for (Boleta boleta : cliente.getBoletas()){
                if(boleta.getFechaDevolucion() == LocalDate.now()){
                    System.out.println(boleta.toString(cliente, boleta.getPeliula()));
                }
            }
        }
    }

}
