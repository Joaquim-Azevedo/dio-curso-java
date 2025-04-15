import java.util.Scanner;

/*
 * Criar uma aplicação que resolva as seguintes situações:
 * 1. Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
 * Sempre 2 valores devem ser passados.
 * 2. A partir da hora do dia, informe uma mensagem adequada: Bom dia, boa tarde ou boa noite.
 * 3. Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam. Defina arbitrariamente as faixas que influenciam nos valores.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exercício Calculadora
        double numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = input.nextDouble();

        Calculadora.soma(numero1, numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.multiplicacao(numero1, numero2);
        Calculadora.divisao(numero1, numero2);

        // Exercício Mensagem Adequada
        int hora;

        System.out.print("Digite o horário: ");
        hora = input.nextInt();

        Mensagem.obterMensagem(hora);

        // Exercício Empréstimo

        double valor;
        int parcelas;

        System.out.print("Digite o valor: ");
        valor = input.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        parcelas = input.nextInt();

        Emprestimo.calcular(valor, parcelas);

        input.close();
    }
}
