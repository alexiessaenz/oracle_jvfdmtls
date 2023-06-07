package org.example;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("marillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris obscuro"),
    NARANJO("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
