package org.example;

public enum TipoAutomovil {
    SEDAN("Sedan","Auto mediano", 4),
    STATION_WAGON("Station wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeno", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGO("Furgon", "Auto utilitario", 3),
    SUV("SUV", "Todo terreno deportivo", 5);

    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
