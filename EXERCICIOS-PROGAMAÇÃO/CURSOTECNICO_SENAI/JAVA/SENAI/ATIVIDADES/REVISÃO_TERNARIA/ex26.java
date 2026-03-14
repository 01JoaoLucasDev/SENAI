package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga a sua idade: ");
        int idade = sc.nextInt();
        if (idade >= 16) {
            System.out.println("voce ja pode votar");
        } else System.out.println("voce ainda não pode votar");
   sc.close(); }

}
