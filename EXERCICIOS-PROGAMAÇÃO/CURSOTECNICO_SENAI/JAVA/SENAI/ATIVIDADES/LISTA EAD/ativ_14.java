package lista.ead;
import java.util.Scanner;

public class ativ_14 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                int somaDiagonal = 0;

                System.out.println("Digite os 9 números para preencher a matriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("\nMatriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }


                for (int i = 0; i < 3; i++) {
                    somaDiagonal += matriz[i][i];
                }

                // Exibindo a soma da diagonal principal
                System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagonal);

                scanner.close();
            }
        }

