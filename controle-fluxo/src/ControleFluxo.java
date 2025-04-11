import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;

        // Controles de decisão

        // if - Pode ser usado para fazer uma validação.
        if (numero1 < numero2)// Condição
        {
            // Decisão
            System.out.println(numero1 + " é menor que " + numero2);
        }

        // If-else
        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else // Caso a condição não seja verdadeira
        {
            System.out.println("Os números não são iguais.");
        }

        // If-else-if
        if (numero1 > numero2) {
            System.out.println("O número 1 é maior que o número 2");
        } else if (numero1 == numero2)// Adiciona outra condição caso a primeira não seja verdadeira.
        {
            System.out.println("O número 1 é igual ao número 2.");
        } else // Caso nenhuma das decisões acima forem verdadeiras.
        {
            return;
        }

        // Switch - Estrutura de escolha com uma variável.

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a operação que deseja realizar: ");
        int operacao = entradaDados.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Você selecionou adição.");
                break;

            case 2:
                System.out.println("Você selecionou subtração.");
                break;

            case 3:
                System.out.println("Você selecionou divisão.");
                break;

            default:
                System.out.println("Valor inválido.");
                break;
        }

        // Ternário

    }
}
