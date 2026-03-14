package lista.ead;
import java.util.Scanner;

public class ativ_16 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o tamanho da matriz identidade (exemplo: 3 para uma matriz 3x3): ");
                int tamanho = scanner.nextInt();

                int[][] matriz = new int[tamanho][tamanho];

                for (int i = 0; i < tamanho; i++) {
                    for (int j = 0; j < tamanho; j++) {
                        if (i == j) {
                            matriz[i][j] = 1;
                        } else {
                            matriz[i][j] = 0;
                        }
                    }
                }

                System.out.println("\nMatriz Identidade " + tamanho + "x" + tamanho + ":");
                for (int i = 0; i < tamanho; i++) {
                    for (int j = 0; j < tamanho; j++) {
                        System.out.print(matriz[i][j] + "\t");
                    }
                    System.out.println();
                }

                scanner.close();
            }
        }
