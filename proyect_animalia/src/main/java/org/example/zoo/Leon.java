package org.example.zoo;

public class Leon extends Felino{
    private Integer numManada;
    private Double potenciaRugidoDecibel;

    public Leon() {
        super();
    }

    public Leon(Double potenciaRugidoDecibel, Integer numManada,float tamanoGarras,Integer velocidad,
                String habitat, float altura, float largo,float peso ,  String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon caza junto a su grupo de " +
                + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El leon duerme en las estepas africanas";
    }

    @Override
    public String correr() {
        return "El leon corre a " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El leon ruge fuerte a " + potenciaRugidoDecibel + " decibeles";
    }

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(Float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String toString() {
        return "Leon{" +
                "numManada=" + numManada +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico=" + nombreCientifico +
                '}';
    }
}
