public class Operadores {
    public static void main(String[] args) {

        double soma = 10.5 + 12.5;
        int subtracao = 130 - 120;
        int multiplicacao = 20 * 7;
        int divisao = 9 / 3;
        int modulo = 18 % 3;

        double resultado = (12 * 6) + (19 / 3);

        // O operador de adição (+) fora de aspas, quando usadas no tipo texto, é
        // realizada a CONCATENAÇÃO.
        String nomeCompleto = "Joaquim" + "Azevedo";

        // OP Incrementação: "++"
        int numero = 6;

        numero++; // É igual à "numero = numero + 1"

        System.out.println(numero++); // Será igual ao número original (7) e só no próximo sysout ele será atualizado.
        System.out.println(numero); // 8;

        // OP Negação: "!"

        boolean verdadeira = true;

        verdadeira = !verdadeira; // = false;

        // Ternário

        int a, b;

        a = 5;
        b = 6;
        String result = "";
        if (a == b) {
            result = "verdadeiro";
        } else {
            result = "falso";
        }

        // Abreviadamente, é o mesmo que:

        String resultadoSoma = a == b ? "verdadeiro" : "falso";
        System.out.println(resultadoSoma);

        // OP Relacionais

        int numero1 = 5;
        int numero2 = 6;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

    }
}
