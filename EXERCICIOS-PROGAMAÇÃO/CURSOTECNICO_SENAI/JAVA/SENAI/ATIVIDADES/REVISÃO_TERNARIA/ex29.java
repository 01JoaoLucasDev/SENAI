package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga sua idade: ");
        int idade = sc.nextInt();
        if (idade > 18 && idade < 60) {
            System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        } else System.out.println("Jovem");
        sc.close();
    }
}
