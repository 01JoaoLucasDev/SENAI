package BASICOS;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("o valor"  +valor1+  "é o maior numero");
        }else if (valor2 > valor1) {
            System.out.println("o valor"  +valor2+  "é o maior numero");
        }else System.out.println("os valores são iguais");
    }

}
