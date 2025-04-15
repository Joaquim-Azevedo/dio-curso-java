import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa que, com base em uma temperatura em graus celsius, 
 * a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
 * seguindo as fórmulas: 
 * K = C + 273.15; 
 * Re = C * 0.8; 
 * Ra = C * 1.8 + 32 + 459.67;
 * F = C * 1.8 + 32; 
 */

public class SistemaConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a temperatura: ");
        double tempCelsius = input.nextInt();

        double kelvintoCelsius = tempCelsius + 273.15;
        double reaumurtoCelsius = tempCelsius * 0.8;
        double fahrenheittoCelsius = (tempCelsius * 1.8) + 32;
        double rankinetoCelsius = fahrenheittoCelsius + 459.67;

        System.out.println("A temperatura em Celsius convertida em: ");
        System.out.printf("Kelvin: %.1f", kelvintoCelsius);
        System.out.printf("\nRéaumur: %.1f", reaumurtoCelsius);
        System.out.printf("\nRankine: %.1f", rankinetoCelsius);
        System.out.printf("\nFahrenheit: %.1f", fahrenheittoCelsius);
    }
}
