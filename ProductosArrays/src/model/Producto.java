package model;

public class Producto {
    private Integer id;
    private String nombre;
    private Double precio;
    public static Integer contadordeproductos=0;

    public Producto(Integer id, String nombre, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
        this.id= ++contadordeproductos;
    }

    public Producto(String camisa, double v) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public static Integer getContadordeproductos() {
        return contadordeproductos;
    }

    public static void setContadordeproductos(Integer contadordeproductos) {
        Producto.contadordeproductos = contadordeproductos;
    }
    public static void contadordeproductos() {
        ++Producto.contadordeproductos;
    }
}
