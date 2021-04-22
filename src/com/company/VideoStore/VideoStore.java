package com.company.VideoStore;

import com.company.Boleta.Boleta;
import com.company.Cliente.Cliente;
import com.company.Pelicula.Pelicula;


import java.util.ArrayList;
import java.util.Scanner;


public class VideoStore {
    private static ArrayList <Pelicula> listaPelicula = new ArrayList();
    private static ArrayList <Cliente> listaCliente = new ArrayList();
    static Scanner input = new Scanner(System.in);


    public void alquilarPelicula(String pelicula, String cliente, String direccion, double telefono){
        loteDePelis(); //BODEGA DE PELICULAS Y CLIENTES
        loteDeClientes();

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
        Pelicula resultadopeli = null;
        resultadopeli=corroborarPelicula(pelicula); //SI LA PELICULA EXISTE, RETORNA LA PELICULA, CASO CONTRARIO, RETORNA NULL Y NO ENTRA AL IF
        if(resultadopeli!= null){
            System.out.println("TA LA PELI BREO");
            if (corroborarStock(resultadopeli)>0){ //CORROBORARSTOCK SOLAMENTE RETORNA EL STOCK DE LA PELICULA RECIBIDA POR PARAMETRO, SI ES 0 ENTONCES NO TIENE NI MIERDA
                System.out.println("TIENE STOCK BREO BREO");
                Cliente resultadocliente = null;
                resultadocliente=corroborarCliente(cliente,direccion,telefono); //LO IGUALAMOS AL RETORNO DE ESTA FUNCION XQ EN EL CASO DE QUE RETORNE UN TIPO CLIENTE, NO SE LO PUEDE COMPARAR CON UN BOOLEANO, LO MISMO PASO CON PELICULA
                if (resultadocliente!= null){
                    System.out.println("Generando Boleta");
                    resultadopeli.toString();
                    resultadocliente.toString();
                }else {
                    System.out.println("NO EXISTE EL CLIENTE BREO");
                    System.out.println("Desea crear el cliente? s/n");
                    String flag=input.next();
                    if(flag=="s"){
                        crearCliente();
                    }


                }

            }else{
                System.out.println("No hay stock de la pelicula ingresada, lo sentimos\n");
            }
        }else{
            System.out.println("La pelicula ingresada no esta disponible\n");
            System.out.println("Desea crear la pelicula? s/n");
            String flag=input.next();
            if(flag=="s"){
                crearPelicula();
            }
            else
                System.out.println("OKA BREO, NO HAY DRAMA");
        }
    }


    public static Pelicula corroborarPelicula(String titulaso) {
        Pelicula resultado = null;
        for (Pelicula pelicula : listaPelicula) {
            if (pelicula.getTitulo().equals(titulaso)) {
                resultado = pelicula;
                break;
            }
        }
        return resultado;
    }

    public int corroborarStock(Pelicula pelicula){
        return pelicula.getStock();
    }

    public Cliente corroborarCliente(String nombre,String direccion, double telefono){
        Cliente resultado = null;
        for (Cliente cliente : listaCliente) {  //RECORRE EL ARREGLO DE CLIENTES
            if ((cliente.getNombre().equals(nombre))&&(cliente.getDireccion().equals(direccion))&&(cliente.getTelefono()==telefono)) { //EQUALS SE REFIERE ES COMO EL ==
                resultado = cliente;
                break;
            }
        }
        return resultado;
    }

    public void crearPelicula(){

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

    public void crearCliente(){

        String nombre, direccion;
        double telefono;

        System.out.println("nombre:");
        nombre= input.next();
        System.out.println("telefono:");
        telefono = input.nextDouble();
        System.out.println("direccion:");
        direccion = input.next();

        Cliente cliente= new Cliente(nombre,telefono,direccion);

        listaCliente.add(cliente);
        System.out.println("cliente creado!");

    }

    public void loteDePelis(){
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


    public void loteDeClientes(){
        Cliente clienteaux= new Cliente("sana",223,"matienzo");
        listaCliente.add(clienteaux);
        Cliente clienteaux2= new Cliente("pepe",223,"villa del parque");
        listaCliente.add(clienteaux2);
        Cliente clienteaux3= new Cliente("juan",223,"luro");
        listaCliente.add(clienteaux3);
        Cliente clienteaux4= new Cliente("mina",223,"repetto");
        listaCliente.add(clienteaux4);
        Cliente clienteaux5= new Cliente("momo",223,"ruta 2");
        listaCliente.add(clienteaux5);

    }

}
