import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner entradaInput = new Scanner(System.in);

        int quantNumeros;
        int numPares = 0, numImpares = 0;
        // int numPares = 0;
        // int numImpares = 0;

        int numero;

        System.out.println("Digite a quantidade de números: ");
        quantNumeros = entradaInput.nextInt();

        int count = 0;
        do {

            System.out.println("Número: ");
            numero = entradaInput.nextInt();
            count++;

            if (numero % 2 == 0)
                numPares++;
            else
                numImpares++;

        } while (count < quantNumeros);

        System.out.println("Números pares: " + numPares);
        System.out.println("Números ímpares: " + numImpares);
    }
}
