package com.estudos.polimorfismo.Funcionario;

/*
 * Crie uma classe Funcionario com atributos nome e salario. 
 * Crie classes Gerente e Desenvolvedor que herdam de Funcionario e 
 * adicionam comportamentos diferentes, como cálculo de bônus (calcularBonus()).
 */

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario meuFuncionario = new Funcionario("Jonas", 900.0);
        Funcionario meuGerente = new Gerente("Marcio", 1200.0);
        Funcionario meuDesenvolvedor = new Desenvolvedor("Joca", 1500.);

        meuFuncionario.exibirStatus();
        meuGerente.exibirStatus();
        meuDesenvolvedor.exibirStatus();

        // ou armazenar em Array e imprimir -- melhor jeito.

        Funcionario[] meusFuncionarios = { meuFuncionario, meuDesenvolvedor, meuGerente };

        for (Funcionario funcionario : meusFuncionarios) {
            funcionario.exibirStatus();
        }
    }
}
