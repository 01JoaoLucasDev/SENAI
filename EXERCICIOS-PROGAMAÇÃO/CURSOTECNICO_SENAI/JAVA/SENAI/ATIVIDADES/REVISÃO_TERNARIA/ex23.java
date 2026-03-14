package REVISÃO_TERNARIA;

import java.util.Scanner;

public class ex23 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite uma senha: ");
            String senha = sc.next();
            if (senha.length() != 7) {
                System.out.println("Senha inválida, a senha deve conter 7 caracteres.");
            } else {
                System.out.println("Senha válida.");
            }

            sc.close();
        }
    }

