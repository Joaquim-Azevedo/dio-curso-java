import java.util.Scanner;

public class MaiorMedia {
    // Estrutura do-while.

    public static void main(String[] args) {
        Scanner entradaInput = new Scanner(System.in);

        int numero;
        int maior = 0;

        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = entradaInput.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count++;
        } while (count < 5);

        int media = soma / count;

        System.out.println("Maior número: " + maior);
        System.out.println("Soma dos números: " + soma);
        System.out.println("A média dos números é: " + media);

    }
}