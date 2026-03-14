package DATAS_E_HORARIOS;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (formato 24h): ");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora < 12) {
            System.out.println("Período da manhã.");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Período da tarde.");
        } else if (hora >= 18 && hora < 24) {
            System.out.println("Período da noite.");
        } else {
            System.out.println("Hora inválida.");
        }
    }
}


