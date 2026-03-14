package DESAFIOS_E_JOGOS;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        boolean ambosPositivos = numero1 > 0 && numero2 > 0;
        boolean ambosNegativos = numero1 < 0 && numero2 < 0;

        if (ambosPositivos) {
            System.out.println("Ambos os números são positivos.");
        } else if (ambosNegativos) {
            System.out.println("Ambos os números são negativos.");
        } else {
            System.out.println("Os números têm sinais diferentes ou um deles é zero.");
        }

        scanner.close();
    }
}

