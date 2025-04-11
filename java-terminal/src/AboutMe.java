public class AboutMe {
    public static void main(String[] args) {
        // Projeto executável pelo terminal.
        // Comando terminal (localizar a pasta 'bin' primeiro): java (Classe) (argumentos)
        // Ex.: java AboutMe Joaquim Azevedo 19 1.76

        String meuNome = args[0];
        String meuSobrenome = args[1];
        int minhaIdade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo " + meuNome + " " + meuSobrenome);
        System.out.println("Tenho " + minhaIdade + " anos");
        System.out.println("A minha altura é: " + altura);
    }
}
