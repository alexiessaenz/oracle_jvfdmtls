package model;

import java.util.ArrayList;

public class Orden {
    private Integer id;

    ArrayList<Producto> productosList;
    Producto productos[];

    static final int MAX_PRODUCTS = 10;
    private int contadorProductos = 0;

    public Orden() {
        ++this.id;
        productos = new Producto[10];
    }
    public void agregarProductos(Producto p){
        if (contadorProductos < MAX_PRODUCTS) {
            this.productos[this.contadorProductos++]=p;
        } else {
            System.out.println("Error: exceso de productos en la orden.");
        }
        productosList.add(p);
    }


    public void  mostrarProducto(){
        for (Producto p :
                productos) {
            System.out.println(p);
        }

//        productosList.forEach();
//        System.out.println(productosList);
    }
}
