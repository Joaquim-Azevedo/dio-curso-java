package com.estudos.polimorfismo.Funcionario;

class Gerente extends Funcionario {
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.15;
    }

}
