package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você possui carteira de motorista? (sim/não): ");
        scanner.nextLine();
        String temCarteira = scanner.nextLine();

        if (idade >= 18 && temCarteira.equalsIgnoreCase("sim")) {
            System.out.println("Você pode dirigir.");
        } else {
            System.out.println("Você não pode dirigir.");
        }

        scanner.close();}}


