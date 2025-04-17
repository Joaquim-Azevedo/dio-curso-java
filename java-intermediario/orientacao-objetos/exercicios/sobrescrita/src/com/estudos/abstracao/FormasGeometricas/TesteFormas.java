package com.estudos.abstracao.FormasGeometricas;

/*
 * Crie uma classe Forma com um método calcularArea(). 
 * Implemente classes Circulo, Quadrado e Triangulo, 
 * cada uma com sua fórmula para calcular a área.
 */
public class TesteFormas {
    public static void main(String[] args) {
        Forma meuCirculo = new Circulo(3);
        Forma meuQuadrado = new Quadrado(2);
        Forma meuTriangulo = new Triangulo(5, 4);

        Forma[] formas = { meuCirculo, meuQuadrado, meuTriangulo };

        for (Forma forma : formas) {
            forma.exibirArea();
        }
    }
}
