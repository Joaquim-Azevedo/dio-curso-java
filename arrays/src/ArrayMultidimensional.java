import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[][] multidimensional = new int[4][4];

        for (int i = 0; i < multidimensional.length; i++) {
            for (int j = 0; j < multidimensional[i].length; j++) {
                multidimensional[i][j] = aleatorio.nextInt(9);
            }
        }

        for (int[] linha : multidimensional) {
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }
    }
}
