package SITUAÇÕES_COTIDIANAS;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "usuario";
        String senhaCorreta = "senha123";

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}

