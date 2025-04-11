package edu.joaquim.primeirasemana;

import java.util.Scanner;

// Exercícios de identação + if else

public class CalculoBoletim {
	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);

		System.out.print("Digite sua nota da primeira prova: ");
		float notaProva1 = entradaDados.nextFloat();

		System.out.print("Digite sua nota da segunda prova: ");
		float notaProva2 = entradaDados.nextFloat();

		float mediaFinal = (notaProva1 + notaProva2) / 2;

		// Seguir uma identação correta são boas práticas.
		if (mediaFinal < 6) {
			System.out.format("Reprovado! Sua média final é: %.2f \n", mediaFinal);
		} else if (mediaFinal == 6) {
			System.out.format("Aprovado na média. Sua média final é: %.2f \n", mediaFinal);
		} else {
			System.out.format("Aprovado acima da média, parabéns! Sua média final é: %.2f \n", mediaFinal);
		}
	}
}
