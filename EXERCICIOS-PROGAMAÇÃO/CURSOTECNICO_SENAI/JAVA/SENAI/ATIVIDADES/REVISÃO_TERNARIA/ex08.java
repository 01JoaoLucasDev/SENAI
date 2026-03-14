package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 7) {
            System.out.println("aprovado");
        } else System.out.println("Reprovado");

     scanner.close();
    }
}
