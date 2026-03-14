package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma idade: ");
        int idade = sc.nextInt();
        if (idade >= 18) {
            System.out.print("maior idade");
        }else System.out.print("menor idade");


       sc.close();
    }
}
