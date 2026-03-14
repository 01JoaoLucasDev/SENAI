package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        if (numero > 0 && numero % 2 == 0) {
            System.out.println("sim, o numero é positivo e par");
        } else System.out.println("não");
        scanner.close(); }}