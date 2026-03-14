package CONDIÇÕES_COM_STRINGS;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra1 = "João";
        String palavra2 = "joão";
        if    (palavra1.compareToIgnoreCase(palavra2) == 0) {
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras são diferentes");

        }

    }
}
