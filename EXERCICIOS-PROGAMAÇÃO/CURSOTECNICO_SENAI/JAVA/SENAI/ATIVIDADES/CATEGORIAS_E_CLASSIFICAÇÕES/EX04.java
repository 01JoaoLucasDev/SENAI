package CATEGORIAS_E_CLASSIFICAÇÕES;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua pressão arterial sistólica (número superior): ");
        int sistolica = scanner.nextInt();
        System.out.println("Digite sua pressão arterial diastólica (número inferior): ");
        int diastolica = scanner.nextInt();
        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Sua pressão arterial é NORMAL.");
        } else if ((sistolica >= 120 && sistolica <= 139) || (diastolica >= 80 && diastolica <= 89)) {
            System.out.println("Sua pressão arterial é MODERADA, mas fique de olho.");
        } else {
            System.out.println("Sua pressão arterial é ALTA, procure um medico imediatamente.");
        }


        scanner.close();
    }
}
