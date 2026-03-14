package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga um numero: ");
        int num = sc.nextInt();
        if (num > 20 && num < 30) {
            System.out.println("Dentro do intervalo");
        } else System.out.println("Fora do intervalo");
sc.close();}}

