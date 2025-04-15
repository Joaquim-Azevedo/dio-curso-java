public class AboutMe {
    /*
     * Projeto executável pelo terminal ou passando os argumentos pelo arquivo
     * launch.json na pasta bin.
     * Comando terminal (localizar a pasta 'bin' primeiro): java (Classe)
     * (argumentos)
     * Ex.: java AboutMe Joaquim Azevedo 19 1.76
     */
    public static void main(String[] args) {

        String meuNome = args[0];
        String meuSobrenome = args[1];
        int minhaIdade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá me chamo " + meuNome + " " + meuSobrenome);
        System.out.println("Tenho " + minhaIdade + " anos");
        System.out.println("A minha altura é: " + altura);
    }
}
