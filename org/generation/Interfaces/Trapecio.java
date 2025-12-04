package org.generation.Interfaces;

/**
 * Trapecio con base mayor, base menor,
 * dos lados no paralelos y la altura.
 */
public class Trapecio implements FiguraGeometrica {

    private String nombre;
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;
    private double altura;

    public Trapecio(String nombre, double baseMayor, double baseMenor,
                    double lado1, double lado2, double altura) {
        this.nombre = nombre;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        // A = h (B + b) / 2
        return altura * (baseMayor + baseMenor) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // P = B + b + lado1 + lado2
        return baseMayor + baseMenor + lado1 + lado2;
    }
}
