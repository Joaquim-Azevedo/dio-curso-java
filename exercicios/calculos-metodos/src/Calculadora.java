public class Calculadora {
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;

        System.out.println("A soma entre os valores: " + numero1 + " e " + numero2 + " é igual a: " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;

        System.out.println("A subtração entre os valores: " + numero1 + " e " + numero2 + " é igual a: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação entre os valores: " + numero1 + " e " + numero2 + " é igual a: " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        System.out.println("A divisão entre os valores: " + numero1 + " e " + numero2 + " é igual a: " + resultado);
    }

}
