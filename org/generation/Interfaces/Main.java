package org.generation.Interfaces;

/**
 * Clase Main: crea varias figuras y
 * muestra área y perímetro de cada una.
 */
public class Main {

    public static void main(String[] args) {

        FiguraGeometrica[] figuras = new FiguraGeometrica[] {
            new Triangulo("Triángulo", 10, 6, 7),
            new Cuadrado("Cuadrado", 5),
            new Rectangulo("Rectángulo", 8, 4),
            new Rombo("Rombo", 6, 10, 8),
            new Romboide("Romboide", 7, 5),
            new Trapecio("Trapecio", 10, 6, 4, 5, 3)
        };

        imprimirFiguras(figuras);
    }

    public static void imprimirFiguras(FiguraGeometrica[] figuras) {

        System.out.println("+------------------------------------------------------+");

        for (FiguraGeometrica f : figuras) {
            System.out.println("Figura: " + f.getNombre());
            System.out.println("  Área: " + f.calcularArea());
            System.out.println("  Perímetro: " + f.calcularPerimetro());
            System.out.println("+------------------------------------------------------+");
        }
    }
}
