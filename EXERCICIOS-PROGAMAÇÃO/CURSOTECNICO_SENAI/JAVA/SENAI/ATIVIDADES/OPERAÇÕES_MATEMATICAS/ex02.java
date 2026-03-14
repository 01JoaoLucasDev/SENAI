package OPERAÇÕES_MATEMATICAS;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Dgite outro numero: ");
        int num2 = sc.nextInt();
        if (num1 - num2 < 0) {
            System.out.println("A diferença entre os numeros é negativa");
        } else System.out.println("A diferença entre os numeros é positiva");
}}
