package com.company.VideoStore;

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

    public void solicitarPelicula(ArrayList<Pelicula> listaPeliculas, ArrayList<Cliente> listaClientes, String pelicula, String cliente){
        if(corroborarPelicula(listaPeliculas, pelicula)){
            if (corroborarStock(listaPeliculas,pelicula)!=0){
                /*if (corroborarCliente(listaClientes, cliente)){
                    System.out.println("Generando Boleta");
                }else {
                    crear();
                }*/
                System.out.println("TA LA PELI BREO");
            }else{
                System.out.println("No hay stock de la pelicula ingresada, lo sentimos\n");
            }
        }else{
            System.out.println("La pelicula ingresada no esta disponible\n");
        }
    }



}
