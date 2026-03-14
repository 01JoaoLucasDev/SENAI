package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        if (num1 > 100) {
            System.out.println("alto");
        } else System.out.println("Baixo");
scanner.close();}}
