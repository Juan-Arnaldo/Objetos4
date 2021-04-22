package com.company;

import com.company.Boleta.Boleta;
import com.company.Cliente.Cliente;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import com.company.Pelicula.Pelicula;
import com.company.VideoStore.VideoStore;

public class Main {

    public static void main(String[] args){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        VideoStore tiendaRoberto = new VideoStore(listaClientes, listaPeliculas);
        Scanner sc = new Scanner(System.in);

        //loteDeClientes(tiendaRoberto.getListacliente());
        loteDePelis(tiendaRoberto.getListapelicula());

        int opc;

        do{
            System.out.println("\tVideoStore de Roberto\n\n");
            System.out.println("1. Alquilar pelicula");
            System.out.println("2. Alquileres Vigentes");
            System.out.println("3. Pelicula mas alquilada");
            System.out.println("\n0. Salir");

            System.out.println("Ingrese la opcion que quiera: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    tiendaRoberto.solicitarPelicula(tiendaRoberto.getListapelicula(), tiendaRoberto.getListacliente(),  "dbz", 000);
                    break;
                case 2:
                    tiendaRoberto.alquileresVigente(tiendaRoberto.getListacliente());
                    break;
                case 3:
                    tiendaRoberto.peliculasMasAlquilada(tiendaRoberto.getListapelicula());
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opcion ingresada no existe");
                    break;
            }
        }while(opc != 0);
    }

    public void crearPelicula(ArrayList<Pelicula> listaPelicula){
        Scanner input = new Scanner(System.in);
        String genero, titulo, fechaLanzamiento, clasificacionAudiencia, paisOrigen, descripcion;
        double duracion;
        int stock;
        System.out.println("titulo:");
        titulo= input.next();
        System.out.println("genero:");
        genero = input.next();
        System.out.println("fecha de lanzamiento:");
        fechaLanzamiento = input.next();
        System.out.println("duracion:");
        duracion = input.nextDouble();
        System.out.println("clasificacion de audiencia:");
        clasificacionAudiencia = input.next();
        System.out.println("pais de origen:");
        paisOrigen = input.next();
        System.out.println("descripcion:");
        descripcion = input.next();
        System.out.println("stock:");
        stock = input.nextInt();

        Pelicula pelicula= new Pelicula(genero,titulo,fechaLanzamiento,duracion,clasificacionAudiencia,paisOrigen,descripcion,stock);

        listaPelicula.add(pelicula);
        System.out.println("pelicula creada!");
    }

    public static Cliente crear() {
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
    }

    public static void loteDePelis(ArrayList<Pelicula> listaPelicula){
        Pelicula peli = new Pelicula("apt","dbz","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli);
        Pelicula peli2 = new Pelicula("apt","duro de matar","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli2);
        Pelicula peli3 = new Pelicula("apt","twilight","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli3);
        Pelicula peli4 = new Pelicula("apt","megamente","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli4);
        Pelicula peli5 = new Pelicula("apt","mulan","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli5);
        Pelicula peli6 = new Pelicula("apt","insidius","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli6);
        Pelicula peli7 = new Pelicula("apt","cosmos","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli7);
        Pelicula peli8 = new Pelicula("apt","la peli que te comiste jaja","1996",200,"19","Bolivia","Buena peli para mirarla con la rata en la mano",3);
        listaPelicula.add(peli8);
    }



   public static void loteDeClientes(ArrayList<Cliente> listaCliente){
        Cliente clienteaux= new Cliente("sana",123,"matienzo");
        listaCliente.add(clienteaux);
        Cliente clienteaux2= new Cliente("pepe",321,"villa del parque");
        listaCliente.add(clienteaux2);
        Cliente clienteaux3= new Cliente("juan",113,"luro");
        listaCliente.add(clienteaux3);
        Cliente clienteaux4= new Cliente("mina",331,"repetto");
        listaCliente.add(clienteaux4);
        Cliente clienteaux5= new Cliente("momo",223,"ruta 2");
        listaCliente.add(clienteaux5);
    }

}
