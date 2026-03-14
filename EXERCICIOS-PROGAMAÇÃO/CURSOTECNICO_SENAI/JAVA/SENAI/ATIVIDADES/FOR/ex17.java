package FOR;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);


                System.out.println("Digite uma string:");
                String input = scanner.nextLine();

                System.out.println("Os caracteres da string de trás para frente são:");
                for (int i = input.length() - 1; i >= 0; i--) {
                    System.out.println(input.charAt(i));
                }


                scanner.close();
            }
        }


