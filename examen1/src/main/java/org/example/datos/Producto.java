package org.example.datos;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public static int contadorProductos = 0;

    public Producto() {
//        if (contadorProductos < 10) {
//            this.id = ++contadorProductos;
//        }
        this.id = ++contadorProductos;

    }

    public Producto(String nombre, double precio) {
        this(); //llamo al construtor basio
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Para imprimir las caracteristicas
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                " nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
