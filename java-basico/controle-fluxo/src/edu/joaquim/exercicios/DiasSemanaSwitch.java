package edu.joaquim.exercicios;

import java.util.Scanner;

public class DiasSemanaSwitch {
    public static void main(String[] args) {
        diasSemana();
        switchValor();
    }

    private static void diasSemana() {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = entradaDados.nextLine();

        switch (dia.toLowerCase()) {
            case "domingo":
                System.out.println("Dia 1");
                break;
            case "segunda":
                System.out.println("Dia 2");
                break;
            case "terca":
                System.out.println("Dia 3");
                break;
            case "quarta":
                System.out.println("Dia 4");
                break;
            case "quinta":
                System.out.println("Dia 5");
                break;
            case "sexta":
                System.out.println("Dia 6");
                break;
            case "sabado":
                System.out.println("Dia 7");
                break;

            default:
                System.out.println("Dia inválido.");
                break;
        }
    }

    private static void switchValor() {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite um valor entre 1 e 5: ");
        int valor = entradaDados.nextInt();

        switch (valor) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;

            case 4:
                System.out.println("Errado");
                break;

            case 5:
                System.out.println("Talvez.");
                break;

            default:
                System.out.println("Número inválido.");
                break;
        }
    }
}
