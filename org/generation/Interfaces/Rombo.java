package org.generation.Interfaces;

/**
 * Rombo con lado y diagonales mayor y menor.
 */
public class Rombo implements FiguraGeometrica {

    private String nombre;
    private double lado;
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(String nombre, double lado,
                 double diagonalMayor, double diagonalMenor) {
        this.nombre = nombre;
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        // A = (D * d) / 2
        return (diagonalMayor * diagonalMenor) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // P = 4a
        return 4 * lado;
    }
}
