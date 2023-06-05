package org.example;

import org.example.datos.Cliente;
import org.example.datos.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int contadorProductos = Producto.contadorProductos;
        System.out.println(contadorProductos);


        Cliente orden1 = new Cliente();//Estoy instaciando el arrays llamando el arrays
        orden1.setName("Jacob");
        Producto p1o1  = new Producto("Camisa", 12.50);
        Producto p2o1  = new Producto("Pantalon", 16.50);
        Producto p3o1  = new Producto("Zapatos", 35.99);
        Producto p4o1  = new Producto("Short", 9.50);
        Producto p5o1  = new Producto("Toalla", 8.50);
        Producto p6o1  = new Producto("Pijama", 11.99);
        Producto p7o1  = new Producto("Corbata", 12.99);
        Producto p8o1  = new Producto("Pans", 10.99);
        Producto p9o1  = new Producto("Camiseta", 9.99);
        Producto p10o1 = new Producto("Tenis", 40.99);
        Producto p11o1 = new Producto("Blusa", 20.99);
        orden1.agregarProducto(p1o1 );
        orden1.agregarProducto(p2o1 );
        orden1.agregarProducto(p3o1 );
        orden1.agregarProducto(p4o1 );
        orden1.agregarProducto(p5o1 );
        orden1.agregarProducto(p6o1 );
        orden1.agregarProducto(p7o1 );
        orden1.agregarProducto(p8o1 );
        orden1.agregarProducto(p9o1 );
        orden1.agregarProducto(p10o1);
        orden1.agregarProducto(p11o1);


        Cliente orden2 = new Cliente();//Estoy instaciando el arrays llamando el arrays
        orden2.setName("Kenia");
        Producto p1o2 = new Producto("Camisa", 12.50);
        Producto p2o2 = new Producto("Pantalon", 16.50);
        Producto p3o2 = new Producto("Zapatos", 35.99);
        Producto p4o2 = new Producto("Short", 9.50);
        orden2.agregarProducto(p1o2);
        orden2.agregarProducto(p2o2);
        orden2.agregarProducto(p3o2);
        orden2.agregarProducto(p4o2);

        Cliente orden3 = new Cliente();//Estoy instaciando el arrays llamando el arrays
        orden3.setName("Moises");
        Producto pr1 = new Producto("Camisa", 12.00);
        Producto pr2 = new Producto("Pantalon", 16.50);
        Producto pr3 = new Producto("Zapatos", 35.90);
        Producto pr4 = new Producto("Short", 9.50);
        Producto pr5 = new Producto("Toalla", 8.50);
        Producto pr6 = new Producto("Pijama", 11.00);
        orden3.agregarProducto(pr1);
        orden3.agregarProducto(pr2);
        orden3.agregarProducto(pr3);
        orden3.agregarProducto(pr4);
        orden3.agregarProducto(pr5);
        orden3.agregarProducto(pr6);

        System.out.println("\n|======== prods ord 1 =========|");
        System.out.println("Nombre de cliente: " + orden1.getName());
        orden1.mostrarProductoArrays();
        System.out.println("Nº de Productos de la orden 1: " + orden1.getContProductos());
        System.out.println("Total de la Orden " + orden1.getId() +": " + orden1.calcularTotalOrden());
        System.out.println("|===========================|\n\n");

        System.out.println("======== prods ord 2 ========="); //apertura
        System.out.println("Nombre de cliente: " + orden2.getName());
        orden2.mostrarProductoArrays();
        System.out.println("Nº de de Productos de la orden 2: " + orden2.getContProductos());
        System.out.println("Total de la Orden " + orden2.getId() +": " + orden2.calcularTotalOrden());
        System.out.println("|===========================|\n\n"); //cierre

        System.out.println("======== prods ord 3 =========");
        System.out.println("Nombre de cliente: " + orden3.getName());
        orden3.mostrarProductoArrays();
        System.out.println("Nª de Productos de la orden 3: " + orden3.getContProductos());
        System.out.println("Total de la Orden " + orden3.getId() +": " + orden3.calcularTotalOrden());
        System.out.println("|===========================|\n\n");

        System.out.println("Total de Ordenes: " + Cliente.nOrdenes);




    }




}