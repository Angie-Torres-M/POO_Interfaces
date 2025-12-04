package org.generation.Interfaces;

/**
 * Romboide (paralelogramo) con base y altura (tomamos base y lado como los 2 lados).
 */
public class Romboide implements FiguraGeometrica {

    private String nombre;
    private double base;
    private double lado; // lado oblicuo

    public Romboide(String nombre, double base, double lado) {
        this.nombre = nombre;
        this.base = base;
        this.lado = lado;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        // A = b * h -> aquí asumimos que lado es equivalente a la altura proyectada
        // o podrías cambiar la fórmula si tu profe lo definió distinto.
        return base * lado;
    }

    @Override
    public double calcularPerimetro() {
        // P = 2b + 2h (usamos base y lado)
        return 2 * base + 2 * lado;
    }
}
