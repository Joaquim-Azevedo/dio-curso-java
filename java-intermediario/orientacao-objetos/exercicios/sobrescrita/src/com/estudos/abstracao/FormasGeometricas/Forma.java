package com.estudos.abstracao.FormasGeometricas;

public abstract class Forma {
    public abstract double calcularArea();

    public void exibirArea() {
        System.out.println("Área: " + calcularArea());
    }

}
