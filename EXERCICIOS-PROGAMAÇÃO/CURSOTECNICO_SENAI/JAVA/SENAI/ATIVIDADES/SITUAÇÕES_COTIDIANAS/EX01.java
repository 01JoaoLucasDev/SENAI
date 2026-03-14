package SITUAÇÕES_COTIDIANAS;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da placa do veículo (ex: ABC1D23): ");
        String placa = scanner.nextLine();

        if (placa.isEmpty() || placa.length() < 1) {
            System.out.println("Placa inválida. Por favor, insira uma placa válida.");
            return;
        }

        char ultimoCaractere = placa.charAt(placa.length() - 1);

        if (Character.isDigit(ultimoCaractere)) {
            int ultimoDigito = Character.getNumericValue(ultimoCaractere);

            if (ultimoDigito % 2 == 0) {
                System.out.println("O veículo pode passar no pedágio (placa termina em número par).");
            } else {
                System.out.println("O veículo não pode passar no pedágio (placa termina em número ímpar).");
            }
        } else {
            System.out.println("O último caractere da placa não é um dígito. Placa inválida.");
        }

        scanner.close();
    }
}

