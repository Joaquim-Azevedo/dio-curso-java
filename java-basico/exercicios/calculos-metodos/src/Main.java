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

        // Cálculo Trapézio com *Sobrecarga* no parâmetro.

        double lado, lado1, lado2, baseMenor, baseMaior, altura;

        System.out.print("Digite o lado do quadrado: ");
        lado = input.nextDouble();

        CalculoQuadrilateros.area(lado);

        System.out.print("Digite o lado do retângulo: ");
        lado1 = input.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        lado2 = input.nextDouble();

        CalculoQuadrilateros.area(lado1, lado2);

        System.out.print("Digite a base menor do trapézio: ");
        baseMenor = input.nextDouble();

        System.out.print("Digite a base maior do trapézio: ");
        baseMaior = input.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        altura = input.nextDouble();

        CalculoQuadrilateros.area(baseMaior, baseMenor, altura);

        // Exercício Cálculo Quadriláteros usando return

        System.out.print("Digite o lado do quadrado: ");
        lado = input.nextDouble();

        double areaQuadrado = CalculoQuadrilaterosReturn.area(lado);
        System.out.println("Área do quadrado: " + areaQuadrado);

        System.out.print("Digite o lado do retângulo: ");
        lado1 = input.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        lado2 = input.nextDouble();

        double areaRetangulo = CalculoQuadrilaterosReturn.area(lado1, lado2);
        System.out.println("Área do retângulo: " + areaRetangulo);

        System.out.print("Digite a base menor do trapézio: ");
        baseMenor = input.nextDouble();

        System.out.print("Digite a base maior do trapézio: ");
        baseMaior = input.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        altura = input.nextDouble();

        double areaTrapezio = CalculoQuadrilaterosReturn.area(baseMaior, baseMenor, altura);
        System.out.println("Área do trapézio: " + areaTrapezio);

        input.close();
    }
}
