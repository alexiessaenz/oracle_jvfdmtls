package org.example.zoo;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo() {
    }

    public Lobo(String habitat, float altura, float largo, float peso, float nombreCientifico,
                String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + especieLobo + " caza junto a su grupo de " +
                numCamada + "individuos en los bosques de " + habitat;
    }

    @Override
    public String dormir() {
        return "El lobo " + color + " duerme en las cabernas de " + habitat;
    }

    @Override
    public String correr() {
        return "El lobo " + especieLobo + " corre en las llanuras atañadas a los bosques de " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + " " + color + " aulla en la luna llena";
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }
}
