package BASICOS;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero > 100 && numero < 200) {
            System.out.println("O numero " + numero + " esta dentro do intervalo de 100 e 200");
        } else {
            System.out.println("O numero " + numero + " esta fora do intervalo de 100 ew 200");
        }

    }
}

