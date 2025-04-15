package edu.joaquim.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {

        Scanner entradaInput = new Scanner(System.in).useLocale(Locale.US); // Usar o sistema convencional
                                                                            // estadunidense.
        System.out.println(
                "1. Adição\n" +
                        "2. Subtração\n" +
                        "3. Multiplicação\n" +
                        "4. Divisão\n");
        System.out.print("Digite a operação que deseja realizar: ");
        int operacaoSelecionada = entradaInput.nextInt();

        switch (operacaoSelecionada) {
            case 1:
                System.out.println("Você escolheu: Adição!");

                System.out.println("Digite o primeiro número: ");
                float parcela1 = entradaInput.nextFloat();

                System.out.println("Digite o segundo número: ");
                float parcela2 = entradaInput.nextFloat();
                float resultadoAdicao = parcela1 + parcela2;

                System.out.println(resultadoAdicao);
                break;

            case 2:
                System.out.println("Você escolheu: Subtração!");

                System.out.println("Digite o primeiro número: ");
                float minuendo = entradaInput.nextFloat();

                System.out.println("Digite o segundo número: ");
                float subtraendo = entradaInput.nextFloat();
                float resultadoSubtracao = minuendo - subtraendo;

                System.out.println(resultadoSubtracao);
                break;

            case 3:
                System.out.println("Você escolheu: Multiplicação!");

                // Float por possibilitar a porcentagem através do setor de multiplicação

                System.out.println("Digite o primeiro número: ");
                float multiplicando = entradaInput.nextFloat();

                System.out.println("Digite o segundo número: ");
                float multiplicador = entradaInput.nextFloat();
                float resultadoMultiplicao = multiplicando * multiplicador;

                System.out.println(resultadoMultiplicao);
                break;

            case 4:
                System.out.println("Você escolheu: Divisão!");

                System.out.println("Digite o primeiro número: ");
                float dividendo = entradaInput.nextFloat();

                System.out.println("Digite o segundo número: ");
                float divisor = entradaInput.nextFloat();

                if (dividendo == 0 || divisor == 0) {
                    System.out.println("Não é possível uma divisão com 0.");
                }
                float resultadoDivisao = dividendo / divisor;

                System.out.println(resultadoDivisao);
                break;

            default:
                System.out.println("Valor indefinido ou inválido.");
                break;
        }
    }
}
