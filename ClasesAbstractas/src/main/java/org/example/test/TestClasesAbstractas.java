package org.example.test;

import org.example.domain.FiguraGeometrica;
import org.example.domain.Retangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        FiguraGeometrica fg = new Retangulo("Rectangulo");
        fg.dibujar();
    }
}
