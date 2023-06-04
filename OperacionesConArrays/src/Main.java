import dato.Orden;
import dato.Producto;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Camisa", 12.50);
        Producto p2 = new Producto("Pantalon", 16.50);
        Producto p3 = new Producto("Zapatos", 35.99);
        Producto p4 = new Producto("Short", 9.50);
        Producto p5 = new Producto("Toalla", 8.50);
        Producto p6 = new Producto("Pijama", 11.99);
        Producto p7 = new Producto("Corbata", 12.99);
        Producto p8 = new Producto("Pans", 10.99);
        Producto p9 = new Producto("Camiseta", 9.99);
        Producto p10 = new Producto("Tenis", 40.99);
        Producto p11 = new Producto("Blusa", 20.99);



       /* p1.setPrecio(10.00);//para cambiar datos
        String nombre= p1.getNombre();//
        System.out.println(p1+ " " + nombre);


        System.out.println(p2);
        System.out.println(p3);*/

        int contadorProductos = Producto.contadorProductos;
        System.out.println(contadorProductos);


        Orden orden1 = new Orden();//Estoy instaciando el arrays llamando el arrays


        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        orden1.agregarProducto(p4);
        orden1.agregarProducto(p5);
        orden1.agregarProducto(p6);
        orden1.agregarProducto(p7);
        orden1.agregarProducto(p8);
        orden1.agregarProducto(p9);
        orden1.agregarProducto(p10);
        orden1.agregarProducto(p11);

        Orden orden2 = new Orden();//Estoy instaciando el arrays llamando el arrays
        Orden orden3 = new Orden();//Estoy instaciando el arrays llamando el arrays
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p2);
        orden2.agregarProducto(p3);
        orden2.agregarProducto(p4);

        orden1.mostrarProductoArrays();
//        orden1.calcularTotalOrden();
        System.out.println("Total de Ordenes: " + Orden.nOrdenes);
        System.out.println("Total de pRODUCTOS: " + orden1.getContProductos());
        System.out.println("Total de la Orden " + orden1.getId() +": " + orden1.calcularTotalOrden());


    }
}