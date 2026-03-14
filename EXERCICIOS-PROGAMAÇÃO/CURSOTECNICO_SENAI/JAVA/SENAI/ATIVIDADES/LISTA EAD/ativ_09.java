package lista.ead;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ativ_09 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                List<Integer> numeros = new ArrayList<>();

                System.out.println("Digite 7 números:");

                for (int i = 0; i < 7; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros.add(scanner.nextInt());
                }

                System.out.println("\nLista na ordem inversa:");
                for (int i = numeros.size() - 1; i >= 0; i--) {
                    System.out.println(numeros.get(i));
                }

                scanner.close();
            }
        }

