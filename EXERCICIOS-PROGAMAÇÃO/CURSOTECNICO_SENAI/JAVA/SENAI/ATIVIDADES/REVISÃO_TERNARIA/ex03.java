package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.print("numero positivo");
        }else if (numero == 0) {
                System.out.print("zero");
        }else System.out.print("numero negativo");


        sc.close();
    }
}


