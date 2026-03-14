package BASICOS;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        System.out.println("Digite um  numero:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o ultimo numero: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println("o valor " +  num1  + "é o maior numero");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("o valor " +  num2  + "é o maior numero");
        }else if (num3 > num2 && num2 > num1) {
            System.out.println("o valor " +  num3  + "é o maior numero");
        }
    }
}

