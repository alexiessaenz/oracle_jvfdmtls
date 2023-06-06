package org.example;

public class Automovil implements Comparable<Automovil>{
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;

    private Rueda ruedas[];

    private int indiceRuedas;

    private TipoAutomovil tipo;

    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";

    public Automovil(){
        this.id=++ultimoId;
        this.ruedas=new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante,modelo);
        this.color=color;
    }

    public Automovil(String fabricante, String modelo, Color color,Motor motor){
        this(fabricante,modelo,color);
        this.motor=motor;
    }
    public Automovil(String fabricante, String modelo, Color color,Motor motor,Estanque estanque){
        this(fabricante,modelo,color,motor);
        this.estanque=estanque;
    }
    public Automovil(String fabricante, String modelo, Color color,Motor motor,Estanque estanque,Persona conductor){
        this(fabricante,modelo,color,motor,estanque);
        this.conductor=conductor;
    }
    public Automovil(String fabricante, String modelo, Color color,
                     Motor motor,Estanque estanque,Persona conductor,Rueda rueda[]){
        this(fabricante,modelo,color,motor,estanque);
        this.ruedas=rueda;
        this.conductor=conductor;
    }

    @Override
    public int compareTo(Automovil o) {
        return 0;
    }
}
