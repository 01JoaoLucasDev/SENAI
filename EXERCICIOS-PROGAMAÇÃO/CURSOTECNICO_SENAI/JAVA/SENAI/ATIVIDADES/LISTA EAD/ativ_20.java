package lista.ead;
import java.util.Scanner;

public class ativ_20 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[4][4];
            int[] somaLinhas = new int[4];
            int[] somaColunas = new int[4];

            System.out.println("Digite os 16 números para preencher a matriz 4x4:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    somaLinhas[i] += matriz[i][j];
                    somaColunas[j] += matriz[i][j];
                }
            }

            System.out.println("\nSoma das linhas:");
            for (int i = 0; i < 4; i++) {
                System.out.println("Soma da linha " + (i + 1) + ": " + somaLinhas[i]);
            }

            System.out.println("\nSoma das colunas:");
            for (int j = 0; j < 4; j++) {
                System.out.println("Soma da coluna " + (j + 1) + ": " + somaColunas[j]);
            }

            scanner.close();
        }
    }


