package PROGAMAÇÃO_MOVIDA_A_OBJETO;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite dois numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int objeto = conjunto(num1,num2);
        showResult(objeto);
    }

    public static int conjunto(int a, int b) {
        int valormaior;
        if (a > b) {
            valormaior = a;
        } else {
            valormaior = b;
        }
        return valormaior;

    }

    public static void showResult(int value) {
        System.out.println("objeto maior = " + value);

    }


}

