package com.estudos.abstracao.FormasGeometricas;

class Quadrado extends Forma {
    private double lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
