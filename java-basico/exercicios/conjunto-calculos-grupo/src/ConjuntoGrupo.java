/*
Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo; <-->
b. média de altura dos homens;
c. o número de mulheres. <-->
*/

import java.util.Scanner;

public class ConjuntoGrupo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sexo;
        double altura, somaH = 0, maiorAltura = 0, menorAltura = 10;
        int qtdHomens = 0, qtdMulheres = 0;

        System.out.println("Digite os dados de cada pessoa: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o sexo (m/f): ");
            sexo = input.next().toLowerCase();

            while (!(sexo.equals("m") || sexo.equals("f"))) {
                System.out.println("Sexo inválido");
                System.out.println("Digite o sexo (m/f): ");
                sexo = input.next();
            }

            System.out.print("Digite a altura: ");
            altura = input.nextDouble();

            if (sexo.equals("m")) {
                qtdHomens++;
                somaH = altura + somaH;
            } else {
                qtdMulheres++;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
            } else if (altura < menorAltura) {
                menorAltura = altura;
            }

        }
        System.out.printf("\nMaior altura do grupo: %.2f" + " metros", maiorAltura);
        System.out.printf("\nMenor altura do grupo: %.2f" + " metros", menorAltura);
        System.out.printf("\nMédia de altura dos homens: %.2f" + " metros", (somaH / qtdHomens));
    }
}
