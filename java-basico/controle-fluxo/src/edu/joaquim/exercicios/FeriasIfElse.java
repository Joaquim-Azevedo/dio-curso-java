package edu.joaquim.exercicios;

import java.util.Scanner;

public class FeriasIfElse {
    public static void main(String[] args) {
        masPraticas();
        boasPraticas();
    }

    private static void masPraticas() {
        System.out.println("Más práticas:");

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o número do mês.");
        int mes = entradaDados.nextInt();

        // Péssimas práticas
        if (mes == 1) {
            System.out.println("O mês correspondente é: Janeiro");
        } else if (mes == 2) {
            System.out.println("O mês correspondente é: Fevereiro");
        } else if (mes == 3) {
            System.out.println("O mês correspondente é: Março");
        } else if (mes == 4) {
            System.out.println("O mês correspondente é: Abril");
        } else if (mes == 5) {
            System.out.println("O mês correspondente é: Maio");
        } else if (mes == 6) {
            System.out.println("O mês correspondente é: Junho");
        } else if (mes == 7) {
            System.out.println("O mês correspondente é: Julho");
        } else if (mes == 8) {
            System.out.println("O mês correspondente é: Agosto");
        } else if (mes == 9) {
            System.out.println("O mês correspondente é: Setembro");
        } else if (mes == 10) {
            System.out.println("O mês correspondente é: Outubro");
        } else if (mes == 11) {
            System.out.println("O mês correspondente é: Novembro");
        } else {
            System.out.println("O mês correspondente é: Dezembro");
        }

        if (mes == 1 || mes == 7 || mes == 12) {
            System.out.println("Você está de férias! Mês: " + mes);
        }
    }

    private static void boasPraticas() {
        System.out.println("Boas práticas:");

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o número do mês.");
        int mes = entradaDados.nextInt();

        // Jeito correto e boas práticas.
        switch (mes) {
            case 1:
                System.out.println("O mês correspondente é: Janeiro");
                break;

            case 2:
                System.out.println("O mês correspondente é: Fevereiro");
                break;

            case 3:
                System.out.println("O mês correspondente é: Março");
                break;

            case 4:
                System.out.println("O mês correspondente é: Abril");
                break;

            case 5:
                System.out.println("O mês correspondente é: Maio");
                break;

            case 6:
                System.out.println("O mês correspondente é: Junho");
                break;

            case 7:
                System.out.println("O mês correspondente é: Julho");
                break;

            case 8:
                System.out.println("O mês correspondente é: Agosto");
                break;

            case 9:
                System.out.println("O mês correspondente é: Setembro");
                break;

            case 10:
                System.out.println("O mês correspondente é: Outubro");
                break;

            case 11:
                System.out.println("O mês correspondente é: Novembro");
                break;

            case 12:
                System.out.println("O mês correspondente é: Dezembro");
                break;

            default:
                System.out.println("Mês/Número inválido.");
                break;
        }

        if (mes == 1 || mes == 7 || mes == 12) {
            System.out.println("Férias");
        }
    }
}
