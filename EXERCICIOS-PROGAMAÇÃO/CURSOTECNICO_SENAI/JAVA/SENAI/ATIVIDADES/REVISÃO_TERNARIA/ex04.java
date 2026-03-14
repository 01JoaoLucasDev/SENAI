package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero % 5 == 0) {
            System.out.print("multiplo de 5");
        }else System.out.print("Não é multiplo de 5");


        sc.close();
    }
}

