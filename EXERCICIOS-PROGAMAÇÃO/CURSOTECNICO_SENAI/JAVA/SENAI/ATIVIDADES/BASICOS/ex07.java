package BASICOS;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber se ele é ou não multiplo de 5: ");
        int numero = sc.nextInt();
        if (numero % 5 == 0) {
            System.out.println("este numero é multiplo de 5");
        } else {
            System.out.println("este numero não é multiplo de 5");
        }

    }
}
