package OPERAÇÕES_MATEMATICAS;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double triangulo = 180;
        System.out.println("Digite um numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite outro numero: ");
        double num2 = sc.nextDouble();
        System.out.println("digite outro numero: ");
        double num3 = sc.nextDouble();
        if (num1 + num2 + num3 == triangulo) {
            System.out.println("a soma dos numeros podem formar um triangulo");
        } else {
            System.out.println("a soma dos numeros nao podem formar um triangulo");
        }
    }}
