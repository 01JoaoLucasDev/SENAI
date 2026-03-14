package lista.ead;

import java.util.Scanner;

public class Ativ_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizTransposta = new int[3][3];

        System.out.println("Digite os 9 números para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTransposta[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}


