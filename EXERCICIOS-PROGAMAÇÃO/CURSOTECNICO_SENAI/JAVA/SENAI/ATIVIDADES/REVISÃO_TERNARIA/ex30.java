package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga duas notas: ");
        double nota = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double media = (nota + nota2) / 2;
        if (media >= 6) {
            System.out.println("aprovado");
        } else System.out.println("Reprovado");
        sc.close();
    }
}
