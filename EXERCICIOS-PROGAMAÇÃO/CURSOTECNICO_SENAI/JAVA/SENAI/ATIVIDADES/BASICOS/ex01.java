package BASICOS;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.println("digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor >= 0) {
            System.out.println("este valor é positivo");
        }else if (valor <= -1) {
            System.out.println("este valor é negativo");
        }

    }
}


