import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner entradaInput = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.print("Letra: ");
            String letra = entradaInput.next();

            if (letra.length() == 1) { // Verificando se o usuário digitou apenas 1 letra.
                /*
                 * Verificando se a letra na entrada de dados é uma VOGAL. Após isso, invertendo
                 * com o operador '!' para resgatar apenas as CONSOANTES.
                 */
                if (!(letra.equalsIgnoreCase("a") ||
                        letra.equalsIgnoreCase("e") ||
                        letra.equalsIgnoreCase("i") ||
                        letra.equalsIgnoreCase("o") ||
                        letra.equalsIgnoreCase("u"))) {
                    consoantes[count] = letra;
                    quantidadeConsoantes++;
                }
                count++;

            } else {
                System.out.println("Digite apenas uma letra.");
            }

        } while (count < consoantes.length);

        System.out.print("Consoantes: ");

        /*
         * Estrutura for-Each ->
         * for(Nova Variável do mesmo tipo do array : Array que irá ser acessado)
         * {argumentos}
         */
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }
}
