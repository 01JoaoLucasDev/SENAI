package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = scanner.next().charAt(0);
        if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E'|| letra == 'i' || letra == 'I' || letra == '0'|| letra == 'O' ||
                letra == 'u' || letra == 'U') {
            System.out.println("é uma vogal");
        } else System.out.println("não é uma vogal");
        scanner.close();}}

