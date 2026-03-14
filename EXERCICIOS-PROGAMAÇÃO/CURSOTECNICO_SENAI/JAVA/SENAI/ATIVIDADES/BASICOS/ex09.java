package BASICOS;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero > 10 && numero < 50) {
            System.out.println("O numero " + numero + " esta dentro do intervalo ");
        } else {
            System.out.println("O numero " + numero + " esta fora do intervalo");
        }

    }
}

