package CATEGORIAS_E_CLASSIFICAÇÕES;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga a sua altura COM SEPARAÇÃO UTILIZANDO VIRGULA: ");
        double altura = sc.nextDouble();

        if (altura < 1.65) {
            System.out.println("Você é uma pessoa considerada baixa!");
        } else if (altura >= 1.65 && altura <= 1.80) {
            System.out.println("Você é uma pessoa considerada média!");
        } else if (altura > 1.80) {
            System.out.println("Você é uma pessoa considerada alta!");
        }

        sc.close();}}
