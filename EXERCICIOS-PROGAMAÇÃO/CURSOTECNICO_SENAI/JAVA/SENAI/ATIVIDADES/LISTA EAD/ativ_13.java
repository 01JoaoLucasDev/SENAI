package lista.ead;
import java.util.Scanner;

public class ativ_13 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[][] matriz = new int[3][3];
                int maior = Integer.MIN_VALUE;

                System.out.println("Digite os 9 números para preencher a matriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();

                        if (matriz[i][j] > maior) {
                            maior = matriz[i][j];
                        }
                    }
                }

                System.out.println("\nMatriz 3x3:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("\nMaior elemento da matriz: " + maior);

                scanner.close();
            }
        }

