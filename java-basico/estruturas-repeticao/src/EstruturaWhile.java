import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        Scanner entradaInput = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.print("Nome: ");
            nome = entradaInput.next();

            if (nome.equals("0")) {
                break;
            }

            System.out.print("Idade: ");
            idade = entradaInput.nextInt();
        }
    }
}
