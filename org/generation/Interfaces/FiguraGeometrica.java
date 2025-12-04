package org.generation.Interfaces;

/**
 * Interfaz que define el "contrato" que deben cumplir
 * todas las figuras: deben poder calcular área y perímetro
 * y devolver su nombre.
 */
public interface FiguraGeometrica {

    String getNombre();

    double calcularArea();

    double calcularPerimetro();
}
