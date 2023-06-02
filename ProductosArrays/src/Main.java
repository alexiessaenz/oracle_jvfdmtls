import model.Orden;
import model.Producto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("camisa",12.5);
        Producto p2 = new Producto("camisa",12.5);
        Producto p3 = new Producto("camisa",12.5);
        Producto p4 = new Producto("camisa",12.5);
        Producto p5 = new Producto("camisa",12.5);
        Producto p6 = new Producto("camisa",12.5);
        Producto p7 = new Producto("camisa",12.5);
        Producto p8 = new Producto("camisa",12.5);
        Producto p9 = new Producto("camisa",12.5);
        Producto p10 = new Producto("camisa",12.5);
        Producto p11 = new Producto("camisa",12.5);

        Orden o1 = new Orden();
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);
        o1.agregarProductos(p1);

        o1.mostrarProducto();
    }
}