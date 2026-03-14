package FOR;

import java.util.Scanner;

public class ex18 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
            String input = scanner.nextLine();


            String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

            if (cleanedInput.equals(reversedInput)) {
                System.out.println("Essa palavra ou frase é um palíndromo :)");
            } else {
                System.out.println("Essa palavra ou frase não é um palíndromo :(");
            }

            scanner.close();
        }
    }

