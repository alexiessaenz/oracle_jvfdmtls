package org.example.domain;

public class Retangulo extends FiguraGeometrica{
    public Retangulo() {
        super();
    }

    public Retangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
