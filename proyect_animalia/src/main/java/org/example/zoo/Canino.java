package org.example.zoo;

public abstract class Canino extends Mamifero{
    protected String color;
    protected float tamanoColmillos;

    public Canino() {
        super();
    }

    public Canino(String habitat, float altura, float largo, float peso,
                  float nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    @Override
    public String toString() {
        return "Canino{" +
                "color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico=" + nombreCientifico +
                '}';
    }
}
