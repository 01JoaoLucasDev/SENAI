package lista.ead;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ativ_07 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> numeros = new ArrayList<>();

            System.out.println("Digite 8 números:");

            for (int i = 0; i < 8; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros.add(scanner.nextInt());
            }

            Collections.sort(numeros);

            System.out.println("Números em ordem crescente: " + numeros);

            scanner.close();
        }
    }




