import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    // Programa para entrada de dados.

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in).useLocale(Locale.US);
        /*
         * Cria um objeto Scanner, passa o parâmetro System.in para entrada de dados,
         * e utiliza o useLocale para definir a convenção para a americana.
         */

        System.out.print("Digite o seu nome: ");
        String nome = entradaDados.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entradaDados.next();

        System.out.print("Digite a sua idade: ");
        int idade = entradaDados.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = entradaDados.nextDouble();

        System.out.println("Olá, me chamo" + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("A minha altura é: " + altura + "cm.");
    }
}