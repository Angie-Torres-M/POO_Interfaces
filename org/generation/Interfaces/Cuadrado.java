package org.generation.Interfaces;

/**
 * Cuadrado de lado 'a'.
 */
public class Cuadrado implements FiguraGeometrica {

    private String nombre;
    private double lado;

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        // A = a^2
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        // P = 4a
        return 4 * lado;
    }
}
