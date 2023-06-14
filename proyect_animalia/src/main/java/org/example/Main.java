package org.example;

import org.example.zoo.Leon;
import org.example.zoo.Lobo;
import org.example.zoo.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero mamiferos[] = new Mamifero[6];
        Mamifero leon = new Leon(120d,5,7.5f,58,
                "Sur Africa",120, 220,190,"felinusLeonis");
        Leon le = new Leon();
        le.setNumManada(5);
        System.out.println(le.comer());

        Lobo lo = new Lobo();
        lo.setEspecieLobo("gris");
        lo.setNumCamada(4);
        lo.setHabitat("norte");

        System.out.println(lo.comer());
    }
}