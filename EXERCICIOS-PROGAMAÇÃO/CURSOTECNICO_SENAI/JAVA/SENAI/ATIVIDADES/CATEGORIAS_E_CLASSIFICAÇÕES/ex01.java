package CATEGORIAS_E_CLASSIFICAÇÕES;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        if (idade < 12) {
            System.out.println("voce é uma criança");
        } else if (idade >= 12 && idade <= 18) {
            System.out.println("voce é um adolescente");
        } else if (idade > 18) {
            System.out.println("voce é um adulto");
        }
    }}
