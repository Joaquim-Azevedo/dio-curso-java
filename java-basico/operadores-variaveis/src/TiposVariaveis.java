import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos de variáveis
        String meuNome = "Joaquim Azevedo"; // Aspas duplas. -> " "

        short minhaIdade = 19;
        int anoNascimento = 2005;
        double salarioMinimo = 2500; // Atenção: no tipo "double" -> 2.500 != 2500 / 2.500 = 2,5
        char sexo = 'M'; // Aspas simples. -> ' '

        boolean doadorOrgao = false;

        int ano = 2000;
        ano = 2025;
        // ano = 2025

        Date dataNascimento = new Date(); // Necessidade do "import java.util.Date;"

        // Constante - Varíavel imutável.

        final short VALOR_MOTO = 15000;
        // Quando usar "final" para declarar uma constante, usar caixa alta no nome por
        // convenção.
    };
}
