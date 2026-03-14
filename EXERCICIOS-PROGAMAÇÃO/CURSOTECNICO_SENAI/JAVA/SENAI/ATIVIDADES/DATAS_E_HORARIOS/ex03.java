package DATAS_E_HORARIOS;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        boolean valido = false;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia >= 1 && dia <= 31) valido = true;
                break;
            case 4: case 6: case 9: case 11:
                if (dia >= 1 && dia <= 30) valido = true;
                break;
            case 2:
                System.out.print("Digite o ano: ");
                int ano = scanner.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    if (dia >= 1 && dia <= 29) valido = true;
                } else {
                    if (dia >= 1 && dia <= 28) valido = true;
                }
                break;
        }

        if (valido) {
            System.out.println("Dia válido.");
        } else {
            System.out.println("Dia inválido.");
        }
    }

}
