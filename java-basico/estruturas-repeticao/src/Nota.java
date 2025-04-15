import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner entradaInput = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = entradaInput.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente.");

            nota = entradaInput.nextInt();
        }
    }
}
