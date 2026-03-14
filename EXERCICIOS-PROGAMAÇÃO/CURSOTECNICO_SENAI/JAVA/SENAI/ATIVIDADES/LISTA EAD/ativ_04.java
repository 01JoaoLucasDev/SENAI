package lista.ead;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ativ_04 {
    public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                numeros.add(random.nextInt(100) + 1);
            }

            System.out.println("Números gerados:");
            for (int numero : numeros) {
                System.out.println(numero);
            }

            int maior = Collections.max(numeros);
            int menor = Collections.min(numeros);

            System.out.println("\nMaior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }
