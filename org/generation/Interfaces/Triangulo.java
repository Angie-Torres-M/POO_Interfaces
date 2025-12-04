package org.generation.Interfaces;

/**
 * Triángulo con base, altura y un lado (lo tomamos equilátero para que
 * el perímetro sea lado * 3). Implementa FiguraGeometrica.
 */
public class Triangulo implements FiguraGeometrica {

    private String nombre;
    private double base;
    private double altura;
    private double lado;

    public Triangulo(String nombre, double base, double altura, double lado) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        // A = (b * h) / 2
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Triángulo equilátero: P = 3 * lado
        return lado * 3;
    }
}
