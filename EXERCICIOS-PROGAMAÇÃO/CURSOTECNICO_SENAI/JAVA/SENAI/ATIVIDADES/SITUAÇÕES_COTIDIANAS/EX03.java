package SITUAÇÕES_COTIDIANAS;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Escolha a conversão:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (escolha == 2) {
            double kelvin = celsius + 273.15;
            System.out.println("Temperatura em Kelvin: " + kelvin);
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}
