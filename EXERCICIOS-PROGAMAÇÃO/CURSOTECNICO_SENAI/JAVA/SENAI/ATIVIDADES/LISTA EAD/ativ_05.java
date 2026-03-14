package lista.ead;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Collection;

public class ativ_05 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        System.out.println("Números gerados:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int maior = Collection.max(numeros);
        int menor = Collections.min(numeros);

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.print("\nDigite um número para verificar se está na lista: ");
        int numeroUsuario = scanner.nextInt();

        if (numeros.contains(numeroUsuario)) {
            System.out.println("O número " + numeroUsuario + " está na lista.");
        } else {
            System.out.println("O número " + numeroUsuario + " não está na lista.");
        }

        scanner.close();
    }
}
