package DESAFIOS_E_JOGOS;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > 2 * numero2) {
            System.out.println(numero1 + " é maior que o dobro de " + numero2 + ".");
        } else {
            System.out.println(numero1 + " não é maior que o dobro de " + numero2 + ".");
        }

        scanner.close();
    }
}

