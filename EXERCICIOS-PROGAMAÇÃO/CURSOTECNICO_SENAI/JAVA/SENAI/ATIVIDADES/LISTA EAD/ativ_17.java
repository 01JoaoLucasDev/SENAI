package lista.ead;
import java.util.Scanner;

public class ativ_17 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[3][3];

                System.out.println("Digite os 9 números para preencher a matriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }

                System.out.print("\nDigite um número escalar para multiplicar a matriz: ");
                int escalar = scanner.nextInt();

                System.out.println("\nNova matriz após multiplicação pelo número escalar:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matriz[i][j] *= escalar;
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }

                scanner.close();
            }
        }



