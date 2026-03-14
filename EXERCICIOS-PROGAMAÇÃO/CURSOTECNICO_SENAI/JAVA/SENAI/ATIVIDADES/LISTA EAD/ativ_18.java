package lista.ead;
import java.util.Random;

public class ativ_18 {
    public static void main(String[] args) {

                Random random = new Random();
                int[][] matriz = new int[4][4];
                int soma = 0;
                int totalElementos = 4 * 4;

                System.out.println("Matriz 4x4 preenchida aleatoriamente:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        matriz[i][j] = random.nextInt(100) + 1;
                        soma += matriz[i][j];
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }

                double media = (double) soma / totalElementos;

                System.out.println("\nMédia de todos os elementos da matriz: " + media);
            }
        }

