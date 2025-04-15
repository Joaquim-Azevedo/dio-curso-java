public class MinhaClasse {

    // Declarando métodos
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        String primeiroNome = "Joaquim";
        String segundoNome = "Azevedo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    };

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
        // .concat = função para concatenar.
        // Retornará: Resultado do método: Joaquim Azevedo.
    };
}
