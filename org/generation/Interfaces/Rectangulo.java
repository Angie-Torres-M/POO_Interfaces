package org.generation.Interfaces;

/**
 * Rectángulo con base y altura.
 */
public class Rectangulo implements FiguraGeometrica {

    private String nombre;
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        // A = b * h
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // P = 2b + 2h
        return 2 * base + 2 * altura;
    }
}
