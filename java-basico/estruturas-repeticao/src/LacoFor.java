import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        Scanner entradaInput = new Scanner(System.in);

        int multiplicando;

        System.out.println("Tabuada: ");
        multiplicando = entradaInput.nextInt();

        System.out.println("A tabuada de " + multiplicando + " é: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplicando + "x" + i + " = " + (multiplicando * i));
        }
    }
}
