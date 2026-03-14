package lista.ead;

import java.util.ArrayList;
import java.util.Scanner;

public class ativ_03 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList <Double> numeros = new ArrayList<>();
                double soma = 0;

                for (int i = 0; i < 6; i++) {
                    System.out.print("Digite o " + (i + 1) + "º número: ");
                    double numero = scanner.nextDouble();
                    numeros.add(numero);
                    soma += numero;
                }

                System.out.println("\nNúmeros digitados:");
                for (double numero : numeros) {
                    System.out.println(numero);
                }

                double media = soma / 6;
                System.out.println("\nMédia dos números: " + media);

                scanner.close();
    }
}
