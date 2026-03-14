package SITUAÇÕES_COTIDIANAS;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("A pessoa está apta para doar sangue.");
        } else {
            System.out.println("A pessoa não está apta para doar sangue.");
        }

        scanner.close();
    }
}

