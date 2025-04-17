package com.estudos.polimorfismo.Funcionario;

public class Funcionario {
    public String nome;
    public Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.1;
    }

    public void exibirStatus() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }

}
