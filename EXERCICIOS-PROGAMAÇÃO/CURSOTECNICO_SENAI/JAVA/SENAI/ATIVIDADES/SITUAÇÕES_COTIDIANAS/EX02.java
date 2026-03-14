package SITUAÇÕES_COTIDIANAS;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoAcesso = 1234;

        System.out.print("Digite o código de acesso: ");
        int codigoDigitado = scanner.nextInt();

        if (codigoDigitado == codigoAcesso) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}

