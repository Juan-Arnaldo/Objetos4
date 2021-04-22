package com.company.VideoStore;

import com.company.Boleta.Boleta;
import com.company.Cliente.Cliente;
import com.company.Pelicula.Pelicula;
import static com.company.Main.crear;

import java.util.ArrayList;

public class VideoStore {
    private Pelicula pelicula[];
    private Cliente cliente[];

    public VideoStore(Pelicula pelicula[], Cliente cliente[]){
        this.pelicula = pelicula;
        this.cliente = cliente;
    }

    public void agregarPelicula(Pelicula aGuardar, ArrayList <Pelicula> listaPelicula){
        listaPelicula.add(aGuardar);
    }

    public void agregarCliente(Cliente aGuardar, ArrayList <Cliente> listaCliente){
        listaCliente.add(aGuardar);
    }

    public void solicitarPelicula(ArrayList<Pelicula> listaPeliculas, ArrayList<Cliente> listaClientes, String nombrePelicula, String nombreCliente){
        Cliente cliente = null;
        Pelicula pelicula = null;
        //pelicula = corroborarPelicula(listaPeliculas, nombrePelicula);
        if(pelicula != null){
            if (pelicula.getStock() > 0){
                //cliente = corroborarCliente(listaClientes, nombreCliente);
                if (cliente != null){
                    cliente.agregarBoleta(cliente.getBoletas(), new Boleta(cliente, pelicula));
                    pelicula.peliculaAlquilada(pelicula);
                }else {
                    cliente = crear();
                    cliente.agregarBoleta(cliente.getBoletas(), new Boleta(cliente, pelicula));
                    pelicula.peliculaAlquilada(pelicula);
                }
            }else{
                System.out.println("No hay stock de la pelicula ingresada, lo sentimos\n");
            }
        }else{
            System.out.println("La pelicula ingresada no esta disponible\n");
        }
    }

}
