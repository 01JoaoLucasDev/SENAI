package CONDIÇÕES_COM_STRINGS;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra : ");
        String palavra = scanner.nextLine();

        if (palavra.length() > 5) {
            System.out.println("A palavra tem mais de 5 letras");
        } else {
            System.out.println("A palavra tem menos de 5 letras");
        }
    }
}
