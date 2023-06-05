package org.example.datos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import static java.time.LocalDate.now;

public class Cliente {
    private int id=0;
    private String name;
    LocalDate fecha;
    public static int nOrdenes =0;
    private Producto[ ] productos;

    static final int MAX_PRODUCTOS=10;
    private int contProductos =0;

    public Cliente(){
        id = ++nOrdenes;
        productos=new Producto[1000];
//        if (contProductos <= 10) {
//            ++this.id;
//            productos=new Producto[10];
//
//        }
    }

    public void agregarProducto(Producto p){
            productos[this.contProductos++]=p;

    }
    public void mostrarProductoArrays(){
        fecha = LocalDate.now();
        SimpleDateFormat fechaSiemple= new SimpleDateFormat("yyyy-M-dd");
        System.out.println("Fecha: " + fecha);
        for (int i = 0; i < contProductos; i++) {
            System.out.println(productos[i]);
        }
//        for (Producto pro :productos) {
//            System.out.println(pro);
//        }
    }
    public double calcularTotalOrden(){
        double total=0.0;
        for (int i = 0; i < contProductos; i++) {
            total += productos[i].getPrecio();

        }
//        System.out.println("Total de la Orden : "+ total);
        return total;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContProductos() {
        return contProductos;
    }

    public void setContProductos(int contProductos) {
        this.contProductos = contProductos;
    }
}
