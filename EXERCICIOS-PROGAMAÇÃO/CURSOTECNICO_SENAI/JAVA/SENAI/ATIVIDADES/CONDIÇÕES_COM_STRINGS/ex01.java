package CONDIÇÕES_COM_STRINGS;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva uma palavra");
        String palavra1 = sc.nextLine();

        if (palavra1.equalsIgnoreCase("sim")){
            System.out.println("está é a palavra correta");
        }else if (palavra1.equalsIgnoreCase("nao")) {
            System.out.println("está é a palavra correta");
        }else System.out.println("a palavra nao consta no sistema");
    }
}
