package lista.ead;
import java.util.Scanner;


public class ativ_15 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                int somaDiagonalSecundaria = 0;

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
                    somaDiagonalSecundaria += matriz[i][2 - i];
                }

                System.out.println("\nSoma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);

                scanner.close();
            }
        }

