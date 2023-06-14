package org.example;

import org.example.almacen.Lacteo;
import org.example.almacen.Producto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setNombre("huevo");
        p.setPrecio(0.25);
        System.out.println("================ Producto ============");
        System.out.println(p);

        Lacteo l1 = new Lacteo();
        l1.setNombre("Queso");
        l1.setPrecio(1.10);
        l1.setCantidad(2);
        l1.setProteinas(25);
        System.out.println("================ Lacteos ============");
        System.out.println(l1);
    }
}