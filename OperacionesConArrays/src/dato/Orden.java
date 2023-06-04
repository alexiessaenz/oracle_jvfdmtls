package dato;

public class Orden {
    private int id;
    public static int nOrdenes =0;
    private Producto[ ] productos;

    static final int MAX_PRODUCTOS=10;
    private int contProductos =0;

    public Orden(){
        ++nOrdenes;
        ++this.id;
        productos=new Producto[10];
//        if (contProductos <= 10) {
//            ++this.id;
//            productos=new Producto[10];
//
//        }

    }

    public void agregarProducto(Producto p){
        if ( contProductos < MAX_PRODUCTOS){
            productos[this.contProductos++]=p;
        }else{
            System.out.println("Exceso de productos en la orden");
        }
    }
    public void mostrarProductoArrays(){
        System.out.println("Numero de orden: " + this.id);
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
