package DESAFIOS_E_JOGOS;

import java.util.Random;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1; // Sorteia um número entre 1 e 10

        System.out.print("Adivinhe o número sorteado (entre 1 e 10): ");
        int palpite = scanner.nextInt();

        if (palpite == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número: " + numeroSorteado);
        } else {
            System.out.println("Você errou! O número sorteado era: " + numeroSorteado);
        }

        scanner.close();
    }
}

