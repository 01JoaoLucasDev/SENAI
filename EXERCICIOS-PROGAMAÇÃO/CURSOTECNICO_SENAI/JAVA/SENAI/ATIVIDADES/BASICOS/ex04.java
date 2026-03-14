package BASICOS;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("Faça sua consulta por idade para saber se pode votar ou não digitando um numero: ");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("voce ja pode paricipar da votação eleitoral");
        }else System.out.println("voce ainda nao pode votar, sua idade está inferior a idade minima para votação");
    }
}

