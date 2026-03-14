package lista.ead;

import java.util.ArrayList;
import java.util.Scanner;

public class ativ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Double> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }

        System.out.println("\nNúmeros digitados:");
        for (double numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
