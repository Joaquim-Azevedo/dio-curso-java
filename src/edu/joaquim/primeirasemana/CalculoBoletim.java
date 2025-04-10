package edu.joaquim.primeirasemana;

// Exercícios de identação + if else

public class CalculoBoletim {
	public static void main(String[] args) {
		// Seguir uma identação correta são boas práticas.
		int mediaFinal = 5;
		if (mediaFinal < 6) {
			System.out.println("Reprovado!");
		} else if (mediaFinal == 6) {
			System.out.println("Aprovado na média.");
		} else {
			System.out.println("Aprovado acima da média, parabéns!");
		}
	}
}
