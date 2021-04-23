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

    public VideoStore(ArrayList<Cliente> listaCliente, ArrayList<Pelicula> listaPelicula) {
        this.Listacliente = listaCliente;
        this.Listapelicula = listaPelicula;
    }

    public ArrayList<Pelicula> getListapelicula() {
        return Listapelicula;
    }

    public ArrayList<Cliente> getListacliente() {
        return Listacliente;
    }

    public void solicitarPelicula(ArrayList<Pelicula> listaPeliculas, ArrayList<Cliente> listaClientes, String nombrePelicula, double telefonoCliente) {
        Cliente cliente = null;
        Pelicula pelicula = null;
        pelicula = corroborarPelicula(listaPeliculas, nombrePelicula); //Corroboro la pelicula y en caso de ser valida la devuelvo
        if (pelicula != null) {
            if (pelicula.getStock() > 0) {
                cliente = corroborarCliente(listaClientes, telefonoCliente); // Corroboro el cliente y en caso de ser valido lo devuelvo
                if (cliente != null) {
                    Boleta nuevaBoleta = new Boleta(cliente, pelicula); // Se crea la boleta
                    cliente.agregarBoleta(cliente.getBoletas(), nuevaBoleta);
                    pelicula.peliculaAlquilada(pelicula);
                } else {
                    cliente = crear(); // En caso que el cliente no exista, se crea y se crea la boleta
                    listaClientes.add(cliente);
                    Boleta nuevaBoleta = new Boleta(cliente, pelicula);
                    cliente.agregarBoleta(cliente.getBoletas(), nuevaBoleta);
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
                if(boleta.getFechaDevolucion().isAfter(LocalDate.now())){
                    System.out.println(boleta.toString());
                }
            }
        }
    }

    public static void mostrarTitulos(ArrayList<Pelicula> listaPelicula){
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void alquileresLimite(ArrayList<Cliente> listaCliente){
        for(Cliente cliente : listaCliente){
            for (Boleta boleta : cliente.getBoletas()){
                if(boleta.getFechaDevolucion().isEqual(LocalDate.now())){
                    System.out.println(boleta.toString());
                }
            }
        }
    }

    public void peliculasMasAlquilada(ArrayList<Pelicula> listaPelicula){
        Pelicula mayor = listaPelicula.get(0);
        for (Pelicula pelicula : listaPelicula){
            if (mayor.getAlquiladas() < pelicula.getAlquiladas()){
                mayor = pelicula;
            }
        }
        System.out.println(mayor.toString());
    }

    public void consultaAlquileres(Cliente cliente){
        for (Boleta boleta : cliente.getBoletas()){
            System.out.println(boleta.toString());
        }
    }

}
